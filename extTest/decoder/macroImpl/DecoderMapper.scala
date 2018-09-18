package net.scalax.asuna.helper.decoder.macroImpl

import java.util.UUID

import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.encoder.CaseDecoderRepWrap
import shapeless.Generic

import scala.reflect.macros.whitebox.Context

trait PropertyType[Pro] {
  def toPlaceholder: Placeholder[Pro] = Placeholder.value[Pro]
}

trait ModelGen[Model] {
  def apply[Pro](f: Model => Pro): PropertyType[Pro] = new PropertyType[Pro] {}
}

object ModelGen {
  def value[Model]: ModelGen[Model] = new ModelGen[Model] {}
}

object DecoderMapper {

  case class FieldNames(law: String, shapeValueName: String)

  class DecoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    def commonProUseInShape[Table: c.WeakTypeTag, Model: c.WeakTypeTag](
        mgVar: String
      , encoderWitColVar: String
      , fieldName: FieldNames
      , modelName: TermName
      , isMissingField: Boolean
    ) = {

      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

      val q =
        q"""
        val ${TermName(fieldName.shapeValueName)} = {
            ${if (isMissingField) {
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
        }}
        }
    """
      q
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Target: c.WeakTypeTag, HListData: c.WeakTypeTag](
        genImplicit: c.Expr[Generic.Aux[Case, HListData]]
    ): c.Expr[CaseDecoderRepWrap.Aux[Table, Case, Target, HListData]] = {
      val caseClass         = weakTypeOf[Case]
      val table             = weakTypeOf[Table]
      val modelGen          = weakTypeOf[ModelGen[Case]]
      val encoderWitColType = q"""_root_.net.scalax.asuna.helper.encoder.EncoderWitCol"""

      val mgVar            = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val encoderWitColVar = "encoderWitCol" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val modelFieldNames = caseClass.members
        .filter { s =>
          s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
        .map(s => FieldNames(law = s, shapeValueName = s + UUID.randomUUID.toString.replaceAllLiterally("-", "a")))
        .reverse
      val fieldNamesInTable = table.members
        .filter { s =>
          s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod)
        }
        .map(_.name)
        .collect { case TermName(n) => n.trim }
        .toList
      val misFieldsInTable = modelFieldNames.filter(n => !fieldNamesInTable.contains(n.law))

      def mgDef =
        List(
            q"""
        val ${TermName(mgVar)}: $modelGen = ${modelGen.typeSymbol.companion}.value[$caseClass]
        """
          , q"""
        val ${TermName(encoderWitColVar)}: $encoderWitColType = $encoderWitColType
        """
        )

      def toShape1111(namePare: List[FieldNames]) = {
        val proNames = namePare
        val termVar1 = c.freshName("termVar1")

        val toListTree = proNames.foldRight(q"""_root_.shapeless.HNil""": Tree) { (name, tree) =>
          q"""${TermName(name.shapeValueName)} :: $tree"""
        }
        val func =
          q"""
        { (${TermName(termVar1)}: $table) =>
          ..${modelFieldNames.map { proName =>
            commonProUseInShape[Table, Case](
                mgVar = mgVar
              , encoderWitColVar = encoderWitColVar
              , fieldName = proName
              , modelName = TermName(termVar1)
              , isMissingField = misFieldsInTable.contains(proName)
            )
          }}
          $toListTree
        }
        """
        func
      }

      val q = c.Expr[CaseDecoderRepWrap.Aux[Table, Case, Target, HListData]] {
        val aa = weakTypeOf[CaseDecoderRepWrap[Table, Case]]
        q"""
           {
           ..$mgDef
           ${aa.typeSymbol.companion}.withFunc(${toShape1111(modelFieldNames)}, $genImplicit)
            }
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }
  }

  class DecoderMapperImpl1111(val c: scala.reflect.macros.whitebox.Context) {

    import c.universe._

    def commonProUseInShape1111[Table: c.WeakTypeTag, Model: c.WeakTypeTag](
        mgVar: String
      , encoderWitColVar: String
      , fieldName: FieldNames
      , modelName: TermName
      , isMissingField: Boolean
    ) = {

      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

      val q = q"""
        {
          ${if (isMissingField) {
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
      }}
        }
    """
      q
    }

  }

}
