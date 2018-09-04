package net.scalax.asuna.helper.data.macroImpl

import java.util.UUID

import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.encoder.CaseDecoderRepWrap
import net.scalax.asuna.helper.template.CaseClassHelper
import net.scalax.asuna.helper.template.CaseClassDataHelper

import scala.reflect.macros.whitebox.Context

object DecoderMapper {

  case class FieldNames(law: String, shapeValueName: String, lawIndex: Int, helperIndex: Int, needInput: Boolean, needSub: Boolean, usePlaceHolder: Boolean)

  class DecoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    def caseclassDecoderGeneric[HelperData: c.WeakTypeTag, Input: c.WeakTypeTag, Output: c.WeakTypeTag, Sub: c.WeakTypeTag, Table: c.WeakTypeTag]: c.Expr[Table => CaseDecoderRepWrap.Aux[HelperData, Input, Output, Sub]] = {
      val helperData = weakTypeOf[HelperData]
      val input = weakTypeOf[Input]
      val output = weakTypeOf[Output]
      val sub = weakTypeOf[Sub]
      val table = weakTypeOf[Table]
      val outputModelGen = weakTypeOf[ModelGen[Output]]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]
      val caseClassDataHelper = weakTypeOf[CaseClassDataHelper]
      val encoderWitColType = q"""_root_.net.scalax.asuna.helper.encoder.EncoderWitCol"""
      val encoderWitColVar = "encoderWitCol" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val mgVar = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val tableVar = "table" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val inputFieldNames = input.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList.reverse
      val outputFieldNames = output.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val subFieldNames = sub.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val tableFieldNames = sub.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList

      def mgDef = List(
        q"""
        val ${TermName(mgVar)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]
        """,
        q"""
        val ${TermName(encoderWitColVar)}: $encoderWitColType = $encoderWitColType
        """)

      def propertyName(name: String) =
        q"""
           ${TermName(mgVar)}(_.${TermName(name)})
         """

      def commonProUseInShape(modelName: String, fieldName: FieldNames, usePlaceHolder: Boolean) = {
        val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

        val q =
          q"""
        val ${TermName(fieldName.shapeValueName)} = {
            ${
            if (usePlaceHolder) {
              q"""
            ${TermName(encoderWitColVar)}.toWrap(${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(fieldName.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))}),
              modelColumnName = ${Literal(Constant(fieldName.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))})
            ))
           """
            } else {
              q"""
            ${TermName(encoderWitColVar)}.toWrap(${modelName}.${TermName(fieldName.law)}, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(fieldName.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))}),
              modelColumnName = ${Literal(Constant(fieldName.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))})
            ))
           """
            }
          }
        }
    """
        q
      }

      val (fields, _, _) = outputFieldNames.foldLeft((List.empty[FieldNames], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), name) =>
          val newLawIndex = lawIndex + 1
          val needInput = inputFieldNames.contains(name)
          val usePlaceHolder = tableFieldNames.contains(name)
          val newHelperIndex = if (needInput) {
            helperIndex + 1
          } else helperIndex
          val fieldName = FieldNames(
            law = name,
            shapeValueName = name,
            lawIndex = newLawIndex,
            helperIndex = newHelperIndex,
            needInput = needInput,
            needSub = subFieldNames.contains(name),
            usePlaceHolder = usePlaceHolder)
          ((fieldName :: nameList), newLawIndex, newHelperIndex)
      }

      val q = c.Expr[Table => CaseDecoderRepWrap.Aux[HelperData, Input, Output, Sub]] {
        val aa = weakTypeOf[CaseDecoderRepWrap.Aux[HelperData, Input, Output, Sub]]
        q"""
           { ${TermName(tableVar)}: ${table} =>
           ..$mgDef
           ${caseClassDataHelper.typeSymbol.companion}.withDataDescribe(..${
          fields.flatMap { field =>
            List(
              q"""${commonProUseInShape(modelName = tableVar, fieldName = field, usePlaceHolder = field.usePlaceHolder)}""",
              q"""${propertyName(field.law)}""",
              q"""${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
            )""")
          }
        })
            }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

    /*def caseOnlyEncoderClassGeneric[HelperData: c.WeakTypeTag,Input:c.WeakTypeTag, Output: c.WeakTypeTag,Sub:c.WeakTypeTag]: c.Expr[EncoderDataGen.Aux[HelperData,Input, Output,Sub  ]] = {
      val helperData = weakTypeOf[HelperData]
      val output = weakTypeOf[Output]
      val outputModelGen = weakTypeOf[ModelGen[Output]]
      //val encoderWitColType = q"""_root_.net.scalax.asuna.helper.encoder.EncoderWitCol"""

      val mgVar = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      //val encoderWitColVar = "encoderWitCol" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val outputFieldNames = output.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList.reverse

      def mgDef = List(
        q"""
        val ${TermName(mgVar)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]
        """)

      val q = c.Expr[EncoderDataGen.Aux[HelperData,Input, Output,Sub ]] {
        val aa = weakTypeOf[EncoderDataGen.Aux[HelperData,Input, Output,Sub ]]
        q"""
           {
           ..$mgDef
            }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }*/

  }

}