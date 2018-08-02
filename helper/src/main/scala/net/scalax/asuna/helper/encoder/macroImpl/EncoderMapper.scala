package net.scalax.asuna.helper.encoder.macroImpl

import java.util.UUID

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.{ MacroColumnInfoContent, MacroColumnInfoImpl }
import net.scalax.asuna.helper.decoder.macroImpl.{ ModelGen, PropertyType }
import net.scalax.asuna.helper.encoder.{ EncoderHelper, ForTableInput }
import net.scalax.asuna.shape.ShapeHelper

import scala.reflect.macros.blackbox.Context

object EncoderMapper {

  val encoderGlobolPrefix = "netScalaxAsunaEncoder"

  case class EncoderFieldNames(law: String, svFunction: String, afterEmap: String)
  case class ContextValNames(selfInputTableImplicit: String, finalOutPutDefName: String, modelGen: String)

  trait EncoerShapeApply[Abs] {
    def withEncoderShape[T, D, U](rep: T, pro: PropertyType[D])(implicit shape: EncoderShape[T, D, U, Abs]): EncoderShapeValue[D, Abs] = {
      val rep1 = rep
      val shape1 = shape
      new EncoderShapeValue[D, Abs] {
        override type RepType = U
        override val rep: RepType = shape1.wrapRep(rep1)
        override val shape = shape1.packed
      }
    }
  }

  def toEncoderShapeValueApply[Abs]: EncoerShapeApply[Abs] = new EncoerShapeApply[Abs] {}

  class EncoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    def cusFreshName(name: String): String = c.freshName(encoderGlobolPrefix + name + UUID.randomUUID.toString.replaceAllLiterally("-", "a"))

    def commonProUseInShape[Abs: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](ctxNames: ContextValNames, fieldName: EncoderFieldNames, modelName: TermName, isMissingField: Boolean) = {
      //val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      //val defName = c.freshName(fieldName + "Gen")
      val columnInfoWrapTraitName = cusFreshName(fieldName.law)
      //val columnInfoWrapObjectName = c.freshName(fieldName)
      //val propertyType = weakTypeOf[PropertyType[_]]
      //val encoderShape = weakTypeOf[EncoderShape[_, _, _, _]]
      //val proGen = weakTypeOf[EncoderProGen[_, _, _, _, _]]
      val abs = weakTypeOf[Abs]
      //val implicitNotFound = weakTypeOf[implicitNotFound]
      val macroColumnInfoContent = weakTypeOf[MacroColumnInfoContent]

      //val columnInfo = weakTypeOf[MacroColumnInfo]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl[_, _, _, _]]

      val wtTT = weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Table]]
      val wtMT = weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Model]]

      val wtTRT = weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]
      val wtMRT = weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]
      /*q"""
      val ${TermName(fieldName)} = {
        @$implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
        trait ${TypeName(traitName)}[ShapeData, ProData]
        object ${TermName(traitName)} {
          implicit def propertyImplicit1[S, T](implicit cv: T <:< S): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
        }
        def ${TermName(defName)}[A, B, C, D](rep: A, pro: ${propertyType.typeSymbol}[D])(implicit shape: ${encoderShape.typeSymbol}[A, B, C, $abs]): ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] = {
          new ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] {
            override protected def innperPro: ${propertyEncoderFun.typeSymbol}[A, B, C, $abs] = {
              val rep1 = rep
              val shape1 = shape
              new ${propertyEncoderFun.typeSymbol}[A, B, C, $abs] {
                override val rep: A = rep1
                override val shape = shape1
              }
            }
          }
        }

        trait ${TypeName(columnInfoWrapTraitName)} extends $macroColumnInfoContent {

        def output = ${
        if (isMissingField) {
          q"""${TermName(defName)}(mg(_.${TermName(fieldName)}).toPlaceholder, mg(_.${TermName(fieldName)})).unwrap.sv"""
        } else {
          q"""${TermName(defName)}(${modelName}.${TermName(fieldName)}, mg(_.${TermName(fieldName)})).unwrap.sv"""
        }
      }
        }

        object ${TermName(columnInfoWrapTraitName)} extends ${TypeName(columnInfoWrapTraitName)} {
          override implicit def columnInfo = ${columnInfoImpl.typeSymbol.companion}(
            tableColumnName = ${Literal(Constant(fieldName))},
            modelColumnName = ${Literal(Constant(fieldName))},
            tableWeakTypeTag = _root_.scala.Predef.implicitly[${wtTT}],
            modelTag = _root_.scala.Predef.implicitly[${wtMT}],
            tableRepWeakTypeTag = _root_.scala.Predef.implicitly[${wtTRT}],
            modelRepTag = _root_.scala.Predef.implicitly[${wtMRT}]
          )
        }

        ${TermName(columnInfoWrapTraitName)}.output
      }
      """*/
      q"""
      val ${TermName(fieldName.svFunction)} = {

        trait ${TypeName(columnInfoWrapTraitName)} extends $macroColumnInfoContent {

        def output = ${
        if (isMissingField) {
          q"""_root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.toEncoderShapeValueApply[$abs].withEncoderShape(${TermName(ctxNames.modelGen)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(ctxNames.modelGen)}(_.${TermName(fieldName.law)}))"""
        } else {
          q"""_root_.net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper.toEncoderShapeValueApply[$abs].withEncoderShape(${modelName}.${TermName(fieldName.law)}, ${TermName(ctxNames.modelGen)}(_.${TermName(fieldName.law)}))"""
        }
      }
        }

        object ${TermName(columnInfoWrapTraitName)} extends ${TypeName(columnInfoWrapTraitName)} {
          override implicit def columnInfo = ${columnInfoImpl.typeSymbol.companion}(
            tableColumnName = ${Literal(Constant(fieldName.law))},
            modelColumnName = ${Literal(Constant(fieldName.law))},
            tableWeakTypeTag = _root_.scala.Predef.implicitly[${wtTT}],
            modelTag = _root_.scala.Predef.implicitly[${wtMT}],
            tableRepWeakTypeTag = _root_.scala.Predef.implicitly[${wtTRT}],
            modelRepTag = _root_.scala.Predef.implicitly[${wtMRT}]
          )
        }

        ${TermName(columnInfoWrapTraitName)}.output
      }
      """
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[ForTableInput[Table, Case, Abs]] = {

      val ctxNames = ContextValNames(selfInputTableImplicit = cusFreshName("SelfInputTableImplicit"), finalOutPutDefName = cusFreshName("FinalOutPutDefName"), modelGen = cusFreshName("ModelGen"))

      val caseClass = weakTypeOf[Case]

      if (!caseClass.typeSymbol.asClass.isCaseClass) {
        c.abort(c.enclosingPosition, s"${caseClass.typeSymbol}不是 case class 类型")
      } else {
        val table = weakTypeOf[Table]
        val modelGen = weakTypeOf[ModelGen[Case]]
        val allHelper = weakTypeOf[EncoderHelper[Abs]]
        val forTableInput = weakTypeOf[ForTableInput[Table, Case, Abs]]
        val shapeValue = weakTypeOf[EncoderShapeValue[Case, Abs]]
        val inputTable = weakTypeOf[ForTableInput[Table, Case, Abs]]
        val shapeHelper = weakTypeOf[ShapeHelper]

        //val fieldNameStrs = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList
        val modelFieldNames = caseClass.members
          .filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }
          .map(_.name)
          .collect { case TermName(n) => n.trim }
          .toList
          .map(name => EncoderFieldNames(law = name, svFunction = cusFreshName(name), afterEmap = cusFreshName(name)))

        val fieldNamesInTable = table.members
          .filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }
          .map(_.name)
          .collect { case TermName(n) => n.trim }
          .toList
          .map(name => EncoderFieldNames(law = name, svFunction = cusFreshName(name), afterEmap = cusFreshName(name)))

        val misFieldsInTable = modelFieldNames.filter(n => !fieldNamesInTable.map(_.law).contains(n.law))

        def mgDef = q"""
          lazy val ${TermName(ctxNames.modelGen)}: $modelGen = new $modelGen {}
        """

        def toShape(namePare: List[EncoderFieldNames]) = {
          val proNames = namePare
          val termVar1 = TermName(cusFreshName("Export"))
          val listSymbol = weakTypeOf[List[_]].typeSymbol.companion

          val func = q"""
        { ($termVar1: $caseClass) =>
          $listSymbol(..${proNames.map(eachName => q"""$termVar1.${TermName(eachName.law)}""")})
        }
        """

          q"""
        new $allHelper{ }.shaped(
          $listSymbol(..${proNames.map(eachName => q"""${TermName(eachName.svFunction)}.emap((s: Any) => ${TermName(ctxNames.modelGen)}(_.${TermName(eachName.law)}).convertData(s))""")})
        ).emap($func)
        """
        }

        val q = c.Expr[ForTableInput[Table, Case, Abs]] {
          val repModelTermName = cusFreshName("Table")

          val implicitFunctionName = TermName(cusFreshName("SelfInputTableInplicit"))

          val outPutDefName = TermName(cusFreshName("outPutDef"))

          q"""
          new $forTableInput {
            tableSelf =>

            override def input(${TermName(repModelTermName)}: $table): $shapeValue = {
              new $shapeHelper {

                implicit def $implicitFunctionName: $inputTable = tableSelf

                def $outPutDefName = {
                  $mgDef
                  ..${modelFieldNames.map { proName => commonProUseInShape[Abs, Table, Case](ctxNames = ctxNames, fieldName = proName, modelName = TermName(repModelTermName), isMissingField = misFieldsInTable.contains(proName)) }}
                  ${toShape(modelFieldNames)}
                }

              }.$outPutDefName
            }
          }: ${weakTypeOf[ForTableInput[Table, Case, Abs]]}
        """
        }
        //println(q + "\n" + "22" * 100)
        q
      }

    }

  }

}