package net.scalax.asuna.mapper.encoder.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.encoder.{EncoderDataGen, EncoderInputTable}

object EncoderCaseClassMapper {

  class EncoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends EncoderCaseClassMapperImpl_blackbox(c)

  class EncoderCaseClassMapperImpl_blackbox(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils {

    import c.universe._

    def caseclassEncoderGeneric[
        Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Unused: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[EncoderInputTable.Aux[Table, Input, Output, Unused, Rep, TempData]] = {
      val rep               = weakTypeOf[Rep]
      val tempData          = weakTypeOf[TempData]
      val input             = weakTypeOf[Input]
      val output            = weakTypeOf[Output]
      val unused            = weakTypeOf[Unused]
      val table             = weakTypeOf[Table]
      val encoderInputTable = weakTypeOf[EncoderInputTable[Table, Input, Output, Unused]]
      val encoderDataGen    = weakTypeOf[EncoderDataGen[Input, Output, Unused]]
      val propertyType      = weakTypeOf[PropertyType[_]]

      val tableName = c.freshName("tableInstance")

      val inputFieldNames = input.members.toList
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
              , fieldType = q"""${propertyType.typeSymbol.companion}.fromModel[${input}](_.${TermName(name)})"""
              , modelGetter = { modelVar: Tree =>
                q"""${modelVar}.${TermName(name)}"""
              }
              , modelSetter = { propertyVar: Tree =>
                q"""${TermName(name)} = ${propertyVar}"""
              }
            )
        }

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

      val unusedFieldNames = unused.members.toList
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
              , fieldType = q"""${propertyType.typeSymbol.companion}.fromModel[${unused}](_.${TermName(name)})"""
              , modelGetter = { modelVar: Tree =>
                q"""${modelVar}.${TermName(name)}"""
              }
              , modelSetter = { propertyVar: Tree =>
                q"""${TermName(name)} = ${propertyVar}"""
              }
            )
        }

      val tableFieldNames = fetchTableFields(table)

      val notInputOutputFieldNames = outputFieldNames.filter(s => !unusedFieldNames.map(_.name).contains(s.name)) ::: inputFieldNames

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

      val (fieldsPrepare, _, _) = notInputOutputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
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

      val fields = fieldsPrepare

      val q = c.Expr[EncoderInputTable.Aux[Table, Input, Output, Unused, Rep, TempData]] {

        q"""
        ${encoderInputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          ${encoderDataGen.typeSymbol.companion}
          .fromDataGenWrap[$input, $output, $unused](${toRepMapper(
            fields = fields
          , tableName = tableName
          , inputFields = notInputOutputFieldNames
        )}.dataGenWrap) { (caseClass, rep) =>
            ${fullSetCaseClass(
            nameList = fields
          , fieldNames = inputFieldNames.map(
              s =>
              s.copy(modelGetter = { tree: Tree =>
                s.modelGetter(q"""${tree}.input""")
              })
          ) ::: outputFieldNames.map(
              s =>
              s.copy(modelGetter = { tree: Tree =>
                s.modelGetter(q"""${tree}.model""")
              })
          )
          , caseClassVarName = "caseClass"
        )}
          }
        }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}
