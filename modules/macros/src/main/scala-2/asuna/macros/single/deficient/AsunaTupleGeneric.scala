package asuna.macros.single.deficient

import asuna.macros.AsunaParameters
import asuna.{AppendTag, TupleTag}
import asuna.macros.single.utils.{Sha1Helper, TypeHelper}

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaTupleGeneric[TupleType] {
  type WT <: TupleTag
  def tag: AppendTag[WT]
}

object AsunaTupleGeneric {
  def init[M]: GenericApply[M] = new GenericApply[M]
  class GenericApply[M] {
    def generic[WW <: TupleTag](implicit i: AsunaTupleGeneric.Aux[M, WW]): AsunaTupleGeneric.Aux[M, WW] = i

    def init1[K <: TupleTag](i: AppendTag[K]): AsunaTupleGeneric.Aux[M, K] = {
      new AsunaTupleGeneric[M] {
        override type WT = K
        override def tag = i
      }
    }
  }

  type Aux[H, II <: TupleTag] = AsunaTupleGeneric[H] { type WT = II }

  implicit def macroImpl[TupleType, T <: TupleTag]: AsunaTupleGeneric.Aux[TupleType, T] = macro AsunaTupleGenericMacroApply.MacroImpl.generic[TupleType, T]
}

object AsunaTupleGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.whitebox.Context) extends TypeHelper with Sha1Helper {
    self =>

    import c.universe._

    def generic[TupleType: c.WeakTypeTag, T <: TupleTag: c.WeakTypeTag]: c.Expr[AsunaTupleGeneric.Aux[TupleType, T]] = {
      try {

        val tuple     = weakTypeOf[TupleType]
        val tupleType = tuple.resultType

        val struct        = tupleTypeNames[TupleType]
        val allFields     = struct.tupleFields.flatMap(_.caseClassFields)
        val genericFields = struct.modelFields.filter(i => !allFields.exists(ii => ii.fieldName == i.fieldName))

        val proTypeTag = genericFields.map(s => q"""_root_.asuna.macros.single.PropertyApply[${tupleType}].to(_.${struct.modelFieldTermName}.${s.fieldTermName})""")

        val typeTag = proTypeTag.grouped(AsunaParameters.maxPropertyNum).toList.map(i => q"""_root_.asuna.AppendTag.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""_root_.asuna.AppendTag.lift(..${tree})"""
          } else if (tree.length <= AsunaParameters.maxPropertyNum) {
            q"""_root_.asuna.AppendTag.lift(asuna.AppendTag.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            typeTagGen(groupedTree.map(s => q"""_root_.asuna.AppendTag.nodeTag(..${s})"""))
          }

        c.Expr[AsunaTupleGeneric.Aux[TupleType, T]] {
          q"""_root_.asuna.macros.single.deficient.AsunaTupleGeneric.init[${tupleType}].init1(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
