package zsg.macros.single.deficient

import zsg.macros.single.utils.{Sha1Helper, TypeHelper}
import zsg.macros.utils.MacroMethods

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaTupleApply[Model, TupleType] {
  def toTuple(gen: Model): TupleType
}

object AsunaTupleApply {
  @inline def apply[Model, TupleType](implicit asunaTupleApply: AsunaTupleApply[Model, TupleType]): AsunaTupleApply[Model, TupleType] =
    asunaTupleApply
  implicit def macroImpl[Model, TupleType]: AsunaTupleApply[Model, TupleType] =
    macro AsunaTupleApplyMacroApply.MacroImpl.generic[Model, TupleType]
}

object AsunaTupleApplyMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper with Sha1Helper with MacroMethods {
    self =>

    import c.universe._

    def generic[Model: c.WeakTypeTag, TupleType: c.WeakTypeTag]: c.Expr[AsunaTupleApply[Model, TupleType]] = {
      try {

        val struct = tupleTypeNames[TupleType]

        val shaKey =
          AsunaTupleApply.getClass.getCanonicalName + c.enclosingPosition.toString + struct.modelType.typeSymbol.name.toString + struct.traitType.typeSymbol.name.toString
        def freshName = toSha1(shaKey + c.freshName)

        val shaSelf     = freshName
        val shaSelfTerm = TermName(shaSelf)
        val shaSelfVal  = q"""val $shaSelfTerm = $EmptyTree"""

        def tupleDeficientSetter =
          struct.tupleFields.map { pro =>
            val argsSetter = pro.caseClassFields.map(i =>
              namedParam(i.fieldTermName, Select(Select(Ident(shaSelfTerm), struct.modelFieldTermName), i.fieldTermName))
            )
            q"""override def ${pro.fieldTermName} = ${pro.fieldType.typeSymbol.companion}(..${argsSetter})"""
          }

        val shaParameterName    = freshName
        val shaParamNameTerm    = TermName(shaParameterName)
        val shaParameterNameVal = q"""val $shaParamNameTerm = $EmptyTree"""

        c.Expr[AsunaTupleApply[Model, TupleType]] {
          q"""{ $shaParameterNameVal =>
            new ${struct.traitType} {
              $shaSelfVal =>
              ..${tupleDeficientSetter}
              override val ${struct.modelFieldTermName} = $shaParamNameTerm
            }
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
