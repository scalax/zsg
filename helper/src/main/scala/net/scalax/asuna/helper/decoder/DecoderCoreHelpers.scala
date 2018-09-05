package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }

trait DecoderCoreHelpers[RepCol, DataCol] {

  def wrap[A, B, C](rep: A)(implicit shape: DecoderShape.Aux[A, B, C, RepCol, DataCol]): C = {
    shape.wrapRep(rep)
  }

  def shaped[A, B, C](rep: A)(implicit shape: DecoderShape.Aux[A, B, C, RepCol, DataCol]): DecoderShapeValue[B, RepCol, DataCol] = {
    val shape1 = shape
    val rep1 = rep
    new DecoderShapeValue[B, RepCol, DataCol] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

}