package net.scalax.asuna.mapper.encoder.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.encoder.{EncoderDataGen, EncoderInputTable}

object EncoderCaseClassMapper {

  class EncoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxEncoderCaseClassMapperImpl(c) {
    override val printlnTree = false

  }

  class BlackboxEncoderCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils {

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

      val inputFieldNames = input.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(s => (s, s.name)).collect {
        case (member, TermName(n)) =>
          val name = n.trim
          CaseClassField(
              name = name
            , rawField = member
            , fieldType = q"""${propertyType.typeSymbol.companion}.fromModel[${input}](_.${TermName(name)})"""
            , modelGetter = { modelVar: Tree =>
              q"""${modelVar}.input.${TermName(name)}"""
            }
          )
      }

      val outputFieldNames = output.members.toList.reverse
        .filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal)
        .map(s => (s, s.name))
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
            )
        }
        .reverse

      val unusedFieldNames =
        unused.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(_.name).collect { case TermName(n) => n.trim }

      val tableFieldNames = fetchTableFields(table)

      val notInputOutputFieldNames = outputFieldNames.filter(s => !unusedFieldNames.contains(s.name)) ::: inputFieldNames

      val fields = getEncoderMembers(notInputOutputFieldNames, tableFieldNames)

      val content = q"""${encoderDataGen.typeSymbol.companion}
        .fromDataGenWrap[$input, $output, $unused](${toRepMapper(fields = fields, tableName = tableName)}.dataGenWrap) { (caseClass, rep) =>
        ${fullSetCaseClass(fields = fields, caseClassVarName = "caseClass")}
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
