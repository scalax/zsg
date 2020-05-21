package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait ZsgDebugGeneric[H] {
  type WT
  def tag: WT
}

object ZsgDebugGeneric {

  val value = new ZsgDebugGeneric[Any] {
    override type WT = Any
    override def tag: Any = 2
  }
  type Aux[H, II] = ZsgDebugGeneric[H] { type WT = II }
  @inline def Aux[H, II]: Aux[H, II] = value.asInstanceOf[Aux[H, II]]

  class GenericApply[M] {
    @inline def value[K](i: InstanceApply => K): ZsgDebugGeneric.Aux[M, K] = Aux[M, K]
  }

  object GenericApply {
    val value                                                     = new GenericApply[Any]
    @inline def apply[T]: ZsgDebugGeneric.GenericApply[T]         = value.asInstanceOf[GenericApply[T]]
    @inline implicit def init[M]: ZsgDebugGeneric.GenericApply[M] = GenericApply[M]
  }

  implicit def macroImpl[H, II](implicit prop: ZsgDebugGeneric.GenericApply[H]): ZsgDebugGeneric.Aux[H, II] = macro ZsgDebugGenericMacroApply.MacroImpl.generic[H, II]

}

object ZsgDebugGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, II: c.WeakTypeTag](prop: c.Expr[ZsgDebugGeneric.GenericApply[H]]): c.Expr[ZsgDebugGeneric.Aux[H, II]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = caseClassMembersByType(hType)

        val proTypeTag = props.zipWithIndex.map {
          case (s, index) =>
            q"""{
              type ${TypeName(index.toString)} = String
              type ${TypeName(s.fieldName)} = String
              item.to[${TypeName(index.toString)}, ${TypeName(s.fieldName)}]
            }"""
        }

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

        c.Expr[ZsgDebugGeneric.Aux[H, II]] {
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
