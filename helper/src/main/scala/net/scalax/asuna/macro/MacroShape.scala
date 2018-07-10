package net.scalax.asuna.core.macroImpl

import net.scalax.asuna.core.common.DelayTag
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import net.scalax.asuna.helper.decoder.{ DecoderHelper, HListDecoderShapeImplicit }
import net.scalax.asuna.shape.ShapeHelper

import scala.reflect.macros.blackbox.Context
import scala.language.higherKinds

trait PropertyType[Pro] {
  def delay[Abs]: DelayTag[Pro, Abs] = new DecoderHelper[Abs] {}.delay[Pro]
}

trait ModelGen[Model] {
  def apply[Pro](f: Model => Pro): PropertyType[Pro] = new PropertyType[Pro] {}
}

trait PropertyFunAbs[Abs] {
  self =>

  type Rep
  type Data
  type Out
  val rep: Rep
  val shape: DecoderShape[Rep, Data, Out, Abs]
  def sv: DecoderShapeValue[Data, Abs] = new DecoderShapeValue[Data, Abs] {
    override type RepType = self.Out
    override val rep: self.Out = self.shape.wrapRep(self.rep)
    override val shape: DecoderShape[self.Out, Data, self.Out, Abs] = self.shape.packed
  }
}

trait PropertyFun[R, D, O, Abs] extends PropertyFunAbs[Abs] {
  override type Rep = R
  override type Data = D
  override type Out = O
}

trait ProGen[A, B, C, PL, Abs] {
  protected def innperPro: PropertyFun[A, B, C, Abs]
  def unwrap(implicit pl: PL): PropertyFun[A, B, C, Abs] = innperPro
}

trait PropertyDataShapeUnwrap[R[_, _, _], Source, Table, Abs] {
  def unwrap(implicit cv: R[Source, Table, Abs]): R[Source, Table, Abs] = cv
}

object MacroShape {

  class MacroShapeImpl(override val c: Context) extends MacroUtils.MacroUtilImpl {
    self =>

    import c.universe._

    def commonProUseInShape[Abs: c.WeakTypeTag](fieldName: String, modelName: TermName, isOutPutSub: Boolean) = {
      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      val propertyType = weakTypeOf[PropertyType[_]]
      val decoderShape = weakTypeOf[DecoderShape[_, _, _, _]]
      val proGen = weakTypeOf[ProGen[_, _, _, _, _]]
      val propertyFun = weakTypeOf[PropertyFun[_, _, _, _]]
      val abs = weakTypeOf[Abs]

      q"""
      val ${TermName(fieldName)} = {
        @_root_.scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
        trait ${TypeName(traitName)}[ShapeData, ProData]
        object ${TermName(traitName)} {
          implicit def propertyImplicit1[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
        }
        def ${TermName(defName)}[A, B, C, D](rep: A, pro: ${propertyType.typeSymbol}[D])(implicit shape: ${decoderShape.typeSymbol}[A, B, C, $abs]): ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] = {
          new ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] {
            override protected def innperPro: ${propertyFun.typeSymbol}[A, B, C, $abs] = {
              val rep1 = rep
              val shape1 = shape
              new ${propertyFun.typeSymbol}[A, B, C, $abs] {
                override val rep: A = rep1
                override val shape = shape1
              }
            }
          }
        }
        ${TermName(defName)}(${modelName}.${TermName(fieldName)}, mg(_.${TermName(fieldName)})).unwrap.sv
      }
      """
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[Table => DecoderShapeValue[Case, Abs]] = {
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val modelGen = weakTypeOf[ModelGen[Case]]
      val allHelper = weakTypeOf[DecoderHelper[Abs]]

      val shapeHelper = weakTypeOf[ShapeHelper]
      val hListDecoderShapeImplicit = weakTypeOf[HListDecoderShapeImplicit]

      val fieldNames = caseClass.members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name }.toList
      val fieldNameStrs = fieldNames.map(_.toString.trim)
      def confireCaseClassFields = {
        confirmHasFields[Case, Table](fieldNames = fieldNameStrs)
      }

      def fileConfirmAction(modelName: TermName) = {
        fieldsShapeConifrm[Table, Abs](modelName = modelName, fieldNames = fieldNameStrs)
      }

      def mgDef = q"""
          lazy val mg: $modelGen = new $modelGen {}
        """

      def hlistFromPros(pros: List[String], hlistVal: TermName) = {
        val (result, _) = pros.foldLeft((List.empty[Tree], hlistVal)) {
          case ((expr, termName), proName) =>
            val tailVal = TermName(c.freshName(proName))
            val q = List(
              q"""val ${TermName(proName)} = ${termName}.head""",
              q"""val ${tailVal} = ${termName}.tail""")
            (expr ::: q, tailVal)
        }
        result
      }

      def toShape(namePare: List[String]) = {
        val proNames = namePare
        val termVar1 = TermName(c.freshName)
        q"""
          new $allHelper{ }.shaped(
            ${proNames.reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${TermName(b)}, $f)")}
          ).map { case $termVar1 =>
            ..${hlistFromPros(proNames, termVar1)}
            ${caseClass.typeSymbol.companion}(..${proNames.map(fName => q"""${TermName(fName)} = ${TermName(fName)}""")})
          }"""
      }

      val q = c.Expr[Table => DecoderShapeValue[Case, Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: $table) =>
            object CaseClassGenImpl extends $shapeHelper with $hListDecoderShapeImplicit {
              ..${confireCaseClassFields}
              ..${fileConfirmAction(modelName = TermName(repModelTermName))}
              $mgDef
              ..${fieldNameStrs.map { case proName => commonProUseInShape[Abs](fieldName = proName, modelName = TermName(repModelTermName), isOutPutSub = false) }}
              val dataShapeValue = ${toShape(fieldNameStrs)}
            }
            CaseClassGenImpl.dataShapeValue
          }
        """
      }
      //println(q)
      q
    }

  }

}