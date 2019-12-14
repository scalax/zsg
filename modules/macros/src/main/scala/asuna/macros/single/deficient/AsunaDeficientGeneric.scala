package asuna.macros.single.deficient

import scala.language.experimental.macros

trait DeficientContent

trait AsunaDeficientGeneric[H, GenericType] {
  def setter(gen: GenericType): H
}

/*object AsunaDeficientGeneric {
  implicit def macroImpl[H, M]: AsunaDeficientGeneric[H, M] = macro AsunaDeficientGenericMacroApply.MacroImpl.generic[H, M]
}

object AsunaDeficientGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaDeficientGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = h.members.toList
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

        def toItemImpl(max: Int, initList: List[(String, Tree => Tree)]): List[(String, Tree => Tree)] =
          if (initList.size > max) {
            val i = initList.zipWithIndex.map {
              case ((str, t), index) =>
                (str, { t1: Tree =>
                  t(q"""${t1}.${TermName("i" + ((index / max % 8) + 1).toString)}""")
                })
            }
            toItemImpl(max * 8, i)
          } else initList

        val preList = props.zipWithIndex.map {
          case (str, index) =>
            (str, { t1: Tree =>
              q"""${t1}.${TermName("i" + (index % 8 + 1).toString)}"""
            })
        }

        val casei = toItemImpl(8, preList)

        val inputFunc = q"""{ item => ${hType.typeSymbol.companion}.apply(..${casei.map { case (item, m) => q"""${TermName(item)} = ${m(Ident(TermName("item")))}""" }}) }"""

        c.Expr[AsunaDeficientGeneric[H, M]] {
          q"""${inputFunc}"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}*/
