package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.decoder.EmptyLazyModel
import net.scalax.asuna.mapper.encoder.UnusedData
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
      val formatterInputTable = weakTypeOf[FormatterInputTable[Table, Output]]
      val formatterDataGen    = weakTypeOf[FormatterDataGen[Output]]
      val unusedData          = weakTypeOf[UnusedData[EmptyLazyModel, Output, EmptyLazyModel]]
      val propertyType        = weakTypeOf[PropertyType[_]]

      val tableName = c.freshName("tableInstance")

      val outputFieldNames = output.members.toList
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map { s =>
          (s, s.name)
        }
        .collect {
          case (member, TermName(n)) =>
            val name = n.trim
            CaseClassField(
                name = name
              , rawField = member
              , fieldType = q"""${propertyType.typeSymbol.companion}.fromModel[${output}](_.${TermName(name)})"""
              , modelGetter = { modelVar: Tree =>
                q"""${modelVar}.${TermName(name)}"""
              }
              , modelSetter = { propertyVar: Tree =>
                q"""${TermName(name)} = ${propertyVar}"""
              }
            )
        }
        .reverse

      val tableFieldNames = fetchTableFields(table)

      val (fieldsPrepare, _, _) = outputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
        case ((nameList, rawIndex, helperIndex), member) =>
          val newRawIndex = rawIndex + 1

          val alreadExists = nameList.exists { s =>
            s.tableFields
              .map(
                  c =>
                  c.key match {
                    case Left(r: SingleKey) =>
                      r.singleKey == member.name
                    case Right(mk: MutiplyKey) =>
                      mk.mutiplyKey.contains(member.name)
                  }
              )
              .getOrElse(false)
          }
          if (alreadExists)
            (nameList, rawIndex, helperIndex)
          else {
            val usePlaceHolder = tableFieldNames.find { s =>
              s.key match {
                case Left(r: SingleKey) =>
                  r.singleKey == member.name
                case Right(mk: MutiplyKey) =>
                  mk.mutiplyKey.contains(member.name)
              }
            }

            val newHelperIndex = helperIndex + 1
            val fieldName = FieldName(
                tableFields = usePlaceHolder
              , rawModelMember = member.rawField
              , raw = member.name
              , rawIndex = newRawIndex
              , mapperIndex = newHelperIndex
              , needInput = false
              , needSub = false
            )
            ((fieldName :: nameList), newRawIndex, newHelperIndex)
          }
      }

      val deepFields = countDeep(fieldsPrepare.filter(s => !s.needInput))

      val q = c.Expr[FormatterInputTable.Aux[Table, Output, Rep, TempData]] {
        q"""
        ${formatterInputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          ${formatterDataGen.typeSymbol.companion}
          .fromDataGenWrap[$output](${toRepMapper(fields = fieldsPrepare, tableName = tableName, inputFields = outputFieldNames)}.dataGenWrap) { (caseClass1, rep) =>
            val caseClass = ${unusedData.typeSymbol.companion}.simple(caseClass1)
            ${fullSetCaseClass(fieldsPrepare, fieldNames = outputFieldNames)}
          } { (tempData, rep) =>
           ${output.typeSymbol.companion}(
            ..${List(
            outputFieldNames.map { field =>
            q"""${TermName(field.name)} = ${appendIndexToTree(deepFields, q"""tempData""", field.name)}"""
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
