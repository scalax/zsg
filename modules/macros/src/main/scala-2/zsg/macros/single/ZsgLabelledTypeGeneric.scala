package zsg.macros.single

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait ZsgLabelledTypeGeneric[CaseClass] {
  type WT
  def tag: WT
}

object ZsgLabelledTypeGeneric {
  type Aux[C, W] = ZsgLabelledTypeGeneric[C] { type WT = W }

  class ColumnNameGen {
    def name[N <: StringName]: ColumnName[N] = ColumnName[N]
  }

  object ColumnNameGen {
    val value = new ColumnNameGen
  }

  class CaseClassColumnName[CaseClass] {
    def propertyName[T](n: ColumnNameGen => T): ZsgLabelledTypeGeneric.Aux[CaseClass, T] = new ZsgLabelledTypeGeneric[CaseClass] {
      override type WT = T
      override def tag: T = n(ColumnNameGen.value)
    }
  }

  object CaseClassColumnName {
    val value                                         = new CaseClassColumnName[Any]
    def apply[N]                                      = value.asInstanceOf[CaseClassColumnName[N]]
    implicit def nImplicit[N]: CaseClassColumnName[N] = CaseClassColumnName[N]
  }

  implicit def lImplicit[CaseClass, T](implicit n: ZsgLabelledTypeGeneric.CaseClassColumnName[CaseClass]): ZsgLabelledTypeGeneric.Aux[CaseClass, T] =
    macro ZsgLabelledTypeGenericMacroApply.MacroImpl.generic[CaseClass, T]
}

object ZsgLabelledTypeGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[CaseClass: c.WeakTypeTag, T: c.WeakTypeTag](
      n: c.Expr[ZsgLabelledTypeGeneric.CaseClassColumnName[CaseClass]]
    ): c.Expr[ZsgLabelledTypeGeneric.Aux[CaseClass, T]] = {
      try {
        val caseClass     = weakTypeOf[CaseClass]
        val caseClassType = caseClass.resultType

        val props = caseClassMembersByType(caseClassType)

        val proTypeTag = props.map(s => q"""{
            type ${TypeName(s.fieldName)} = _root_.zsg.macros.single.StringName
            item.name[${TypeName(s.fieldName)}]
          }""")

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

        c.Expr[ZsgLabelledTypeGeneric.Aux[CaseClass, T]] {
          q"""$n.propertyName(item => ${typeTagGen(proTypeTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
