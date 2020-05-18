package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.SealedHelper

import scala.language.experimental.macros

trait ZsgSealedToAbsGeneric[H, NameType] {
  def names: NameType
}

object ZsgSealedToAbsGeneric {

  def value[N, Model](name: N): ZsgSealedToAbsGeneric[Model, N] = new ZsgSealedToAbsGeneric[Model, N] {
    override def names: N = name
  }

  implicit def macroImpl[H, II]: ZsgSealedToAbsGeneric[H, II] = macro AsunaSealedToabsGenericMacroApply.MacroImpl1.generic[H, II]

}

object AsunaSealedToabsGenericMacroApply {

  class MacroImpl1(override val c: scala.reflect.macros.blackbox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgSealedToAbsGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).toList

        val nameTag = props.map { subType => q"""{ i: ${subType} => i }: (${subType} => ${hType})""" }
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

        c.Expr[ZsgSealedToAbsGeneric[H, M]] {
          q"""_root_.zsg.macros.single.ZsgSealedToAbsGeneric.value(${nameTagGen(nameTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
