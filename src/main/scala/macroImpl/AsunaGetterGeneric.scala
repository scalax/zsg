package org.scalax.asuna.mapper.append.macroImpl

import org.scalax.asuna.mapper.item.ContextContent

import scala.language.experimental.macros

trait AsunaGetterGeneric[H] {
  type GenericType
  def getter: H => ContextContent[GenericType]
}

object AsunaGetterGeneric {

  def init[M, R](i: M => ContextContent[R]): AsunaGetterGeneric.Aux[M, R] = new AsunaGetterGeneric[M] {
    override type GenericType = R
    override def getter = i
  }

  type Aux[H, WW] = AsunaGetterGeneric[H] { type GenericType = WW }

  implicit def appendMacroImpl[H, M]: AsunaGetterGeneric.Aux[H, M] = macro AsunaGetterGenericMacroApply.AppendMacroImpl1.generic[H, M]

}

object AsunaGetterGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaGetterGeneric.Aux[H, M]] = {
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

        val proSize = props.size

        /*val nameTag = if (proSize <= 22) {
          q"""(s: ${h}) => { org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + proSize)}(..${props.map(s => q"""s.${TermName(s)}""")}) }"""
        } else {
          q"""(s: ${h}) => {
          org.scalax.asuna.mapper.item.BuildTagContect.${TermName("nodeItem" + props.grouped(22).length)}(..${props.grouped(22).toList.map { ii =>
            q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + ii.length)}(..${ii.map { p =>
              q"""s.${TermName(p)}"""
            }})"""
          }})
          }"""
        }*/

        val nameTag = props.map { name => q"""s.${TermName(name)}"""}
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""(s: ${h}) => { ..${tree} }"""
          } else if (tree.length < 8) {
            q"""(s: ${h}) => { org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + tree.length)}(..${tree}) }"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s =>q"""org.scalax.asuna.mapper.item.BuildTagContect.${TermName("item" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaGetterGeneric.Aux[H, M]] {
          q"""org.scalax.asuna.mapper.append.macroImpl.AsunaGetterGeneric.init(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
