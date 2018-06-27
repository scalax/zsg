package net.scalax.asuna.core.macroImpl

import net.scalax.asuna.core._

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros
import scala.language.higherKinds

trait PropertyType[Pro] {
  def toIO[Abs]: DelayTag[Pro, Abs] = DelayTag.createDelayTagGeneration[Abs].apply[Pro]
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
  val shape: DataShape[Rep, Data, Out, Abs]
  def sv: DataShapeValue[Data, Abs] = new DataShapeValue[Data, Abs] {
    override type RepType = self.Out
    override val rep: self.Out = self.shape.wrapRep(self.rep)
    override val shape: DataShape[self.Out, Data, self.Out, Abs] = self.shape.packed
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

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[Table => DataShapeValue[Case, Abs]] = {
      val fieldNames = weakTypeOf[Case].members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name }.toList
      val fieldNameStrs = fieldNames.map(_.toString.trim)
      def confireCaseClassFields = {
        confirmHasFields(baseModelName = weakTypeOf[Case].typeSymbol, compareModelName = weakTypeOf[Table].typeSymbol, fieldNames = fieldNameStrs)
      }

      def fileConfirmAction(modelName: TermName) = {
        fieldsShapeConifrm(modelName = modelName, tableName = weakTypeOf[Table].typeSymbol, absName = weakTypeOf[Abs].typeSymbol, fieldNames = fieldNameStrs)
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
          _root_.net.scalax.asuna.core.DataShapeValue.toShapeValue[${weakTypeOf[Abs].typeSymbol}].sv(
            ${proNames.reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${TermName(b)}, $f)")}
          ).map { case ${termVar1} =>
            ..${hlistFromPros(proNames, termVar1)}
            ${weakTypeOf[Case].typeSymbol.companion}(..${proNames.map(fName => q"""${TermName(fName)} = ${TermName(fName)}""")})
          }"""
      }

      val q = c.Expr[Table => DataShapeValue[Case, Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: ${weakTypeOf[Table].typeSymbol}) =>
            ..${confireCaseClassFields}
            ..${fileConfirmAction(modelName = TermName(repModelTermName))}
            ${mgDef}
            ..${fieldNameStrs.map { case proName => proUseInShape(fieldName = proName, modelName = TermName(repModelTermName), absName = weakTypeOf[Abs].typeSymbol, isOutPutSub = false) }}
            ${toShape(fieldNameStrs)}
          }
        """
      }
      //println(q)
      q
    }

  }

}