package org.scalax.asuna.mapper.macroImpl

import org.scalax.asuna.mapper.AppendTag
import org.scalax.asuna.mapper.ItemTag

import scala.language.experimental.macros

trait AsunaSetterGeneric[H] {
  type GenericType
  def setter: GenericType => H
}

object AsunaSetterGeneric {

  def init[T1]: AsunaSetterApply1[T1] = new AsunaSetterApply1[T1] {}
  trait AsunaSetterApply1[T1] {
    def to[T2 <: ItemTag](appendTag: AppendTag[T2])(c: T2#ItemType => T1): AsunaSetterGeneric.Aux[T1, T2#ItemType] = new AsunaSetterGeneric[T1] {
      override type GenericType = T2#ItemType
      override def setter: T2#ItemType => T1 = c
    }
  }

  type Aux[H, WW] = AsunaSetterGeneric[H] { type GenericType = WW }

  implicit def appendMacroImpl[H, M]: AsunaSetterGeneric.Aux[H, M] = macro AsunaSetterGenericMacroApply.AppendMacroImpl1.generic[H, M]

}

object AsunaSetterGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSetterGeneric.Aux[H, M]] = {
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

        val proTypeTag = props
          .map(s => q"""new org.scalax.asuna.mapper.macroImpl.ModelApply[${hType}].to(_.${TermName(s)})""")
          .grouped(8)
          .toList
          .map(s => q"""org.scalax.asuna.mapper.BuildContent.tag(..${s})""")

        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""org.scalax.asuna.mapper.BuildContent.lift(..${tree})"""
          } else if (tree.length < 8) {
            q"""org.scalax.asuna.mapper.BuildContent.lift(org.scalax.asuna.mapper.BuildContent.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""org.scalax.asuna.mapper.BuildContent.nodeTag(..${s})"""))
          }

        def toItemImpl(max: Int, initList: List[(String, Tree => Tree)]): List[(String, Tree => Tree)] =
          if (initList.size > max) {
            val i = initList.zipWithIndex.map {
              case ((str, t), index) =>
                (str, { t1: Tree =>
                  t(q"""${t1}.${TermName("i" + (index / max + 1).toString)}""")
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

        c.Expr[AsunaSetterGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.macroImpl.AsunaSetterGeneric.init[${hType}].to(${typeTagGen(proTypeTag)})(${inputFunc})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}