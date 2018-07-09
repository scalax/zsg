package net.scalax.asuna.core.macroImpl

import net.scalax.asuna.core._

import scala.reflect.macros.blackbox.Context

object DataModelMacroShape {

  class DataModelMacroShapeImpl(override val c: Context) extends MacroUtils.MacroUtilImpl {
    self =>

    import c.universe._

    def proUseInShape(fieldName: String, modelName: TermName, absName: Type, isOutPutSub: Boolean) = {
      val colDef = if (isOutPutSub) {
        q"""new _root_.net.scalax.asuna.core.AllHelper[$absName] { }.toSub(${modelName}.${TermName(fieldName)})"""
      } else {
        q"""new _root_.net.scalax.asuna.core.AllHelper[$absName] { }.toOutput(${modelName}.${TermName(fieldName)})"""
      }

      val traitName = c.freshName(fieldName + "ProShape") //s"$proName-pro-shape-trait"
      val defName = c.freshName(fieldName + "Gen")
      q"""
          val ${TermName(fieldName)} = {
            @_root_.scala.annotation.implicitNotFound(msg = "属性 id 中，Shape 的数据类型 $${ShapeData} 和实体类的数据类型 $${ProData} 不对应")
            trait ${TypeName(traitName)}[ShapeData, ProData]
            object ${TermName(traitName)} {
              implicit def propertyImplicit1[S, T](implicit cv: S <:< T): ${TypeName(traitName)}[_root_.net.scalax.asuna.core.OutputData[S], T] = new ${TypeName(traitName)}[_root_.net.scalax.asuna.core.OutputData[S], T] {}
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

    def impl[Table: c.WeakTypeTag, ICase: c.WeakTypeTag, Case: c.WeakTypeTag, SubCase: c.WeakTypeTag, Abs: c.WeakTypeTag]: c.Expr[Table => DataShapeValue[DataModel[ICase, Case, SubCase], Abs]] = {
      val caseFieldNames = weakTypeOf[Case].members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name.toString.trim }.toList
      val iCaseFieldNames = weakTypeOf[ICase].members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name.toString.trim }.toList
      val subCaseFieldNames = weakTypeOf[SubCase].members.collect { case s if s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal => s.name.toString.trim }.toList

      val useFieldNames = caseFieldNames.filter(s => !iCaseFieldNames.contains(s))
      val subFieldNames = subCaseFieldNames.map(s => (s, caseFieldNames.indexOf(s))).sortBy(_._2).map(_._1)

      def confireCaseClassFields = {
        confirmHasFields(baseModelName = weakTypeOf[Case].typeSymbol, compareModelName = weakTypeOf[Table].typeSymbol, fieldNames = useFieldNames)
      }

      def fieldConfirmAction(modelName: TermName) = {
        fieldsShapeConifrm(modelName = modelName, tableName = weakTypeOf[Table].typeSymbol, absName = weakTypeOf[Abs], fieldNames = useFieldNames)
      }

      def mgDef =
        q"""
           lazy val mg: _root_.net.scalax.asuna.core.macroImpl.ModelGen[${weakTypeOf[Case].typeSymbol}] = new _root_.net.scalax.asuna.core.macroImpl.ModelGen[${weakTypeOf[Case].typeSymbol}] {}
         """

      def hlistFromPros(pros: List[String], hlistVal: TermName) = {
        val (result, _) = pros.foldLeft((List.empty[Tree], hlistVal)) {
          case ((expr, termName), proName) =>
            val tailVal = TermName(c.freshName(proName))
            val q = List(
              q"""val ${TermName(proName)} = ${termName}.head""",
              q"""val ${tailVal} = ${termName}.tail""")
            (expr ::: q, tailVal)
        }
        result
      }

      def ioFieldGen(field: String) = {
        q"""
           lazy val ${TermName(field)} = mg(s => s.${TermName(field)}).delay[${weakTypeOf[Abs]}]
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
            (${termVar4}: ${weakTypeOf[ICase].typeSymbol}) => {
              ${iCaseFieldNames.reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${termVar4}.${TermName(b)}, $f)")}
            }
           """

        q"""
          lazy val aa = new _root_.net.scalax.asuna.core.AllHelper[${weakTypeOf[Abs]}] { }.shaped(
            ${(useFieldNames ::: iCaseFieldNames).reverse.foldLeft(q"_root_.shapeless.HNil": Tree)((f, b) => q"_root_.shapeless.::(${TermName(b)}, $f)")}
          ).map { case ${termVar1} =>
            val ${termVar2} = _root_.net.scalax.asuna.core.DMHelper.compile(${termVar1})
            ${termVar2}.andThen { case ${termVar3} =>
              ..${hlistFromPros(useFieldNames ::: iCaseFieldNames, termVar3)}
              ${weakTypeOf[Case].typeSymbol.companion}(..${(useFieldNames ::: iCaseFieldNames).map(fName => q"""${TermName(fName)} = ${TermName(fName)}""")})
            }.compose($compose).changeSub { case ${termVar5} =>
              ..${hlistFromPros(subFieldNames, termVar5)}
              ${weakTypeOf[SubCase].typeSymbol.companion}(..${subFieldNames.map(fName => q"""${TermName(fName)} = ${TermName(fName)}""")})
            }
          }"""
      }

      val q = c.Expr[Table => DataShapeValue[DataModel[ICase, Case, SubCase], Abs]] {
        val repModelTermName = c.freshName
        q"""
          { (${TermName(repModelTermName)}: ${weakTypeOf[Table].typeSymbol}) =>
            object CaseClassGenImpl extends _root_.net.scalax.asuna.shape.ShapeHelper with _root_.net.scalax.asuna.shape.HListShapeHelper {
            ..${confireCaseClassFields}
              ..${fieldConfirmAction(modelName = TermName(repModelTermName))}
              ..${ioFieldsGen}
              ${mgDef}
              ..${useFieldNames.map { fieldName => proUseInShape(fieldName = fieldName, modelName = TermName(repModelTermName), absName = weakTypeOf[Abs], isOutPutSub = subCaseFieldNames.contains(fieldName)) }}
              ${toShape}
            }
           CaseClassGenImpl.aa
          }
        """
      }
      //println(q)
      q
    }

  }

}