package net.scalax.asuna.helper.decoder.macroImpl

import net.scalax.asuna.core.decoder.DecoderShape

import scala.annotation.implicitNotFound
import scala.reflect.macros.blackbox.Context

object MacroUtils {

  trait MacroUtilImpl {

    val c: Context

    import c.universe._

    private def confirmHasField[Case: c.WeakTypeTag, Table: c.WeakTypeTag](fieldName: String) = {
      val implicitNotFound = weakTypeOf[implicitNotFound]
      val caseModel = weakTypeOf[Case]
      val tableModel = weakTypeOf[Table]

      val traitName = c.freshName(fieldName)
      q"""
          {
            @$implicitNotFound(msg = ${Literal(Constant(s"基础对象 $${BaseModel} 中含有 ${fieldName} 属性，但目标对象 $${CompareModel} 中没有该属性"))})
            trait ${TypeName(traitName)}[BaseModel, CompareModel]

            object ${TermName(traitName)} {
              implicit def propertyImplicit[S, T](implicit cv: T <:< { def ${TermName(fieldName)}: Any }): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] { }
            }
            def ${TermName(c.freshName(fieldName))} = implicitly[${TypeName(traitName)}[$caseModel, $tableModel]]
          }
        """
    }

    def confirmHasFields[Case: c.WeakTypeTag, Table: c.WeakTypeTag](fieldNames: List[String]) = {
      val blocks = fieldNames.map(field => q"""..${confirmHasField[Case, Table](fieldName = field)}""")
      q"""..${blocks}"""
    }

    private def fieldShapeConifrm[Table: c.WeakTypeTag, Abs: c.WeakTypeTag](modelName: TermName, fieldName: String) = {
      val traitName = c.freshName(fieldName)
      val traitDef = TypeName(traitName)
      val traitObjDef = TermName(traitName)
      val def1Name = c.freshName(fieldName)
      val tableName = weakTypeOf[Table]
      val abs = weakTypeOf[Abs]
      val decoderShape = weakTypeOf[DecoderShape[_, _, _, _]]
      val propertyDataShapeUnwrap = weakTypeOf[PropertyDataShapeUnwrap[_, _, _, _]]
      val implicitNotFound = weakTypeOf[implicitNotFound]

      q"""
          {
            @$implicitNotFound(msg = ${Literal(Constant(s"函数源 $${SourceTable} 的属性 ${fieldName} 找不到合适的 Shape\n列类型为 $${Source}\n抽象类型为 $${Abs}"))})
            trait ${traitDef}[SourceTable, Source, Abs]

            object ${traitObjDef} {
              implicit def propertyImplicit[SourceTable, Source, Data, Target, Abs](implicit shape: ${decoderShape.typeSymbol}[Source, Data, Target, $abs]): $traitDef[SourceTable, Source, Abs] = new ${traitDef}[SourceTable, Source, Abs] { }
            }
            def ${TermName(def1Name)}[T](rep: T): ${propertyDataShapeUnwrap.typeSymbol}[$traitDef, $tableName, T, $abs] = {
              new ${propertyDataShapeUnwrap.typeSymbol}[$traitDef, $tableName, T, $abs] { }
            }
            def ${TermName(c.freshName(fieldName))} = ${TermName(def1Name)}($modelName.${TermName(fieldName)}).unwrap
          }
         """
    }

    def fieldsShapeConifrm[Table: c.WeakTypeTag, Abs: c.WeakTypeTag](modelName: TermName, fieldNames: List[String]) = {
      val blocks = fieldNames.map(field => q"""..${fieldShapeConifrm[Table, Abs](modelName = modelName, fieldName = field)}""")
      q"""..${blocks}"""
    }

  }

}