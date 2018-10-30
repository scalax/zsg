package net.scalax.asuna.mapper.common.macroImpl

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait RepMapperUtils extends BaseCaseClassMapperUtils {

  val c: Context

  import c.universe._

  private def countIndexImpl[T](base: List[T])(cv: T => List[BaseField])(deep: Int): List[BaseField] = {
    base match {
      case Nil =>
        c.abort(c.enclosingPosition, "Can't not map empty case class")
      case head :: Nil if deep > 1 =>
        cv(head)

      case l =>
        val groupedList = l.grouped(maxNum).toList
        val newCv = { list: List[T] =>
          list.zipWithIndex.flatMap {
            case (list, index) =>
              cv(list).map(r => r.appendIndex(index))
          }
        }

        countIndexImpl(groupedList)(newCv)(deep + 1)
    }
  }

  def countIndex(base: List[BaseField]): List[BaseField] = countIndexImpl(base)(s => List(s))(1)

  private def countDeepImpl[T](base: List[T])(cv: T => List[DecoderField])(deep: Int): List[DecoderField] = {
    base match {
      case Nil =>
        c.abort(c.enclosingPosition, "Can't not map empty case class")
      case head :: Nil if deep > 1 =>
        cv(head)

      case l =>
        val groupedList = l.grouped(maxNum).toList
        val newCv = { list: List[T] =>
          list.zipWithIndex.flatMap {
            case (list, index) =>
              cv(list).map(r => r.appendField(s"data${(index + 1).toString}"))
          }
        }

        countDeepImpl(groupedList)(newCv)(deep + 1)
    }
  }

  def countDeep(base: List[DecoderField]): List[DecoderField] = countDeepImpl(base)(s => List(s))(1)

  @tailrec
  private def setCaseClass(treeList: List[Tree])(deep: Int): Tree = {
    treeList match {
      case Nil =>
        c.abort(c.enclosingPosition, "Can't not map empty case class")
      case head :: Nil if deep > 1 =>
        head
      case list =>
        val upper = list.grouped(maxNum).toList.map { items =>
          val q =
            q"""
           ${caseClassMapperCompanion}.withData(
                 ..${items.zipWithIndex.flatMap {
              case (field, index) =>
                val plusIndex = index + 1
                List(
                    q"""${TermName("data" + plusIndex.toString)} = ${field}"""
                )
            }}
                 )
          """

          q
        }
        setCaseClass(upper)(deep + 1)
    }
  }

  def initSetCaseClass(fields: List[EncoderField], caseClassVarName: String): List[Tree] = {
    val caseVar = Ident(TermName(caseClassVarName))
    fields.map(fieldItem => fieldItem.modelGetter(caseVar))
  }

  def fullSetCaseClass(fields: List[EncoderField], caseClassVarName: String): Tree =
    setCaseClass(initSetCaseClass(fields = fields, caseClassVarName))(1)

}
