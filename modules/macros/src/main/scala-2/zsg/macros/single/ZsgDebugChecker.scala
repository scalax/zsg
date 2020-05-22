package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

class ZsgDebugChecker[T, CaseClass](val context: T) {

  def checkCaseClass(contextInstance: T)(prop: Any): Any = macro ZsgDebugCheckerMacroApply.MacroImpl.generic[CaseClass]

}

object ZsgDebugChecker {
  def apply[T, CaseClass](context: T): ZsgDebugChecker[T, CaseClass] = new ZsgDebugChecker[T, CaseClass](context)
}

object ZsgDebugCheckerMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[CaseClass: c.WeakTypeTag](contextInstance: c.Tree)(prop: c.Tree): c.Tree = {
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

        val checkerList: List[Tree] = casei.map(s => q"""${s._2(prop)}.debug""")

        def typeTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init)
              q"""buildContextApply.tuple(..${tree})"""
            else
              q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
            if (init)
              typeTagGen(groupedTree.map(s => q"""buildContextApply.tuple(..$s)"""), false)
            else
              typeTagGen(groupedTree.map(s => q"""buildContextApply.nodeTuple(..$s)"""), false)
          }

        q"""{
          val buildContextApply = _root_.zsg.BuildContextApply(${contextInstance})
          ${typeTagGen(checkerList, true)}
        }"""

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
