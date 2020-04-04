package asuna.macros.single.deficient

import java.util.UUID

import asuna.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait DeficientContent

trait AsunaDeficientToTupleApply[Model, PreTupleType <: TupleType, TupleType] {
  def toTuple(gen: Model): TupleType
}

object AsunaDeficientToTupleApply {
  implicit def macroImpl[Model, PreTupleType <: TupleType, TupleType]: AsunaDeficientToTupleApply[Model, PreTupleType, TupleType] =
    macro AsunaDeficientToTupleApplyMacroApply.MacroImpl.generic[Model, PreTupleType, TupleType]
}

object AsunaDeficientToTupleApplyMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[Model: c.WeakTypeTag, PreTupleType <: TupleType: c.WeakTypeTag, TupleType: c.WeakTypeTag]
      : c.Expr[AsunaDeficientToTupleApply[Model, PreTupleType, TupleType]] = {
      try {
        val model     = c.weakTypeOf[Model]
        val modelType = model.resultType

        val tuple     = c.weakTypeOf[TupleType]
        val tupleType = tuple.resultType

        val preTuple     = c.weakTypeOf[PreTupleType]
        val preTupleType = preTuple.resultType

        val props = caseClassMembersByType(modelType)

        val tupleModelProperty: Symbol = preTupleType.members.to(List).filter(s => s.annotations.find(s => s.tree.tpe.<:<(weakTypeOf[ModelProperty])).isDefined).head

        case class SymbolWithField(symbol: Symbol, termName: TermName, fields: List[String])

        val tupleDeficientProperty: List[SymbolWithField] = preTupleType.members
          .to(List)
          .filter(s => s.annotations.find(r => r.tree.tpe.<:<(weakTypeOf[DeficientProperty])).isDefined)
          .map(
            r =>
              r.name match {
                case i: TermName => SymbolWithField(symbol = r, termName = i, fields = caseClassMembersByType(r.typeSignatureIn(preTupleType)))
              }
          )

        val uuidSelf     = UUID.randomUUID().toString
        val uuidSelfTerm = TermName(uuidSelf)
        val uuidSelfVal  = q"""val $uuidSelfTerm = $EmptyTree"""

        def tupleDeficientSetter = tupleDeficientProperty.map { pro =>
          val argsSetter = pro.fields.map(
            i => NamedArg(Ident(TermName(i)), Select(Select(Ident(uuidSelfTerm), tupleModelProperty.name), TermName(i)))
          )
          q"""override def ${pro.termName} = ${pro.symbol.typeSignatureIn(preTupleType).typeSymbol.companion}(..${argsSetter})"""
        }

        val uuidParameterName    = UUID.randomUUID().toString
        val uuidParamNameTerm    = TermName(uuidParameterName)
        val uuidParameterNameVal = q"""val $uuidParamNameTerm = $EmptyTree"""

        c.Expr[AsunaDeficientToTupleApply[Model, PreTupleType, TupleType]] {
          q"""{ $uuidParameterNameVal =>
            new ${preTupleType} {
              $uuidSelfVal =>
              ..${tupleDeficientSetter}
              override val ${tupleModelProperty.name.asInstanceOf[TermName]} = $uuidParamNameTerm
            }
          }: _root_.asuna.macros.single.deficient.AsunaDeficientToTupleApply[${modelType}, ${preTupleType}, ${tupleType}]"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
