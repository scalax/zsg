package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait ZsgGetterGeneric[H, GenericType] {
  def getter(model: H): GenericType
}

object ZsgGetterGeneric {
  @inline def value[H, GenericType](i: H => GenericType): ZsgGetterGeneric[H, GenericType] =
    new ZsgGetterGeneric[H, GenericType] {
      override def getter(model: H): GenericType = i(model)
    }
  implicit def macroImpl[H, M]: ZsgGetterGeneric[H, M] = macro ZsgGetterGenericMacroApply.MacroImpl.generic[H, M]

}

object ZsgGetterGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgGetterGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType

        val props = caseClassMembersByType(hType)

        val nameTag = props.map { name => q"""s.${name.fieldTermName}""" }
        def nameTagGen(tree: List[Tree]): Tree = if (tree.length == 1) q"""(s: ${h}) => { ..${tree} }"""
        else {
          val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
          nameTagGen(groupedTree.map(s => if (s.size > 1) q"""new _root_.zsg.ZsgTuple2(..${s})""" else q"""..$s"""))
        }

        c.Expr[ZsgGetterGeneric[H, M]] {
          q"""_root_.zsg.macros.single.ZsgGetterGeneric.value(${nameTagGen(nameTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
