package zsg.macros.single.utils

import zsg.macros.single.deficient.{DeficientProperty, ModelProperty}

import scala.collection.compat._

trait TypeHelper {

  val c: scala.reflect.macros.blackbox.Context
  import c.universe._

  case class ModelField(fieldName: String, fieldSymbol: Symbol, fieldTermName: TermName)
  case class TupleField(fieldName: String, fieldSymbol: Symbol, fieldType: Type, fieldTermName: TermName, caseClassFields: List[ModelField])

  case class TupleTypeStructure(
    traitType: Type,
    modelFieldSymbol: Symbol,
    modelFieldName: String,
    modelType: Type,
    modelFieldTermName: TermName,
    modelFields: List[ModelField],
    tupleFields: List[TupleField]
  )

  def caseClassMembersByType(tpe: Type): List[ModelField] = {
    tpe.members
      .to(List)
      .filter(s => s.isTerm && s.asTerm.isVal && s.asTerm.isCaseAccessor)
      .map(s => (s, s.name))
      .collect { case (symbol, TermName(n)) =>
        val name = n.trim
        ModelField(name, symbol, TermName(name))
      }
      .reverse
  }

  def tupleTypeNames[TupleType: c.WeakTypeTag]: TupleTypeStructure = {
    val traitType = weakTypeOf[TupleType].resultType
    val tupleModelProperty: Symbol =
      traitType.members.to(List).filter(s => s.annotations.find(s => s.tree.tpe.<:<(weakTypeOf[ModelProperty])).isDefined).head
    val TermName(preProName) = tupleModelProperty.name
    val modelFieldName       = preProName.trim
    val modelType            = tupleModelProperty.typeSignatureIn(traitType)

    val tupleSymbols =
      traitType.members.to(List).filter(s => s.annotations.find(s => s.tree.tpe.<:<(weakTypeOf[DeficientProperty])).isDefined).reverse
    val tupleFields = tupleSymbols.map { i =>
      val TermName(n) = i.name
      val name        = n.trim
      val fieldType   = i.typeSignatureIn(traitType)
      TupleField(
        fieldName = name,
        fieldSymbol = i,
        fieldType = fieldType,
        caseClassFields = caseClassMembersByType(fieldType),
        fieldTermName = TermName(name)
      )
    }

    val modelFields = caseClassMembersByType(modelType)
    TupleTypeStructure(
      traitType = traitType,
      modelFieldSymbol = tupleModelProperty,
      modelFieldName = modelFieldName,
      modelFieldTermName = TermName(modelFieldName),
      modelType = modelType,
      modelFields = modelFields,
      tupleFields = tupleFields
    )
  }

}
