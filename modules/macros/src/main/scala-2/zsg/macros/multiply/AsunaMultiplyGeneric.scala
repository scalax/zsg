package zsg.macros.multiply

import zsg.macros.ZsgParameters
import zsg.macros.multiply.utils.PropertyOverrideHelper
import zsg.macros.single.PropertyApply

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaMultiplyGeneric[Table, Model] {
  type WT
  def tag: WT
}

object AsunaMultiplyGeneric {

  val value = new AsunaMultiplyGeneric[Any, Any] {
    override type WT = Any
    override def tag: Any = 2
  }
  type Aux[Table, Model, II] = AsunaMultiplyGeneric[Table, Model] { type WT = II }
  def Aux[Table, Model, II]: Aux[Table, Model, II] = value.asInstanceOf[Aux[Table, Model, II]]

  class MultiplyGenericApply[Table, Model] {
    def toAux[K](i: PropertyApply[Table] => K): AsunaMultiplyGeneric.Aux[Table, Model, K] = AsunaMultiplyGeneric.Aux[Table, Model, K]
  }

  object MultiplyGenericApply {
    val ins                                                                             = new MultiplyGenericApply[Any, Any]
    def apply[Table, Model]: MultiplyGenericApply[Table, Model]                         = ins.asInstanceOf[MultiplyGenericApply[Table, Model]]
    implicit def genericApplyImplicit[Table, Model]: MultiplyGenericApply[Table, Model] = apply
  }

  implicit def macroImpl[Table, Model, II](implicit prop: AsunaMultiplyGeneric.MultiplyGenericApply[Table, Model]): AsunaMultiplyGeneric.Aux[Table, Model, II] =
    macro AsunaMultiplyGenericApply.MacroImpl.generic[Table, Model, II]

}

object AsunaMultiplyGenericApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends PropertyOverrideHelper {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M: c.WeakTypeTag](
      prop: c.Expr[AsunaMultiplyGeneric.MultiplyGenericApply[Table, Model]]
    ): c.Expr[AsunaMultiplyGeneric.Aux[Table, Model, M]] = {
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

        val proTypeTag = props.map(s => q"""item.to(table => ${tableProperty(s)})""")

        def typeTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init)
              q"""_root_.zsg.BuildContent.tuple1(..${tree})"""
            else
              q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
            if (init)
              typeTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("tuple" + s.length)}(..${s})"""), false)
            else
              typeTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("nodeTuple" + s.length)}(..${s})"""), false)
          }

        c.Expr[AsunaMultiplyGeneric.Aux[Table, Model, M]] {
          q"""${prop}.toAux(item => ${typeTagGen(proTypeTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
