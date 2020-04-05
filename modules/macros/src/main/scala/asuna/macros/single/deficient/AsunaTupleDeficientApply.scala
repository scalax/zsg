package asuna.macros.single.deficient

import asuna.macros.single.utils.{Sha1Helper, TypeHelper}

import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaTupleDeficientApply[Model, PreTupleType <: TupleType, TupleType] {
  def toTuple(gen: Model): TupleType
}

object AsunaTupleDeficientApply {
  implicit def macroImpl[Model, PreTupleType <: TupleType, TupleType]: AsunaTupleDeficientApply[Model, PreTupleType, TupleType] =
    macro AsunaTupleDeficientApplyMacroApply.MacroImpl.generic[Model, PreTupleType, TupleType]
}

object AsunaTupleDeficientApplyMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper with Sha1Helper {
    self =>

    import c.universe._

    def generic[Model: c.WeakTypeTag, PreTupleType <: TupleType: c.WeakTypeTag, TupleType: c.WeakTypeTag]
      : c.Expr[AsunaTupleDeficientApply[Model, PreTupleType, TupleType]] = {
      try {
        val model     = c.weakTypeOf[Model]
        val modelType = model.resultType

        val tuple     = c.weakTypeOf[TupleType]
        val tupleType = tuple.resultType

        val preTuple     = c.weakTypeOf[PreTupleType]
        val preTupleType = preTuple.resultType

        val struct = tupleTypeNames[TupleType]

        val shaKey    = AsunaTupleDeficientApply.getClass.getCanonicalName + c.enclosingPosition.toString + modelType.typeSymbol.name.toString + tupleType.typeSymbol.name.toString + preTupleType.typeSymbol.name.toString
        def freshName = toSha1(shaKey + c.freshName)

        val shaSelf     = freshName
        val shaSelfTerm = TermName(shaSelf)
        val shaSelfVal  = q"""val $shaSelfTerm = $EmptyTree"""

        def tupleDeficientSetter = struct.tupleFields.map { pro =>
          val argsSetter = pro.caseClassFields.map(
            i => NamedArg(Ident(i.fieldTermName), Select(Select(Ident(shaSelfTerm), struct.modelFieldTermName), i.fieldTermName))
          )
          q"""override def ${pro.fieldTermName} = ${pro.fieldType.typeSymbol.companion}(..${argsSetter})"""
        }

        val shaParameterName    = freshName
        val shaParamNameTerm    = TermName(shaParameterName)
        val shaParameterNameVal = q"""val $shaParamNameTerm = $EmptyTree"""

        c.Expr[AsunaTupleDeficientApply[Model, PreTupleType, TupleType]] {
          q"""{ $shaParameterNameVal =>
            new ${preTupleType} {
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
