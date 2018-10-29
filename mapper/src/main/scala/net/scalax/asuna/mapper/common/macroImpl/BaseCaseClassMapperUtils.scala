package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.{CaseClassMapper, MacroColumnInfoImpl}

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait BaseCaseClassMapperUtils extends TableFieldsGen {

  val maxNum = 12

  override val c: Context

  import c.universe._

  trait BaseField {
    def names: List[String]
    def tableGetter: Tree => Tree
    def propertyType: Tree
  }

  trait EncoderField extends BaseField {
    def modelGetter: Tree => Tree
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
      DecoderFieldImpl(names = names, tableGetter = tableGetter, propertyType = propertyType, modelSetter = modelSetter.map {
        case (key, setter) =>
          (key, name :: setter)
      })
  }

  trait FormatterField extends EncoderField with DecoderField {
    override def appendField(name: String): FormatterField =
      FormatterFieldImpl(
          names = names
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
      override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelGetter: Tree => Tree
    , override val propertyType: Tree
  ) extends EncoderField

  case class DecoderFieldImpl(
      override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelSetter: Map[String, List[String]]
    , override val propertyType: Tree
  ) extends DecoderField

  case class FormatterFieldImpl(
      override val names: List[String]
    , override val tableGetter: Tree => Tree
    , override val modelGetter: Tree => Tree
    , override val modelSetter: Map[String, List[String]]
    , override val propertyType: Tree
  ) extends FormatterField

  sealed trait FieldToWrapInfo {
    def tableGetter: Tree => Tree

  }

  case class PlaceHolderFieldInfo(field: CaseClassField, override val tableGetter: Tree => Tree) extends FieldToWrapInfo

  sealed trait FieldWithKeyInfo extends FieldToWrapInfo {
    def containFields: List[String]
  }

  case class SingleFieldInfo(key: SingleKey, caseField: CaseClassField, override val tableGetter: Tree => Tree) extends FieldWithKeyInfo {
    override def containFields: List[String] = key.containFields

  }
  case class MutiplyFieldInfo(key: MutiplyKey, caseFields: List[CaseClassField], override val tableGetter: Tree => Tree) extends FieldWithKeyInfo {
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
          }): FieldToWrapInfo, List(s.name))) {
            case (r, _) =>
              (r match {
                case key: SingleKey =>
                  SingleFieldInfo(key, s, r.tableGetter)
                case key: MutiplyKey =>
                  MutiplyFieldInfo(key, caseFields.filter(s => key.containFields.contains(s.name)), r.tableGetter)
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
        )
      case s: SingleFieldInfo =>
        EncoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = s.caseField.modelGetter
          , propertyType = s.caseField.fieldType
        )
      case s: MutiplyFieldInfo =>
        EncoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = { modelVar: Tree =>
            s.key.modelSetter(s.caseFields.map(field => q"""${TermName(field.name)} = ${field.modelGetter(modelVar)}"""))
          }
          , propertyType = s.key.properType
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
        )
      case s: SingleFieldInfo =>
        DecoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelSetter = Map((s.caseField.name, List.empty))
          , propertyType = s.caseField.fieldType
        )
      case s: MutiplyFieldInfo =>
        DecoderFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelSetter = s.caseFields.map(field => (field.name, List(field.name))).toMap
          , propertyType = s.key.properType
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
        )
      case s: SingleFieldInfo =>
        FormatterFieldImpl(
            names = s.containFields
          , tableGetter = s.tableGetter
          , modelGetter = s.caseField.modelGetter
          , modelSetter = Map((s.caseField.name, List.empty))
          , propertyType = s.caseField.fieldType
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
        )
    }

  }

  case class CaseClassField(
      name: String
    , rawField: Symbol
    , fieldType: Tree
    , modelGetter: Tree => Tree
  )

  def initProperty(fields: List[BaseField], tableName: String): List[Tree] = {
    val caseClassMapper = weakTypeOf[CaseClassMapper]
    val columnInfoImpl  = weakTypeOf[MacroColumnInfoImpl]

    fields
      .grouped(maxNum)
      .map { subList =>
        val q = q"""
          ${getObject(caseClassMapper)}.withRep(..${subList.zipWithIndex.flatMap {
          case (field, index) =>
            val plusIndex = index + 1
            List(
                q"""${TermName("rep" + plusIndex)} = ${field.tableGetter(Ident(TermName(tableName)))}"""
              , q"""${TermName("property" + plusIndex)} = ${field.propertyType}"""
              , q"""${TermName("column" + plusIndex)} = ${getObject(columnInfoImpl)}(
              tableColumnName = ${Literal(Constant(field.names.head))},
              tableColumnSymbol = ${getObject(weakTypeOf[scala.Symbol])}(${Literal(Constant(field.names.head))}),
              modelColumnName = ${Literal(Constant(field.names.head))},
              modelColumnSymbol = ${getObject(weakTypeOf[scala.Symbol])}(${Literal(Constant(field.names.head))})
            )"""
            )
        }})
          """
        q
      }
      .toList
  }

  @tailrec
  final def withDataDescribeFunc(treeList: List[Tree]): List[Tree] = {
    val caseClassMapper = weakTypeOf[CaseClassMapper]

    if (treeList.size == 1) {
      treeList
    } else {
      val newList = treeList.grouped(maxNum).toList.map { subList =>
        val (setVal, setParameter) = subList.zipWithIndex.map {
          case (item, index) =>
            val plusIndex = index + 1
            val fName     = c.freshName("data" + index)
            (
                q"""val ${TermName(fName)} = ${item}"""
              , List(q"""${TermName("rep" + plusIndex)} = ${TermName(fName)}""", q"""${TermName("property" + plusIndex)} = ${TermName(fName)}.propertyType""")
            )
        }.unzip

        q"""
            ..${setVal}
            ${caseClassMapper.typeSymbol.companion}.withRawRep(..${setParameter.flatten})"""
      }
      withDataDescribeFunc(newList)
    }
  }

  def toRepMapper(fields: List[BaseField], tableName: String): Tree = {
    withDataDescribeFunc(
        initProperty(fields = fields, tableName)
    ).head
  }

}
