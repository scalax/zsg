package net.scalax.asuna.mapper.decoder.macroImpl

import net.scalax.asuna.core.decoder.DecoderShapeValue
import net.scalax.asuna.mapper.common.macroImpl.{CopyHelper, RepMapperUtils}
import net.scalax.asuna.mapper.decoder._

object DecoderCaseClassMapper {

  class DecoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxDecoderCaseClassMapperImpl(c) {
    override val printlnTree = false
  }

  class BlackboxDecoderCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils with CopyHelper {
    self =>

    import c.universe._

    def debugCaseClassSingleModelDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ](tableParam: c.Expr[Table]): c.Expr[DecoderShapeValue[Output, RepCol, DataCol]] = {
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Table, EmptyLazyModel, Output, EmptyLazyModel]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val output            = weakTypeOf[Output]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val decoderWrapApply  = weakTypeOf[DecoderWrapApply[RepCol, DataCol]]

      val tableName = c.freshName("table")

      val (content, decoderFields) = baseCaseClassDecoderGeneric[Poly, Table, EmptyLazyModel, Output, EmptyLazyModel, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""
        ${getCompanion(decoderWrapApply)}.decoderInstance[${repCol}, ${dataCol}].withSingleModel[${output}](${tableParam}) {
          ${getCompanion(decoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      """

      copySourceToTarget(completeTree.toString, decoderFields)

      c.Expr[DecoderShapeValue[Output, RepCol, DataCol]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def debugCaseClassLazyModelDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Sub: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ](tableParam: c.Expr[Table]): c.Expr[DecoderShapeValue[LazyModel[Input, Output, Sub], RepCol, DataCol]] = {
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Table, Input, Output, Sub]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val input             = weakTypeOf[Input]
      val output            = weakTypeOf[Output]
      val sub               = weakTypeOf[Sub]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val decoderWrapApply  = weakTypeOf[DecoderWrapApply[RepCol, DataCol]]

      val tableName = c.freshName("table")

      val (content, decoderFields) = baseCaseClassDecoderGeneric[Poly, Table, Input, Output, Sub, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""
        ${getCompanion(decoderWrapApply)}.decoderInstance[${repCol}, ${dataCol}].withLazyModel[${input}, ${output}, ${sub}](${tableParam}) {
          ${getCompanion(decoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      """

      copySourceToTarget(completeTree.toString, decoderFields)

      c.Expr[DecoderShapeValue[LazyModel[Input, Output, Sub], RepCol, DataCol]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def caseClassDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Sub: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[DecoderInputTable.Aux[Poly, Table, Input, Output, Sub, Rep, TempData]] = {
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Input, Output, Sub, Output]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]

      val tableName = c.freshName("table")

      val (content, _) = baseCaseClassDecoderGeneric[Poly, Table, Input, Output, Sub, Rep, TempData](tableName)

      val q = q"""${getCompanion(decoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
          ${content}
        }"""

      c.Expr[DecoderInputTable.Aux[Poly, Table, Input, Output, Sub, Rep, TempData]](q)
    }

    def baseCaseClassDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Sub: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ](tableName: String): (Tree, List[DecoderField]) = {
      val rep               = weakTypeOf[Rep]
      val tempData          = weakTypeOf[TempData]
      val poly              = weakTypeOf[Poly]
      val input             = weakTypeOf[Input]
      val output            = weakTypeOf[Output]
      val sub               = weakTypeOf[Sub]
      val table             = weakTypeOf[Table]
      val lazyModel         = weakTypeOf[LazyModel[Input, Output, Sub]]
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Table, Input, Output, Sub]]
      val decoderDataGen    = weakTypeOf[DecoderDataGen[Input, Output, Sub]]

      //Model to input's fields
      val inputFieldNames = getCaseClassFields(input)
      /*input.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(s => (s, s.name)).collect {
        case (member, TermName(n)) =>
          val name = n.trim
          CaseClassField(
              name = name
            , rawField = member
            , fieldType = q"""${proCompanion}.fromModel[${input}](_.${TermName(name)})"""
            , modelGetter = { modelVar: Tree =>
              q"""${modelVar}.${TermName(name)}"""
            }
          )
      }*/

      //Model to output's fields
      //Some not confirm to inputFieldNames is use to map to the table
      val outputFieldNames = getCaseClassFields(output)
      /*output.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(s => (s, s.name)).collect {
        case (member, TermName(n)) =>
          val name = n.trim
          CaseClassField(
              name = name
            , rawField = member
            , fieldType = q"""${proCompanion}.fromModel[${output}](_.${TermName(name)})"""
            , modelGetter = { modelVar: Tree =>
              q"""${modelVar}.${TermName(name)}"""
            }
          )
      }*/

      //.reverse
      //Model to sub's fields
      val subFieldNames = getCaseClassFields(sub)
      //sub.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(_.name).collect { case TermName(n) => n.trim }

      val notInputOutputFieldNames = outputFieldNames.filterNot(s => inputFieldNames.map(_.name).contains(s.name))

      //Table fields
      val tableFieldNames = fetchTableFields(table)

      val decoderFields = getDecoderMembers(notInputOutputFieldNames, tableFieldNames)
      val fieldValue = countDeep(decoderFields).flatMap { value =>
        value.toSetter("tempData")
      }.toMap
      val tempFieldSetter = notInputOutputFieldNames.map(s => (s.name, fieldValue.get(s.name))).collect { case (name, Some(s)) => (name, s) }.map {
        case (name, tree) => q"""${TermName(name)} = ${tree}"""
      }

      val subSetter =
        if (sub.<:<(weakTypeOf[EmptyLazyModel])) q"""${getCompanion(weakTypeOf[EmptyLazyModel])}()"""
        else q"""${sub.typeSymbol.companion}(..${subFieldNames.map(s => q"""${TermName(s.name)} = ${fieldValue(s.name)}""")})"""

      val content = q"""${getCompanion(decoderDataGen)}
        .fromDataGenWrap(${toRepMapper(fields = decoderFields, tableName = Ident(TermName(tableName)))}.dataGenWrap) { (tempData, rep) =>
          ${getCompanion(lazyModel)}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
            ..${List(
          tempFieldSetter
        , inputFieldNames.map { field =>
          val setterValue = field.modelGetter(Ident(TermName("s")))
          q"""${TermName(field.name)} = ${setterValue}"""
        }
      ).flatten}

            ) }, sub = ${subSetter})
        }"""

      (content, decoderFields)
    }
  }

}
