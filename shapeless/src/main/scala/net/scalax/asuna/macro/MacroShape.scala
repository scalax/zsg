package net.scalax.asuna.core.macroImpl

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.DelayTag
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }

import scala.reflect.macros.blackbox.Context
import scala.language.higherKinds

trait PropertyType[Pro] {
  def delay[Abs]: DelayTag[Pro, Abs] = new AllHelper[Abs] {}.delay[Pro]
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
  def unwrap(implicit pl: PL) = innperPro
}

trait PropertyDataShapeUnwrap[R[_, _, _], Source, Table, Abs] {
  def unwrap(implicit cv: R[Source, Table, Abs]): R[Source, Table, Abs] = cv
}

object MacroShape {

  class MacroShapeImpl(override val c: Context) extends MacroUtils.MacroUtilImpl {
    self =>

    import c.universe._

    def commonProUseInShape(fieldName: String, modelName: TermName, absName: Type, isOutPutSub: Boolean) = {
      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      q"""
          val ${TermName(fieldName)} = {
            @_root_.scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
            trait ${TypeName(traitName)}[ShapeData, ProData]
            object ${TermName(traitName)} {
              implicit def propertyImplicit1[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
            }
            def ${TermName(defName)}[A, B, C, D](rep: A, pro: _root_.net.scalax.asuna.core.macroImpl.PropertyType[D])(implicit shape: _root_.net.scalax.asuna.core.decoder.DecoderShape[A, B, C, ${absName}]): _root_.net.scalax.asuna.core.macroImpl.ProGen[A, B, C, ${TypeName(traitName)}[B, D], ${absName}] = {
              new _root_.net.scalax.asuna.core.macroImpl.ProGen[A, B, C, ${TypeName(traitName)}[B, D], ${absName}] {
                override protected def innperPro: _root_.net.scalax.asuna.core.macroImpl.PropertyFun[A, B, C, ${absName}] = {
                  val rep1 = rep
                  val shape1 = shape
                  new _root_.net.scalax.asuna.core.macroImpl.PropertyFun[A, B, C, ${absName}] {
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
      val fieldNames = weakTypeOf[Case].members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name }.toList
      val fieldNameStrs = fieldNames.map(_.toString.trim)
      def confireCaseClassFields = {
        confirmHasFields(baseModelName = weakTypeOf[Case].typeSymbol, compareModelName = weakTypeOf[Table].typeSymbol, fieldNames = fieldNameStrs)
      }

      def fileConfirmAction(modelName: TermName) = {
        fieldsShapeConifrm(modelName = modelName, tableName = weakTypeOf[Table].typeSymbol, absName = weakTypeOf[Abs], fieldNames = fieldNameStrs)
      }

      /*def shapeConifrm(modelName: String, proName: String) = {
        val traitName = c.freshName(proName)
        val def1Name = c.freshName(proName)
        q"""
          {
            @_root_.scala.annotation.implicitNotFound(msg = ${Literal(Constant(s"函数源 $${SourceTable} 的属性 ${proName} 找不到合适的 Shape\n列类型为 $${Source}\n抽象类型为 $${Abs}"))})
            trait ${TypeName(traitName)}[SourceTable, Source, Abs]

            object ${TermName(traitName)} {
              implicit def propertyImplicit[SourceTable, Source, Data, Target, Abs](implicit shape: _root_.net.scalax.asuna.core.DataShape[Source, Data, Target, ${weakTypeOf[Abs].typeSymbol}]): ${TypeName(traitName)}[SourceTable, Source, Abs] = new ${TypeName(traitName)}[SourceTable, Source, Abs] { }
            }
            def ${TermName(def1Name)}[T](rep: T): _root_.net.scalax.asuna.core.macroImpl.PropertyDataShapeUnwrap[${TypeName(traitName)}, ${weakTypeOf[Table].typeSymbol}, T, ${weakTypeOf[Abs].typeSymbol}] = {
              new _root_.net.scalax.asuna.core.macroImpl.PropertyDataShapeUnwrap[${TypeName(traitName)}, ${weakTypeOf[Table].typeSymbol}, T, ${weakTypeOf[Abs].typeSymbol}] { }
            }
            def ${TermName(c.freshName(proName))} = ${TermName(def1Name)}(${TermName(modelName)}.${TermName(proName)}).unwrap
          }
         """
      }*/

      def mgDef = q"""
          lazy val mg: _root_.net.scalax.asuna.core.macroImpl.ModelGen[${weakTypeOf[Case].typeSymbol}] = new _root_.net.scalax.asuna.core.macroImpl.ModelGen[${weakTypeOf[Case].typeSymbol}] {}
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
          new _root_.net.scalax.asuna.core.AllHelper[${weakTypeOf[Abs]}]{ }.shaped(
            ${proNames.reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${TermName(b)}, $f)")}
          ).map { case ${termVar1} =>
            ..${hlistFromPros(proNames, termVar1)}
            ${weakTypeOf[Case].typeSymbol.companion}(..${proNames.map(fName => q"""${TermName(fName)} = ${TermName(fName)}""")})
          }"""
      }

      val q = c.Expr[Table => DecoderShapeValue[Case, Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: ${weakTypeOf[Table].typeSymbol}) =>
            object CaseClassGenImpl extends _root_.net.scalax.asuna.shape.ShapeHelper with _root_.net.scalax.asuna.shape.HListShapeHelper {
              ..${confireCaseClassFields}
              ..${fileConfirmAction(modelName = TermName(repModelTermName))}
              ${mgDef}
              ..${fieldNameStrs.map { case proName => commonProUseInShape(fieldName = proName, modelName = TermName(repModelTermName), absName = weakTypeOf[Abs], isOutPutSub = false) }}
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