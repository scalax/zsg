package asuna.macros.single

import asuna.macros.single.utils.SealedHelper

import scala.language.experimental.macros

trait AsunaSealedClassGeneric[H, NameType] {
  def names(): NameType
}

object AsunaSealedClassGeneric {

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

        val nameTag = props.map { subType =>
          q"""classOf[${subType}]"""
        }
        //.grouped(8)
        //.toList
        //.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= 8) {
            q"""asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaSealedClassGeneric[H, M]] {
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
