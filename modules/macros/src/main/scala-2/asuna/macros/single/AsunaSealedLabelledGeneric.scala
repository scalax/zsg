package asuna.macros.single

import asuna.macros.AsunaParameters
import asuna.macros.single.utils.SealedHelper

import scala.language.experimental.macros

trait AsunaSealedLabelledGeneric[H, NameType] {
  def names: NameType
}

object AsunaSealedLabelledGeneric {

  def value[T, Model](name: T): AsunaSealedLabelledGeneric[Model, T] = new AsunaSealedLabelledGeneric[Model, T] {
    override def names: T = name
  }

  implicit def macroImpl[H, II]: AsunaSealedLabelledGeneric[H, II] = macro AsunaSealedLabelledGenericMacroApply.MacroImpl1.generic[H, II]

}

object AsunaSealedLabelledGenericMacroApply {

  class MacroImpl1(override val c: scala.reflect.macros.blackbox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSealedLabelledGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).toList

        val nameTag = props.map { subType => q"""${Literal(Constant(subType.typeSymbol.name.toString))}""" }
        def nameTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init)
              q"""_root_.asuna.BuildContent.tuple1(..${tree})"""
            else
              q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            if (init)
              nameTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""), false)
            else
              nameTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("nodeTuple" + s.length)}(..${s})"""), false)
          }

        c.Expr[AsunaSealedLabelledGeneric[H, M]] {
          q"""_root_.asuna.macros.single.AsunaSealedLabelledGeneric.value(${nameTagGen(nameTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
