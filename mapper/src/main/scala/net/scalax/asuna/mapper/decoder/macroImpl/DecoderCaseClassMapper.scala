package net.scalax.asuna.mapper.decoder.macroImpl

import net.scalax.asuna.mapper.common.ModelGen
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.decoder.{DecoderDataGen, DecoderInputTable, LazyModel}

object DecoderCaseClassMapper {

  class DecoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends RepMapperUtils {
    self =>

    import c.universe._

    def caseclassDecoderGeneric[
        Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Sub: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[DecoderInputTable.Aux[Table, Input, Output, Sub, Rep, TempData]] = {
      val rep               = weakTypeOf[Rep]
      val tempData          = weakTypeOf[TempData]
      val input             = weakTypeOf[Input]
      val output            = weakTypeOf[Output]
      val sub               = weakTypeOf[Sub]
      val table             = weakTypeOf[Table]
      val outputModelGen    = weakTypeOf[ModelGen[Output]]
      val lazyModel         = weakTypeOf[LazyModel[Input, Output, Sub]]
      val decoderInputTable = weakTypeOf[DecoderInputTable[Table, Input, Output, Sub]]
      val decoderDataGen    = weakTypeOf[DecoderDataGen[Input, Output, Sub]]

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

      val deepFields = countDeep(fieldsPrepare.filter(s => !s.needInput))

      val q = c.Expr[DecoderInputTable.Aux[Table, Input, Output, Sub, Rep, TempData]] {
        q"""
        ${decoderInputTable.typeSymbol.companion} { ${TermName(tableName)}: ${table} =>
          $mgDef
          ${decoderDataGen.typeSymbol.companion}
          .fromDataGenWrap(${toRepMapper(fields = needToMapFields, tableName = tableName, modelGenName = modelGenName)}.dataGenWrap) { (tempData, rep) =>
            ${lazyModel.typeSymbol.companion}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
              ..${List(
            notInputOutputFieldNames.map { field =>
            q"""${TermName(field._2)} = ${appendIndexToTree(deepFields, q"""tempData""", field._2)}"""
          }
          , inputFieldNames.map { field =>
            q"""${TermName(field)} = s.${TermName(field)}"""
          }
        ).flatten}

            ) }, sub = ${sub.typeSymbol.companion}(..${subFieldNames.map { field =>
          q"""${TermName(field)} = ${appendIndexToTree(deepFields, q"""tempData""", field)}"""
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
