package asuna.macros

import scala.language.experimental.macros

trait DefaultValue[T] {
  def value: Option[T]
}

object DefaultValue {
  def model[Model]: DefaultValueApply[Model] = new DefaultValueApply[Model]

  class DefaultValueApply[Model] {
    def to[R](m: Model => R)(o: => Option[R]): DefaultValue[R] = {
      new DefaultValue[R] {
        override def value: Option[R] = o
      }
    }
  }
}

trait AsunaDefaultValueGeneric[H, DefaultValueType] {
  def defaultValues(): DefaultValueType
}

object AsunaDefaultValueGeneric extends AsunaDefaultValueGenericMacroPoly

trait AsunaDefaultValueGenericMacroPoly {

  implicit def macroImpl[H, II]: AsunaDefaultValueGeneric[H, II] = macro AsunaDefaultValueGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaDefaultValueGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaDefaultValueGeneric[H, M]] = {
      try {
        val h           = c.weakTypeOf[H]
        val hType       = h.resultType
        val hTypeSymbol = h.typeSymbol
        val hCompanion  = hTypeSymbol.companion
        val apply       = hCompanion.typeSignature.decl(TermName("apply")).asMethod

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

        val proTypeTag =
          apply.paramLists.head.map(_.asTerm).zipWithIndex.map {
            case (p, i) =>
              if (!p.isParamWithDefault) q"""asuna.macros.DefaultValue.model[${hType}].to(_.${p.name})(Option.empty)"""
              else {
                val getterName = TermName("apply$default$" + (i + 1))
                q"""asuna.macros.DefaultValue.model[${hType}].to(_.${p.name})(Some($hCompanion.$getterName))"""
              }
          }

        val nameTag                            = proTypeTag //.grouped(8).toList.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})""")
        def nameTagGen(tree: List[Tree]): Tree =
          /*if (tree.length == 1) {
            q"""..${tree}"""
          } else*/ if (tree.length <= 8) {
            q"""asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaDefaultValueGeneric[H, M]] {
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
