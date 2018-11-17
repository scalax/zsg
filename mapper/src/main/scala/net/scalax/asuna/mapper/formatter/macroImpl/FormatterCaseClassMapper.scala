package net.scalax.asuna.helper.data.macroImpl

import net.scalax.asuna.core.formatter.FormatterShapeValue
import net.scalax.asuna.mapper.common.macroImpl.{GenFileOutputHelper, RepMapperUtils}
import net.scalax.asuna.mapper.decoder.EmptyLazyModel
import net.scalax.asuna.mapper.encoder.UnusedData
import net.scalax.asuna.mapper.formatter.{FormatterDataGen, FormatterInputTable, FormatterWrapApply}

object FormatterCaseClassMapper {

  class FormatterCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxFormatterCaseClassMapperImpl(c) {
    override val printlnTree = false
  }

  class BlackboxFormatterCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils with GenFileOutputHelper {

    import c.universe._

    def debugCaseClassFormatterGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , EncoderDataCol: c.WeakTypeTag
      , DecoderDataCol: c.WeakTypeTag
    ](tableParam: c.Expr[Table]): c.Expr[FormatterShapeValue[Output, RepCol, EncoderDataCol, DecoderDataCol]] = {
      val formatterInputTable = weakTypeOf[FormatterInputTable[Poly, Table, Output]]
      val poly                = weakTypeOf[Poly]
      val table               = weakTypeOf[Table]
      val output              = weakTypeOf[Output]
      val repCol              = weakTypeOf[RepCol]
      val encoderDataCol      = weakTypeOf[EncoderDataCol]
      val decoderDataCol      = weakTypeOf[DecoderDataCol]
      val formatterWrapApply  = weakTypeOf[FormatterWrapApply[RepCol, EncoderDataCol, DecoderDataCol]]

      val tableName = c.freshName("table")

      val (content, formatterFields) = baseCaseClassFormatterGeneric[Poly, Table, Output, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""
        ${getCompanion(formatterWrapApply)}.formatterInstance[${repCol}, ${encoderDataCol}, ${decoderDataCol}].withModel[${output}](${tableParam}) {
          ${getCompanion(formatterInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      """

      copySourceToTarget(completeTree.toString, formatterFields)

      c.Expr[FormatterShapeValue[Output, RepCol, EncoderDataCol, DecoderDataCol]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def caseClassFormatterGeneric[Poly: c.WeakTypeTag, Table: c.WeakTypeTag, Output: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]
      : c.Expr[FormatterInputTable.Aux[Poly, Table, Output, Rep, TempData]] = {
      val formatterInputTable = weakTypeOf[FormatterInputTable[Poly, Table, Output]]
      val poly                = weakTypeOf[Poly]
      val table               = weakTypeOf[Table]

      val tableName = c.freshName("table")

      val (content, _) = baseCaseClassFormatterGeneric[Poly, Table, Output, Rep, TempData](tableName)

      val q = q"""${getCompanion(formatterInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
          ${content}
        }"""

      c.Expr[FormatterInputTable.Aux[Poly, Table, Output, Rep, TempData]](q)
    }

    def baseCaseClassFormatterGeneric[Poly: c.WeakTypeTag, Table: c.WeakTypeTag, Output: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag](
        tableName: String
    ): (Tree, List[FormatterField]) = {
      val rep              = weakTypeOf[Rep]
      val tempData         = weakTypeOf[TempData]
      val output           = weakTypeOf[Output]
      val table            = weakTypeOf[Table]
      val formatterDataGen = weakTypeOf[FormatterDataGen[Output]]
      val unusedData       = weakTypeOf[UnusedData[EmptyLazyModel, Output, EmptyLazyModel]]

      val outputFieldNames = getCaseClassFields(output)

      val tableFieldNames = fetchTableFields(table)

      val fields = getFormatterMembers(outputFieldNames, tableFieldNames)
      val fieldValue = countDeep(fields).flatMap { value =>
        value.toSetter("tempData")
      }.toMap
      val tempFieldSetter = outputFieldNames.map(s => (s.name, fieldValue.get(s.name))).collect { case (name, Some(s)) => (name, s) }.map {
        case (name, tree) => q"""${TermName(name)} = ${tree}"""
      }

      val content = q"""${getCompanion(formatterDataGen)}
        .fromDataGenWrap[$output](${toRepMapper(fields = fields, tableName = Ident(TermName(tableName)))}.dataGenWrap) { (caseClass, rep) =>
        ${fullSetCaseClass(fields = fields, caseClassVarName = "caseClass")}
      } { (tempData, rep) =>
        new ${output}(
        ..${tempFieldSetter}
        ) }"""

      (content, fields)

    }

  }

}
