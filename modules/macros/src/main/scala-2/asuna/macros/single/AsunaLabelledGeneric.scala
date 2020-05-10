package asuna.macros.single

import asuna.macros.AsunaParameters
import asuna.macros.single.utils.TypeHelper

import scala.language.experimental.macros

trait AsunaLabelledGeneric[H, NameType] {
  def names: NameType
}

object AsunaLabelledGeneric extends AsunaLabelledGenericMacroPoly {
  @inline def value[T, Model](name: T): AsunaLabelledGeneric[Model, T] = new AsunaLabelledGeneric[Model, T] {
    override def names: T = name
  }
}

trait AsunaLabelledGenericMacroPoly {

  implicit def macroImpl[H, II]: AsunaLabelledGeneric[H, II] = macro AsunaLabelledGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaLabelledGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaLabelledGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = caseClassMembersByType(hType)

        val nameTag = props.map { name => q"""${Literal(Constant(name.fieldName))}""" }
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            nameTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaLabelledGeneric[H, M]] {
          q"""_root_.asuna.macros.single.AsunaLabelledGeneric.value(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
