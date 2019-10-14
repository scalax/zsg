package asuna.macros

import asuna.{AppendTag, ItemTag}

import scala.language.experimental.macros

trait AsunaSealedGeneric[H] {
  type Sealed <: ItemTag
  def tag: Sealed
}

class SealedTag[T]

object SealedTag {
  def apply[T]: AppendTag[SealedTag[T]] = new AppendTag[SealedTag[T]]
}

object AsunaSealedGeneric {

  def init[M]: GenericApply[M] = new GenericApply[M] {}

  trait GenericApply[M] {
    def generic[WW <: ItemTag](implicit i: AsunaSealedGeneric.Aux[M, WW]): AsunaSealedGeneric.Aux[M, WW] = i

    def init1[K <: ItemTag](i: AppendTag[K]): Aux[M, K] = {
      new AsunaSealedGeneric[M] {
        override type Sealed = K
        override def tag = throw new Exception("debugging")
      }
    }
  }

  type Aux[H, II <: ItemTag] = AsunaSealedGeneric[H] { type Sealed = II }

  implicit def appendMacroImpl[H, II <: ItemTag]: AsunaSealedGeneric.Aux[H, II] = macro AsunaSealedGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaSealedGenericMacroApply {

  class AppendMacroImpl1(override val c: scala.reflect.macros.whitebox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M <: ItemTag: c.WeakTypeTag]: c.Expr[AsunaSealedGeneric.Aux[H, M]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).toList

        val proTypeTag = props.map(s => q"""asuna.macros.SealedTag[${s}]""")

        val typeTag = proTypeTag.grouped(8).toList.map(i => q"""asuna.BuildContent.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildContent.lift(..${tree})"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.lift(org.scalax.asuna.mapper.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildContent.nodeTag(..${s})"""))
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
