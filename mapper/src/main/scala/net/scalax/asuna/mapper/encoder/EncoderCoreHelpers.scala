package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}

trait EncoderDataShapeValueHelper[RepCol, DataCol] {

  def wrap[A, B, C](rep: A)(implicit shape: EncoderShape.Aux[A, B, C, RepCol, DataCol]): C = {
    shape.wrapRep(rep)
  }

  def shaped[A, B, C](rep: A)(implicit shape: EncoderShape.Aux[A, B, C, RepCol, DataCol]): EncoderShapeValue[B, RepCol, DataCol] = {
    val shape1 = shape
    val rep1   = rep
    new EncoderShapeValue[B, RepCol, DataCol] {
      override type RepType = C
      override val rep   = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

}
