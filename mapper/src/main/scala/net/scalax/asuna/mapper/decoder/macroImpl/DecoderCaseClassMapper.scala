package net.scalax.asuna.mapper.decoder.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
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
      val lazyModel         = weakTypeOf[LazyModel[Input, Output, Sub]]
      val decoderInputTable = weakTypeOf[DecoderInputTable[Table, Input, Output, Sub]]
      val decoderDataGen    = weakTypeOf[DecoderDataGen[Input, Output, Sub]]
      val propertyType      = weakTypeOf[PropertyType[_]]

      val tableName = c.freshName("tableInstance")

      //Model to input's fields
      val inputFieldNames = input.members.toList
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(s => (s, s.name))
        .collect {
          case (member, TermName(n)) =>
            val name = n.trim
            CaseClassField(
                name = name
              , rawField = member
              , fieldType = q"""${propertyType.typeSymbol.companion}.fromModel[${input}](_.${TermName(name)})"""
              , modelGetter = { modelVar: Tree =>
                q"""${modelVar}.${TermName(name)}"""
              }
              , modelSetter = { propertyVar: Tree =>
                q"""${TermName(name)} = ${propertyVar}"""
              }
            )
        }

      //Model to output's fields
      //Some not confirm to inputFieldNames is use to map to the table
      val outputFieldNames = output.members.toList
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(s => (s, s.name))
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

      //.reverse
      //Model to sub's fields
      val subFieldNames = sub.members.toList
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(s => (s, s.name))
        .collect {
          case (member, TermName(n)) =>
            val name = n.trim
            CaseClassField(
                name = name
              , rawField = member
              , fieldType = q"""${propertyType.typeSymbol.companion}.fromModel[${sub}](_.${TermName(name)})"""
              , modelGetter = { modelVar: Tree =>
                q"""${modelVar}.${TermName(name)}"""
              }
              , modelSetter = { propertyVar: Tree =>
                q"""${TermName(name)} = ${propertyVar}"""
              }
            )
        }

      val notInputOutputFieldNames = outputFieldNames.filterNot(s => inputFieldNames.map(_.name).contains(s.name))

      //Table fields
      val tableFieldNames = fetchTableFields(table)

      val (fieldsPrepare, _, _) = notInputOutputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
        case ((nameList, rawIndex, helperIndex), member) =>
          val newRawIndex = rawIndex + 1
          val needInput   = inputFieldNames.map(_.name).contains(member.name)

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

            val newHelperIndex = if (!needInput) helperIndex + 1 else helperIndex
            val fieldName = FieldName(
                tableFields = usePlaceHolder
              , rawModelMember = member.rawField
              , raw = member.name
              , rawIndex = newRawIndex
              , mapperIndex = newHelperIndex
              , needInput = needInput
              , needSub = subFieldNames.contains(member.name)
            )
            ((fieldName :: nameList), newRawIndex, newHelperIndex)
          }
      }

      val needToMapFields = fieldsPrepare.filter(s => !s.needInput)

      val deepFields = countDeep(fieldsPrepare.filter(s => !s.needInput))

      val q = c.Expr[DecoderInputTable.Aux[Table, Input, Output, Sub, Rep, TempData]] {
        q"""
        ${decoderInputTable.typeSymbol.companion} { ${TermName(tableName)}: ${table} =>
          ${decoderDataGen.typeSymbol.companion}
          .fromDataGenWrap(${toRepMapper(fields = needToMapFields, tableName = tableName, inputFields = outputFieldNames)}.dataGenWrap) { (tempData, rep) =>
            ${lazyModel.typeSymbol.companion}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
              ..${List(
            notInputOutputFieldNames.map { field =>
            q"""${TermName(field.name)} = ${appendIndexToTree(deepFields, q"""tempData""", field.name)}"""
          }
          , inputFieldNames.map { field =>
            q"""${TermName(field.name)} = s.${TermName(field.name)}"""
          }
        ).flatten}

            ) }, sub = ${sub.typeSymbol.companion}(..${subFieldNames.map { field =>
          q"""${TermName(field.name)} = ${appendIndexToTree(deepFields, q"""tempData""", field.name)}"""
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
