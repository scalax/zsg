package net.scalax.asuna.core.macroImpl

import scala.reflect.macros.blackbox.Context

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

  }

}