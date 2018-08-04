package net.scalax.asuna.helper.encoder.macroImpl

import java.util.UUID

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.{ EncoderColumnInfo, MacroColumnInfo, MacroColumnInfoContent, MacroColumnInfoImpl }
import net.scalax.asuna.helper.decoder.macroImpl.{ ModelGen, PropertyType }
import net.scalax.asuna.helper.encoder.{ EncoderHelper, ForTableInput }
import net.scalax.asuna.shape.ShapeHelper

import scala.annotation.implicitNotFound
import scala.reflect.macros.blackbox.Context

trait AA11[Abs] {
  def aabb[A, B, C](rep: A)(implicit shape: EncoderShape[A, B, C, Abs]): EncoderShapeValue[B, Abs] = {
    val rep1 = rep
    val shape1 = shape
    new EncoderShapeValue[B, Abs] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }
}

object AA11 {
  def dkdkdkdk[Abs]: AA11[Abs] = new AA11[Abs] {}
}

object EncoderMapper {

  trait PropertyEncoderFunAbs[Abs] {
    self =>

    type Rep
    type Data
    type Out
    val rep: Rep
    val shape: EncoderShape[Rep, Data, Out, Abs]
    def sv: EncoderShapeValue[Data, Abs] = new EncoderShapeValue[Data, Abs] {
      override type RepType = self.Out
      override val rep: self.Out = self.shape.wrapRep(self.rep)
      override val shape = self.shape.packed
    }
  }

  trait PropertyEncoderFun[R, D, O, Abs] extends PropertyEncoderFunAbs[Abs] {
    override type Rep = R
    override type Data = D
    override type Out = O
  }

  trait EncoderProGen[A, B, C, PL, Abs] {
    protected def innperPro: PropertyEncoderFun[A, B, C, Abs]
    def unwrap(implicit pl: PL): PropertyEncoderFun[A, B, C, Abs] = innperPro
  }

  class EncoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    def commonProUseInShape[Abs: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](mgVar: String, fieldName: String, modelName: TermName, isMissingField: Boolean) = {
      val traitName = c.freshName(fieldName + "ProShape" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")) //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      val encoderShape = weakTypeOf[EncoderShape[_, _, _, _]]
      val abs = weakTypeOf[Abs]
      val edsv = weakTypeOf[EncoderShapeValue[Any, Abs]]

      val columnInfo = weakTypeOf[MacroColumnInfo]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

      q"""
        def ${TermName(fieldName)} = {
          def ${TermName(defName)}[A, B, C](rep: A)(implicit shape: ${encoderShape.typeSymbol}[A, B, C, $abs]) = {
            val rep1 = rep
            val shape1 = shape
            new _root_.net.scalax.asuna.core.encoder.EncoderShapeValue[B, $abs] {
              override type RepType = C
              override val rep = shape1.wrapRep(rep1)
              override val shape = shape1.packed
            }
          }

          def ${TermName(traitName)}(implicit columnInfo: $columnInfo): $edsv = {
            ${
        if (isMissingField) {
          q"""${TermName(defName)}(${TermName(mgVar)}(_.${TermName(fieldName)}).toPlaceholder).emap((s: Any) => ${TermName(mgVar)}(_.${TermName(fieldName)}).convertData(s))"""
        } else {
          q"""${TermName(defName)}(${modelName}.${TermName(fieldName)}).emap((s: Any) => ${TermName(mgVar)}(_.${TermName(fieldName)}).convertData(s))"""
        }
      }
          }

          ${TermName(traitName)}(${columnInfoImpl.typeSymbol.companion}(
            tableColumnName = ${Literal(Constant(fieldName))},
            modelColumnName = ${Literal(Constant(fieldName))}
          ))
        }
    """
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[ForTableInput[Table, Case, Abs]] = {
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val modelGen = weakTypeOf[ModelGen[Case]]
      val allHelper = weakTypeOf[EncoderHelper[Abs]]
      val forTableInput = weakTypeOf[ForTableInput[Table, Case, Abs]]
      val shapeValue = weakTypeOf[EncoderShapeValue[Case, Abs]]

      val mgVar = c.freshName("mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a"))

      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val fieldNamesInTable = table.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val misFieldsInTable = modelFieldNames.filter(n => !fieldNamesInTable.contains(n))

      def mgDef = q"""
          lazy val ${TermName(mgVar)}: $modelGen = new $modelGen {}
        """

      def toShape(namePare: List[String]) = {
        val proNames = namePare
        val termVar1 = TermName(c.freshName)
        val listSymbol = weakTypeOf[List[_]].typeSymbol.companion

        val func = q"""
        { ($termVar1: $caseClass) =>
          $listSymbol(..${proNames.map(eachName => q"""$termVar1.${TermName(eachName)}""")})
        }
        """

        q"""
        new $allHelper{ }.shaped(
          $listSymbol(..${proNames.map(eachName => q"""${TermName(eachName)}""")})
        ).emap($func)
        """
      }

      val q = c.Expr[ForTableInput[Table, Case, Abs]] {
        val repModelTermName = c.freshName
        q"""
          new $forTableInput {
            override def input(${TermName(repModelTermName)}: $table): $shapeValue = {
                       $mgDef
                       ..${modelFieldNames.map { proName => commonProUseInShape[Abs, Table, Case](mgVar = mgVar, fieldName = proName, modelName = TermName(repModelTermName), isMissingField = misFieldsInTable.contains(proName)) }}
                   ${toShape(modelFieldNames)}
            }
          }: ${weakTypeOf[ForTableInput[Table, Case, Abs]]}
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}