package net.scalax.asuna.mapper.decoder.macroImpl

import net.scalax.asuna.mapper.common.{InputTable, ModelGen}
import net.scalax.asuna.mapper.common.macroImpl.{BaseCaseClassMapperUtils, TableFieldsGen}
import net.scalax.asuna.mapper.decoder.{DecoderDataGen, LazyData}

object DecoderCaseClassMapper {

  class DecoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BaseCaseClassMapperUtils with TableFieldsGen {
    self =>

    import c.universe._

    def caseclassDecoderGeneric[
        Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Sub: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] = {
      val rep            = weakTypeOf[Rep]
      val tempData       = weakTypeOf[TempData]
      val input          = weakTypeOf[Input]
      val output         = weakTypeOf[Output]
      val sub            = weakTypeOf[Sub]
      val table          = weakTypeOf[Table]
      val outputModelGen = weakTypeOf[ModelGen[Output]]
      val lazyData       = weakTypeOf[LazyData[Input, Output, Sub]]
      val inputTable     = weakTypeOf[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]]
      val decoderDataGen = weakTypeOf[DecoderDataGen[Input, Output, Sub]]

      val modelGenName = c.freshName("modelGen")
      val tableName    = c.freshName("tableInstance")

      //Model to input's fields
      val inputFieldNames = input.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList

      //Model to output's fields
      //Some not confirm to inputFieldNames is use to map to the table
      val outputFieldNames = output.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(s => (s, s.name))
        .collect { case (member, TermName(n)) => (member, n.trim) }
        .toList

      //.reverse
      //Model to sub's fields
      val subFieldNames = sub.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList

      val notInputOutputFieldNames = outputFieldNames.filterNot(s => inputFieldNames.contains(s._2))

      //Table fields
      val tableFieldNames = fetchTableFields(table)

      def mgDef = q"""val ${TermName(modelGenName)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]"""

      val (fieldsPrepare, _, _) = notInputOutputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), (member, strName)) =>
          val newLawIndex = lawIndex + 1
          val needInput   = inputFieldNames.contains(strName)

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

            val newHelperIndex = if (!needInput) helperIndex + 1 else helperIndex
            val fieldName = FieldName(
                tableFields = usePlaceHolder
              , lawModelMember = member
              , law = strName
              , lawIndex = newLawIndex
              , mapperIndex = newHelperIndex
              , needInput = needInput
              , needSub = subFieldNames.contains(strName)
            )
            ((fieldName :: nameList), newLawIndex, newHelperIndex)
          }
      }

      val needToMapFields = fieldsPrepare.filter(s => !s.needInput)

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

      val fields    = deepFields
      val subFields = deepFields.filter(s => s.field.needSub)

      val q = c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] {
        q"""
        ${inputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          $mgDef
          ${decoderDataGen.typeSymbol.companion}
          .fromDataGenWrap(${toRepMapper(fields = needToMapFields, tableName = tableName, modelGenName = modelGenName)}.dataGenWrap) { (tempData, rep) =>
            ${lazyData.typeSymbol.companion}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
              ..${List(
            notInputOutputFieldNames.map { field =>
            q"""${TermName(field._2)} = ${appendIndexToTree(q"""tempData""", field._2)}"""
          }
          , inputFieldNames /*.filter(_.needInput)*/.map { field =>
            q"""${TermName(field)} = s.${TermName(field)}"""
          }
        ).flatten}

            ) }, sub = ${sub.typeSymbol.companion}(..${subFieldNames.map { field =>
          q"""${TermName(field)} = ${appendIndexToTree(q"""tempData""", field)}"""
        }}))
          }
        }
        """

      }
      //println(q + "\n" + "22" * 100)
      q
    }
  }

}
