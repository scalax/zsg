package net.scalax.asuna.mapper.decoder.macroImpl

import net.scalax.asuna.core.decoder.DecoderShapeValue
import net.scalax.asuna.mapper.common.macroImpl.{GenFileOutputHelper, RepMapperUtils}
import net.scalax.asuna.mapper.decoder._

object DecoderCaseClassMapper {

  class DecoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxDecoderCaseClassMapperImpl(c) {
    override val printlnTree = false
  }

  class BlackboxDecoderCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils with GenFileOutputHelper {
    self =>

    import c.universe._

    def debugCaseClassSingleModelDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , L: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ]: c.Expr[DecoderInputTable.Aux[Poly, Table, L, Any, Any]] = {
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Table, L]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val lazyModel         = weakTypeOf[L]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val decoderWrapApply  = weakTypeOf[DecoderWrapApply[RepCol, DataCol]]

      val tableName = c.freshName("table")

      val (content, decoderFields) = baseCaseClassDecoderGeneric[Poly, Table, L, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""{ (${TermName(tableName)} :${table}) =>
        ${getCompanion(decoderWrapApply)}.decoderInstance[${repCol}, ${dataCol}].withSingleModel[${lazyModel}](${TermName(tableName)}) {
          ${getCompanion(decoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      }"""

      copySourceToTarget(completeTree.toString, decoderFields)

      c.Expr[DecoderInputTable.Aux[Poly, Table, L, Any, Any]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def debugCaseClassLazyModelDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , LazyModel: c.WeakTypeTag
      , RepCol: c.WeakTypeTag
      , DataCol: c.WeakTypeTag
    ](tableParam: c.Expr[Table]): c.Expr[DecoderShapeValue[LazyModel, RepCol, DataCol]] = {
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Table, LazyModel]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val repCol            = weakTypeOf[RepCol]
      val dataCol           = weakTypeOf[DataCol]
      val decoderWrapApply  = weakTypeOf[DecoderWrapApply[RepCol, DataCol]]
      val lazyModel         = weakTypeOf[LazyModel]

      val tableName = c.freshName("table")

      val (content, decoderFields) = baseCaseClassDecoderGeneric[Poly, Table, LazyModel, Any, Any](tableName)

      val q = q"""def aa(${TermName(tableName)}: ${table}) = {
        ${content}.debug
      }"""

      val completeTree = q"""
        ${getCompanion(decoderWrapApply)}.decoderInstance[${repCol}, ${dataCol}].withLazyModel[${lazyModel}](${tableParam}) {
          ${getCompanion(decoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
            ${content}
          }
        }.compile
      """

      copySourceToTarget(completeTree.toString, decoderFields)

      c.Expr[DecoderShapeValue[LazyModel, RepCol, DataCol]] {
        q"""
          ${q}
          ???
        """
      }

    }

    def caseClassDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , LazyModel: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[DecoderInputTable.Aux[Poly, Table, LazyModel, Rep, TempData]] = {
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Table, LazyModel]]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]

      val tableName = c.freshName("table")

      val (content, _) = baseCaseClassDecoderGeneric[Poly, Table, LazyModel, Rep, TempData](tableName)

      val q = q"""${getCompanion(decoderInputTable)}[${poly}] { ${TermName(tableName)}: ${table} =>
          ${content}
        }"""

      c.Expr[DecoderInputTable.Aux[Poly, Table, LazyModel, Rep, TempData]](q)
    }

    def baseCaseClassDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , LazyModel: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ](tableName: String): (Tree, List[DecoderField]) = {
      val rep               = weakTypeOf[Rep]
      val tempData          = weakTypeOf[TempData]
      val poly              = weakTypeOf[Poly]
      val table             = weakTypeOf[Table]
      val lazyModel         = weakTypeOf[LazyModel]
      val decoderInputTable = weakTypeOf[DecoderInputTable[Poly, Table, LazyModel]]
      val decoderDataGen    = weakTypeOf[DecoderDataGen[LazyModel]]

      val (input, output, paramName: TermName, methodName: TermName, typeParams: List[TypeDef]) = lazyModel.decls.collect {
        case m: MethodSymbol if {
              val TermName(name) = m.name
              name == "apply"
            } =>
          m.typeSignatureIn(lazyModel) match {
            case MethodType(paramList, returnType) =>
              val headParam = paramList.head
              val inputType = headParam.typeSignatureIn(lazyModel)
              (inputType, returnType, headParam.name, m.name, List.empty)

            case PolyType(typeParams, MethodType(paramList, returnType)) =>
              val headParam  = paramList.head
              val inputType  = headParam.typeSignatureIn(lazyModel)
              val outputType = returnType
              (inputType, outputType, headParam.name, m.name, typeParams.map(r => internal.typeDef(r)))
          }
      }.head

      //Model to input's fields
      val inputFieldNames = getCaseClassFields(input)

      //Model to output's fields
      //Some not confirm to inputFieldNames is use to map to the table
      val outputFieldNames = getCaseClassFields(output)

      val sub = lazyModel.member(TermName("sub")).asTerm.typeSignatureIn(lazyModel).resultType
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
        if (sub.<:<(weakTypeOf[EmptyLazyModel])) q"""${getCompanion(weakTypeOf[EmptyLazyModel])}.value"""
        else q"""new ${sub}(..${subFieldNames.map(s => q"""${TermName(s.name)} = ${fieldValue(s.name)}""")})"""

      val content = q"""${getCompanion(decoderDataGen)}
        .fromDataGenWrap(${toRepMapper(fields = decoderFields, tableName = Ident(TermName(tableName)))}) { (tempData, rep) =>
          new ${lazyModel} {
             override def ${methodName}[..${typeParams}](${paramName}: ${input}): ${output} = { new ${output}(..${List(tempFieldSetter, inputFieldNames.map {
        field =>
          val setterValue = field.modelGetter(Ident(paramName))
          q"""${TermName(field.name)} = ${setterValue}"""
      }).flatten})
            }
            override val sub: ${sub} = ${subSetter}
          }: ${lazyModel}
        }"""

      (content, decoderFields)
    }
  }

}
