package net.scalax.asuna.mapper.encoder.macroImpl

import net.scalax.asuna.mapper.common.ModelGen
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.encoder.{EncoderDataGen, EncoderInputTable}

object EncoderCaseClassMapper {

  class EncoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends RepMapperUtils {

    import c.universe._

    def caseclassEncoderGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[EncoderInputTable.Aux[Table, Output, Rep, TempData]] = {
      val rep               = weakTypeOf[Rep]
      val tempData          = weakTypeOf[TempData]
      val output            = weakTypeOf[Output]
      val table             = weakTypeOf[Table]
      val outputModelGen    = weakTypeOf[ModelGen[Output]]
      val encoderInputTable = weakTypeOf[EncoderInputTable[Table, Output]]
      val encoderDataGen    = weakTypeOf[EncoderDataGen[Output]]

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

      val fields = fieldsPrepare

      val q = c.Expr[EncoderInputTable.Aux[Table, Output, Rep, TempData]] {
        q"""
        ${encoderInputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          $mgDef
          ${encoderDataGen.typeSymbol.companion}
          .fromDataGenWrap[$output](${toRepMapper(fields = fields, tableName = tableName, modelGenName = modelGenName)}.dataGenWrap) { (caseClass, rep) =>
            ${fullSetCaseClass(fields)}
          }
        }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}
