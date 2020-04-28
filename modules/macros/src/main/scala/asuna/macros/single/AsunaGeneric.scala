package asuna.macros.single

import asuna._
import asuna.macros.AsunaParameters

import scala.language.experimental.macros

import scala.collection.compat._

trait AsunaGeneric[H] {
  type WT <: TupleTag
  def tag: AppendTag[WT]
}

object AsunaGeneric {

  val value = new AsunaGeneric[Any] {
    override type WT = TupleTag1[Any]
    override def tag: AppendTag[TupleTag1[Any]] = AppendTag[TupleTag1[Any]]
  }
  type Aux[H, II <: TupleTag] = AsunaGeneric[H] { type WT = II }
  @inline def Aux[H, II <: TupleTag]: Aux[H, II] = value.asInstanceOf[Aux[H, II]]

  class GenericApply[M] {
    def generic[WW <: TupleTag](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW]     = i
    @inline def value[K <: TupleTag](i: PropertyApply[M] => AppendTag[K]): AsunaGeneric.Aux[M, K] = Aux[M, K]
  }

  object GenericApply {
    val value                                                  = new GenericApply[Any]
    @inline def apply[T]: AsunaGeneric.GenericApply[T]         = value.asInstanceOf[GenericApply[T]]
    @inline implicit def init[M]: AsunaGeneric.GenericApply[M] = GenericApply[M]
  }

  implicit def macroImpl[H, II <: TupleTag](implicit prop: AsunaGeneric.GenericApply[H]): AsunaGeneric.Aux[H, II] = macro AsunaGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, II <: TupleTag: c.WeakTypeTag](prop: c.Expr[AsunaGeneric.GenericApply[H]]): c.Expr[AsunaGeneric.Aux[H, II]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = hType.members
          .to(List)
          .filter { s => s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        //val proTypeTag = props.map(s => q"""_root_.asuna.macros.single.PropertyApply[${hType}].to(_.${TermName(s)})""")
        val proTypeTag = props.map(s => q"""item.to(_.${TermName(s)})""")

        val typeTag = proTypeTag.grouped(AsunaParameters.maxPropertyNum).to(List).map(i => q"""_root_.asuna.AppendTag.tag(..$i)""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..$tree"""
          } else if (tree.length <= AsunaParameters.maxPropertyNum) {
            q"""_root_.asuna.AppendTag.nodeTag(..$tree)"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).to(List)
            typeTagGen(groupedTree.map(s => q"""_root_.asuna.AppendTag.nodeTag(..$s)"""))
          }

        c.Expr[AsunaGeneric.Aux[H, II]] {
          q"""$prop.value(item => ${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
