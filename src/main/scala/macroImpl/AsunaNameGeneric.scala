package org.scalax.asuna.mapper.append.macroImpl

import org.scalax.asuna.mapper.item.{ItemTag, MessageContent}

import scala.language.experimental.macros

trait AsunaNameGeneric[H] {
  type NameType
  def names: NameType
}

object AsunaNameGeneric {

  def init[M]: AsunaNameGenericApply[M] = new AsunaNameGenericApply[M] {}

  trait AsunaNameGenericApply[M] {
    def name[N](names1: N): Aux[M, N] = new AsunaNameGeneric[M] {
      override type NameType = N
      override def names: N = names1
    }
  }

  type Aux[H, WW] = AsunaNameGeneric[H] { type NameType = WW }

  implicit def appendMacroImpl[H, II]: AsunaNameGeneric.Aux[H, II] = macro AsunaNameGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaNameGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaNameGeneric.Aux[H, M]] = {
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

        val nameProTag = if (props.length <= 22) {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + props.length)}(..${props.map(s => q"""${Literal(Constant(s))}""")})"""
        } else {
          q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + props.grouped(22).length)}(..${props.grouped(22).toList.map { ii =>
            q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + ii.length)}(..${ii.map { p =>
              q"""${Literal(Constant(p))}"""
            }})"""
          }})"""
        }

        c.Expr[AsunaNameGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.append.macroImpl.AsunaNameGeneric.init[${hType}].name(${nameProTag})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
