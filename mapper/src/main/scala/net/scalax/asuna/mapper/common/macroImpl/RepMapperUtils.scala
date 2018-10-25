package net.scalax.asuna.mapper.common.macroImpl

import net.scalax.asuna.mapper.common.CaseClassMapper

import scala.annotation.tailrec
import scala.reflect.macros.blackbox.Context

trait RepMapperUtils extends BaseCaseClassMapperUtils {

  val c: Context

  import c.universe._

  case class FieldNameWrap(field: FieldName, deepIndex: List[Int])

  val caseClassMapper = weakTypeOf[CaseClassMapper]

  private def countDeepImpl[T](base: List[T])(cv: T => List[FieldNameWrap])(deep: Int): List[FieldNameWrap] = {
    base match {
      case Nil =>
        c.abort(c.enclosingPosition, "Can't not map empty case class")
      case head :: Nil =>
        if (deep == 1)
          cv(head).map(s => s.copy(deepIndex = 1 :: s.deepIndex))
        else
          cv(head)

      case l =>
        val groupedList = l.grouped(maxNum).toList
        val newCv = { list: List[T] =>
          list.zipWithIndex.flatMap {
            case (list, index) =>
              cv(list).map(r => r.copy(deepIndex = (index + 1) :: r.deepIndex))
          }
        }

        countDeepImpl(groupedList)(newCv)(deep + 1)
    }
  }

  def countDeep(base: List[FieldName]) = countDeepImpl(base)(s => List(FieldNameWrap(s, List.empty)))(1)

  def appendIndexToTree(deepFields: List[FieldNameWrap], tree: Tree, fieldName: String): Tree = {
    deepFields
      .map { df =>
        val keys = df.field.tableFields match {
          case Some(f) =>
            f.key match {
              case Left(s) =>
                List(s.singleKey)
              case Right(s) =>
                s.mutiplyKey
            }
          case None =>
            List(df.field.raw)
        }
        (keys, df)
      }
      .find {
        case (keys, _) =>
          keys.contains(fieldName)
      } match {
      case Some((_, fieldNameWrap)) =>
        val tree1 = fieldNameWrap.deepIndex.foldLeft(tree) { (treeItem, index) =>
          q"""$treeItem.${TermName("data" + index.toString)}"""
        }
        fieldNameWrap.field.tableFields match {
          case None =>
            tree1
          case Some(s) =>
            s.key match {
              case Left(_: SingleKey) =>
                tree1
              case Right(mKey: MutiplyKey) =>
                q"""${tree1}.${TermName(fieldName)}"""
            }
        }
      case _ =>
        println("==" * 100 + s"\n找不到列${fieldName}")
        throw new Exception(s"找不到列${fieldName}")
    }

  }

  @tailrec
  private def setCaseClass(treeList: List[Tree]): Tree = {
    treeList match {
      case head :: Nil =>
        head
      case list =>
        val upper = list.grouped(maxNum).toList.map { items =>
          val q =
            q"""
           ${caseClassMapper.typeSymbol.companion}.withData(
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
        setCaseClass(upper)
    }

  }

  def initSetCaseClass(nameList: List[FieldName], fieldNames: List[CaseClassField]): List[Tree] = {
    val getterCol = fieldNames.map(s => (s.name, s.modelGetter(q"""${TermName("caseClass")}""")))

    nameList.grouped(maxNum).toList.map { item =>
      val q =
        q"""
           ${caseClassMapper.typeSymbol.companion}.withData(
                 ..${item.zipWithIndex.map {
          case (fieldItem, index) =>
            val plusIndex = index + 1
            fieldItem.tableFields.flatMap(
                s =>
                s.key match {
                  case Left(_) =>
                    Option.empty
                  case Right(i) =>
                    Option(i)
                }
            ) match {
              case Some(mKey: MutiplyKey) =>
                q"""${TermName("data" + plusIndex.toString)} = ${mKey.modelSetter(getterCol)}"""

              case _ =>
                q"""${TermName("data" + plusIndex.toString)} = ${getterCol.toMap.apply(fieldItem.raw)}"""

            }

        }}
                 )
          """

      q
    }
  }

  def fullSetCaseClass(nameList: List[FieldName], fieldNames: List[CaseClassField]): Tree =
    setCaseClass(initSetCaseClass(nameList = nameList, fieldNames = fieldNames))

}