package asuna.macros.single.deficient

import asuna.macros.single.utils.TypeHelper

import scala.language.experimental.macros
import scala.collection.compat._

trait DeficientContent

trait AsunaDeficientToTupleApply[Model, TupleType] {
  def toTuple(gen: Model): TupleType
}

object AsunaDeficientToTupleApply {
  implicit def macroImpl[Model, TupleType]: AsunaDeficientToTupleApply[Model, TupleType] = macro AsunaDeficientToTupleApplyMacroApply.MacroImpl.generic[Model, TupleType]
}

object AsunaDeficientToTupleApplyMacroApply {

  class MacroImpl(override val c: scala.reflect.macros.blackbox.Context) extends TypeHelper {
    self =>

    import c.universe._

    def generic[Model: c.WeakTypeTag, TupleType: c.WeakTypeTag]: c.Expr[AsunaDeficientToTupleApply[Model, TupleType]] = {
      try {
        val model     = c.weakTypeOf[Model]
        val modelType = model.resultType

        val tuple     = c.weakTypeOf[TupleType]
        val tupleType = tuple.resultType

        val props = caseClassMembersByType(modelType)

        val tupleModelProperty: Symbol = tupleType.members
          .to(List)
          .filter { s =>
            s.annotations.find(s => s.tree.tpe.<:<(weakTypeOf[ModelProperty])).isDefined
          }
          .head

        case class SymbolWithField(symbol: Symbol, fields: List[String])

        val tupleDeficientProperty: List[SymbolWithField] = tupleType.members
          .to(List)
          .filter(s => s.annotations.find(r => r.tree.tpe.<:<(weakTypeOf[DeficientProperty])).isDefined)
          .map(r => SymbolWithField(symbol = r, fields = caseClassMembersByType(r.typeSignatureIn(tupleType))))

        def tupleDeficientSetter = tupleDeficientProperty.map { pro =>
          q"""override def ${pro.symbol.name.asInstanceOf[TermName]} = ${pro.symbol.typeSignatureIn(tupleType).typeSymbol.companion}(..${pro.fields.map(
            i => q"""${TermName(i)} = deficientApplySelf.${tupleModelProperty}.${TermName(i)}"""
          )})"""
        }

        println("11" * 100)
        println("11" * 100)
        println("11" * 100)
        println("11" * 100)
        println("11" * 100)

        println(q"""{ (gen) =>
            new ${tupleType} {
              deficientApplySelf =>
              ..${tupleDeficientSetter}
              override val ${tupleModelProperty.name.asInstanceOf[TermName]} = gen
            }
          }: _root_.asuna.macros.single.deficient.AsunaDeficientToTupleApply[${modelType}, ${tupleType}]""")

        c.Expr[AsunaDeficientToTupleApply[Model, TupleType]] {
          q"""{ (gen) =>
            new ${tupleType} {
              deficientApplySelf =>
              ..${tupleDeficientSetter}
              override val ${tupleModelProperty.name.asInstanceOf[TermName]} = gen
            }
          }: _root_.asuna.macros.single.deficient.AsunaDeficientToTupleApply[${modelType}, ${tupleType}]"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
