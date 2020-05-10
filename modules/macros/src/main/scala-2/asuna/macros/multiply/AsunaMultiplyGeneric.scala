package asuna.macros.multiply

import asuna.macros.AsunaParameters
import asuna.macros.multiply.utils.PropertyOverrideHelper
import asuna.macros.single.PropertyApply

import scala.language.experimental.macros

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
  @inline def Aux[Table, Model, II]: Aux[Table, Model, II] = value.asInstanceOf[Aux[Table, Model, II]]

  class GenericApply[Table] {
    @inline def value[K, Model](i: PropertyApply[Table] => K): AsunaMultiplyGeneric.Aux[Table, Model, K] = Aux[Table, Model, K]
  }

  object GenericApply {
    val value                                                                                  = new GenericApply[Any]
    @inline def apply[Table]: AsunaMultiplyGeneric.GenericApply[Table]                         = value.asInstanceOf[GenericApply[Table]]
    @inline implicit def genericApplyImplicit[Table]: AsunaMultiplyGeneric.GenericApply[Table] = apply
  }

  implicit def macroImpl[Table, Model, II](implicit prop: AsunaMultiplyGeneric.GenericApply[Table]): AsunaMultiplyGeneric.Aux[Table, Model, II] =
    macro AsunaMultiplyGenericApply.MacroImpl.generic[Table, Model, II]

}

object AsunaMultiplyGenericApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends PropertyOverrideHelper {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M: c.WeakTypeTag](
      prop: c.Expr[AsunaMultiplyGeneric.GenericApply[Table]]
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
              q"""_root_.asuna.macros.utils.PlaceHolder.value"""
            )
        }

        val proTypeTag = props.map(s => q"""item.to(table => ${tableProperty(s)})""")

        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            typeTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaMultiplyGeneric.Aux[Table, Model, M]] {
          q"""${prop}.value(item => ${typeTagGen(proTypeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
