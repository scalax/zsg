package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.mapper.common.ModelGen
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.formatter.{FormatterDataGen, FormatterInputTable}

object FormatterCaseClassMapper {

  class FormatterCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends RepMapperUtils {

    import c.universe._

    def caseclassFormatterGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[FormatterInputTable.Aux[Table, Output, Rep, TempData]] = {
      val rep                 = weakTypeOf[Rep]
      val tempData            = weakTypeOf[TempData]
      val output              = weakTypeOf[Output]
      val table               = weakTypeOf[Table]
      val outputModelGen      = weakTypeOf[ModelGen[Output]]
      val formatterInputTable = weakTypeOf[FormatterInputTable[Table, Output]]
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

      val deepFields = countDeep(fieldsPrepare.filter(s => !s.needInput))

      val q = c.Expr[FormatterInputTable.Aux[Table, Output, Rep, TempData]] {
        q"""
        ${formatterInputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          $mgDef
          ${formatterDataGen.typeSymbol.companion}
          .fromDataGenWrap[$output](${toRepMapper(fields = fieldsPrepare, tableName = tableName, modelGenName = modelGenName)}.dataGenWrap) { (caseClass, rep) =>
            ${fullSetCaseClass(fieldsPrepare)}
          } { (tempData, rep) =>
           ${output.typeSymbol.companion}(
            ..${List(
            outputFieldNames.map { field =>
            q"""${TermName(field._2)} = ${appendIndexToTree(deepFields, q"""tempData""", field._2)}"""
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
