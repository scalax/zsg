package asuna.macros

import asuna._

import scala.language.experimental.macros

trait AsunaSetterGeneric[H, GenericType] {
  def setter: GenericType => H
}

class PropertySetter[T] {
  def to[R](i: T => R): AppendTag[R] = new AppendTag[R]
}
object PropertySetter {
  def apply[T]: PropertySetter[T] = new PropertySetter[T]
}

object AsunaSetterGeneric {

  def init[T1]: AsunaSetterApply1[T1] = new AsunaSetterApply1[T1] {}
  trait AsunaSetterApply1[T1] {
    def to[T2 <: TupleTag](appendTag: AppendTag[T2])(c: T2#AsunaTupleType => T1): AsunaSetterGeneric[T1, T2#AsunaTupleType] =
      new AsunaSetterGeneric[T1, T2#AsunaTupleType] {
        override def setter: T2#AsunaTupleType => T1 = c
      }
  }

  implicit def macroImpl[H, M]: AsunaSetterGeneric[H, M] = macro AsunaSetterGenericMacroApply.MacroImpl.generic[H, M]

}

object AsunaSetterGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSetterGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = h.members.toList
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

        val proTypeTag =
          props.map(s => q"""asuna.macros.PropertySetter[${hType}].to(_.${TermName(s)})""").grouped(8).toList.map(s => q"""asuna.BuildContent.tag(..${s})""")

        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildContent.lift(..${tree})"""
          } else if (tree.length <= 8) {
            q"""asuna.BuildContent.lift(asuna.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildContent.nodeTag(..${s})"""))
          }

        def toItemImpl(max: Int, initList: List[(String, Tree => Tree)]): List[(String, Tree => Tree)] =
          if (initList.size > max) {
            val i = initList.zipWithIndex.map {
              case ((str, t), index) =>
                (str, { t1: Tree =>
                  t(q"""${t1}.${TermName("i" + ((index / max % 8) + 1).toString)}""")
                })
            }
            toItemImpl(max * 8, i)
          } else initList

        val preList = props.zipWithIndex.map {
          case (str, index) =>
            (str, { t1: Tree =>
              q"""${t1}.${TermName("i" + (index % 8 + 1).toString)}"""
            })
        }

        val casei = toItemImpl(8, preList)

        val inputFunc = q"""{ item => ${hType.typeSymbol.companion}.apply(..${casei.map { case (item, m) => q"""${TermName(item)} = ${m(Ident(TermName("item")))}""" }}) }"""

        c.Expr[AsunaSetterGeneric[H, M]] {
          q"""asuna.macros.AsunaSetterGeneric.init[${hType}].to(${typeTagGen(proTypeTag)})(${inputFunc})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
