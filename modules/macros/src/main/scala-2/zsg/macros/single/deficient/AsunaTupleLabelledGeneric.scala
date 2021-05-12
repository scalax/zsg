package zsg.macros.single.deficient

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.{Sha1Helper, TypeHelper}

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaTupleLabelledGeneric[H, NameType] {
  def names(): NameType
}

object AsunaTupleLabelledGeneric {
  implicit def macroImpl[H, NameType]: AsunaTupleLabelledGeneric[H, NameType] =
    macro AsunaTupleLabelledGenericMacroApply.MacroImpl.generic[H, NameType]
}

object AsunaTupleLabelledGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper with Sha1Helper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, NameType: c.WeakTypeTag]: c.Expr[AsunaTupleLabelledGeneric[H, NameType]] = {
      try {
        val struct = tupleTypeNames[H]

        val allFields     = struct.tupleFields.flatMap(_.caseClassFields)
        val genericFields = struct.modelFields.filter(i => !allFields.exists(ii => ii.fieldName == i.fieldName))

        val nameTag = genericFields.map { name => q"""${Literal(Constant(name.fieldName))}""" }
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= ZsgParameters.maxPropertyNum) {
            q"""_root_.zsg.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).toList
            nameTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaTupleLabelledGeneric[H, NameType]] {
          q"""{ () => ${nameTagGen(nameTag)} }"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
