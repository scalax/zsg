package zsg.macros.single

import zsg.PropertyTag
import zsg.macros.ZsgParameters
import zsg.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

object ZsgDebugChecker {

  def checkCaseClass[CaseClass](prop: Any): PropertyTag[CaseClass] = macro ZsgDebugCheckerMacroApply.MacroImpl.generic[CaseClass]

}

object ZsgDebugCheckerMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[CaseClass: c.WeakTypeTag](prop: c.Tree): c.Expr[PropertyTag[CaseClass]] = {
      try {
        val caseClass     = weakTypeOf[CaseClass]
        val caseClassType = caseClass.resultType

        val props = caseClassMembersByType(caseClassType)

        def toItemImpl(max: Int, initList: List[(ModelField, Tree => Tree)])(init: Boolean): List[(ModelField, Tree => Tree)] =
          if (initList.size > max || init) {
            val i = initList.zipWithIndex.map {
              case ((str, t), index) =>
                (str, { t1: Tree => t(q"""${t1}.${TermName("i" + ((index / max % ZsgParameters.maxPropertyNum) + 1).toString)}""") })
            }
            toItemImpl(max * ZsgParameters.maxPropertyNum, i)(false)
          } else initList

        val preList: List[(ModelField, Tree => Tree)] = props.map(str => (str, { s: Tree => s }))

        val casei = toItemImpl(1, preList)(true)

        val checkerList: List[Tree] = casei.map { case (field, fun) => q"""_root_.zsg.DebugMessage.byImplicit(${fun(prop)})""" }

        c.Expr[PropertyTag[CaseClass]] {
          q"""{
            ${checkerList}
            _root_.zsg.PropertyTag[${caseClass}]
          }"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
