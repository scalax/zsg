package asuna.macros.single

import asuna.macros.AsunaParameters

import scala.language.experimental.macros

trait AsunaSetterGeneric[H, GenericType] {
  def setter(gen: GenericType): H
}

object AsunaSetterGeneric {
  implicit def macroImpl[H, M]: AsunaSetterGeneric[H, M] = macro AsunaSetterGenericMacroApply.MacroImpl.generic[H, M]
}

object AsunaSetterGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaSetterGeneric[H, M]] = {
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
                  t(q"""${t1}.${TermName("i" + ((index / max % AsunaParameters.maxPropertyNum) + 1).toString)}""")
                })
            }
            toItemImpl(max * AsunaParameters.maxPropertyNum, i)
          } else initList

        val preList = props.zipWithIndex.map {
          case (str, index) =>
            (str, { t1: Tree =>
              q"""${t1}.${TermName("i" + (index % AsunaParameters.maxPropertyNum + 1).toString)}"""
            })
        }

        val casei = toItemImpl(AsunaParameters.maxPropertyNum, preList)

        val inputFunc = q"""{ item => ${hType.typeSymbol.companion}.apply(..${casei.map { case (item, m) => q"""${TermName(item)} = ${m(Ident(TermName("item")))}""" }}) }"""

        c.Expr[AsunaSetterGeneric[H, M]] {
          q"""${inputFunc}"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
