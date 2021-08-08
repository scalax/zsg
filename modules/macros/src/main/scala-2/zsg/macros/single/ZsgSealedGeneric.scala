package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.SealedHelper

import scala.annotation.tailrec
import scala.language.experimental.macros
import scala.collection.compat._

trait ZsgSealedGeneric[H] {
  type Sealed
  def tag: Sealed
}

class SealedTag[T]

object SealedTag {
  def apply[T]: SealedTag[T] = new SealedTag[T]
}

object ZsgSealedGeneric {

  class SealedGenericApply[I] {
    def value[M](value1: => M): ZsgSealedGeneric.Aux[I, M] =
      new ZsgSealedGeneric[I] {
        override type Sealed = M
        override def tag: M = value1
      }
  }
  object SealedGenericApply {
    val value: SealedGenericApply[Any]  = new SealedGenericApply[Any]
    def apply[T]: SealedGenericApply[T] = value.asInstanceOf[SealedGenericApply[T]]
  }

  type Aux[H, II] = ZsgSealedGeneric[H] { type Sealed = II }

  implicit def macroImpl[H, II]: ZsgSealedGeneric.Aux[H, II] = macro ZsgSealedGenericMacroApply.MacroImpl1.generic[H, II]

}

object ZsgSealedGenericMacroApply {

  class MacroImpl1(override val c: scala.reflect.macros.whitebox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: WeakTypeTag, M: WeakTypeTag]: c.Expr[ZsgSealedGeneric.Aux[H, M]] = {
      try {
        val h = weakTypeOf[H]

        val props = fleshedOutSubtypes(h).to(List)

        val proTypeTag = props.map(s => q"""_root_.zsg.macros.single.SealedTag[${s}]""")

        @tailrec
        def typeTagGen(tree: List[Tree]): Tree = if (tree.length == 1) q"""..$tree"""
        else {
          val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
          typeTagGen(groupedTree.map(s => if (s.size > 1) q"""_root_.zsg.ItemTag2(..$s)""" else q"""..$s"""))
        }

        c.Expr[ZsgSealedGeneric.Aux[H, M]] {
          q"""_root_.zsg.macros.single.ZsgSealedGeneric.SealedGenericApply[$h].value(${typeTagGen(proTypeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
