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

  val value: ZsgLabelledTypeGeneric.Aux[Any, Any] = new ZsgLabelledTypeGeneric[Any] {
    override type WT = Any
    override def tag: Any = null
  }
  def apply[Model, T]: ZsgLabelledTypeGeneric.Aux[Model, T] = value.asInstanceOf[ZsgLabelledTypeGeneric.Aux[Model, T]]
  class ZsgLabeledTypeGenericApply[Model] {
    def model[T](tag: => T): ZsgLabelledTypeGeneric.Aux[Model, T] = apply[Model, T]
  }
  object ZsgLabeledTypeGenericApply {
    val value: ZsgLabeledTypeGenericApply[Any] = new ZsgLabeledTypeGenericApply[Any]
    def apply[T]                               = value.asInstanceOf[ZsgLabeledTypeGenericApply[T]]
  }

  def apply[M]: ZsgLabeledTypeGenericApply[M] = ZsgLabeledTypeGenericApply[M]

  implicit def lImplicit[CaseClass, T]: ZsgLabelledTypeGeneric.Aux[CaseClass, T] =
    macro ZsgLabelledTypeGenericMacroApply.MacroImpl.generic[CaseClass, T]
}

object ZsgLabelledTypeGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[CaseClass: c.WeakTypeTag, T: c.WeakTypeTag]: c.Expr[ZsgLabelledTypeGeneric.Aux[CaseClass, T]] = {
      try {
        val caseClass     = weakTypeOf[CaseClass]
        val caseClassType = caseClass.resultType

        val props = caseClassMembersByType(caseClassType)

        // model.${TermName(s.fieldName)}.type
        val proTypeTag = props.map(s => q"""_root_.zsg.macros.single.ColumnName[${c.internal.constantType(Constant(s.fieldName))}]""")

        case class bb(i1: Int)
        def typeTagGen(tree: List[Tree]): Tree = if (tree.length == 1) q"""..${tree}"""
        else {
          val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).to(List)
          typeTagGen(groupedTree.map(s => if (s.size > 1) q"""_root_.zsg.ItemTag2(..$s)""" else q"""..$s"""))
        }

        c.Expr[ZsgLabelledTypeGeneric.Aux[CaseClass, T]] {
          q"""_root_.zsg.macros.single.ZsgLabelledTypeGeneric[${caseClass}].model(${typeTagGen(proTypeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
