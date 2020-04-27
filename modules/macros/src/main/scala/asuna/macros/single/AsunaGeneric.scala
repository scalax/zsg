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

  def value[T, G <: TupleTag](p: PropertyApply[T] => AppendTag[G]): AsunaGeneric.Aux[T, G] = new AsunaGeneric[T] {
    override type WT = G
    override def tag: AppendTag[G] = p(PropertyApply[T])
  }

  /*def init[M]: GenericApply[M] = new GenericApply[M]
  class GenericApply[M] {
    def generic[WW <: TupleTag](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW] = i

    def init1[K <: TupleTag](i: AppendTag[K]): AsunaGeneric.Aux[M, K] = {
      new AsunaGeneric[M] {
        override type WT = K
        override def tag: AppendTag[K] = AppendTag[K]
      }
    }
  }*/

  type Aux[H, II <: TupleTag] = AsunaGeneric[H] { type WT = II }

  //implicit def macroImpl[H/*, T <: AsunaGeneric[H]*/]: AsunaGeneric[H] = macro AsunaGenericMacroApply.MacroImpl.generic[H]
  implicit def macroImpl[H, II <: TupleTag]: AsunaGeneric.Aux[H, II] = macro AsunaGenericMacroApply.MacroImpl.generic[H, II]

}

object AsunaGenericMacroApply {

  class MacroImpl(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._


    def generic[H: c.WeakTypeTag, II <: TupleTag: c.WeakTypeTag]: c.Expr[AsunaGeneric.Aux[H, II]] = {
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

        println(q"""_root_.asuna.macros.single.AsunaGeneric.value(item => ${typeTagGen(typeTag)})""")

        c.Expr[AsunaGeneric.Aux[H, II]] {
          //q"""_root_.asuna.macros.single.AsunaGeneric.init[$hType].init1(${typeTagGen(typeTag)})"""
          q"""_root_.asuna.macros.single.AsunaGeneric.value { item: _root_.asuna.macros.single.PropertyApply[$hType] => ${typeTagGen(typeTag)} }"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
