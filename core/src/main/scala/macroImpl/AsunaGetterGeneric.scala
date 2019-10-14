package asuna.macros

import asuna.ContextContent

import scala.language.experimental.macros

trait AsunaGetterGeneric[H] {
  type GenericType
  def getter: H => ContextContent[GenericType]
}

object AsunaGetterGeneric {

  def init[M, R](i: M => ContextContent[R]): AsunaGetterGeneric.Aux[M, R] = new AsunaGetterGeneric[M] {
    override type GenericType = R
    override def getter: M => ContextContent[R] = i
  }

  type Aux[H, WW] = AsunaGetterGeneric[H] { type GenericType = WW }

  implicit def appendMacroImpl[H, M]: AsunaGetterGeneric.Aux[H, M] = macro AsunaGetterGenericMacroApply.AppendMacroImpl1.generic[H, M]

}

object AsunaGetterGenericMacroApply {

  class AppendMacroImpl1(val c: scala.reflect.macros.blackbox.Context) {
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

        val nameTag = props
          .map { name =>
            q"""s.${TermName(name)}"""
          }
          .grouped(8)
          .toList
          .map(s => q"""asuna.BuildContent.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""(s: ${h}) => { ..${tree} }"""
          } else if (tree.length < 8) {
            q"""(s: ${h}) => { asuna.BuildContent.${TermName("nodeItem" + tree.length)}(..${tree}) }"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("nodeItem" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaGetterGeneric.Aux[H, M]] {
          q"""asuna.macros.AsunaGetterGeneric.init(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
