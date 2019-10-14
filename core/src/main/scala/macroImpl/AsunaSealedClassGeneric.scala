package asuna.macros

import asuna.ContextContent

import scala.language.experimental.macros

trait AsunaSealedClassGeneric[H] {
  type NameType
  def names: ContextContent[NameType]
}

object AsunaSealedClassGeneric {

  def init[M]: AsunaSealedClassGenericApply[M] = new AsunaSealedClassGenericApply[M] {}

  trait AsunaSealedClassGenericApply[M] {
    def name[N](names1: ContextContent[N]): Aux[M, N] = new AsunaSealedClassGeneric[M] {
      override type NameType = N
      override def names: ContextContent[N] = names1
    }
  }

  type Aux[H, WW] = AsunaSealedClassGeneric[H] { type NameType = WW }

  implicit def appendMacroImpl[H, II]: AsunaSealedClassGeneric.Aux[H, II] = macro AsunaSealedClassGenericMacroApply.AppendMacroImpl1.generic[H, II]

}

object AsunaSealedClassGenericMacroApply {

  class AppendMacroImpl1(override val c: scala.reflect.macros.blackbox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSealedClassGeneric.Aux[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).toList

        val nameTag = props
          .map { subType =>
            q"""classOf[${subType}]"""
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

        c.Expr[AsunaSealedClassGeneric.Aux[H, M]] {
          q"""asuna.macros.AsunaSealedClassGeneric.init[${hType}].name(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
