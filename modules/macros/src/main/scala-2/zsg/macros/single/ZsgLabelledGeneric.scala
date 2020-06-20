package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.TypeHelper

import scala.language.experimental.macros

trait ZsgLabelledGeneric[H, NameType] {
  def names: NameType
}

object ZsgLabelledGeneric {
  @inline def value[T, Model](name: T): ZsgLabelledGeneric[Model, T] =
    new ZsgLabelledGeneric[Model, T] {
      override def names: T = name
    }

  implicit def macroImpl[H, II]: ZsgLabelledGeneric[H, II] = macro ZsgLabelledGenericMacroApply.MacroImpl.generic[H, II]

}

object ZsgLabelledGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgLabelledGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = caseClassMembersByType(hType)

        val nameTag = props.map { name => q"""${Literal(Constant(name.fieldName))}""" }
        def nameTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init)
              q"""_root_.zsg.BuildContent.tuple1(..${tree})"""
            else
              q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).toList
            if (init)
              nameTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("tuple" + s.length)}(..${s})"""), false)
            else
              nameTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("nodeTuple" + s.length)}(..${s})"""), false)
          }

        c.Expr[ZsgLabelledGeneric[H, M]] {
          q"""_root_.zsg.macros.single.ZsgLabelledGeneric.value(${nameTagGen(nameTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
