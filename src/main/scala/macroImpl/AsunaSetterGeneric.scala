package org.scalax.asuna.mapper.append.macroImpl

import org.scalax.asuna.mapper.AppendTag
import org.scalax.asuna.mapper.item.ItemTag

import scala.language.experimental.macros

trait AsunaSetterGeneric[H] {
  type GenericType
  def setter: GenericType => H
}

object AsunaSetterGeneric {

  def init[T1]: AsunaSetterApply1[T1] = new AsunaSetterApply1[T1] {}
  trait AsunaSetterApply1[T1] {
    def to[T2 <: ItemTag](appendTag: AppendTag[T2])(c: T2#XyyItemType => T1): AsunaSetterGeneric.Aux[T1, T2#XyyItemType] = new AsunaSetterGeneric[T1] {
      override type GenericType = T2#XyyItemType
      override def setter: T2#XyyItemType => T1 = c
    }
  }

  type Aux[H, WW] = AsunaSetterGeneric[H] { type GenericType = WW }

  implicit def appendMacroImpl[H, M]: AsunaSetterGeneric.Aux[H, M] = macro AsunaSetterGenericMacroApply.AppendMacroImpl1.generic[H, M]

}

object AsunaSetterGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSetterGeneric.Aux[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.typeSymbol

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

        val proTypeTag = props.map(s => q"""new org.scalax.asuna.mapper.append.macroImpl.ModelApply[${hType}].to(_.${TermName(s)})""")
        val typeTag = if (proTypeTag.length <= 22) {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.lift(org.scalax.asuna.mapper.item.BuildTagContect.tag(..${proTypeTag}))"""
        } else {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.lift(org.scalax.asuna.mapper.item.BuildTagContect.nodeTag(..${proTypeTag
            .grouped(22)
            .toList
            .map(i => q"""org.scalax.asuna.mapper.item.BuildTagContect.tag(..${i})""")}))"""
        }

        val proSize = props.size

        def inputItem: List[(String, Tree)] = {
          if (proSize < 22) {
            props.zipWithIndex.map {
              case (r, index) =>
                (r, q"""item.${TermName("i" + (index + 1))}""")
            }
          } else {
            props
              .grouped(22)
              .zipWithIndex
              .map {
                case (item, index) =>
                  item.zipWithIndex.map { case (item1, index1) => (item1, q"""item.${TermName("i" + (index + 1))}.${TermName("i" + (index1 + 1))}""") }
              }
              .flatten
              .toList
          }
        }

        val inputFunc = q"""{ item => ${hType.companion}.apply(..${inputItem.map { case (item, m) => q"""${TermName(item)} = ${m}""" }}) }"""

        c.Expr[AsunaSetterGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.append.macroImpl.AsunaSetterGeneric.init[${hType}].to(${typeTag})(${inputFunc})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
