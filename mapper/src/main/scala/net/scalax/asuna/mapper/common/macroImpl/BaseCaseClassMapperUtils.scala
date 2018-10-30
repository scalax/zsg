package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.{CaseClassMapper, MacroColumnInfoImpl, PropertyType}

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait BaseCaseClassMapperUtils extends TableFieldsGen {

  val maxNum = 6

  override val c: Context

  import c.universe._

  trait BaseField {
    def tablePropertyName: String
    def names: List[String]
    def tableGetter: Tree => Tree
    def propertyType: Tree
    def repIndex: List[Int]
    def appendIndex(index: Int): BaseField

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
      )
  }

  trait DecoderField extends BaseField {
    def modelSetter: Map[String, List[String]]
    def toSetter(tempDataVar: String): Map[String, Tree] = {
      modelSetter.map {
        case (key, value) =>
          val initTree: Tree = Ident(TermName(tempDataVar))
          val setterTree = value.foldLeft(initTree) { (tree, name) =>
            q"""${tree}.${TermName(name)}"""
          }
          (key, setterTree)
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
            (key, name :: setter)
        }
      )

    override def appendIndex(index: Int): DecoderField =
      DecoderFieldImpl(
          tablePropertyName = tablePropertyName
        , names = names
        , tableGetter = tableGetter
        , propertyType = propertyType
        , modelSetter = modelSetter
        , repIndex = index :: repIndex
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
            (key, name :: setter)
        }
      )
  }

  case class EncoderFieldImpl(
      override val tablePropertyName: String
    , override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelGetter: Tree => Tree
    , override val propertyType: Tree
    , override val repIndex: List[Int] = List.empty
  ) extends EncoderField

  case class DecoderFieldImpl(
      override val tablePropertyName: String
    , override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelSetter: Map[String, List[String]]
    , override val propertyType: Tree
    , override val repIndex: List[Int] = List.empty
  ) extends DecoderField

  case class FormatterFieldImpl(
      override val tablePropertyName: String
    , override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelGetter: Tree => Tree
    , override val modelSetter: Map[String, List[String]]
    , override val propertyType: Tree
    , override val repIndex: List[Int] = List.empty
  ) extends FormatterField

  sealed trait FieldToWrapInfo {
    val tablePropertyName: String
    def tableGetter: Tree => Tree

  }

  case class PlaceHolderFieldInfo(field: CaseClassField, override val tableGetter: Tree => Tree, override val tablePropertyName: String) extends FieldToWrapInfo

  sealed trait FieldWithKeyInfo extends FieldToWrapInfo {
    def containFields: List[String]
  }

  case class SingleFieldInfo(key: SingleKey, caseField: CaseClassField, override val tableGetter: Tree => Tree, override val tablePropertyName: String)
      extends FieldWithKeyInfo {
    override def containFields: List[String] = key.containFields

  }
  case class MutiplyFieldInfo(key: MutiplyKey, caseFields: List[CaseClassField], override val tableGetter: Tree => Tree, override val tablePropertyName: String)
      extends FieldWithKeyInfo {
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
            q"""${s.fieldType}.toPlaceholder"""
          }, tablePropertyName = s.name): FieldToWrapInfo, List(s.name))) {
            case (r, _) =>
              (r match {
                case key: SingleKey =>
                  SingleFieldInfo(key, s, r.tableGetter, tablePropertyName = key.tablePropertyName)
                case key: MutiplyKey =>
                  MutiplyFieldInfo(key, caseFields.filter(s => key.containFields.contains(s.name)), r.tableGetter, tablePropertyName = key.tablePropertyName)
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
        )
      case s: SingleFieldInfo =>
        EncoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = s.caseField.modelGetter
          , propertyType = s.caseField.fieldType
          , tablePropertyName = s.tablePropertyName
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
          , modelSetter = Map((s.field.name, List.empty))
          , propertyType = s.field.fieldType
          , tablePropertyName = s.tablePropertyName
        )
      case s: SingleFieldInfo =>
        DecoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelSetter = Map((s.caseField.name, List.empty))
          , propertyType = s.caseField.fieldType
          , tablePropertyName = s.tablePropertyName
        )
      case s: MutiplyFieldInfo =>
        DecoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelSetter = s.caseFields.map(field => (field.name, List(field.name))).toMap
          , propertyType = s.key.properType
          , tablePropertyName = s.tablePropertyName
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
          , modelSetter = Map((s.field.name, List.empty))
          , propertyType = s.field.fieldType
          , tablePropertyName = s.tablePropertyName
        )
      case s: SingleFieldInfo =>
        FormatterFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = s.caseField.modelGetter
          , modelSetter = Map((s.caseField.name, List.empty))
          , propertyType = s.caseField.fieldType
          , tablePropertyName = s.tablePropertyName
        )
      case s: MutiplyFieldInfo =>
        FormatterFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = { modelVar: Tree =>
            s.key.modelSetter(s.caseFields.map(field => q"""${TermName(field.name)} = ${field.modelGetter(modelVar)}"""))
          }
          , modelSetter = s.caseFields.map(field => (field.name, List(field.name))).toMap
          , propertyType = s.key.properType
          , tablePropertyName = s.tablePropertyName
        )
    }

  }

  case class CaseClassField(
      name: String
    , rawField: Symbol
    , fieldType: Tree
    , modelGetter: Tree => Tree
  )

  lazy val caseClassMapper          = weakTypeOf[CaseClassMapper]
  lazy val columnInfoImpl           = weakTypeOf[MacroColumnInfoImpl]
  lazy val caseClassMapperCompanion = getCompanion(caseClassMapper)
  lazy val columnInfoImplCompanion  = getCompanion(columnInfoImpl)
  lazy val propertyType             = weakTypeOf[PropertyType[_]]
  lazy val proCompanion             = getCompanion(propertyType)

  def initProperty(fields: List[BaseField], tableName: Tree): List[Tree] = {

    fields
      .grouped(maxNum)
      .map { subList =>
        val q = q"""
          ${caseClassMapperCompanion}.withRep(..${subList.zipWithIndex.flatMap {
          case (field, index) =>
            val plusIndex = index + 1
            val columnInfoTree = q"""${columnInfoImplCompanion}(
              tableColumnSymbol = ${weakTypeOf[scala.Symbol].typeSymbol.companion}(${Literal(Constant(field.tablePropertyName))}),
              modelColumnSymbols = ${weakTypeOf[List[scala.Symbol]].typeSymbol.companion}(..${field.names.map(
                fieldName => q"""${weakTypeOf[scala.Symbol].typeSymbol.companion}(${Literal(Constant(fieldName))})"""
            )})
            )"""

            List(
                q"""${TermName("rep" + plusIndex)} = ${field.tableGetter(tableName)}"""
              , q"""${TermName("property" + plusIndex)} = ${field.propertyType}"""
              , q"""${TermName("column" + plusIndex)} = ${columnInfoTree}"""
            )
        }})
          """
        q
      }
      .toList
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
