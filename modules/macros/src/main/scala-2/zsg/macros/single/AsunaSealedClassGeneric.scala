package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.SealedHelper

import scala.language.experimental.macros

trait AsunaSealedClassGeneric[H, NameType] {
  def names: NameType
}

object AsunaSealedClassGeneric {

  def value[T, Model](name: T): AsunaSealedClassGeneric[Model, T] = new AsunaSealedClassGeneric[Model, T] {
    override def names: T = name
  }

  implicit def macroImpl[H, II]: AsunaSealedClassGeneric[H, II] = macro AsunaSealedClassGenericMacroApply.MacroImpl1.generic[H, II]

}

object AsunaSealedClassGenericMacroApply {

  class MacroImpl1(override val c: scala.reflect.macros.blackbox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSealedClassGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).toList

        val nameTag = props.map { subType => q"""classOf[${subType}]""" }
        //.grouped(8)
        //.toList
        //.map(s => q"""zsg.BuildContent.${TermName("tuple" + s.length)}(..${s})""")
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

        c.Expr[AsunaSealedClassGeneric[H, M]] {
          q"""_root_.zsg.macros.single.AsunaSealedClassGeneric.value(${nameTagGen(nameTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
