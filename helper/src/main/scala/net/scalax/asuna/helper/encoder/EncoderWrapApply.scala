package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import net.scalax.asuna.helper.data.macroImpl._

trait EncoderWrapApply[RepCol, DataCol] {
  def withCase[Table, Case]: CaseWrap[Table, Case] = new CaseWrap[Table, Case] {}
  trait CaseWrap[Table, Case] {

    def compile[Rep, TempData](
        implicit repWrap: InputTable[Table, EncoderDataGen.Aux[Case, Rep, TempData]]
    ): EncoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] =
      new EncoderInputTable[Table, Rep, TempData, RepCol, DataCol, Case] {
        override def inputTable[Target1](
            table: Table
        )(implicit shape: EncoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]): EncoderShapeValue[Case, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new EncoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.emap { (content: Case) =>
            wrap.to(content, wrap.rep)
          }
        }
      }

  }
}

object EncoderWrapApply {
  def encoderInstance[RepCol, DataCol]: EncoderWrapApply[RepCol, DataCol] = new EncoderWrapApply[RepCol, DataCol] {}
}
