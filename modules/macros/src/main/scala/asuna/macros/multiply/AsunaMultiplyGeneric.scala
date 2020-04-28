package asuna.macros.multiply

import asuna.macros.AsunaParameters
import asuna.macros.multiply.utils.PropertyOverrideHelper
import asuna.{AppendTag, TupleTag, TupleTag1}

import scala.language.experimental.macros

trait AsunaMultiplyGeneric[Table, Model] {
  type WT <: TupleTag
  def tag: AppendTag[WT]
}

object AsunaMultiplyGeneric {

  val value = new AsunaMultiplyGeneric[Any, Any] {
    override type WT = TupleTag1[Any]
    override def tag: AppendTag[TupleTag1[Any]] = AppendTag[TupleTag1[Any]]
  }
  type Aux[Table, Model, II <: TupleTag] = AsunaMultiplyGeneric[Table, Model] { type WT = II }
  @inline def Aux[Table, Model, II <: TupleTag]: Aux[Table, Model, II] = value.asInstanceOf[Aux[Table, Model, II]]

  class GenericApply[Table, Model] {
    def generic[WW <: TupleTag](implicit i: AsunaMultiplyGeneric.Aux[Table, Model, WW]): AsunaMultiplyGeneric.Aux[Table, Model, WW] = i
    @inline def value[K <: TupleTag](i: Property1Apply[Table, Model] => AppendTag[K]): AsunaMultiplyGeneric.Aux[Table, Model, K]    = Aux[Table, Model, K]
  }

  object GenericApply {
    val value                                                                                                = new GenericApply[Any, Any]
    @inline def apply[Table, M]: AsunaMultiplyGeneric.GenericApply[Table, M]                                 = value.asInstanceOf[GenericApply[Table, M]]
    @inline implicit def genericApplyImplicit[Table, Model]: AsunaMultiplyGeneric.GenericApply[Table, Model] = apply
  }

  implicit def macroImpl[Table, Model, II <: TupleTag](implicit prop: AsunaMultiplyGeneric.GenericApply[Table, Model]): AsunaMultiplyGeneric.Aux[Table, Model, II] =
    macro AsunaMultiplyGenericApply.MacroImpl.generic[Table, Model, II]

}

object AsunaMultiplyGenericApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends PropertyOverrideHelper {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M <: TupleTag: c.WeakTypeTag](
      prop: c.Expr[AsunaMultiplyGeneric.GenericApply[Table, Model]]
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

        val proTypeTag = props.map(s => q"""item.to({ (table) => ${tableProperty(s)} }, _.${TermName(s)})""")

        val typeTag = proTypeTag.grouped(AsunaParameters.maxPropertyNum).toList.map(i => q"""asuna.AppendTag.tag(..${i})""")

        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""_root_.asuna.AppendTag.lift(..${tree})"""
          } else if (tree.length <= AsunaParameters.maxPropertyNum) {
            q"""_root_.asuna.AppendTag.lift(asuna.AppendTag.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            typeTagGen(groupedTree.map(s => q"""_root_.asuna.AppendTag.nodeTag(..${s})"""))
          }

        c.Expr[AsunaMultiplyGeneric.Aux[Table, Model, M]] {
          q"""${prop}.value(item => ${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
