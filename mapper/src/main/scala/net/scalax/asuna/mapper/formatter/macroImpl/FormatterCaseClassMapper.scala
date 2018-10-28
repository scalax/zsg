package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
import net.scalax.asuna.mapper.common.macroImpl.RepMapperUtils
import net.scalax.asuna.mapper.decoder.EmptyLazyModel
import net.scalax.asuna.mapper.encoder.UnusedData
import net.scalax.asuna.mapper.formatter.{FormatterDataGen, FormatterInputTable}

object FormatterCaseClassMapper {

  class FormatterCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxFormatterCaseClassMapperImpl(c) {
    override val printlnTree = false
  }

  class BlackboxFormatterCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils {

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

      val outputFieldNames = output.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(s => (s, s.name)).collect {
        case (member, TermName(n)) =>
          val name = n.trim
          CaseClassField(
              name = name
            , rawField = member
            , fieldType = q"""${propertyType.typeSymbol.companion}.fromModel[${output}](_.${TermName(name)})"""
            , modelGetter = { modelVar: Tree =>
              q"""${modelVar}.${TermName(name)}"""
            }
          )
      }

      val tableFieldNames = fetchTableFields(table)

      val fields = getFormatterMembers(outputFieldNames, tableFieldNames)
      val fieldValue = countDeep(fields).flatMap { value =>
        value.toSetter("tempData")
      }.toMap

      val q = c.Expr[FormatterInputTable.Aux[Table, Output, Rep, TempData]] {
        q"""
        ${formatterInputTable.typeSymbol.companion}{ ${TermName(tableName)}: ${table} =>
          ${formatterDataGen.typeSymbol.companion}
          .fromDataGenWrap[$output](${toRepMapper(fields = fields, tableName = tableName)}.dataGenWrap) { (caseClass, rep) =>
            ${fullSetCaseClass(fields = fields, caseClassVarName = "caseClass")}
          } { (tempData, rep) =>
           ${output.typeSymbol.companion}(
            ..${outputFieldNames.map(n => q"""${TermName(n.name)} = ${fieldValue(n.name)}""")}
            ) }
           }
                   """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}
