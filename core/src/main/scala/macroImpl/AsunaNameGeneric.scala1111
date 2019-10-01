package org.scalax.asuna.mapper.append.macroImpl

import org.scalax.asuna.mapper.item.ContextContent

import scala.language.experimental.macros

trait AsunaNameGeneric[H] {
  type NameType
  def names: ContextContent[NameType]
}

object AsunaNameGeneric {

  def init[M]: AsunaNameGenericApply[M] = new AsunaNameGenericApply[M] {}

  trait AsunaNameGenericApply[M] {
    def name[N](names1: ContextContent[N]): Aux[M, N] = new AsunaNameGeneric[M] {
      override type NameType = N
      override def names: ContextContent[N] = names1
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

        val nameTag = props
          .map { name =>
            q"""${Literal(Constant(name))}"""
          }
          .grouped(8)
          .toList
          .map(s => q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("nodeItem" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("nodeItem" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaNameGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.append.macroImpl.AsunaNameGeneric.init[${hType}].name(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
