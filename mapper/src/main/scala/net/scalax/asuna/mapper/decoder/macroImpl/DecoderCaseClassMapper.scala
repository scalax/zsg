package net.scalax.asuna.mapper.decoder.macroImpl

import net.scalax.asuna.mapper.common.PropertyType
import net.scalax.asuna.mapper.common.macroImpl.{CopyHelper, RepMapperUtils}
import net.scalax.asuna.mapper.decoder.{DecoderDataGen, DecoderInputTable, EmptyLazyModel, LazyModel}

object DecoderCaseClassMapper {

  class DecoderCaseClassMapperImpl(override val c: scala.reflect.macros.whitebox.Context) extends BlackboxDecoderCaseClassMapperImpl(c) {
    override val printlnTree = false
  }

  class BlackboxDecoderCaseClassMapperImpl(override val c: scala.reflect.macros.blackbox.Context) extends RepMapperUtils with CopyHelper {
    self =>

    import c.universe._

    def caseclassDecoderGeneric[
        Poly: c.WeakTypeTag
      , Table: c.WeakTypeTag
      , Input: c.WeakTypeTag
      , Output: c.WeakTypeTag
      , Sub: c.WeakTypeTag
      , Rep: c.WeakTypeTag
      , TempData: c.WeakTypeTag
    ]: c.Expr[DecoderInputTable.Aux[Poly, Table, Input, Output, Sub, Rep, TempData]] = {
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
      val propertyType      = weakTypeOf[PropertyType[_]]

      val tableName = c.freshName("tableInstance")

      //Model to input's fields
      val inputFieldNames = input.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(s => (s, s.name)).collect {
        case (member, TermName(n)) =>
          val name = n.trim
          CaseClassField(
              name = name
            , rawField = member
            , fieldType = q"""${getObject(propertyType)}.fromModel[${input}](_.${TermName(name)})"""
            , modelGetter = { modelVar: Tree =>
              q"""${modelVar}.${TermName(name)}"""
            }
          )
      }

      //Model to output's fields
      //Some not confirm to inputFieldNames is use to map to the table
      val outputFieldNames = output.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(s => (s, s.name)).collect {
        case (member, TermName(n)) =>
          val name = n.trim
          CaseClassField(
              name = name
            , rawField = member
            , fieldType = q"""${getObject(propertyType)}.fromModel[${output}](_.${TermName(name)})"""
            , modelGetter = { modelVar: Tree =>
              q"""${modelVar}.${TermName(name)}"""
            }
          )
      }

      //.reverse
      //Model to sub's fields
      val subFieldNames =
        sub.members.toList.reverse.filter(s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal).map(_.name).collect { case TermName(n) => n.trim }

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
        if (sub.<:<(weakTypeOf[EmptyLazyModel])) q"""${getObject(weakTypeOf[EmptyLazyModel])}()"""
        else q"""${sub.typeSymbol.companion}(..${subFieldNames.map(s => q"""${TermName(s)} = ${fieldValue(s)}""")})"""

      val content = q"""${getObject(decoderDataGen)}
        .fromDataGenWrap(${toRepMapper(fields = decoderFields, tableName = tableName)}.dataGenWrap) { (tempData, rep) =>
          ${getObject(lazyModel)}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
            ..${List(
          tempFieldSetter
        , inputFieldNames.map { field =>
          val setterValue = field.modelGetter(Ident(TermName("s")))
          q"""${TermName(field.name)} = ${setterValue}"""
        }
      ).flatten}

            ) }, sub = ${subSetter})
        }"""

      val q =
        if (printlnTree)
          q"""${getObject(decoderInputTable)}[$poly].apply[${table}, ${input}, ${output}, ${sub}, ${rep}, ${tempData}] { ${TermName(tableName)}: ${table} =>
          ${content}.debug
        }"""
        else
          q"""${getObject(decoderInputTable)}[$poly] { ${TermName(tableName)}: ${table} =>
          ${content}
        }"""

      /*if (printlnTree) {
        copySourceToTarget("aaaaaagshohowieth")
        println(q + "\n" + "22" * 100)
      }*/

      c.Expr[DecoderInputTable.Aux[Poly, Table, Input, Output, Sub, Rep, TempData]] {
        if (printlnTree) {
          q"""
          ${copySourceToTarget(q.toString)}
          ${q}
           """
        } else {
          q
        }
      }
    }
  }

}
