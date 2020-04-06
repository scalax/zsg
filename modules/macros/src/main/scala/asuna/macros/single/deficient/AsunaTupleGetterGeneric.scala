package asuna.macros.single.deficient

import asuna.macros.AsunaParameters
import asuna.macros.single.utils.{Sha1Helper, TypeHelper}

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaTupleGetterGeneric[H, GenericType] {
  def getter(model: H): GenericType
}

object AsunaTupleGetterGeneric {
  implicit def macroImpl[H, GenericType]: AsunaTupleGetterGeneric[H, GenericType] = macro AsunaTupleGetterGenericMacroApply.MacroImpl.generic[H, GenericType]
}

object AsunaTupleGetterGenericMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper with Sha1Helper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, GenericType: c.WeakTypeTag]: c.Expr[AsunaTupleGetterGeneric[H, GenericType]] = {
      try {
        val struct = tupleTypeNames[H]

        val allFields     = struct.tupleFields.flatMap(_.caseClassFields)
        val genericFields = struct.modelFields.filter(i => !allFields.exists(ii => ii.fieldName == i.fieldName))

        val shaKey    = AsunaTupleDeficientApply.getClass.getCanonicalName + c.enclosingPosition.toString + struct.modelType.typeSymbol.name.toString + struct.traitType.typeSymbol.name.toString
        def freshName = toSha1(shaKey + c.freshName)

        val modelParam = freshName

        val modelFields = genericFields.map { name =>
          Select(Select(Ident(TermName(modelParam)), struct.modelFieldTermName), name.fieldTermName)
        }

        val paramName = q"""val ${TermName(modelParam)} = $EmptyTree"""

        def nameTagGen(tree: List[Tree]): Tree =
          if (tree.length <= AsunaParameters.maxPropertyNum) {
            q"""_root_.asuna.BuildContent.${TermName("tuple" + tree.length)}(..${tree})"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).to(List)
            nameTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""))
          }

        c.Expr[AsunaTupleGetterGeneric[H, GenericType]] {
          q"""{ $paramName => ${nameTagGen(modelFields)} }"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
