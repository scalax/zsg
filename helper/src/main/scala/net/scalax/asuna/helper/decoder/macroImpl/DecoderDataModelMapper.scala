package net.scalax.asuna.helper.decoder.macroImpl

import net.scalax.asuna.core.decoder._
import net.scalax.asuna.helper.{ MacroColumnInfo, MacroColumnInfoImpl }
import net.scalax.asuna.helper.decoder.DecoderHelper
import net.scalax.asuna.shape.ShapeHelper

import scala.annotation.implicitNotFound
import scala.reflect.macros.blackbox.Context

object DecoderDataModelMapper {

  class DecoderDataModelMapperImpl(override val c: Context) extends MacroUtils.MacroUtilImpl {
    self =>

    import c.universe._

    def proUseInShape[Abs: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](fieldName: String, modelName: TermName, isOutPutSub: Boolean) = {
      val abs = weakTypeOf[Abs]
      val implicitNotFound = weakTypeOf[implicitNotFound]
      val propertyType = weakTypeOf[PropertyType[_]]
      val decoderShape = weakTypeOf[DecoderShape[_, _, _, _]]
      val proGen = weakTypeOf[ProGen[_, _, _, _, _]]
      val propertyFun = weakTypeOf[PropertyFun[_, _, _, _]]

      val columnInfo = weakTypeOf[MacroColumnInfo]
      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl[_, _, _, _]]

      val wtTT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Table]]
      val wtMT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[Model]]

      val wtTRT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]
      val wtMRT = c.weakTypeOf[scala.reflect.runtime.universe.WeakTypeTag[() => String]]

      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      q"""
          val ${TermName(fieldName)} = {
            @$implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
            trait ${TypeName(traitName)}[ShapeData, ProData]
            object ${TermName(traitName)} {
              implicit def propertyImplicit2[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
            }
            implicit val ${TermName(c.freshName)}: $columnInfo = ${columnInfoImpl.typeSymbol.companion}(
              tableColumnName = ${Literal(Constant(fieldName))},
              modelColumnName = ${Literal(Constant(fieldName))},
              tableWeakTypeTag = _root_.scala.Predef.implicitly[${wtTT}],
              modelTag = _root_.scala.Predef.implicitly[${wtMT}],
              tableRepWeakTypeTag = _root_.scala.Predef.implicitly[${wtTRT}],
              modelRepTag = _root_.scala.Predef.implicitly[${wtMRT}]
            )
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
            ${TermName(defName)}(${modelName}.${TermName(fieldName)}, mg(_.${TermName(fieldName)})).unwrap.sv
          }
         """
    }

    def impl[Table: c.WeakTypeTag, ICase: c.WeakTypeTag, Case: c.WeakTypeTag, SubCase: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[Table => DecoderShapeValue[DataModel[ICase, Case, SubCase], Abs]] = {
      val modelGen = weakTypeOf[ModelGen[Case]]
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val iCase = weakTypeOf[ICase]
      val subCase = weakTypeOf[SubCase]
      val allHelper = weakTypeOf[DecoderHelper[Abs]]
      val shapeHelper = weakTypeOf[ShapeHelper]

      val caseFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val iCaseFieldNames = iCase.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val subCaseFieldNames = subCase.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList

      val useFieldNames = caseFieldNames.filter(s => !iCaseFieldNames.contains(s))

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

      def toShape = {
        val listSymbol = weakTypeOf[List[_]].typeSymbol.companion
        val proSuffix = c.freshName

        val outputCaseCus = useFieldNames.map(fName => q"""${TermName(fName)} = mg(_.${TermName(fName)}).convertData(${TermName(fName + proSuffix)})""")
        val inputCaseCus = iCaseFieldNames.map(fName => q"""${TermName(fName)} = i.${TermName(fName)}""")

        val pqMatch = pq"""$listSymbol(..${useFieldNames.map(fName => pq"""${TermName(fName + proSuffix)} @ (_: Any)""")})"""

        q"""
          new $allHelper{ }.shaped(
            List(..${useFieldNames.map(fName => q"""${TermName(fName)}.dmap(s => s: Any)""")})
          ).dmap { case $pqMatch =>
            new _root_.net.scalax.asuna.core.decoder.DataModel[$iCase, $caseClass, $subCase] {
              self =>
              override def apply(i: $iCase): $caseClass = {
                ${caseClass.typeSymbol.companion}(..${outputCaseCus ::: inputCaseCus})
              }
              override def sub: $subCase = {
                ${subCase.typeSymbol.companion}(..${subCaseFieldNames.map(fName => q"""${TermName(fName)} = mg(_.${TermName(fName)}).convertData(${TermName(fName + proSuffix)})""")})
              }
            }
          }"""
      }

      val q = c.Expr[Table => DecoderShapeValue[DataModel[ICase, Case, SubCase], Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: $table) =>
            object CaseClassGenImpl extends $shapeHelper {
              ..${confireCaseClassFields}
              ..${fieldConfirmAction(modelName = TermName(repModelTermName))}
              ${mgDef}
              ..${useFieldNames.map { fieldName => proUseInShape[Abs, Table, Case](fieldName = fieldName, modelName = TermName(repModelTermName), isOutPutSub = subCaseFieldNames.contains(fieldName)) }}
              lazy val dataModelShapeValue = ${toShape}
            }
           CaseClassGenImpl.dataModelShapeValue
          }
        """
      }
      //println(q)
      q
    }

  }

}