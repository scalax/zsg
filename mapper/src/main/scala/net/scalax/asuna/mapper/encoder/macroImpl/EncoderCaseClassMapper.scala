package org.scalax.asuna.mapper.encoder.macroImpl

import org.scalax.asuna.core.encoder.EncoderShapeValue
import org.scalax.asuna.mapper.common.macroImpl.{GenFileOutputHelper, RepMapperUtils}
import org.scalax.asuna.mapper.encoder.{EncoderDataGen, EncoderInputTable, EncoderWrapApply}

object EncoderCaseClassMapper {

  class EncoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxEncoderCaseClassMapperImpl(c) {
    override val printlnTree = false
  }

  class BlackboxEncoderCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils with GenFileOutputHelper {

    import c.universe._

    def debugCaseClassSingleModelEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ]: c.Expr[EncoderInputTable.Aux[Poly, Table, Output, Any, Any]] = {
      val encoderInputTable = weakTypeOf[EncoderInputTable[Poly, Table, Output]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val output            = weakTypeOf[Output]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val encoderWrapApply  = weakTypeOf[EncoderWrapApply[RepCol, DataCol]]

      val tableName = c.freshName("table")

      val (content, encoderFields) = baseCaseClassEncoderGeneric[Poly, Table, Output, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""{ (${TermName(tableName)} :${table}) =>
        ${getCompanion(encoderWrapApply)}.encoderInstance[${repCol}, ${dataCol}].withSingleModel[${output}](${tableName}) {
          ${getCompanion(encoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      }"""

      copySourceToTarget(
          showCode(
            tree = completeTree
          , printTypes = Option(true)
          , printIds = Option(true)
          , printOwners = Option(true)
          , printPositions = Option(true)
          , printRootPkg = true
        )
        , encoderFields
      )

      c.Expr[EncoderInputTable.Aux[Poly, Table, Output, Any, Any]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def debugCaseClassLazyModelEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Model: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ](tableParam: c.Expr[Table]): c.Expr[EncoderShapeValue[Model, RepCol, DataCol]] = {
      val encoderInputTable = weakTypeOf[EncoderInputTable[Poly, Table, Model]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val unusedModel       = weakTypeOf[Model]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val encoderWrapApply  = weakTypeOf[EncoderWrapApply[RepCol, DataCol]]

      val tableName = c.freshName("table")

      val (content, encoderFields) = baseCaseClassEncoderGeneric[Poly, Table, Model, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""
        ${getCompanion(encoderWrapApply)}.encoderInstance[${repCol}, ${dataCol}].withUnusedModel[${unusedModel}](${tableParam}) {
          ${getCompanion(encoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      """

      copySourceToTarget(completeTree.toString, encoderFields)

      c.Expr[EncoderShapeValue[Model, RepCol, DataCol]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def caseClassEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Model: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[EncoderInputTable.Aux[Poly, Table, Model, Rep, TempData]] = {
      val encoderInputTable = weakTypeOf[EncoderInputTable[Poly, Table, Model]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]

      val tableName = c.freshName("table")

      val (content, _) = baseCaseClassEncoderGeneric[Poly, Table, Model, Rep, TempData](tableName)

      val q = q"""${getCompanion(encoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
          ${content}
        }"""

      c.Expr[EncoderInputTable.Aux[Poly, Table, Model, Rep, TempData]](q)
    }

    def baseCaseClassEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Model: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ](tableName: String): (Tree, List[EncoderField]) = {
      val poly           = weakTypeOf[Poly]
      val rep            = weakTypeOf[Rep]
      val tempData       = weakTypeOf[TempData]
      val unusedModel    = weakTypeOf[Model]
      val table          = weakTypeOf[Table]
      val encoderDataGen = weakTypeOf[EncoderDataGen[Model]]

      val input  = unusedModel.member(TermName("input")).asTerm.typeSignatureIn(unusedModel).resultType
      val output = unusedModel.member(TermName("model")).asTerm.typeSignatureIn(unusedModel).resultType
      val unused = unusedModel.member(TermName("unused")).asTerm.typeSignatureIn(unusedModel).resultType

      val inputFieldNames = getCaseClassFields(input).map(
          s =>
          s.copy(modelGetter = { modelVar: Tree =>
            s.modelGetter(q"""${modelVar}.input""")
          })
      )

      val outputFieldNames = getCaseClassFields(output).map(
          s =>
          s.copy(modelGetter = { modelVar: Tree =>
            s.modelGetter(q"""${modelVar}.model""")
          })
      )

      val unusedFieldNames = getCaseClassFields(unused)

      val tableFieldNames = fetchTableFields(table)

      val notInputOutputFieldNames = outputFieldNames.filter(s => !unusedFieldNames.map(_.name).contains(s.name)) ::: inputFieldNames

      val fields = getEncoderMembers(notInputOutputFieldNames, tableFieldNames)

      val content = q"""${getCompanion(encoderDataGen)}
        .fromDataGenWrap[$unusedModel](${toRepMapper(fields = fields, tableName = Ident(TermName(tableName)))}) { (caseClass, rep) =>
        ${fullSetCaseClass(fields = fields, caseClassVarName = "caseClass")}
      }"""

      (content, fields)

    }

  }

}
