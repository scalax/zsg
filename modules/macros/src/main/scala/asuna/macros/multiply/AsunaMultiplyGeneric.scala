package asuna.macros.multiply

import asuna.{AppendTag, TupleTag}

import scala.language.experimental.macros

trait AsunaMultiplyGeneric[Table, Model] {
  type WT <: TupleTag
  def tag: WT
}

object AsunaMultiplyGeneric {

  def init[Table, Model]: GenericApply[Table, Model] = new GenericApply[Table, Model]
  class GenericApply[Table, Model] {
    def generic[WW <: TupleTag](implicit i: AsunaMultiplyGeneric.Aux[Table, Model, WW]): AsunaMultiplyGeneric.Aux[Table, Model, WW] = i

    def init1[K <: TupleTag](i: AppendTag[K]): AsunaMultiplyGeneric.Aux[Table, Model, K] = {
      new AsunaMultiplyGeneric[Table, Model] {
        override type WT = K
        override def tag = throw new Exception("debugging")
      }
    }
  }

  type Aux[Table, Model, II <: TupleTag] = AsunaMultiplyGeneric[Table, Model] { type WT = II }

  implicit def macroImpl[Table, Model, II <: TupleTag]: AsunaMultiplyGeneric.Aux[Table, Model, II] = macro AsunaMultiplyGenericApply.MacroImpl.generic[Table, Model, II]

}

object AsunaMultiplyGenericApply {

  class MacroImpl(val c: scala.reflect.macros.whitebox.Context) {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M <: TupleTag: c.WeakTypeTag]: c.Expr[AsunaMultiplyGeneric.Aux[Table, Model, M]] = {
      try {
        val t     = weakTypeOf[Table]
        val m     = weakTypeOf[Model]
        val tType = t.resultType
        val mType = m.resultType

        val props = mType.members.toList
          .filter { s =>
            s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor
          }
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        val tableProps = tType.members.toList
          .filter(s => s.isTerm)
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              proName
          }
          .reverse

        def tableProperty(s: String): Tree = {
          tableProps
            .find(t => s == t)
            .map((fieldName) => q"""_.${TermName(fieldName)}""")
            .getOrElse(
              q"""{ (s: ${tType}) => asuna.macros.utils.PlaceHolder.value }"""
            )
        }

        val proTypeTag = props.map(s => q"""asuna.macros.multiply.Property1Apply[${tType}, ${mType}].to(${tableProperty(s)}, _.${TermName(s)})""")

        val typeTag = proTypeTag.grouped(8).toList.map(i => q"""asuna.BuildTag.tag(..${i})""")
        def typeTagGen(tree: List[Tree]): Tree =
          if (tree.length == 1) {
            q"""asuna.BuildTag.lift(..${tree})"""
          } else if (tree.length <= 8) {
            q"""asuna.BuildTag.lift(asuna.BuildTag.nodeTag(..${tree}))"""
          } else {
            val groupedTree = tree.grouped(8).toList
            typeTagGen(groupedTree.map(s => q"""asuna.BuildTag.nodeTag(..${s})"""))
          }

        c.Expr[AsunaMultiplyGeneric.Aux[Table, Model, M]] {
          q"""asuna.macros.multiply.AsunaMultiplyGeneric.init[${tType}, ${mType}].init1(${typeTagGen(typeTag)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
