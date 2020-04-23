package asuna.macros.single

import asuna.macros.AsunaParameters

import scala.language.experimental.macros

trait AsunaGetterGeneric[H, GenericType] {
  def getter(model: H): GenericType
}

object AsunaGetterGeneric extends AsunaGetterGenericMacroPoly {
  @inline def value[H, GenericType](i: H => GenericType): AsunaGetterGeneric[H, GenericType] = new AsunaGetterGeneric[H, GenericType] {
    override def getter(model: H): GenericType = i(model)
  }
}

trait AsunaGetterGenericMacroPoly {
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
          .filter { s => s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val nameTag = props.map { name => q"""s.${TermName(name)}""" }
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= AsunaParameters.maxPropertyNum) {
            q"""(s: ${h}) => { asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree}) }"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaGetterGeneric[H, M]] {
          q"""_root_.asuna.macros.single.AsunaGetterGeneric.value(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
