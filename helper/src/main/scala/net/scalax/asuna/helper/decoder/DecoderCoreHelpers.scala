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
  /*def shapedList[A, B, C](rep: List[A])(implicit shape: EncoderShape.Aux[A, B, C, RepCol, DataCol]): EncoderShapeValue[List[B], RepCol, DataCol] = {
    val shape1 = shape
    val rep1 = rep
    new EncoderShapeValue[List[B], RepCol, DataCol] {
      override type RepType = List[C]
      override val rep = rep1.map(r => shape1.wrapRep(r))
      override val shape = EncoderShape.listDateShapeExt(shape1.packed)
    }
  }

  def listAny(reps: List[EncoderShapeValue[Any, RepCol, DataCol]]): EncoderShapeValue[List[Any], RepCol, DataCol] = {
    new EncoderShapeValue[List[Any], RepCol, DataCol] {
      override type RepType = List[EncoderShapeValue[Any, RepCol, DataCol]]
      override val rep = reps
      override val shape = EncoderShape.listDateShapeExt(implicitly[EncoderShape.Aux[EncoderShapeValue[Any, RepCol, DataCol], Any, EncoderShapeValue[Any, RepCol, DataCol], RepCol, DataCol]])
    }
  }*/
}