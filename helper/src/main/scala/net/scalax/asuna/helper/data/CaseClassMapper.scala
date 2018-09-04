package net.scalax.asuna.helper.data.macroImpl

import java.util.UUID

import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.encoder.{ EncoderWitCol, InputTable }
import net.scalax.asuna.helper.template.CaseClassDataHelper

import scala.reflect.macros.whitebox.Context

object DecoderMapper {

  case class FieldNames(law: String, shapeValueName: String, lawIndex: Int, helperIndex: Int, needInput: Boolean, needSub: Boolean, usePlaceHolder: Boolean)

  class DecoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    def caseclassDecoderGeneric[Input: c.WeakTypeTag, Output: c.WeakTypeTag, Sub: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]: c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] = {
      val rep = weakTypeOf[Rep]
      val tempData = weakTypeOf[TempData]
      val input = weakTypeOf[Input]
      val output = weakTypeOf[Output]
      val sub = weakTypeOf[Sub]
      val table = weakTypeOf[Table]
      val outputModelGen = weakTypeOf[ModelGen[Output]]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]
      val caseClassDataHelper = weakTypeOf[CaseClassDataHelper]
      val encoderWitColType = weakTypeOf[EncoderWitCol]
      val lazyData = weakTypeOf[LazyData[Input, Output, Sub]]

      val mgVar = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val tableVar = "table" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val inputFieldNames = input.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val outputFieldNames = output.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList.reverse
      val subFieldNames = sub.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val tableFieldNames = table.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList

      def mgDef = List(
        q"""
        val ${TermName(mgVar)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]
        """)

      def propertyName(name: String) =
        q"""
           ${TermName(mgVar)}(_.${TermName(name)})
         """

      def commonProUseInShape(modelName: String, fieldName: FieldNames, usePlaceHolder: Boolean) = {
        val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

        val q =
          q"""
        {
            ${
            if (usePlaceHolder) {
              q"""
            ${encoderWitColType.typeSymbol.companion}.toWrap(${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(fieldName.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))}),
              modelColumnName = ${Literal(Constant(fieldName.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))})
            ))
           """
            } else {
              q"""
            ${encoderWitColType.typeSymbol.companion}.toWrap(${TermName(modelName)}.${TermName(fieldName.law)}, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
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

      val (fieldsPrepare, _, _) = outputFieldNames.foldLeft((List.empty[FieldNames], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), name) =>
          val newLawIndex = lawIndex + 1
          val needInput = inputFieldNames.contains(name)
          val usePlaceHolder = !tableFieldNames.contains(name)
          val newHelperIndex = if (!needInput) {
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

      val fields = fieldsPrepare

      val q = c.Expr[InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]] {
        val aa = weakTypeOf[DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]
        q"""
           { ${TermName(tableVar)}: ${table} =>
           ..$mgDef
           ${caseClassDataHelper.typeSymbol.companion}.withDataDescribe(..${
          fields.filter(s => !s.needInput).flatMap { field =>
            List(
              q"""${TermName("rep" + field.helperIndex)} = ${commonProUseInShape(modelName = tableVar, fieldName = field, usePlaceHolder = field.usePlaceHolder)}""",
              q"""${TermName("property" + field.helperIndex)} = ${propertyName(field.law)}""",
              q"""${TermName("column" + field.helperIndex)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
            )""")
          }
        }).asDecoder { (tempData, rep) =>
                 ${lazyData.typeSymbol.companion}.init(gen = {s: ${input} => ${output.typeSymbol.companion}(
                 ..${fields.map(field => q"""${TermName(field.law)} = ${if (field.needInput) q"""s.${TermName(field.law)}""" else q"""tempData.${TermName("data" + field.helperIndex)}"""}""")}
                 ) }, sub = ${sub.typeSymbol.companion}(..${fields.filter(_.needSub).map(field => s"""${TermName(field.law)} = tempData.${TermName("data" + field.helperIndex)}""")}))
            }
            }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

    def caseclassEncoderGeneric[Output: c.WeakTypeTag, Table: c.WeakTypeTag, Rep: c.WeakTypeTag, TempData: c.WeakTypeTag]: c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] = {
      val rep = weakTypeOf[Rep]
      val tempData = weakTypeOf[TempData]
      val output = weakTypeOf[Output]
      val table = weakTypeOf[Table]
      val outputModelGen = weakTypeOf[ModelGen[Output]]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]
      val caseClassDataHelper = weakTypeOf[CaseClassDataHelper]
      val encoderWitColType = weakTypeOf[EncoderWitCol]

      val mgVar = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val tableVar = "table" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val outputFieldNames = output.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList.reverse
      val tableFieldNames = table.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList

      def mgDef = List(
        q"""
        val ${TermName(mgVar)}: $outputModelGen = ${outputModelGen.typeSymbol.companion}.value[$output]
        """)

      def propertyName(name: String) =
        q"""
           ${TermName(mgVar)}(_.${TermName(name)})
         """

      def commonProUseInShape(modelName: String, fieldName: FieldNames, usePlaceHolder: Boolean) = {
        val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

        val q =
          q"""
        {
            ${
            if (usePlaceHolder) {
              q"""
            ${encoderWitColType.typeSymbol.companion}.toWrap(${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(fieldName.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))}),
              modelColumnName = ${Literal(Constant(fieldName.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(fieldName.law))})
            ))
           """
            } else {
              q"""
            ${encoderWitColType.typeSymbol.companion}.toWrap(${TermName(modelName)}.${TermName(fieldName.law)}, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
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

      val (fieldsPrepare, _, _) = outputFieldNames.foldLeft((List.empty[FieldNames], 0, 0)) {
        case ((nameList, lawIndex, helperIndex), name) =>
          val newLawIndex = lawIndex + 1
          val usePlaceHolder = !tableFieldNames.contains(name)
          val fieldName = FieldNames(
            law = name,
            shapeValueName = name,
            lawIndex = newLawIndex,
            helperIndex = newLawIndex,
            needInput = false,
            needSub = false,
            usePlaceHolder = usePlaceHolder)
          ((fieldName :: nameList), newLawIndex, newLawIndex)
      }

      val fields = fieldsPrepare

      val q = c.Expr[InputTable[Table, EncoderDataGen.Aux[Output, Rep, TempData]]] {
        val aa = weakTypeOf[EncoderDataGen.Aux[Output, Rep, TempData]]
        q"""
           { ${TermName(tableVar)}: ${table} =>
           ..$mgDef
           ${caseClassDataHelper.typeSymbol.companion}.withDataDescribe(..${
          fields.filter(s => !s.needInput).flatMap { field =>
            List(
              q"""${TermName("rep" + field.helperIndex)} = ${commonProUseInShape(modelName = tableVar, fieldName = field, usePlaceHolder = field.usePlaceHolder)}""",
              q"""${TermName("property" + field.helperIndex)} = ${propertyName(field.law)}""",
              q"""${TermName("column" + field.helperIndex)} = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(field.law))},
              tableColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))}),
              modelColumnName = ${Literal(Constant(field.law))},
              modelColumnSymbol = _root_.scala.Symbol(${Literal(Constant(field.law))})
            )""")
          }
        }).asEncoder[$output] { (caseClass, rep) =>
                  new ${TermName("_root_")}.${TermName("net")}.${TermName("scalax")}.${TermName("asuna")}.${TermName("helper")}.${TermName("template")}.${TypeName(s"CaseClassDataHelper${fields.size}")}(
                 ..${fields.flatMap(field => List(q"""${TermName("data" + field.lawIndex)} = caseClass.${TermName(field.law)}""", q"""${TermName("column" + field.lawIndex)} = rep.${TermName(s"column${field.lawIndex}")}"""))}
                 )
            }
            }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}