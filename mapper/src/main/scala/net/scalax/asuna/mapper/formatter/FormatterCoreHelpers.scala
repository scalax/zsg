package net.scalax.asuna.mapper.formatter

import net.scalax.asuna.core.formatter.{FormatterShape, FormatterShapeValue}

trait FormatterDataShapeValueHelper[RepCol, EncoderDataCol, DecoderDataCol] {

  def wrap[A, B, C](rep: A)(implicit shape: FormatterShape.Aux[A, B, C, RepCol, EncoderDataCol, DecoderDataCol]): C = {
    shape.wrapRep(rep)
  }

  def shaped[A, B, C](
      rep: A
  )(implicit shape: FormatterShape.Aux[A, B, C, RepCol, EncoderDataCol, DecoderDataCol]): FormatterShapeValue[B, RepCol, EncoderDataCol, DecoderDataCol] = {
    val shape1 = shape
    val rep1   = rep
    new FormatterShapeValue[B, RepCol, EncoderDataCol, DecoderDataCol] {
      override type RepType = C
      override val rep   = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

}
