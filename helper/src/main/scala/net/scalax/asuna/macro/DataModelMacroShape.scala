package net.scalax.asuna.core.macroImpl

import net.scalax.asuna.core.decoder._
import net.scalax.asuna.helper.decoder.{ DecoderHelper, HListDecoderShapeImplicit }
import net.scalax.asuna.helper.decoder.datamodel.DMHelper
import net.scalax.asuna.shape.ShapeHelper

import scala.annotation.implicitNotFound
import scala.reflect.macros.blackbox.Context

object DataModelMacroShape {

  class DataModelMacroShapeImpl(override val c: Context) extends MacroUtils.MacroUtilImpl {
    self =>

    import c.universe._

    def proUseInShape[Abs: c.WeakTypeTag](fieldName: String, modelName: TermName, isOutPutSub: Boolean) = {
      val abs = weakTypeOf[Abs]
      val allHelper = weakTypeOf[DecoderHelper[Abs]]
      val implicitNotFound = weakTypeOf[implicitNotFound]
      val outputData = weakTypeOf[OutputData[_]]
      val outputSubData = weakTypeOf[OutputSubData[_, _]]
      val propertyType = weakTypeOf[PropertyType[_]]
      val decoderShape = weakTypeOf[DecoderShape[_, _, _, _]]
      val proGen = weakTypeOf[ProGen[_, _, _, _, _]]
      val propertyFun = weakTypeOf[PropertyFun[_, _, _, _]]

      val colDef = if (isOutPutSub) {
        q"""new $allHelper { }.toSub(${modelName}.${TermName(fieldName)})"""
      } else {
        q"""new $allHelper { }.toOutput(${modelName}.${TermName(fieldName)})"""
      }

      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      q"""
          val ${TermName(fieldName)} = {
            @$implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
            trait ${TypeName(traitName)}[ShapeData, ProData]
            object ${TermName(traitName)} {
              implicit def propertyImplicit1[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[${outputData.typeSymbol}[S], T] = new ${TypeName(traitName)}[${outputData.typeSymbol}[S], T] {}
              implicit def propertyImplicit2[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[${outputSubData.typeSymbol}[S, S], T] = new ${TypeName(traitName)}[${outputSubData.typeSymbol}[S, S], T] {}
            }
            def ${TermName(defName)}[A, B, C, D](rep: A, pro: ${propertyType.typeSymbol}[D])(implicit shape: ${decoderShape.typeSymbol}[A, B, C, $abs]): ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] = {
              new ${proGen.typeSymbol}[A, B, C, ${TypeName(traitName)}[B, D], $abs] {
                override protected def innperPro: ${propertyFun.typeSymbol}[A, B, C, $abs] = {
                  val rep1 = rep
                  val shape1 = shape
                  new ${propertyFun.typeSymbol}[A, B, C, $abs] {
                    override val rep: A = rep1
                    override val shape = shape1
                  }
                }
              }
            }
            ${TermName(defName)}(${colDef}, mg(_.${TermName(fieldName)})).unwrap.sv
          }
         """
    }

    def impl[Table: c.WeakTypeTag, ICase: c.WeakTypeTag, Case: c.WeakTypeTag, SubCase: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[Table => DecoderShapeValue[DataModel[ICase, Case, SubCase], Abs]] = {
      val modelGen = weakTypeOf[ModelGen[Case]]
      val abs = weakTypeOf[Abs]
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val iCase = weakTypeOf[ICase]
      val subCase = weakTypeOf[SubCase]
      val allHelper = weakTypeOf[DecoderHelper[Abs]]
      val shapeHelper = weakTypeOf[ShapeHelper]
      val hListDecoderShapeImplicit = weakTypeOf[HListDecoderShapeImplicit]
      val dMHelper = weakTypeOf[DMHelper]

      val caseFieldNames = caseClass.members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name.toString.trim }.toList
      val iCaseFieldNames = iCase.members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name.toString.trim }.toList
      val subCaseFieldNames = subCase.members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name.toString.trim }.toList

      val useFieldNames = caseFieldNames.filter(s => !iCaseFieldNames.contains(s))
      val subFieldNames = subCaseFieldNames.map(s => (s, caseFieldNames.indexOf(s))).sortBy(_._2).map(_._1)

      def confireCaseClassFields = {
        confirmHasFields[Case, Table](fieldNames = useFieldNames)
      }

      def fieldConfirmAction(modelName: TermName) = {
        fieldsShapeConifrm[Table, Abs](modelName = modelName, fieldNames = useFieldNames)
      }

      def mgDef =
        q"""
           lazy val mg: $modelGen = new $modelGen {}
         """

      def hlistFromPros(pros: List[String], hlistVal: TermName) = {
        val (result, _) = pros.foldLeft((List.empty[Tree], hlistVal)) {
          case ((expr, termName), proName) =>
            val tailVal = TermName(c.freshName(proName))
            val q = List(
              q"""val ${TermName(proName)} = $termName.head""",
              q"""val $tailVal = $termName.tail""")
            (expr ::: q, tailVal)
        }
        result
      }

      def ioFieldGen(field: String) = {
        q"""
           lazy val ${TermName(field)} = mg(s => s.${TermName(field)}).delay[$abs]
         """
      }

      def ioFieldsGen = iCaseFieldNames.map(ioFieldGen)

      def toShape = {
        val termVar1 = TermName(c.freshName)
        val termVar2 = TermName(c.freshName)
        val termVar3 = TermName(c.freshName)
        val termVar4 = TermName(c.freshName)
        val termVar5 = TermName(c.freshName)

        val compose = q"""
            ($termVar4: $iCase) => {
              ${iCaseFieldNames.reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${termVar4}.${TermName(b)}, $f)")}
            }
           """

        q"""
          lazy val aa = new $allHelper { }.shaped(
            ${(useFieldNames ::: iCaseFieldNames).reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${TermName(b)}, $f)")}
          ).map { case $termVar1 =>
            val $termVar2 = ${dMHelper.typeSymbol.companion}.compile($termVar1)
            $termVar2.andThen { case $termVar3 =>
              ..${hlistFromPros(useFieldNames ::: iCaseFieldNames, termVar3)}
              ${caseClass.typeSymbol.companion}(..${(useFieldNames ::: iCaseFieldNames).map(fName => q"""${TermName(fName)} = ${TermName(fName)}""")})
            }.compose($compose).changeSub { case $termVar5 =>
              ..${hlistFromPros(subFieldNames, termVar5)}
              ${subCase.typeSymbol.companion}(..${subFieldNames.map(fName => q"""${TermName(fName)} = ${TermName(fName)}""")})
            }
          }"""
      }

      val q = c.Expr[Table => DecoderShapeValue[DataModel[ICase, Case, SubCase], Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: $table) =>
            object CaseClassGenImpl extends $shapeHelper with $hListDecoderShapeImplicit {
              ..${confireCaseClassFields}
              ..${fieldConfirmAction(modelName = TermName(repModelTermName))}
              ..${ioFieldsGen}
              ${mgDef}
              ..${useFieldNames.map { fieldName => proUseInShape[Abs](fieldName = fieldName, modelName = TermName(repModelTermName), isOutPutSub = subCaseFieldNames.contains(fieldName)) }}
              ${toShape}
            }
           CaseClassGenImpl.aa
          }
        """
      }
      q
    }

  }

}