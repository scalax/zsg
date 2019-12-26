package asuna.macros.multiply

import asuna.{AppendTag, TupleTag}

import scala.language.experimental.macros

trait AsunaMultiplyRepGeneric[Table, Model, Rep] {
  def rep(table: Table): Rep
}

object AsunaMultiplyRepGeneric {
  implicit def macroImpl[Table, Model, Rep]: AsunaMultiplyRepGeneric[Table, Model, Rep] = macro AsunaMultiplyRepGenericApply.MacroImpl.generic[Table, Model, Rep]
}

object AsunaMultiplyRepGenericApply {

  class MacroImpl(val c: scala.reflect.macros.blackbox.Context) {
    self =>

    import c.universe._

    def generic[Table: c.WeakTypeTag, Model: c.WeakTypeTag, M: c.WeakTypeTag]: c.Expr[AsunaMultiplyRepGeneric[Table, Model, M]] = {
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

        val proTypeTag = props.map(s => tableProperty(s))

        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= 8) {
            q"""(table: ${tType}) => { asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree}) }"""
          } else {
            val groupedTree = tree.grouped(8).toList
            nameTagGen(groupedTree.map(s => q"""asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaMultiplyRepGeneric[Table, Model, M]] {
          nameTagGen(proTypeTag)
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
