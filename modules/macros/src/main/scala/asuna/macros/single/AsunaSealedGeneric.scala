package asuna.macros

import asuna.macros.utils.SealedHelper
import asuna.{AppendTag, TupleTag}

import scala.language.experimental.macros

trait AsunaSealedGeneric[H] {
  type Sealed <: TupleTag
  def tag: Sealed
}

class SealedTag[T]

object SealedTag {
  def apply[T]: AppendTag[SealedTag[T]] = new AppendTag[SealedTag[T]]
}

object AsunaSealedGeneric {

  def init[M]: GenericApply[M] = new GenericApply[M]

  class GenericApply[M] {
    def generic[WW <: TupleTag](implicit i: AsunaSealedGeneric.Aux[M, WW]): AsunaSealedGeneric.Aux[M, WW] = i

    def init1[K <: TupleTag](i: AppendTag[K]): Aux[M, K] = {
      new AsunaSealedGeneric[M] {
        override type Sealed = K
        override def tag = throw new Exception("debugging")
      }
    }
  }

  type Aux[H, II <: TupleTag] = AsunaSealedGeneric[H] { type Sealed = II }

  implicit def macroImpl[H, II <: TupleTag]: AsunaSealedGeneric.Aux[H, II] = macro AsunaSealedGenericMacroApply.MacroImpl1.generic[H, II]

}

object AsunaSealedGenericMacroApply {

  class MacroImpl1(override val c: scala.reflect.macros.whitebox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M <: TupleTag: c.WeakTypeTag]: c.Expr[AsunaSealedGeneric.Aux[H, M]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).toList

        val proTypeTag = props.map(s => q"""asuna.macros.SealedTag[${s}]""")

        val typeTag = proTypeTag.grouped(8).toList.map(i => q"""asuna.BuildTag.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildTag.lift(..${tree})"""
          } else if (tree.length <= 8) {
            q"""asuna.BuildTag.lift(org.scalax.asuna.mapper.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildTag.nodeTag(..${s})"""))
          }

        c.Expr[AsunaSealedGeneric.Aux[H, M]] {
          q"""asuna.macros.AsunaSealedGeneric.init[${hType}].init1(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
