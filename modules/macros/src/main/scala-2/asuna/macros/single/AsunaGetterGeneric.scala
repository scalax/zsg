package asuna.macros.single

import asuna.macros.AsunaParameters
import asuna.macros.single.utils.TypeHelper

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

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaGetterGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = caseClassMembersByType(hType)

        val nameTag = props.map { name => q"""s.${name.fieldTermName}""" }
        def nameTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init)
              q"""(s: ${h}) => { _root_.asuna.BuildContent.tuple1(..${tree}) }"""
            else
              q"""(s: ${h}) => { ..${tree} }"""

          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            if (init)
              nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""), false)
            else
              nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("nodeTuple" + s.length)}(..${s})"""), false)
          }

        c.Expr[AsunaGetterGeneric[H, M]] {
          q"""_root_.asuna.macros.single.AsunaGetterGeneric.value(${nameTagGen(nameTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
