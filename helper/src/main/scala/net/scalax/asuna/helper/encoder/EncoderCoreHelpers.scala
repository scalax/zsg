package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }

trait EncoderDataShapeValueHelper[D] {

  def wrap[A, B, C](rep: A)(implicit shape: EncoderShape[A, B, C, D]): C = {
    shape.wrapRep(rep)
  }

  def shaped[A, B, C](rep: A)(implicit shape: EncoderShape[A, B, C, D]): EncoderShapeValue[B, D] = {
    val shape1 = shape
    val rep1 = rep
    new EncoderShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

}