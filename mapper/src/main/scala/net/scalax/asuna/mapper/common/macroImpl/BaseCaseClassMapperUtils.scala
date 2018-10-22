package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.{CaseClassMapper, MacroColumnInfoImpl, PropertyType}

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait BaseCaseClassMapperUtils extends TableFieldsGen {

  val maxNum = 12

  override val c: Context

  import c.universe._

  trait CaseClassField {
    def name: String
    def rawField: Symbol
    def fieldType: Tree
  }

  object CaseClassField {
    def apply(name: String, rawField: Symbol, fieldType: => Tree): CaseClassField = {
      val name1           = name
      val rawField1       = rawField
      lazy val fieldType1 = fieldType

      new CaseClassField {
        override val name           = name1
        override val rawField       = rawField1
        override lazy val fieldType = fieldType1
      }
    }
  }

  case class FieldName(
      tableFields: Option[MemberWithDeepKey]
    , rawModelMember: Symbol
    , raw: String
    , rawIndex: Int
    , mapperIndex: Int
    , needInput: Boolean
    , needSub: Boolean
  )

  def commonProUseInShape(caseClassFields: List[CaseClassField], tableName: String, fieldName: FieldName) = {
    val q = fieldName.tableFields match {
      case Some(members) =>
        members.members.map(_.name).collect { case TermName(name) => name.trim }.foldLeft(q"""${TermName(tableName)}""": Tree) { (tree, fieldName) =>
          q"""${tree}.${TermName(fieldName)}"""
        }
      case _ => q"""${caseClassFields.find(s => s.name == fieldName.raw).get.fieldType}.toPlaceholder"""

    }
    q
  }

  def initProperty(fieldNames: List[FieldName], inputFields: List[CaseClassField], tableName: String): List[Tree] = {
    val caseClassMapper = weakTypeOf[CaseClassMapper]
    val columnInfoImpl  = weakTypeOf[MacroColumnInfoImpl]
    val proType         = weakTypeOf[PropertyType[_]]

    fieldNames
      .grouped(maxNum)
      .map { subList =>
        val q = q"""
          ${caseClassMapper.typeSymbol.companion}.withRep(..${subList.filter(s => !s.needInput).zipWithIndex.flatMap {
          case (field, index) =>
            val proTree = field.tableFields
              .flatMap(
                  s =>
                  s.key match {
                    case Left(_) =>
                      Option.empty
                    case Right(i) =>
                      Option(i)
                  }
              )
              .map(_.fieldType) match {
              case Some(autalType) =>
                q"""${proType.typeSymbol.companion}[${autalType}]"""
              case _ =>
                inputFields.find(s => s.name == field.raw).get.fieldType
            }

            val plusIndex = index + 1
            List(
                q"""${TermName("rep" + plusIndex)} = ${commonProUseInShape(caseClassFields = inputFields, fieldName = field, tableName = tableName)}"""
              , q"""${TermName("property" + plusIndex)} = $proTree"""
              , q"""${TermName("column" + plusIndex)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.raw))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.raw))}),
              modelColumnName = ${Literal(Constant(field.raw))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.raw))})
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
            ${caseClassMapper.typeSymbol.companion}.withrawRep(..${setParameter.flatten})"""
      }
      withDataDescribeFunc(newList)
    }
  }

  def toRepMapper(fields: List[FieldName], tableName: String, inputFields: List[CaseClassField]): Tree = {
    withDataDescribeFunc(
        initProperty(fieldNames = fields, tableName = tableName, inputFields = inputFields)
    ).head
  }

}
