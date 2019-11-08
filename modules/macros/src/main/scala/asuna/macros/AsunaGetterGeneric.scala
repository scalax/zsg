package asuna.macros

import scala.language.experimental.macros

trait AsunaGetterGeneric[H, GenericType] {
  def getter(model: H): GenericType
}

object AsunaGetterGeneric {

  implicit def macroImpl[H, M]: AsunaGetterGeneric[H, M] = macro AsunaGetterGenericMacroApply.MacroImpl.generic[H, M]

}

object AsunaGetterGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaGetterGeneric[H, M]] = {
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

        val nameTag = props.map { name =>
          q"""s.${TermName(name)}"""
        }
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= 8) {
            q"""(s: ${h}) => { asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree}) }"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaGetterGeneric[H, M]] {
          q"""${nameTagGen(nameTag)}"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
