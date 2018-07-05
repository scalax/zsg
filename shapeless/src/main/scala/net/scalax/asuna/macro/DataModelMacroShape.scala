package net.scalax.asuna.core.macroImpl

import net.scalax.asuna.core._

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros
import scala.language.higherKinds

object DataModelMacroShape {

  class DataModelMacroShapeImpl(override val c: Context) extends MacroUtils.MacroUtilImpl {
    self =>

    import c.universe._

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
           lazy val ${TermName(field)} = mg(s => s.${TermName(field)}).toIO[${weakTypeOf[Abs].typeSymbol}]
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
          lazy val aa = _root_.net.scalax.asuna.core.DataShapeValue.toShapeValue[${weakTypeOf[Abs]}].sv(
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
            object CaseClassGenImpl extends _root_.net.scalax.asuna.shape.ShapeHelper with _root_.net.scalax.asuna.shape.HListShapeHelper with _root_.net.scalax.asuna.shape.DataAtomicShapeHelper {
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