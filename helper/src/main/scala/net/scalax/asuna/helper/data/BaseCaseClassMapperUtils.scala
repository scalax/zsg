package net.scalax.asuna.helper

import net.scalax.asuna.helper.mapper.CaseClassMapper

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait BaseCaseClassMapperUtils {

  val maxNum = 12

  val c: Context

  import c.universe._

  case class FieldName(
      tableFields: Option[List[Symbol]]
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
        members.map(_.name).collect { case TermName(name) => name.trim }.foldLeft(q"""${TermName(tableName)}""": Tree) { (tree, fieldName) =>
          q"""${tree}.${TermName(fieldName)}"""
        }
      case _ => q"""${TermName(modelGenName)}(_.${TermName(fieldName.law)}).toPlaceholder"""
    }
    q
  }

  def initProperty(fieldNames: List[FieldName], tableName: String, modelGenName: String): List[Tree] = {
    val caseClassMapper = weakTypeOf[CaseClassMapper]
    val columnInfoImpl  = weakTypeOf[MacroColumnInfoImpl]

    fieldNames
      .grouped(maxNum)
      .map { subList =>
        val q = q"""
          ${caseClassMapper.typeSymbol.companion}.withRep(..${subList.filter(s => !s.needInput).zipWithIndex.flatMap {
          case (field, index) =>
            val plusIndex = index + 1
            List(
                q"""${TermName("rep" + plusIndex)} = ${commonProUseInShape(modelGenName = modelGenName, fieldName = field, tableName = tableName)}"""
              , q"""${TermName("property" + plusIndex)} = ${TermName(modelGenName)}(_.${TermName(field.law)})"""
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

  def toRepMapper(fields: List[FieldName], tableName: String, modelGenName: String): Tree = {
    withDataDescribeFunc(initProperty(fieldNames = fields, tableName = tableName, modelGenName = modelGenName)).head
  }

}
