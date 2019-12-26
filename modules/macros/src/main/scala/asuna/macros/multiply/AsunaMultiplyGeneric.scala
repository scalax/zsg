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

        val tableFields = tType.members.toList
          .filter(s => s.isTerm)
          .map(s => (s.name, s))
          .collect {
            case (TermName(n), s) =>
              val proName = n.trim
              (List(proName), s, s.typeSignatureIn(tType))
          }
          .reverse

        def tablePropsGen(tables: (List[String], Symbol, Type), mapping: Map[String, List[String]]): Map[String, List[String]] = {
          val (keys, field, rootType) = tables
          val newRootType             = field.typeSignatureIn(rootType)
          val TermName(n1)            = field.name
          val fieldName               = n1.trim
          val newMapping1             = mapping + ((fieldName, keys))

          val orderOpt = field.annotations
            .map(_.tree)
            .collect {
              case q"""new ${classDef}(${Literal(Constant(num: Int))})""" if classDef.tpe.<:<(weakTypeOf[RootTable]) =>
                num
              case q"""new ${classDef}(${_})""" if classDef.tpe.<:<(weakTypeOf[RootTable]) =>
                RootTable.apply$default$1
            }
            .headOption

          orderOpt match {
            case Some(_) =>
              val newMapList = newRootType.members.toList
                .filter(_.isTerm)
                .map(s => (s.name, s))
                .collect {
                  case (TermName(n), s) =>
                    val proName = n.trim
                    (proName, s)
                }
                .reverse
                .map { case (r, s) => tablePropsGen((keys ::: r :: Nil, s, s.typeSignatureIn(newRootType)), Map.empty) }
              newMapList.foldLeft(newMapping1) { (start, m) =>
                start ++ m
              }

            case _ => newMapping1
          }
        }

        val tableProps = tableFields.map(s => tablePropsGen(s, Map.empty)).foldLeft(Map.empty[String, List[String]]) { (start, path) =>
          start ++ path
        }

        def tableProperty(s: String): Tree = {
          tableProps
            .get(s)
            .map(
              (fieldName) =>
                fieldName.foldLeft(q"""table""": Tree) { (start, termName) =>
                  q"""${start}.${TermName(termName)}"""
                }
            )
            .getOrElse(
              q"""asuna.macros.utils.PlaceHolder.value"""
            )
        }

        val proTypeTag = props.map(s => q"""asuna.macros.multiply.Property1Apply[${tType}, ${mType}].to({ (table) => ${tableProperty(s)} }, _.${TermName(s)})""")

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
