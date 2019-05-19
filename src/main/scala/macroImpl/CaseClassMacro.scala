package org.scalax.asuna.mapper.append.macroImpl

import org.scalax.asuna.mapper.item.{AppendTag, ItemTag}

import scala.language.experimental.macros

class ModelApply[I] {
  def to[R](m: I => R): AppendTag[R] = new AppendTag[R]
}

trait AsunaGeneric[H] {
  type II <: ItemTag
  type S
  def tag: AppendTag[II]
  def getter: H => II#XyyItemType
  def setter: II#XyyItemType => H
  def names: S
}

object AsunaGeneric {

  def init[M] = new GenericApply[M] {}

  trait GenericApply[M] {
    def init1[K <: ItemTag](i: AppendTag[K]): GenericApply1[M, K] = new GenericApply1[M, K] {
      override def init2[T](ii: M => K#XyyItemType, mm: K#XyyItemType => M, n: T): Aux[M, K, T] = {
        new AsunaGeneric[M] {
          override type II = K
          override type S  = T
          override def tag    = i
          override def getter = ii
          override def setter = mm
          override def names  = n
        }
      }
    }
  }

  trait GenericApply1[M, K <: ItemTag] {
    def init2[T](ii: M => K#XyyItemType, mm: K#XyyItemType => M, n: T): Aux[M, K, T]
  }

  type Aux[H, K <: ItemTag, U] = AsunaGeneric[H] { type II = K; type S = U }

  implicit def appendMacroImpl[H, II <: ItemTag, T]: AsunaGeneric.Aux[H, II, T] = macro AsunaGenericMacroApply.AppendMacroImpl1.generic[H, II, T]

}

object AsunaGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M <: org.scalax.asuna.mapper.item.ItemTag: c.WeakTypeTag, U]: c.Expr[AsunaGeneric.Aux[H, M, U]] = {
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
        q"""org.scalax.asuna.ii.item.BuildTagContect.lift(org.scalax.asuna.ii.item.BuildTagContect.tag(..${proTypeTag}))"""
      } else {
        q"""org.scalax.asuna.ii.item.BuildTagContect.lift(org.scalax.asuna.ii.item.BuildTagContect.nodeTag(..${proTypeTag
          .grouped(22)
          .toList
          .map(i => q"""org.scalax.asuna.ii.item.BuildTagContect.tag(..${i})""")}))"""
      }

      val nameTag = if (proTypeTag.length <= 22) {
        q"""(s: ${h}) => { org.scalax.asuna.ii.item.BuildTagContect.${TermName("item" + proTypeTag.length)}(..${props.map(s => q"""s.${TermName(s)}""")}) }"""
      } else {
        q"""(s: ${h}) => {
          org.scalax.asuna.ii.item.BuildTagContect.${TermName("item" + proTypeTag.grouped(22).length)}(..${props.grouped(22).toList.map { ii =>
          q"""org.scalax.asuna.ii.item.BuildTagContect.${TermName("item" + ii.length)}(..${ii.map { p =>
            q"""s.${TermName(p)}"""
          }})"""
        }})
          }"""
      }

      val nameProTag = if (proTypeTag.length <= 22) {
        q"""org.scalax.asuna.ii.item.BuildTagContect.${TermName("item" + proTypeTag.length)}(..${props.map(s => q"""${Literal(Constant(s))}""")})"""
      } else {
        q"""org.scalax.asuna.ii.item.BuildTagContect.${TermName("item" + proTypeTag.grouped(22).length)}(..${props.grouped(22).toList.map { ii =>
          q"""org.scalax.asuna.ii.item.BuildTagContect.${TermName("item" + ii.length)}(..${ii.map { p =>
            q"""${Literal(Constant(p))}"""
          }})"""
        }})"""
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

      c.Expr[AsunaGeneric.Aux[H, M, U]] {
        q"""org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric.init[${hType}].init1(${typeTag}).init2(${nameTag}, ${inputFunc}, ${nameProTag})"""
      }
    }

  }

}
