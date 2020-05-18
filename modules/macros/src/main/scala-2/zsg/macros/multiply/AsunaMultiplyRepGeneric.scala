package zsg.macros.multiply

import zsg.macros.ZsgParameters
import zsg.macros.multiply.utils.PropertyOverrideHelper

import scala.language.experimental.macros

trait AsunaMultiplyRepGeneric[Table, Model, Rep] {
  def rep(table: Table): Rep
}

object AsunaMultiplyRepGeneric {
  def value[Table, Model, Rep](i: Table => Rep): AsunaMultiplyRepGeneric[Table, Model, Rep] = new AsunaMultiplyRepGeneric[Table, Model, Rep] {
    override def rep(table: Table): Rep = i(table)
  }
  implicit def macroImpl[Table, Model, Rep]: AsunaMultiplyRepGeneric[Table, Model, Rep] = macro AsunaMultiplyRepGenericApply.MacroImpl.generic[Table, Model, Rep]
}

object AsunaMultiplyRepGenericApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends PropertyOverrideHelper {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaMultiplyRepGeneric[Table, Model, M]] = {
      try {
        val t     = weakTypeOf[Table]
        val m     = weakTypeOf[Model]
        val tType = t.resultType
        val mType = m.resultType

        val props = mType.members.toList
          .filter { s => s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val tableFields = tType.members.toList
          .filter(s => s.isTerm)
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              (List(proName), s, s.typeSignatureIn(tType))
          }
          .reverse

        val tableProps = tableFields.map(s => tablePropsGen(s._1, s._2, s._3, Map.empty)).foldLeft(Map.empty[String, List[String]]) { (start, path) => start ++ path }

        def tableProperty(s: String): Tree = {
          tableProps
            .get(s)
            .map((fieldName) => fieldName.foldLeft(q"""table""": Tree) { (start, termName) => q"""${start}.${TermName(termName)}""" })
            .getOrElse(
              q"""_root_.zsg.macros.utils.PlaceHolder.value"""
            )
        }

        val proTypeTag = props.map(s => tableProperty(s))

        def nameTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init) {
              q"""{ table => _root_.zsg.BuildContent.tuple1(..${tree}) }"""
            } else {
              q"""{ table => ..${tree} }"""
            }
          } else {
            val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).toList
            if (init) {
              nameTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("tuple" + s.length)}(..${s})"""), false)
            } else {
              nameTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("nodeTuple" + s.length)}(..${s})"""), false)
            }
          }

        c.Expr[AsunaMultiplyRepGeneric[Table, Model, M]] {
          q"""_root_.zsg.macros.multiply.AsunaMultiplyRepGeneric.value(${nameTagGen(proTypeTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
