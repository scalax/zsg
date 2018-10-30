package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.core.decoder.DecoderShape

import scala.annotation.implicitNotFound

trait DecoderDebugShape[Rep, Data, RepCol, DataCol] {
  type Target
  def shape: DecoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
}

object DecoderDebugShape {

  @implicitNotFound(
      msg = "DecoderShape not found in this property.\nRepType: ${Rep}\nDataType: ${Data}\nTargetType: ${T}\nRepCol: ${RepCol}\nDataCol: ${DataCol}\n" +
      "If RepType is some of CaseClassRepMapper?, replace i?(context) to rep?.selfInfo and continue debug.\n" +
      "If not, define context.mappingSingleModel or context.mappingLazyModel to find the implicit not found column."
  )
  type Aux[Rep, Data, T, RepCol, DataCol] = DecoderDebugShape[Rep, Data, RepCol, DataCol] { type Target = T }

  implicit def decoderDebugShapeImplicit[Rep, Data, Target, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[Rep, Data, Target, RepCol, DataCol]
  ): DecoderDebugShape.Aux[Rep, Data, Target, RepCol, DataCol] = {
    type Target1 = Target
    val shape1 = shape
    new DecoderDebugShape[Rep, Data, RepCol, DataCol] {
      override type Target = Target1
      override def shape = shape1
    }
  }

}
