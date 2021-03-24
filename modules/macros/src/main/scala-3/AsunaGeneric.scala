package zsg.macros.single

import asuna._
import zsg.macros.ZsgParameters

import scala.language.experimental.macros

trait AsunaGeneric[H] {
  type WT
  def tag: WT
}

object AsunaGeneric {

  val value = new AsunaGeneric[Any] {
    override type WT = Any
    override def tag: Any = 2
  }
  type Aux[H, II] = AsunaGeneric[H] { type WT = II }
  @inline def Aux[H, II  ]: Aux[H, II] = value.asInstanceOf[Aux[H, II]]

  class GenericApply[M] {
    def generic[WW](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW]     = i
    @inline def value[K](i: PropertyApply[M] => K): AsunaGeneric.Aux[M, K] = Aux[M, K]
  }

  object GenericApply {
    val value                                                  = new GenericApply[Any]
    @inline def apply[T]: AsunaGeneric.GenericApply[T]         = value.asInstanceOf[GenericApply[T]]
    @inline implicit def init[M]: AsunaGeneric.GenericApply[M] = GenericApply[M]
  }

  transparent inline def defaultOf[H](using inline prop: AsunaGeneric.GenericApply[H]) = ${ AsunaGenericMacroApply.generic('prop) }

}

object AsunaGenericMacroApply {

  import scala.quoted.*

  def generic[H](prop: Expr[AsunaGeneric.GenericApply[H]])(using qctx: Quotes, t1: Type[H]): Expr[Any] = {
    // import qctx.tasty._
    // println(t1.unseal)
    prop
  }

  // class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) {
  //   self =>

  //   import c.universe._

  //   def generic[H: c.WeakTypeTag, II <: TupleTag: c.WeakTypeTag](prop: c.Expr[AsunaGeneric.GenericApply[H]]): c.Expr[AsunaGeneric.Aux[H, II]] = {
  //     try {
  //       val h     = weakTypeOf[H]
  //       val hType = h.resultType

  //       val props = caseClassMembersByType(hType)

  //       val proTypeTag = props.map(s => q"""item.to(_.${s.fieldTermName})""")

  //       val typeTag = proTypeTag.grouped(ZsgParameters.maxPropertyNum).to(List).map(i => q"""_root_.asuna.AppendTag.tag(..$i)""")
  //       def typeTagGen(tree: List[Tree]): Tree =
  //         if (tree.length == 1) {
  //           q"""..$tree"""
  //         } else if (tree.length <= ZsgParameters.maxPropertyNum) {
  //           q"""_root_.asuna.AppendTag.nodeTag(..$tree)"""
  //         } else {
  //           val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
  //           typeTagGen(groupedTree.map(s => q"""_root_.asuna.AppendTag.nodeTag(..$s)"""))
  //         }

  //       c.Expr[AsunaGeneric.Aux[H, II]] {
  //         q"""$prop.value(item => ${typeTagGen(typeTag)})"""
  //       }

  //     } catch {
  //       case e: Exception =>
  //         e.printStackTrace
  //         throw e
  //     }
  //   }
  // }

}