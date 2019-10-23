package asuna.macros

import asuna.macros.utils.SealedHelper

import scala.language.experimental.macros

trait AsunaSealedLabelledGeneric[H, NameType] {
  def names: NameType
}

object AsunaSealedLabelledGeneric {

  def init[M]: AsunaSealedLabelledGenericApply[M] = new AsunaSealedLabelledGenericApply[M] {}

  trait AsunaSealedLabelledGenericApply[M] {
    def name[N](names1: N): AsunaSealedLabelledGeneric[M, N] = new AsunaSealedLabelledGeneric[M, N] {
      override def names: N = names1
    }
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

        val nameTag = props.map { subType =>
          q"""${Literal(Constant(subType.typeSymbol.name.toString))}"""
        }
        //.grouped(8)
        //.toList
        //.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaSealedLabelledGeneric[H, M]] {
          q"""asuna.macros.AsunaSealedLabelledGeneric.init[${hType}].name(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
