package net.scalax.asuna.core.macroImpl

import net.scalax.asuna.core._

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros
import scala.language.higherKinds

object MacroUtils {

  trait MacroUtilImpl {

    val c: Context

    import c.universe._

    private def confirmHasField(baseModelName: Symbol, compareModelName: Symbol, fieldName: String) = {
      val traitName = c.freshName(fieldName)
      q"""
          {
            @_root_.scala.annotation.implicitNotFound(msg = ${Literal(Constant(s"基础对象 $${BaseModel} 中含有 ${fieldName} 属性，但目标对象 $${CompareModel} 中没有该属性"))})
            trait ${TypeName(traitName)}[BaseModel, CompareModel]

            object ${TermName(traitName)} {
              implicit def propertyImplicit[S, T](implicit cv: T <:< { def ${TermName(fieldName)}: Any }): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] { }
            }
            def ${TermName(c.freshName(fieldName))} = implicitly[${TypeName(traitName)}[${baseModelName}, ${compareModelName}]]
          }
        """
    }

    def confirmHasFields(baseModelName: Symbol, compareModelName: Symbol, fieldNames: List[String]) = {
      val blocks = fieldNames.map(field => q"""..${confirmHasField(baseModelName = baseModelName, compareModelName = compareModelName, fieldName = field)}""")
      q"""..${blocks}"""
    }

    private def fieldShapeConifrm(modelName: TermName, tableName: Symbol, absName: Type, fieldName: String) = {
      val traitName = c.freshName(fieldName)
      val traitDef = TypeName(traitName)
      val traitObjDef = TermName(traitName)
      val def1Name = c.freshName(fieldName)
      q"""
          {
            @_root_.scala.annotation.implicitNotFound(msg = ${Literal(Constant(s"函数源 $${SourceTable} 的属性 ${fieldName} 找不到合适的 Shape\n列类型为 $${Source}\n抽象类型为 $${Abs}"))})
            trait ${traitDef}[SourceTable, Source, Abs]

            object ${traitObjDef} {
              implicit def propertyImplicit[SourceTable, Source, Data, Target, Abs](implicit shape: _root_.net.scalax.asuna.core.DataShape[Source, Data, Target, ${absName}]): ${traitDef}[SourceTable, Source, Abs] = new ${traitDef}[SourceTable, Source, Abs] { }
            }
            def ${TermName(def1Name)}[T](rep: T): _root_.net.scalax.asuna.core.macroImpl.PropertyDataShapeUnwrap[${traitDef}, ${tableName}, T, ${absName}] = {
              new _root_.net.scalax.asuna.core.macroImpl.PropertyDataShapeUnwrap[${traitDef}, ${tableName}, T, ${absName}] { }
            }
            def ${TermName(c.freshName(fieldName))} = ${TermName(def1Name)}(${modelName}.${TermName(fieldName)}).unwrap
          }
         """
    }

    def fieldsShapeConifrm(modelName: TermName, tableName: Symbol, absName: Type, fieldNames: List[String]) = {
      val blocks = fieldNames.map(field => q"""..${fieldShapeConifrm(modelName = modelName, tableName = tableName, absName = absName, fieldName = field)}""")
      q"""..${blocks}"""
    }

    def proUseInShape(fieldName: String, modelName: TermName, absName: Type, isOutPutSub: Boolean) = {
      val colDef = if (isOutPutSub) {
        q"""${modelName}.${TermName(fieldName)}.toOutputSub"""
      } else {
        q"""${modelName}.${TermName(fieldName)}.toOutput"""
      }

      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      q"""
          val ${TermName(fieldName)} = {
            @_root_.scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
            trait ${TypeName(traitName)}[ShapeData, ProData]
            object ${TermName(traitName)} {
              implicit def propertyImplicit1[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[S, T] = new ${TypeName(traitName)}[S, T] {}
              implicit def propertyImplicit2[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[_root_.net.scalax.asuna.core.OutputSubData[S, S], T] = new ${TypeName(traitName)}[_root_.net.scalax.asuna.core.OutputSubData[S, S], T] {}
            }
            def ${TermName(defName)}[A, B, C, D](rep: A, pro: _root_.net.scalax.asuna.core.macroImpl.PropertyType[D])(implicit shape: _root_.net.scalax.asuna.core.DataShape[A, B, C, ${absName}]): _root_.net.scalax.asuna.core.macroImpl.ProGen[A, B, C, ${TypeName(traitName)}[B, D], ${absName}] = {
              new _root_.net.scalax.asuna.core.macroImpl.ProGen[A, B, C, ${TypeName(traitName)}[B, D], ${absName}] {
                override protected def innperPro: _root_.net.scalax.asuna.core.macroImpl.PropertyFun[A, B, C, ${absName}] = {
                  val rep1 = rep
                  val shape1 = shape
                  new _root_.net.scalax.asuna.core.macroImpl.PropertyFun[A, B, C, ${absName}] {
                    override val rep: A = rep1
                    override val shape: _root_.net.scalax.asuna.core.DataShape[A, B, C, ${absName}] = shape1
                  }
                }
              }
            }
            ${TermName(defName)}(${colDef}, mg(_.${TermName(fieldName)})).unwrap.sv
          }
         """
    }

  }

}