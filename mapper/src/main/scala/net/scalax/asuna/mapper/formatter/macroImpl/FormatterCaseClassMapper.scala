package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.mapper.common.{CaseClassMapper, ModelGen}
import net.scalax.asuna.mapper.common.macroImpl.{BaseCaseClassMapperUtils, TableFieldsGen}
import net.scalax.asuna.mapper.formatter.{FormatterDataGen, FormatterInputTable}

import scala.annotation.tailrec

object FormatterCaseClassMapper {

  class FormatterCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BaseCaseClassMapperUtils with TableFieldsGen {

    import c.universe._

    def caseclassFormatterGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[FormatterInputTable.Aux[Table, Output, Rep, TempData]] = {
      val rep                 = weakTypeOf[Rep]
      val tempData            = weakTypeOf[TempData]
      val output              = weakTypeOf[Output]
      val table               = weakTypeOf[Table]
      val outputModelGen      = weakTypeOf[ModelGen[Output]]
      val formatterInputTable = weakTypeOf[FormatterInputTable[Table, Output]]
      val caseClassMapper     = weakTypeOf[CaseClassMapper]
      val formatterDataGen    = weakTypeOf[FormatterDataGen[Output]]

      val modelGenName = c.freshName("modelGen")
      val tableName    = c.freshName("tableInstance")

      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map { s =>
          (s, s.name)
        }
        .collect { case (member, TermName(n)) => (member, n.trim) }
        .toList
        .reverse

      val tableFieldNames = fetchTableFields(table)

      def mgDef = q"""val ${TermName(modelGenName)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]"""

      /*val (fieldsPrepare, _) = outputFieldNames.foldLeft((List.empty[FieldName], 0)) {
        case ((nameList, lawIndex), (member, strName)) =>
          val newLawIndex = lawIndex + 1
          val usePlaceHolder = tableFieldNames.find { s =>
            s.key match {
              case Left(SingleKey(r)) =>
                r == strName
              case Right(MutiplyKey(mk, _)) =>
                mk.contains(strName)
            }
          }

          val fieldName = FieldName(
              tableFields = usePlaceHolder
            , lawModelMember = member
            , law = strName
            , lawIndex = newLawIndex
            , mapperIndex = newLawIndex
            , needInput = false
            , needSub = false
          )

          ((fieldName :: nameList), newLawIndex)
      }*/

      val (fieldsPrepare, _, _) = outputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), (member, strName)) =>
          val newLawIndex = lawIndex + 1

          val alreadExists = nameList.exists { s =>
            s.tableFields
              .map(
                  c =>
                  c.key match {
                    case Left(SingleKey(r)) =>
                      r == strName
                    case Right(MutiplyKey(mk, _)) =>
                      mk.contains(strName)
                  }
              )
              .getOrElse(false)
          }
          if (alreadExists)
            (nameList, lawIndex, helperIndex)
          else {
            val usePlaceHolder = tableFieldNames.find { s =>
              s.key match {
                case Left(SingleKey(r)) =>
                  r == strName
                case Right(MutiplyKey(mk, _)) =>
                  mk.contains(strName)
              }
            }

            val newHelperIndex = helperIndex + 1
            val fieldName = FieldName(
                tableFields = usePlaceHolder
              , lawModelMember = member
              , law = strName
              , lawIndex = newLawIndex
              , mapperIndex = newHelperIndex
              , needInput = false
              , needSub = false
            )
            ((fieldName :: nameList), newLawIndex, newHelperIndex)
          }
      }

      @tailrec
      def setCaseClass(treeList: List[Tree]): List[Tree] = {
        if (treeList.size == 1)
          treeList
        else {
          val upper = treeList.grouped(maxNum).toList.map { items =>
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

      def initSetCaseClass(nameList: List[FieldName]): List[Tree] = {
        nameList.grouped(maxNum).toList.map { item =>
          val q =
            q"""
           ${caseClassMapper.typeSymbol.companion}.withData(
                 ..${item.zipWithIndex.flatMap {
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
                  case Some(MutiplyKey(keys, typeRef)) =>
                    List(
                        q"""${TermName("data" + plusIndex.toString)} = ${typeRef.typeSymbol.companion}(..${keys
                        .map(key => q"""${TermName(key)} = caseClass.${TermName(key)}""")})"""
                    )

                  case _ =>
                    List(
                        q"""${TermName("data" + plusIndex.toString)} = caseClass.${TermName(fieldItem.law)}"""
                    )
                }

            }}
                 )
          """

          q
        }
      }

      case class FieldNameWrap(field: FieldName, deepIndex: List[Int])

      def countDeepImpl[T](base: List[T])(cv: T => List[FieldNameWrap])(deep: Int): List[FieldNameWrap] = {
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

      val deepFields = countDeep(fieldsPrepare.filter(s => !s.needInput))

      def appendIndexToTree(tree: Tree, fieldName: String): Tree = {
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
                List(df.field.law)
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
                  case Left(SingleKey(_)) =>
                    tree1
                  case Right(MutiplyKey(_, _)) =>
                    q"""${tree1}.${TermName(fieldName)}"""
                }
            }
          case _ =>
            println("==" * 100 + s"\n找不到列${fieldName}")
            throw new Exception(s"找不到列${fieldName}")
        }

      }

      def fullSetCaseClass(nameList: List[FieldName]): Tree = setCaseClass(initSetCaseClass(nameList)).head

      val fields = fieldsPrepare

      val q = c.Expr[FormatterInputTable.Aux[Table, Output, Rep, TempData]] {
        q"""
        ${formatterInputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          $mgDef
          ${formatterDataGen.typeSymbol.companion}
          .fromDataGenWrap[$output](${toRepMapper(fields = fields, tableName = tableName, modelGenName = modelGenName)}.dataGenWrap) { (caseClass, rep) =>
            ${fullSetCaseClass(fields)}
          } { (tempData, rep) =>
           ${output.typeSymbol.companion}(
            ..${List(
            outputFieldNames.map { field =>
            q"""${TermName(field._2)} = ${appendIndexToTree(q"""tempData""", field._2)}"""
          }
        ).flatten}
            ) }
           }
                   """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}
