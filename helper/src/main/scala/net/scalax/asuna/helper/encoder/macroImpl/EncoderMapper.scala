package net.scalax.asuna.helper.encoder.macroImpl

import java.util.UUID

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.{ MacroColumnInfo, MacroColumnInfoImpl }
import net.scalax.asuna.helper.decoder.macroImpl.{ ModelGen, PropertyType }
import net.scalax.asuna.helper.encoder.{ EncoderHelper, ForTableInput }

import scala.reflect.macros.blackbox.Context

object EncoderMapper {

  class EncoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    case class FieldNames(law: String, shapeValueName: String)

    def commonProUseInShape[RepCol: c.WeakTypeTag, DataCol: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](mgVar: String, fieldName: FieldNames, modelName: TermName, isMissingField: Boolean) = {
      val traitName = c.freshName(fieldName.law)
      val defName = c.freshName(fieldName.law)
      //val encoderShape = weakTypeOf[EncoderShape[_, _, _, _, _]]
      val repCol = weakTypeOf[RepCol]
      val dataCol = weakTypeOf[DataCol]
      val edsv = weakTypeOf[EncoderShapeValue[Any, RepCol, DataCol]]

      //val columnInfo = weakTypeOf[MacroColumnInfo]
      //val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]
      //val propertyType = weakTypeOf[PropertyType[_]]

      q"""
        val ${TermName(fieldName.shapeValueName)} = {
          def ${TermName(defName)}[A, B, C](rep: A, propertyType: _root_.net.scalax.asuna.helper.decoder.macroImpl.PropertyType[B])(implicit shape: _root_.net.scalax.asuna.core.encoder.EncoderShape[A, B, C, $repCol, $dataCol]) = {
            val rep1 = rep
            val shape1 = shape
            new _root_.net.scalax.asuna.core.encoder.EncoderShapeValue[B, $repCol, $dataCol] {
              override type RepType = C
              override val rep = shape1.wrapRep(rep1)
              override val shape = shape1.packed
            }
          }

          def ${TermName(traitName)}(implicit columnInfo: _root_.net.scalax.asuna.helper.MacroColumnInfo): $edsv = {
            ${
        if (isMissingField) {
          //q"""${TermName(defName)}(${TermName(mgVar)}(_.${TermName(fieldName)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName)})).emap((s: Any) => ${TermName(mgVar)}(_.${TermName(fieldName)}).convertData(s))"""
          q"""${TermName(defName)}(${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName.law)})).asInstanceOf[$edsv]"""
        } else {
          //q"""${TermName(defName)}(${modelName}.${TermName(fieldName)}, ${TermName(mgVar)}(_.${TermName(fieldName)})).emap((s: Any) => ${TermName(mgVar)}(_.${TermName(fieldName)}).convertData(s))"""
          q"""${TermName(defName)}(${modelName}.${TermName(fieldName.law)}, ${TermName(mgVar)}(_.${TermName(fieldName.law)})).asInstanceOf[$edsv]"""
        }
      }
          }

          ${TermName(traitName)}(_root_.net.scalax.asuna.helper.MacroColumnInfoImpl.apply(
            tableColumnName = ${Literal(Constant(fieldName.law))},
            modelColumnName = ${Literal(Constant(fieldName.law))}
          ))
        }
    """
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, RepCol: c.WeakTypeTag, DataCol: c.WeakTypeTag]: c.Expr[ForTableInput[Table, Case, RepCol, DataCol]] = {
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val repCol = weakTypeOf[RepCol]
      val dataCol = weakTypeOf[DataCol]
      //val modelGen = weakTypeOf[ModelGen[Case]]
      //val allHelper = weakTypeOf[EncoderHelper[RepCol, DataCol]]
      val forTableInput = weakTypeOf[ForTableInput[Table, Case, RepCol, DataCol]]
      val shapeValue = weakTypeOf[EncoderShapeValue[Case, RepCol, DataCol]]

      val mgVar = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList.map(s => FieldNames(law = s, shapeValueName = s + UUID.randomUUID.toString.replaceAllLiterally("-", "a")))
      val fieldNamesInTable = table.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val misFieldsInTable = modelFieldNames.filter(n => !fieldNamesInTable.contains(n.law))

      def mgDef = q"""
          lazy val ${TermName(mgVar)}: _root_.net.scalax.asuna.helper.decoder.macroImpl.ModelGen[$caseClass] = new _root_.net.scalax.asuna.helper.decoder.macroImpl.ModelGen[$caseClass] {}
        """

      def toShape(namePare: List[FieldNames]) = {
        val proNames = namePare
        val termVar1 = TermName(c.freshName)
        val listSymbol = weakTypeOf[List[_]].typeSymbol.companion

        //          $listSymbol(..${proNames.map(eachName => q"""$termVar1.${TermName(eachName)}""")})

        val toListTree = proNames.foldRight(q"""Nil""": Tree) { (name, tree) =>
          q"""$termVar1.${TermName(name.law)} :: $tree"""
        }

        val func = q"""
        { ($termVar1: $caseClass) =>
$toListTree
        }
        """

        q"""
        new _root_.net.scalax.asuna.helper.encoder.EncoderHelper[$repCol, $dataCol]{ }.listAny(
          $listSymbol(..${proNames.map(eachName => q"""${TermName(eachName.shapeValueName)}""")})
        ).emap($func)
        """
      }

      val q = c.Expr[ForTableInput[Table, Case, RepCol, DataCol]] {
        val repModelTermName = c.freshName
        q"""
          new $forTableInput {
            override def input(${TermName(repModelTermName)}: $table): $shapeValue = {
              $mgDef
              ..${modelFieldNames.map { proName => commonProUseInShape[RepCol, DataCol, Table, Case](mgVar = mgVar, fieldName = proName, modelName = TermName(repModelTermName), isMissingField = misFieldsInTable.contains(proName)) }}
              ${toShape(modelFieldNames)}
            }
          }: ${weakTypeOf[ForTableInput[Table, Case, RepCol, DataCol]]}
        """
      }
      //println(q + "\n" + "22" * 100)
      q
    }

  }

}