package asuna.macros

import asuna.{BuildContent, ContextContent, Item2, Item8}

import scala.language.experimental.macros

trait AsunaLabelledGeneric[H, NameType] {
  def names: ContextContent[NameType]
}

object AsunaLabelledGeneric {

  def init[M]: AsunaNameGenericApply[M] = new AsunaNameGenericApply[M] {}

  trait AsunaNameGenericApply[M] {
    def name[N](names1: ContextContent[N]): AsunaLabelledGeneric[M, N] = new AsunaLabelledGeneric[M, N] {
      override def names: ContextContent[N] = names1
    }
  }

  implicit def macroImpl[H, II]: AsunaLabelledGeneric[H, II] = macro AsunaLabelledGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaLabelledGenericCodeGenSample {

  case class Test10(i1: String, i2: Int, i3: Int, i4: Long, i5: String, i6: List[String], i7: Long, i8: Option[Long], i9: List[Long], i10: String)
  val genResult: AsunaLabelledGeneric[Test10, Item2[Item8[String, String, String, String, String, String, String, String], Item2[String, String]]] =
    AsunaLabelledGeneric.init[Test10].name(BuildContent.nodeItem2(BuildContent.item8("i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8"), BuildContent.item2("i9", "i10")))

}

object AsunaLabelledGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaLabelledGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val nameTag = props
          .map { name =>
            q"""${Literal(Constant(name))}"""
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

        c.Expr[AsunaLabelledGeneric[H, M]] {
          q"""asuna.macros.AsunaLabelledGeneric.init[${hType}].name(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
