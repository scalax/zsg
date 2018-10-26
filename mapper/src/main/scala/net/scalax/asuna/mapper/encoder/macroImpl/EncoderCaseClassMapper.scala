package net.scalax.asuna.mapper.encoder.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.encoder.{EncoderDataGen, EncoderInputTable}

object EncoderCaseClassMapper {

  class EncoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends EncoderCaseClassMapperImpl_blackbox(c) {
    override val printlnTree = false

  }

  class EncoderCaseClassMapperImpl_blackbox(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils {

    val printlnTree = true

    import c.universe._

    def caseclassEncoderGeneric[
        Poly: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Unused: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[EncoderInputTable.Aux[Poly, Table, Input, Output, Unused, Rep, TempData]] = {
      val poly              = weakTypeOf[Poly]
      val rep               = weakTypeOf[Rep]
      val tempData          = weakTypeOf[TempData]
      val input             = weakTypeOf[Input]
      val output            = weakTypeOf[Output]
      val unused            = weakTypeOf[Unused]
      val table             = weakTypeOf[Table]
      val encoderInputTable = weakTypeOf[EncoderInputTable[Poly, Table, Input, Output, Unused]]
      val encoderDataGen    = weakTypeOf[EncoderDataGen[Input, Output, Unused]]
      val propertyType      = weakTypeOf[PropertyType[_]]

      val tableName = c.freshName("tableInstance")

      val inputFieldNames = input.members.toList.reverse
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
                q"""${modelVar}.input.${TermName(name)}"""
              }
              , modelSetter = { propertyVar: Tree =>
                q"""${TermName(name)} = ${propertyVar}"""
              }
            )
        }

      val outputFieldNames = output.members.toList.reverse
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
                q"""${modelVar}.model.${TermName(name)}"""
              }
              , modelSetter = { propertyVar: Tree =>
                q"""${TermName(name)} = ${propertyVar}"""
              }
            )
        }
        .reverse

      val unusedFieldNames = unused.members.toList.reverse
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

      /*val (fieldsPrepare, _, _) = notInputOutputFieldNames.foldLeft((List.empty[FieldName], 0, 0)) {
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

      val fields = fieldsPrepare*/

      val fields = getEncoderMembers(notInputOutputFieldNames, tableFieldNames)

      val content = q"""${encoderDataGen.typeSymbol.companion}
        .fromDataGenWrap[$input, $output, $unused](${toRepMapper1111(fields = fields, tableName = tableName)}.dataGenWrap) { (caseClass, rep) =>
        ${fullSetCaseClass1111(fields = fields, caseClassVarName = "caseClass")}
      }"""

      val content1 = if (printlnTree) q"""${content}.debug""" else content

      val q = q"""
        ${encoderInputTable.typeSymbol.companion}[${poly}]{ ${TermName(tableName)}: ${table} =>
          ${content1}
        }
        """

      if (printlnTree)
        println(q + "\n" + "22" * 100)

      c.Expr[EncoderInputTable.Aux[Poly, Table, Input, Output, Unused, Rep, TempData]] {
        q
      }
    }

  }

}
