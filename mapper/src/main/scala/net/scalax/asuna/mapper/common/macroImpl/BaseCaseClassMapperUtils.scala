package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common._

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait BaseCaseClassMapperUtils extends TableFieldsGen {

  val maxNum = 7

  override val c: Context

  import c.universe._

  trait BaseField {
    def tablePropertyName: String
    def names: List[String]
    def tableGetter: Tree => Tree
    def propertyType: Tree
    def repIndex: List[Int]
    def appendIndex(index: Int): BaseField
    def defaultValue: Option[Tree]
  }

  trait EncoderField extends BaseField {
    def modelGetter: Tree => Tree

    override def appendIndex(index: Int): EncoderField =
      EncoderFieldImpl(
          tablePropertyName = tablePropertyName
        , names = names
        , tableGetter = tableGetter
        , propertyType = propertyType
        , modelGetter = modelGetter
        , repIndex = index :: repIndex
        , defaultValue = defaultValue
      )
  }

  trait DecoderField extends BaseField {
    def modelSetter: Map[String, Tree => Tree]
    def toSetter(tempDataVar: String): Map[String, Tree] = {
      modelSetter.map {
        case (key, value) =>
          val initTree = Ident(TermName(tempDataVar))
          /*val setterTree = value.foldLeft(initTree) { (tree, name) =>
            q"""${tree}.${TermName(name)}"""
          }*/
          (key, value(initTree))
      }
    }
    def appendField(name: String): DecoderField =
      DecoderFieldImpl(
          tablePropertyName = tablePropertyName
        , names = names
        , tableGetter = tableGetter
        , propertyType = propertyType
        , modelSetter = modelSetter.map {
          case (key, setter) =>
            (key, { modelVar: Tree =>
              setter(q"""${modelVar}.${TermName(name)}""")
            })
        }
        , defaultValue = defaultValue
      )

    override def appendIndex(index: Int): DecoderField =
      DecoderFieldImpl(
          tablePropertyName = tablePropertyName
        , names = names
        , tableGetter = tableGetter
        , propertyType = propertyType
        , modelSetter = modelSetter
        , repIndex = index :: repIndex
        , defaultValue = defaultValue
      )
  }

  trait FormatterField extends EncoderField with DecoderField {
    override def appendField(name: String): FormatterField =
      FormatterFieldImpl(
          tablePropertyName = tablePropertyName
        , names = names
        , tableGetter = tableGetter
        , propertyType = propertyType
        , modelGetter = modelGetter
        , modelSetter = modelSetter.map {
          case (key, setter) =>
            (key, { modelVar: Tree =>
              setter(q"""${modelVar}.${TermName(name)}""")
            })
        }
        , defaultValue = defaultValue
      )

    override def appendIndex(index: Int): FormatterField =
      FormatterFieldImpl(
          tablePropertyName = tablePropertyName
        , names = names
        , tableGetter = tableGetter
        , propertyType = propertyType
        , modelGetter = modelGetter
        , modelSetter = modelSetter
        , repIndex = index :: repIndex
        , defaultValue = defaultValue
      )
  }

  case class EncoderFieldImpl(
      override val tablePropertyName: String
    , override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelGetter: Tree => Tree
    , override val propertyType: Tree
    , override val repIndex: List[Int] = List.empty
    , override val defaultValue: Option[Tree]
  ) extends EncoderField

  case class DecoderFieldImpl(
      override val tablePropertyName: String
    , override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelSetter: Map[String, Tree => Tree]
    , override val propertyType: Tree
    , override val repIndex: List[Int] = List.empty
    , override val defaultValue: Option[Tree]
  ) extends DecoderField

  case class FormatterFieldImpl(
      override val tablePropertyName: String
    , override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelGetter: Tree => Tree
    , override val modelSetter: Map[String, Tree => Tree]
    , override val propertyType: Tree
    , override val repIndex: List[Int] = List.empty
    , override val defaultValue: Option[Tree]
  ) extends FormatterField

  sealed trait FieldToWrapInfo {
    val tablePropertyName: String
    def tableGetter: Tree => Tree
    def defaultValue: Option[Tree]
  }

  case class PlaceHolderFieldInfo(
      field: CaseClassField
    , override val tableGetter: Tree => Tree
    , override val tablePropertyName: String
    , override val defaultValue: Option[Tree]
  ) extends FieldToWrapInfo

  sealed trait FieldWithKeyInfo extends FieldToWrapInfo {
    def containFields: List[String]
  }

  case class SingleFieldInfo(
      key: SingleKey
    , caseField: CaseClassField
    , override val tableGetter: Tree => Tree
    , override val tablePropertyName: String
    , override val defaultValue: Option[Tree]
  ) extends FieldWithKeyInfo {
    override def containFields: List[String] = key.containFields
  }

  case class MutiplyFieldInfo(
      key: MutiplyKey
    , caseFields: List[CaseClassField]
    , override val tableGetter: Tree => Tree
    , override val tablePropertyName: String
    , override val defaultValue: Option[Tree]
  ) extends FieldWithKeyInfo {
    override def containFields: List[String] = key.containFields
  }

  protected def getMemberInfo(caseFields: List[CaseClassField], tableFields: List[MemberInfo]): List[FieldToWrapInfo] = {
    val (fields, _) = caseFields.foldLeft(
        (List.empty[FieldToWrapInfo], List.empty[String])
    ) {
      case ((list, names), s) =>
        if (names.contains(s.name)) {
          (list, names)
        } else {
          val fieldOpt = tableFields.map(r => (r, r.containFields.contains(s.name))).find { case (_, contains) => contains }

          val fieldEither = fieldOpt.fold((PlaceHolderFieldInfo(s, tableGetter = { tableVar: Tree =>
            s.placeHolder
          }, tablePropertyName = s.name, defaultValue = s.defaultValueTree): FieldToWrapInfo, List(s.name))) {
            case (r, _) =>
              (r match {
                case key: SingleKey =>
                  SingleFieldInfo(key, s, r.tableGetter, tablePropertyName = key.tablePropertyName, defaultValue = s.defaultValueTree)
                case key: MutiplyKey =>
                  MutiplyFieldInfo(
                      key
                    , caseFields.filter(s => key.containFields.contains(s.name))
                    , r.tableGetter
                    , tablePropertyName = key.tablePropertyName
                    , defaultValue = {
                      val values = key.containFields
                        .map(
                            r =>
                            caseFields.find(f => f.name == r).map(fi => (fi, fi.defaultValueTree)).collect {
                              case (field, Some(t)) => q"""${TermName(field.name)} = ${t}"""
                            }
                        )
                        .collect { case Some(r) => r }
                      if (key.containFields.size == values.size) {
                        Option(key.modelSetter(values))
                      } else Option.empty
                    }
                  )
              }, r.containFields)
          }

          (list ::: fieldEither._1 :: Nil, names ::: fieldEither._2)
        }

    }

    fields
  }

  def getEncoderMembers(inputCaseFields: List[CaseClassField], tableFields: List[MemberInfo]): List[EncoderField] = {
    val fields = getMemberInfo(inputCaseFields, tableFields)

    fields.map {
      case s: PlaceHolderFieldInfo =>
        EncoderFieldImpl(
            names = List(s.field.name)
          , tableGetter = s.tableGetter
          , modelGetter = s.field.modelGetter
          , propertyType = s.field.fieldType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
      case s: SingleFieldInfo =>
        EncoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = s.caseField.modelGetter
          , propertyType = s.caseField.fieldType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
      case s: MutiplyFieldInfo =>
        EncoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = { modelVar: Tree =>
            s.key.modelSetter(s.caseFields.map(field => q"""${TermName(field.name)} = ${field.modelGetter(modelVar)}"""))
          }
          , propertyType = s.key.properType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )

    }
  }

  def getDecoderMembers(inputCaseFields: List[CaseClassField], tableFields: List[MemberInfo]): List[DecoderField] = {
    val fields = getMemberInfo(inputCaseFields, tableFields)

    fields.map {
      case s: PlaceHolderFieldInfo =>
        DecoderFieldImpl(
            names = List(s.field.name)
          , tableGetter = s.tableGetter
          , modelSetter = Map((s.field.name, identity))
          , propertyType = s.field.fieldType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
      case s: SingleFieldInfo =>
        DecoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelSetter = Map((s.caseField.name, identity))
          , propertyType = s.caseField.fieldType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
      case s: MutiplyFieldInfo =>
        DecoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelSetter = s.caseFields
            .map(
                field =>
                (field.name, { modelVar: Tree =>
                  q"""${modelVar}.${TermName(field.name)}"""
                })
            )
            .toMap
          , propertyType = s.key.properType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
    }

  }

  def getFormatterMembers(inputCaseFields: List[CaseClassField], tableFields: List[MemberInfo]): List[FormatterField] = {
    val fields = getMemberInfo(inputCaseFields, tableFields)

    fields.map {
      case s: PlaceHolderFieldInfo =>
        FormatterFieldImpl(
            names = List(s.field.name)
          , tableGetter = s.tableGetter
          , modelGetter = s.field.modelGetter
          , modelSetter = Map((s.field.name, identity))
          , propertyType = s.field.fieldType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
      case s: SingleFieldInfo =>
        FormatterFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = s.caseField.modelGetter
          , modelSetter = Map((s.caseField.name, identity))
          , propertyType = s.caseField.fieldType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
      case s: MutiplyFieldInfo =>
        FormatterFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = { modelVar: Tree =>
            s.key.modelSetter(s.caseFields.map(field => q"""${TermName(field.name)} = ${field.modelGetter(modelVar)}"""))
          }
          , modelSetter = s.caseFields
            .map(
                field =>
                (field.name, { modelVar: Tree =>
                  q"""${modelVar}.${TermName(field.name)}"""
                })
            )
            .toMap
          , propertyType = s.key.properType
          , tablePropertyName = s.tablePropertyName
          , defaultValue = s.defaultValue
        )
    }

  }

  case class CaseClassField(
      name: String
    , fieldType: Tree
    , placeHolder: Tree
    , modelGetter: Tree => Tree
    , defaultValueTree: Option[Tree]
  )

  def getCaseClassFields(caseClass: Type): List[CaseClassField] = {
    caseClass.companion.member(TermName("apply")).asTerm.alternatives.find(_.isSynthetic).get.asMethod.paramLists.head.map(_.asTerm).zipWithIndex.map {
      case (field, i) =>
        val TermName(paramName) = field.name

        val method = TermName(s"apply$$default$$${i + 1}")
        val defaultValueTree = caseClass.companion.member(method) match {
          case NoSymbol => None
          case _        => Some(q"${caseClass.typeSymbol.companion}.$method")
        }

        CaseClassField(
            name = paramName
          , fieldType = q"""null: net.scalax.asuna.mapper.common.PropertyType[${caseClass.member(TermName(paramName)).typeSignatureIn(caseClass).resultType}]"""
          , placeHolder = q"""null: net.scalax.asuna.core.common.Placeholder[${caseClass.member(TermName(paramName)).typeSignatureIn(caseClass).resultType}]"""
          , modelGetter = { modelVar: Tree =>
            q"""${modelVar}.${field.name}"""
          }
          , defaultValueTree = defaultValueTree
        )
    }

  }

  lazy val caseClassMapper          = weakTypeOf[CaseClassMapper]
  lazy val columnInfoImpl           = weakTypeOf[MacroColumnInfo]
  lazy val caseClassMapperCompanion = getCompanion(caseClassMapper)
  lazy val columnInfoImplCompanion  = getCompanion(columnInfoImpl)
  /*lazy val propertyType             = weakTypeOf[PropertyType[_]]
  lazy val placeHolder              = weakTypeOf[Placeholder[_]]
  lazy val proCompanion             = getCompanion(propertyType)*/
  lazy val singleColumnInfo         = weakTypeOf[SingleColumnInfo]
  lazy val mutiplyColumnInfo        = weakTypeOf[MutiplyColumnInfo]
  lazy val symbol                   = weakTypeOf[scala.Symbol]
  lazy val repGroupColumnWrapper    = weakTypeOf[RepGroupColumnWrapper[_, _, _]]

  def initProperty(fields: List[BaseField], tableName: Tree): List[Tree] = {
    val treeList = fields.map { field =>
      val columnInfoTree = /*field.names match {
        case head :: Nil =>
          q"""new ${singleColumnInfo} {
            override lazy val tableColumnSymbol = ${symbol.typeSymbol.companion}(${Literal(Constant(field.tablePropertyName))})
            override lazy val tableColumnName = ${Literal(Constant(field.tablePropertyName))}
            override lazy val singleModelSymbol = ${symbol.typeSymbol.companion}(${Literal(Constant(head))})
            override lazy val singleModelName = ${Literal(Constant(head))}
          }: ${singleColumnInfo}"""
        case list =>
          q"""new ${mutiplyColumnInfo} {
            override lazy val tableColumnSymbol = ${symbol.typeSymbol.companion}(${Literal(Constant(field.tablePropertyName))})
            override lazy val tableColumnName = ${Literal(Constant(field.tablePropertyName))}
            override lazy val mutiplyModelSymbol = List(..${list.map(l => q"""${symbol.typeSymbol.companion}(${Literal(Constant(l))})""")})
            override lazy val mutiplyModelName = List(..${list.map(l => q"""${Literal(Constant(l))}""")})
          }: ${mutiplyColumnInfo}"""
      }*/

      q"""${columnInfoImplCompanion}(
                  tableColumnSymbol = ${symbol.typeSymbol.companion}(${Literal(Constant(field.tablePropertyName))}),
                  ..${field.names.map(
          fieldName => q"""${symbol.typeSymbol.companion}(${Literal(Constant(fieldName))})"""
      )})"""

      val paramList = List(
          q"""${TermName("rep")} = ${field.tableGetter(tableName)}"""
        , q"""${TermName("propertyType")} = ${field.propertyType}"""
        , q"""${TermName("columnInfo")} = ${columnInfoTree}"""
      ) //:::
        //field.defaultValue.map(value => q"""${TermName("defaultValue")} = ${value}""").toList

      (field, q"""${repGroupColumnWrapper.typeSymbol.companion}(..${paramList})""")
    }

    treeList
      .grouped(maxNum)
      .map { subList =>
        val q = q"""
          ${caseClassMapperCompanion}.withRawRep(..${subList.zipWithIndex.flatMap {
          case ((field, repTree), index) =>
            val plusIndex = index + 1
            List(q"""${TermName("rep" + plusIndex)} = ${repTree}""", q"""${TermName("property" + plusIndex)} = ${field.propertyType}""")
        }})
          """
        q
      }
      .toList

    /*fields
      .grouped(maxNum)
      .map { subList =>
        val q = q"""
          ${caseClassMapperCompanion}.withRep(..${subList.zipWithIndex.flatMap {
          case (field, index) =>
            val plusIndex = index + 1
            val columnInfoTree = field.names match {
              case head :: Nil =>
                q"""new ${singleColumnInfo} {
                  override lazy val tableColumnSymbol = ${symbol.typeSymbol.companion}(${Literal(Constant(field.tablePropertyName))})
                  override lazy val tableColumnName = ${Literal(Constant(field.tablePropertyName))}
                  override lazy val singleModelSymbol = ${symbol.typeSymbol.companion}(${Literal(Constant(head))})
                  override lazy val singleModelName = ${Literal(Constant(head))}
                }: ${singleColumnInfo}"""
              case list => q"""new ${mutiplyColumnInfo} {
                  override lazy val tableColumnSymbol = ${symbol.typeSymbol.companion}(${Literal(Constant(field.tablePropertyName))})
                  override lazy val tableColumnName = ${Literal(Constant(field.tablePropertyName))}
                  override lazy val mutiplyModelSymbol = List(..${list.map(l => q"""${symbol.typeSymbol.companion}(${Literal(Constant(l))})""")})
                  override lazy val mutiplyModelName = List(..${list.map(l => q"""${Literal(Constant(l))}""")})
                }: ${mutiplyColumnInfo}"""
            }

            /*q"""${columnInfoImplCompanion}(
              tableColumnSymbol = ${weakTypeOf[scala.Symbol].typeSymbol.companion}(${Literal(Constant(field.tablePropertyName))}),
              ..${field.names.map(
                fieldName => q"""${weakTypeOf[scala.Symbol].typeSymbol.companion}(${Literal(Constant(fieldName))})"""
            )})"""*/

            val defaultValueTree = field.defaultValue.map(r => q"""Option(${r})""").getOrElse(reify(Option.empty).tree)

            List(
                q"""${TermName("rep" + plusIndex)} = ${field.tableGetter(tableName)}"""
              , q"""${TermName("property" + plusIndex)} = ${field.propertyType}"""
              , q"""${TermName("column" + plusIndex)} = ${columnInfoTree}"""
              , q"""${TermName("defaultValue" + plusIndex)} = ${defaultValueTree}"""
            )
        }})
          """
        q
      }
      .toList*/
  }

  @tailrec
  final def withDataDescribeFunc(treeList: List[Tree]): List[Tree] = {
    if (treeList.size == 1) {
      treeList
    } else {
      val newList = treeList.grouped(maxNum).toList.map { subList =>
        val (setVal, setParameter) = subList.zipWithIndex.map {
          case (item, index) =>
            val plusIndex = index + 1
            val fName     = c.freshName("data" + (index + 1))
            (
                q"""val ${TermName(fName)} = ${item}"""
              , List(q"""${TermName("rep" + plusIndex)} = ${TermName(fName)}""", q"""${TermName("property" + plusIndex)} = ${TermName(fName)}.propertyType""")
            )
        }.unzip

        q"""
            ..${setVal}
            ${caseClassMapperCompanion}.withRawRep(..${setParameter.flatten})"""
      }
      withDataDescribeFunc(newList)
    }
  }

  def toRepMapper(fields: List[BaseField], tableName: Tree): Tree = {
    withDataDescribeFunc(
        initProperty(fields = fields, tableName)
    ).head
  }

}
