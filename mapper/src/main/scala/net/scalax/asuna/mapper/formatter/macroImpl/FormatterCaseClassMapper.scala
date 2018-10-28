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

    def caseclassFormatterGeneric[Poly: c.WeakTypeTag, Table: c.WeakTypeTag, Output: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[FormatterInputTable.Aux[Poly, Table, Output, Rep, TempData]] = {
      val rep                 = weakTypeOf[Rep]
      val poly                = weakTypeOf[Poly]
      val tempData            = weakTypeOf[TempData]
      val output              = weakTypeOf[Output]
      val table               = weakTypeOf[Table]
      val formatterInputTable = weakTypeOf[FormatterInputTable[Poly, Table, Output]]
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
      val tempFieldSetter = outputFieldNames.map(s => (s.name, fieldValue.get(s.name))).collect { case (name, Some(s)) => (name, s) }.map {
        case (name, tree) => q"""${TermName(name)} = ${tree}"""
      }

      val content = q"""${formatterDataGen.typeSymbol.companion}
        .fromDataGenWrap[$output](${toRepMapper(fields = fields, tableName = tableName)}.dataGenWrap) { (caseClass, rep) =>
        ${fullSetCaseClass(fields = fields, caseClassVarName = "caseClass")}
      } { (tempData, rep) =>
        ${output.typeSymbol.companion}(
        ..${tempFieldSetter}
        ) }"""

      val content1 = if (printlnTree) q"""${content}.debug""" else content

      val q = q"""${formatterInputTable.typeSymbol.companion}[${poly}] { ${TermName(tableName)}: ${table} =>
          ${content1}
        }"""

      if (printlnTree)
        println(q + "\n" + "22" * 100)

      c.Expr[FormatterInputTable.Aux[Poly, Table, Output, Rep, TempData]](q)
    }

  }

}
