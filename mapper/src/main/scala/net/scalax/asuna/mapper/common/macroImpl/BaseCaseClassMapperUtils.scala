package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.{CaseClassMapper, MacroColumnInfoImpl, PropertyType}

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait BaseCaseClassMapperUtils extends TableFieldsGen {

  val maxNum = 12

  override val c: Context

  import c.universe._

  case class FieldName(
      tableFields: Option[MemberWithDeepKey]
    , lawModelMember: Symbol
    , law: String
    , lawIndex: Int
    , mapperIndex: Int
    , needInput: Boolean
    , needSub: Boolean
  )

  def commonProUseInShape(modelGenName: String, tableName: String, fieldName: FieldName) = {
    val q = fieldName.tableFields match {
      case Some(members) =>
        members.members.map(_.name).collect { case TermName(name) => name.trim }.foldLeft(q"""${TermName(tableName)}""": Tree) { (tree, fieldName) =>
          q"""${tree}.${TermName(fieldName)}"""
        }
      case _ => q"""${TermName(modelGenName)}(_.${TermName(fieldName.law)}).toPlaceholder"""

    }
    q
  }

  def initProperty(fieldNames: List[FieldName], tableName: String, modelGenName: String, inputModelName: String, inputFields: List[String]): List[Tree] = {
    val caseClassMapper = weakTypeOf[CaseClassMapper]
    val columnInfoImpl  = weakTypeOf[MacroColumnInfoImpl]
    val proType         = weakTypeOf[PropertyType[String]]

    fieldNames
      .grouped(maxNum)
      .map { subList =>
        val q = q"""
          ${caseClassMapper.typeSymbol.companion}.withRep(..${subList.filter(s => !s.needInput).zipWithIndex.flatMap {
          case (field, index) =>
            val modelNameToUse = if (inputFields.contains(field.law)) inputModelName else modelGenName

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
                q"""new ${proType.typeSymbol}[${autalType}] { }"""
              case _ =>
                q"""${TermName(modelNameToUse)}(_.${TermName(field.law)})"""
            }

            val plusIndex = index + 1
            List(
                q"""${TermName("rep" + plusIndex)} = ${commonProUseInShape(modelGenName = modelNameToUse, fieldName = field, tableName = tableName)}"""
              //, q"""${TermName("property" + plusIndex)} = ${TermName(modelGenName)}(_.${TermName(field.law)})"""
              , q"""${TermName("property" + plusIndex)} = $proTree"""
              , q"""${TermName("column" + plusIndex)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
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
            ${caseClassMapper.typeSymbol.companion}.withLawRep(..${setParameter.flatten})"""
      }
      withDataDescribeFunc(newList)
    }
  }

  def toRepMapper(fields: List[FieldName], tableName: String, modelGenName: String, inputModelName: String, inputFields: List[String]): Tree = {
    withDataDescribeFunc(
        initProperty(fieldNames = fields, tableName = tableName, modelGenName = modelGenName, inputModelName = inputModelName, inputFields = inputFields)
    ).head
  }

}
