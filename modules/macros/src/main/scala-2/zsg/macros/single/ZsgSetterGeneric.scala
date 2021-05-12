package zsg.macros.single

import zsg.macros.single.utils.TypeHelper
import zsg.macros.{AllScalaMacroMethods, ZsgParameters}
import zsg.macros.utils.MacroMethods

import scala.language.experimental.macros

trait ZsgSetterGeneric[H, GenericType] {
  def setter(gen: GenericType): H
}

object ZsgSetterGeneric {

  def value[Model, GenericType](i: GenericType => Model): ZsgSetterGeneric[Model, GenericType] =
    new ZsgSetterGeneric[Model, GenericType] {
      override def setter(gen: GenericType): Model = i(gen)
    }

  implicit def macroImpl[H, M]: ZsgSetterGeneric[H, M] = macro ZsgSetterGenericMacroApply.MacroImpl.generic[H, M]

}

object ZsgSetterGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends MacroMethods with AllScalaMacroMethods with TypeHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[ZsgSetterGeneric[H, M]] = {
      try {
        val h     = c.weakTypeOf[H]
        val hType = h.resultType
        val s     = symbolOf[H]
        val b     = companionOfSymbol(s)

        val props = caseClassMembersByType(hType)

        /*def toItemImpl(max: Int, initList: List[(ModelField, Tree => Tree)])(init: Boolean): List[(ModelField, Tree => Tree)] =
          if (initList.size > max || init) {
            val i = initList.zipWithIndex.map { case ((str, t), index) =>
              (str, { t1: Tree => t(q"""${t1}.${TermName("i" + ((index / max % ZsgParameters.maxPropertyNum) + 1).toString)}""") })
            }
            toItemImpl(max * ZsgParameters.maxPropertyNum, i)(false)
          } else initList*/

        def toTupleTree(prop: List[ModelField]): (Any, Any) = {
          if (prop.size > 3) {
            val groupedSize = if (prop.size / 2 * 2 == prop.size) prop.size / 2 else prop.size / 2 + 1
            val groupedList = prop.grouped(groupedSize).to(List)
            (toTupleTree(groupedList(1)), toTupleTree(groupedList(2)))
          } else if(prop.size == 3){
            (prop,prop)
          }
        }

        /*val preList = props.zipWithIndex.map {
          case (str, index) =>
            (str, { t1: Tree => q"""${t1}.${TermName("i" + (index % ZsgParameters.maxPropertyNum + 1).toString)}""" })
        }*/

        val preList: List[(ModelField, Tree => Tree)] = props.map(str => (str, { s: Tree => s }))

        val casei = if (preList.size > 1) toProperty(preList) else preList

        val inputFunc = q"""_root_.zsg.macros.single.ZsgSetterGeneric.value(item => ${b.companionTree}.apply(..${casei.map { case (item, m) =>
          namedParam(item.fieldTermName, m(Ident(TermName("item"))))
        }}))"""

        println(h)
        println(inputFunc)
        c.Expr[ZsgSetterGeneric[H, M]] {
          inputFunc
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
