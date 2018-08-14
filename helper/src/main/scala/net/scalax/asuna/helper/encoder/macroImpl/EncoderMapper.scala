package net.scalax.asuna.helper.encoder.macroImpl

import java.util.UUID

import net.scalax.asuna.core.encoder.EncoderShapeValue
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.decoder.macroImpl.ModelGen
import net.scalax.asuna.helper.encoder.{ CaseRepWrap, EncoderHelper, EncoderWitCol, ForTableInput }

import scala.reflect.macros.whitebox.Context

object EncoderMapper {

  class EncoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    case class FieldNames(law: String, shapeValueName: String)

    def commonProUseInShape[RepCol: c.WeakTypeTag, DataCol: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](mgVar: String, encoderWitColVar: String, fieldName: FieldNames, modelName: TermName, isMissingField: Boolean) = {
      //val traitName = c.freshName(fieldName.law)
      //val defName = "defName" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      //val encoderShape = weakTypeOf[EncoderShape[_, _, _, _, _]]
      //val repCol = weakTypeOf[RepCol]
      //val dataCol = weakTypeOf[DataCol]
      //val edsv = weakTypeOf[EncoderShapeValue[Any, RepCol, DataCol]]

      //val columnInfo = weakTypeOf[MacroColumnInfo]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]
      //val propertyType = weakTypeOf[PropertyType[_]]

      val q = q"""
        val ${TermName(fieldName.shapeValueName)} = {
            ${
        if (isMissingField) {
          q"""
             ${TermName(encoderWitColVar)}.toWrap(${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
                         tableColumnName = ${Literal(Constant(fieldName.law))},
                         modelColumnName = ${Literal(Constant(fieldName.law))}
                       ))
           """
        } else {
          q"""
             ${TermName(encoderWitColVar)}.toWrap(${modelName}.${TermName(fieldName.law)}, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
                         tableColumnName = ${Literal(Constant(fieldName.law))},
                         modelColumnName = ${Literal(Constant(fieldName.law))}
                       ))
           """
        }
      }
        }
    """
      q
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Target: c.WeakTypeTag, RepCol: c.WeakTypeTag, DataCol: c.WeakTypeTag]: c.Expr[CaseRepWrap.Aux[Table, Case, Target, RepCol, DataCol]] = {
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val repCol = weakTypeOf[RepCol]
      val dataCol = weakTypeOf[DataCol]
      val modelGen = weakTypeOf[ModelGen[Case]]
      val encoderHelperType = weakTypeOf[EncoderHelper[RepCol, DataCol]]
      val encoderWitColType = weakTypeOf[EncoderWitCol[RepCol, DataCol]]

      val forTableInput = weakTypeOf[ForTableInput[Table, Case, RepCol, DataCol]]
      println("11" * 100)
      println(repCol)
      println(dataCol)

      //val forTableInputImpl = weakTypeOf[ForTableInputImpl[Table, Case, RepCol, DataCol]]
      val shapeValue = weakTypeOf[EncoderShapeValue[Case, RepCol, DataCol]]

      val mgVar = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val encoderHelper = "encoderHelper" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val encoderWitColVar = "encoderWitCol" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList.map(s => FieldNames(law = s, shapeValueName = s + UUID.randomUUID.toString.replaceAllLiterally("-", "a")))
      val fieldNamesInTable = table.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val misFieldsInTable = modelFieldNames.filter(n => !fieldNamesInTable.contains(n.law))

      def mgDef = List(
        q"""
        val ${TermName(mgVar)}: $modelGen = ${modelGen.typeSymbol.companion}.value[$caseClass]
        """,
        q"""
        val ${TermName(encoderWitColVar)}: $encoderWitColType = ${encoderWitColType.typeSymbol.companion}.value[$repCol, $dataCol]
        """,
        q"""
        val ${TermName(encoderHelper)}: $encoderHelperType = ${encoderHelperType.typeSymbol.companion}.value[$repCol, $dataCol]
        """)

      def toShape1111(namePare: List[FieldNames]) = {
        val proNames = namePare
        val termVar1 = c.freshName("termVar1")

        val toListTree = proNames.foldRight(q"""_root_.shapeless.HNil""": Tree) { (name, tree) =>
          q"""${TermName(name.shapeValueName)} :: $tree"""
        }
        val func = q"""
        { (${TermName(termVar1)}: $table) =>
                                ..${modelFieldNames.map { proName => commonProUseInShape[RepCol, DataCol, Table, Case](mgVar = mgVar, encoderWitColVar = encoderWitColVar, fieldName = proName, modelName = TermName(termVar1), isMissingField = misFieldsInTable.contains(proName)) }}

          $toListTree
        }
        """
        func
      }

      val q = c.Expr[CaseRepWrap.Aux[Table, Case, Target, RepCol, DataCol]] {
        val repModelTermName = c.freshName
        val aa = weakTypeOf[CaseRepWrap[Table, Case, RepCol, DataCol]]
        q"""
           {
           ..$mgDef
           ${aa.typeSymbol.companion}.value[$repCol, $dataCol].withFunc(${toShape1111(modelFieldNames)}, ${TermName(mgVar)})
            }
        """
      }
      println(q + "\n" + "22" * 100)
      q
    }

  }

}