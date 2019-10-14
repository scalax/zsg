package asuna.macros

import asuna.ContextContent

import scala.language.experimental.macros

trait AsunaSealedLabelledGeneric[H] {
  type NameType
  def names: ContextContent[NameType]
}

object AsunaSealedLabelledGeneric {

  def init[M]: AsunaSealedLabelledGenericApply[M] = new AsunaSealedLabelledGenericApply[M] {}

  trait AsunaSealedLabelledGenericApply[M] {
    def name[N](names1: ContextContent[N]): Aux[M, N] = new AsunaSealedLabelledGeneric[M] {
      override type NameType = N
      override def names: ContextContent[N] = names1
    }
  }

  type Aux[H, WW] = AsunaSealedLabelledGeneric[H] { type NameType = WW }

  implicit def appendMacroImpl[H, II]: AsunaSealedLabelledGeneric.Aux[H, II] = macro AsunaSealedLabelledGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaSealedLabelledGenericMacroApply {

  class AppendMacroImpl1(override val c: scala.reflect.macros.blackbox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSealedLabelledGeneric.Aux[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).toList

        val nameTag = props
          .map { subType =>
            q"""${Literal(Constant(subType.typeSymbol.name.toString))}"""
          }
          .grouped(8)
          .toList
          .map(s => q"""asuna.BuildContent.${TermName("item" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else if (tree.length < 8) {
            q"""asuna.BuildContent.${TermName("nodeItem" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("nodeItem" + s.length)}(..${s})"""))
          }
        println(q"""asuna.macros.AsunaSealedLabelledGeneric.init[${hType}].name(${nameTagGen(nameTag)})""")

        c.Expr[AsunaSealedLabelledGeneric.Aux[H, M]] {
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
