package net.scalax.asuna.mapper.encoder.macroImpl

import net.scalax.asuna.core.encoder.EncoderShapeValue
import net.scalax.asuna.mapper.common.macroImpl.{CopyHelper, RepMapperUtils}
import net.scalax.asuna.mapper.decoder.EmptyLazyModel
import net.scalax.asuna.mapper.encoder.{EncoderDataGen, EncoderInputTable, EncoderWrapApply, UnusedData}

object EncoderCaseClassMapper {

  class EncoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxEncoderCaseClassMapperImpl(c) {
    override val printlnTree = false

  }

  class BlackboxEncoderCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils with CopyHelper {

    import c.universe._

    def debugCaseClassSingleModelEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ](tableParam: c.Expr[Table]): c.Expr[EncoderShapeValue[Output, RepCol, DataCol]] = {
      val encoderInputTable = weakTypeOf[EncoderInputTable[Poly, Table, EmptyLazyModel, Output, EmptyLazyModel]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val output            = weakTypeOf[Output]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val encoderWrapApply  = weakTypeOf[EncoderWrapApply[RepCol, DataCol]]

      val tableName = c.freshName("table")

      val (content, encoderFields) = baseCaseClassEncoderGeneric[Poly, Table, EmptyLazyModel, Output, EmptyLazyModel, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""
        ${getCompanion(encoderWrapApply)}.encoderInstance[${repCol}, ${dataCol}].withSingleModel[${output}](${tableParam}) {
          ${getCompanion(encoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      """

      copySourceToTarget(completeTree.toString, encoderFields)

      c.Expr[EncoderShapeValue[Output, RepCol, DataCol]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def debugCaseClassLazyModelEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Unused: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ](tableParam: c.Expr[Table]): c.Expr[EncoderShapeValue[UnusedData[Input, Output, Unused], RepCol, DataCol]] = {
      val encoderInputTable = weakTypeOf[EncoderInputTable[Poly, Table, Input, Output, Unused]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val input             = weakTypeOf[Input]
      val output            = weakTypeOf[Output]
      val unused            = weakTypeOf[Unused]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val encoderWrapApply  = weakTypeOf[EncoderWrapApply[RepCol, DataCol]]

      val tableName = c.freshName("table")

      val (content, encoderFields) = baseCaseClassEncoderGeneric[Poly, Table, Input, Output, Unused, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""
        ${getCompanion(encoderWrapApply)}.encoderInstance[${repCol}, ${dataCol}].withUnusedModel[${input}, ${output}, ${unused}](${tableParam}) {
          ${getCompanion(encoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      """

      copySourceToTarget(completeTree.toString, encoderFields)

      c.Expr[EncoderShapeValue[UnusedData[Input, Output, Unused], RepCol, DataCol]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def caseClassEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Unused: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[EncoderInputTable.Aux[Poly, Table, Input, Output, Unused, Rep, TempData]] = {
      val encoderInputTable = weakTypeOf[EncoderInputTable[Poly, Input, Output, Unused, Output]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]

      val tableName = c.freshName("table")

      val (content, _) = baseCaseClassEncoderGeneric[Poly, Table, Input, Output, Unused, Rep, TempData](tableName)

      val q = q"""${getCompanion(encoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
          ${content}
        }"""

      c.Expr[EncoderInputTable.Aux[Poly, Table, Input, Output, Unused, Rep, TempData]](q)
    }

    def baseCaseClassEncoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Unused: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ](tableName: String): (Tree, List[EncoderField]) = {
      val poly           = weakTypeOf[Poly]
      val rep            = weakTypeOf[Rep]
      val tempData       = weakTypeOf[TempData]
      val input          = weakTypeOf[Input]
      val output         = weakTypeOf[Output]
      val unused         = weakTypeOf[Unused]
      val table          = weakTypeOf[Table]
      val encoderDataGen = weakTypeOf[EncoderDataGen[Input, Output, Unused]]

      val inputFieldNames = getCaseClassFields(input).map(
          s =>
          s.copy(modelGetter = { modelVar: Tree =>
            s.modelGetter(q"""${modelVar}.input""")
          })
      )
      /*input.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(s => (s, s.name)).collect {
        case (member, TermName(n)) =>
          val name = n.trim
          CaseClassField(
              name = name
            , rawField = member
            , fieldType = q"""${proCompanion}.fromModel[${input}](_.${TermName(name)})"""
            , modelGetter = { modelVar: Tree =>
              q"""${modelVar}.input.${TermName(name)}"""
            }
          )
      }*/

      val outputFieldNames = getCaseClassFields(output).map(
          s =>
          s.copy(modelGetter = { modelVar: Tree =>
            s.modelGetter(q"""${modelVar}.model""")
          })
      )
      /*output.members.toList.reverse
        .filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal)
        .map(s => (s, s.name))
        .collect {
          case (member, TermName(n)) =>
            /*val Ident(TermName(aaaa)) = q"""${member.asTerm.name}"""
            println(aaaa * 100)*/
            val name = n.trim
            CaseClassField(
                name = name
              , rawField = member
              , fieldType = q"""${proCompanion}.fromModel[${output}](_.${TermName(name)})"""
              , modelGetter = { modelVar: Tree =>
                q"""${modelVar}.model.${TermName(name)}"""
              }
            )
        }
        .reverse*/

      val unusedFieldNames = getCaseClassFields(unused)
      //unused.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(_.name).collect { case TermName(n) => n.trim }

      val tableFieldNames = fetchTableFields(table)

      val notInputOutputFieldNames = outputFieldNames.filter(s => !unusedFieldNames.map(_.name).contains(s.name)) ::: inputFieldNames

      val fields = getEncoderMembers(notInputOutputFieldNames, tableFieldNames)

      val content = q"""${getCompanion(encoderDataGen)}
        .fromDataGenWrap[$input, $output, $unused](${toRepMapper(fields = fields, tableName = Ident(TermName(tableName)))}.dataGenWrap) { (caseClass, rep) =>
        ${fullSetCaseClass(fields = fields, caseClassVarName = "caseClass")}
      }"""

      (content, fields)

    }

  }

}
