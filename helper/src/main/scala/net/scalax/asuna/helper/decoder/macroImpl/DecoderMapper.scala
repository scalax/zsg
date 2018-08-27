package net.scalax.asuna.helper.decoder.macroImpl

import java.util.UUID

import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import net.scalax.asuna.helper.MacroColumnInfoImpl
import net.scalax.asuna.helper.encoder.{ CaseDecoderRepWrap, EncoderWitCol }
import shapeless.Generic

import scala.reflect.macros.whitebox.Context
import scala.language.higherKinds

trait PropertyType[Pro] {
  def convertData(f: Any): Pro = f.asInstanceOf[Pro]
  def toPlaceholder: Placeholder[Pro] = Placeholder.value[Pro]
}

trait ModelGen[Model] {
  def apply[Pro](f: Model => Pro): PropertyType[Pro] = new PropertyType[Pro] {}
}

object ModelGen {
  def value[Model]: ModelGen[Model] = new ModelGen[Model] {}
}

trait PropertyFunAbs[RepCol, DataCol] {
  self =>

  type Rep
  type Data
  type Out
  val rep: Rep
  val shape: DecoderShape.Aux[Rep, Data, Out, RepCol, DataCol]
  def sv: DecoderShapeValue[Data, RepCol, DataCol] = new DecoderShapeValue[Data, RepCol, DataCol] {
    override type RepType = self.Out
    override val rep: self.Out = self.shape.wrapRep(self.rep)
    override val shape: DecoderShape.Aux[self.Out, Data, self.Out, RepCol, DataCol] = self.shape.packed
  }
}

trait PropertyFun[R, D, O, RepCol, DataCol] extends PropertyFunAbs[RepCol, DataCol] {
  override type Rep = R
  override type Data = D
  override type Out = O
}

trait ProGen[A, B, C, PL, RepCol, DataCol] {
  protected def innperPro: PropertyFun[A, B, C, RepCol, DataCol]
  def unwrap(implicit pl: PL): PropertyFun[A, B, C, RepCol, DataCol] = innperPro
}

trait PropertyDataShapeUnwrap[R[_, _, _], Source, Table, Abs] {
  def unwrap(implicit cv: R[Source, Table, Abs]): R[Source, Table, Abs] = cv
}

object DecoderMapper {

  class DecoderMapperImpl(val c: Context) {
    self =>

    import c.universe._

    case class FieldNames(law: String, shapeValueName: String)

    def commonProUseInShape[RepCol: c.WeakTypeTag, DataCol: c.WeakTypeTag, Table: c.WeakTypeTag, Model: c.WeakTypeTag](mgVar: String, encoderWitColVar: String, fieldName: FieldNames, modelName: TermName, isMissingField: Boolean) = {

      val columnInfoImpl = weakTypeOf[MacroColumnInfoImpl]

      val q = q"""
        val ${TermName(fieldName.shapeValueName)} = {
            ${
        if (isMissingField) {
          q"""
             ${TermName(encoderWitColVar)}.toWrap(${TermName(mgVar)}(_.${TermName(fieldName.law)}).toPlaceholder, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
                         tableColumnName = ${Literal(Constant(fieldName.law))},
                         modelColumnName = ${Literal(Constant(fieldName.law))}
                       ))
           """
        } else {
          q"""
             ${TermName(encoderWitColVar)}.toWrap(${modelName}.${TermName(fieldName.law)}, ${TermName(mgVar)}(_.${TermName(fieldName.law)}), ${columnInfoImpl.typeSymbol.companion}(
                         tableColumnName = ${Literal(Constant(fieldName.law))},
                         modelColumnName = ${Literal(Constant(fieldName.law))}
                       ))
           """
        }
      }
        }
    """
      q
    }

    def impl[Table: c.WeakTypeTag, Case: c.WeakTypeTag, Target: c.WeakTypeTag, HListData: c.WeakTypeTag, RepCol: c.WeakTypeTag, DataCol: c.WeakTypeTag](genImplicit: c.Expr[Generic.Aux[Case, HListData]]): c.Expr[CaseDecoderRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol]] = {
      val caseClass = weakTypeOf[Case]
      val table = weakTypeOf[Table]
      val repCol = weakTypeOf[RepCol]
      val dataCol = weakTypeOf[DataCol]
      val modelGen = weakTypeOf[ModelGen[Case]]
      val encoderWitColType = weakTypeOf[EncoderWitCol[RepCol, DataCol]]

      val mgVar = "mg" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")
      val encoderWitColVar = "encoderWitCol" + UUID.randomUUID.toString.replaceAllLiterally("-", "a")

      val modelFieldNames = caseClass.members.filter { s => s.isTerm && s.asTerm.isCaseAccessor && s.asTerm.isVal }.map(_.name).collect { case TermName(n) => n.trim }.toList.map(s => FieldNames(law = s, shapeValueName = s + UUID.randomUUID.toString.replaceAllLiterally("-", "a"))).reverse
      val fieldNamesInTable = table.members.filter { s => s.isTerm && (s.asTerm.isVal || s.asTerm.isVar || s.asTerm.isMethod) }.map(_.name).collect { case TermName(n) => n.trim }.toList
      val misFieldsInTable = modelFieldNames.filter(n => !fieldNamesInTable.contains(n.law))

      def mgDef = List(
        q"""
        val ${TermName(mgVar)}: $modelGen = ${modelGen.typeSymbol.companion}.value[$caseClass]
        """,
        q"""
        val ${TermName(encoderWitColVar)}: $encoderWitColType = ${encoderWitColType.typeSymbol.companion}.value[$repCol, $dataCol]
        """)

      def toShape1111(namePare: List[FieldNames]) = {
        val proNames = namePare
        val termVar1 = c.freshName("termVar1")

        val toListTree = proNames.foldRight(q"""_root_.shapeless.HNil""": Tree) { (name, tree) =>
          q"""${TermName(name.shapeValueName)} :: $tree"""
        }
        val func = q"""
        { (${TermName(termVar1)}: $table) =>
                                ..${modelFieldNames.map { proName => commonProUseInShape[RepCol, DataCol, Table, Case](mgVar = mgVar, encoderWitColVar = encoderWitColVar, fieldName = proName, modelName = TermName(termVar1), isMissingField = misFieldsInTable.contains(proName)) }}

          $toListTree
        }
        """
        func
      }

      val q = c.Expr[CaseDecoderRepWrap.Aux[Table, Case, Target, HListData, RepCol, DataCol]] {
        val aa = weakTypeOf[CaseDecoderRepWrap[Table, Case, RepCol, DataCol]]
        q"""
           {
           ..$mgDef
           ${aa.typeSymbol.companion}.value[$repCol, $dataCol].withFunc(${toShape1111(modelFieldNames)}, ${TermName(mgVar)}, $genImplicit)
            }
        """
      }
      println(q + "\n" + "22" * 100)
      q
    }

  }

}