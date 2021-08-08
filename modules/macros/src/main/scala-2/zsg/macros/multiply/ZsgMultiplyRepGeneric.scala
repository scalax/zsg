package zsg.macros.multiply

import zsg.macros.ZsgParameters
import zsg.macros.multiply.utils.PropertyOverrideHelper

import scala.language.experimental.macros

trait ZsgMultiplyRepGeneric[Table, Model, Rep] {
  def rep(table: Table): Rep
}

object ZsgMultiplyRepGeneric {
  def value[Table, Model, Rep](i: Table => Rep): ZsgMultiplyRepGeneric[Table, Model, Rep] =
    new ZsgMultiplyRepGeneric[Table, Model, Rep] {
      override def rep(table: Table): Rep = i(table)
    }
  implicit def macroImpl[Table, Model, Rep]: ZsgMultiplyRepGeneric[Table, Model, Rep] =
    macro ZsgMultiplyRepGenericApply.MacroImpl.generic[Table, Model, Rep]
}

object ZsgMultiplyRepGenericApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends PropertyOverrideHelper {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgMultiplyRepGeneric[Table, Model, M]] = {
      try {
        val t     = weakTypeOf[Table]
        val m     = weakTypeOf[Model]
        val tType = t.resultType
        val mType = m.resultType

        val props = mType.members.toList
          .filter { s => s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor }
          .map(s => (s.name, s))
          .collect { case (TermName(n), s) =>
            val proName = n.trim
            proName
          }
          .reverse

        val tableFields = tType.members.toList
          .filter(s => s.isTerm)
          .map(s => (s.name, s))
          .collect { case (TermName(n), s) =>
            val proName = n.trim
            (List(proName), s, s.typeSignatureIn(tType))
          }
          .reverse

        val tableProps = tableFields.map(s => tablePropsGen(s._1, s._2, s._3, Map.empty)).foldLeft(Map.empty[String, List[String]]) {
          (start, path) => start ++ path
        }

        def tableProperty(s: String): Tree = {
          tableProps
            .get(s)
            .map((fieldName) => fieldName.foldLeft(q"""table""": Tree) { (start, termName) => q"""${start}.${TermName(termName)}""" })
            .getOrElse(
              q"""_root_.zsg.macros.utils.PlaceHolder.value"""
            )
        }

        val proTypeTag = props.map(s => tableProperty(s))

        def nameTagGen(tree: List[Tree]): Tree = if (tree.length == 1) q"""{ table => ..$tree }"""
        else {
          val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).toList
          nameTagGen(groupedTree.map(s => if (s.size > 1) q"""new _root_.zsg.ZsgTuple2(..$s)""" else q"""..$s"""))
        }

        c.Expr[ZsgMultiplyRepGeneric[Table, Model, M]] {
          q"""_root_.zsg.macros.multiply.ZsgMultiplyRepGeneric.value(${nameTagGen(proTypeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
