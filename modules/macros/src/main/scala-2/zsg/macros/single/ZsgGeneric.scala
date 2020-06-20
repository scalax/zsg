package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait ZsgGeneric[H] {
  type WT
  def tag: WT
}

object ZsgGeneric {

  type Aux[H, II] = ZsgGeneric[H] { type WT = II }

  class GenericApply[M] {
    def generic[WW](implicit i: ZsgGeneric.Aux[M, WW]): ZsgGeneric.Aux[M, WW] = i
    def value[K](i: PropertyApply[M] => K): ZsgGeneric.Aux[M, K] =
      new ZsgGeneric[M] {
        override type WT = K
        override def tag: WT = i(PropertyApply[M])
      }
  }

  object GenericApply {
    val value                                        = new GenericApply[Any]
    def apply[T]: ZsgGeneric.GenericApply[T]         = value.asInstanceOf[GenericApply[T]]
    implicit def init[M]: ZsgGeneric.GenericApply[M] = GenericApply[M]
  }

  implicit def macroImpl[H, II](implicit prop: ZsgGeneric.GenericApply[H]): ZsgGeneric.Aux[H, II] = macro ZsgGenericMacroApply.MacroImpl.generic[H, II]

}

object ZsgGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, II: c.WeakTypeTag](prop: c.Expr[ZsgGeneric.GenericApply[H]]): c.Expr[ZsgGeneric.Aux[H, II]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = caseClassMembersByType(hType)

        val proTypeTag = props.map(s => q"""item.to(_.${s.fieldTermName})""")

        def typeTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init)
              q"""_root_.zsg.BuildContent.tuple1(..${tree})"""
            else
              q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
            if (init)
              typeTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("tuple" + s.length)}(..$s)"""), false)
            else
              typeTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.${TermName("nodeTuple" + s.length)}(..$s)"""), false)
          }

        c.Expr[ZsgGeneric.Aux[H, II]] {
          q"""$prop.value(item => ${typeTagGen(proTypeTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
