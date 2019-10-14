package asuna.macros

import asuna.{AppendTag, ItemTag}

import scala.language.experimental.macros

class PropertyTag[T]
class PropertyApply[I] {
  def to[R](m: I => R): AppendTag[PropertyTag[R]] = new AppendTag[PropertyTag[R]]
}
object PropertyApply {
  def apply[R]: PropertyApply[R] = new PropertyApply[R]
}

trait AsunaGeneric[H] {
  type WT <: ItemTag
  def tag: WT
}

object AsunaGeneric {

  def init[M]: GenericApply[M] = new GenericApply[M] {}

  trait GenericApply[M] {
    def generic[WW <: ItemTag](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW] = i

    def init1[K <: ItemTag](i: AppendTag[K]): Aux[M, K] = {
      new AsunaGeneric[M] {
        override type WT = K
        override def tag = throw new Exception("debugging")
      }
    }
  }

  type Aux[H, II <: ItemTag] = AsunaGeneric[H] { type WT = II }

  implicit def appendMacroImpl[H, II <: ItemTag]: AsunaGeneric.Aux[H, II] = macro AsunaGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M <: ItemTag: c.WeakTypeTag]: c.Expr[AsunaGeneric.Aux[H, M]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val proTypeTag = props.map(s => q"""asuna.macros.PropertyApply[${hType}].to(_.${TermName(s)})""")

        val typeTag = proTypeTag.grouped(8).toList.map(i => q"""asuna.BuildContent.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildContent.lift(..${tree})"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.lift(asuna.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildContent.nodeTag(..${s})"""))
          }

        c.Expr[AsunaGeneric.Aux[H, M]] {
          q"""asuna.macros.AsunaGeneric.init[${hType}].init1(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
