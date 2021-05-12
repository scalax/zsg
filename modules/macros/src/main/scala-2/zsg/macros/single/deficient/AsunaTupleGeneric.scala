package zsg.macros.single.deficient

import zsg.macros.ZsgParameters
import zsg.macros.single.utils.{Sha1Helper, TypeHelper}

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaTupleGeneric[TupleType] {
  type WT
  def tag: WT
}

object AsunaTupleGeneric {
  def value[T, WT1](value1: WT1): AsunaTupleGeneric.Aux[T, WT1] =
    new AsunaTupleGeneric[T] {
      override type WT = WT1
      override def tag: WT1 = value1
    }

  type Aux[H, II] = AsunaTupleGeneric[H] { type WT = II }

  implicit def macroImpl[TupleType, T]: AsunaTupleGeneric.Aux[TupleType, T] =
    macro AsunaTupleGenericMacroApply.MacroImpl.generic[TupleType, T]
}

object AsunaTupleGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper with Sha1Helper {
    self =>

    import c.universe._

    def generic[TupleType: c.WeakTypeTag, T: c.WeakTypeTag]: c.Expr[AsunaTupleGeneric.Aux[TupleType, T]] = {
      try {

        val tuple     = weakTypeOf[TupleType]
        val tupleType = tuple.resultType

        val struct        = tupleTypeNames[TupleType]
        val allFields     = struct.tupleFields.flatMap(_.caseClassFields)
        val genericFields = struct.modelFields.filter(i => !allFields.exists(ii => ii.fieldName == i.fieldName))

        val proTypeTag = genericFields.map(s =>
          q"""_root_.zsg.macros.single.PropertyApply[${tupleType}].to(_.${struct.modelFieldTermName}.${s.fieldTermName})"""
        )

        val typeTag = proTypeTag.grouped(ZsgParameters.maxPropertyNum).toList.map(i => q"""_root_.zsg.AppendTag.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(ZsgParameters.maxPropertyNum).toList
            typeTagGen(groupedTree.map(s => q"""_root_.zsg.BuildContent.tuple(..${s})"""))
          }

        c.Expr[AsunaTupleGeneric.Aux[TupleType, T]] {
          q"""_root_.zsg.macros.single.deficient.AsunaTupleGeneric.value(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
