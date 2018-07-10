package net.scalax.asuna.hepler

import net.scalax.asuna.core.common.DelayTag
import net.scalax.asuna.core.decoder._

trait DataShapeValueHelper[D] {
  def wrap[A, B, C](rep: A)(implicit shape: DecoderShape[A, B, C, D]): C = {
    shape.wrapRep(rep)
  }
  def shaped[A, B, C](rep: A)(implicit shape: DecoderShape[A, B, C, D]): DecoderShapeValue[B, D] = {
    val shape1 = shape
    val rep1 = rep
    new DecoderShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }
}

trait DelayTagHelper[CommonCol] {
  def delay[Data]: DelayTag[Data, CommonCol] = {
    new DelayTag[Data, CommonCol] {}
  }
}

trait DateModelHelper[Abs] {

  def toOutput[A, B, C](rep: A)(implicit shape: DecoderShape[A, B, C, Abs]): DecoderShapeValue[OutputData[B], Abs] = {
    val rep1 = rep
    val shape1 = shape
    val sv = new DecoderShapeValue[B, Abs] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
    sv.dmap(s => OutputData.lift(s))
  }

  def toSubOnly[A, B, C](rep: A)(implicit shape: DecoderShape[A, B, C, Abs]): DecoderShapeValue[SubOnly[B], Abs] = {
    val rep1 = rep
    val shape1 = shape
    val sv = new DecoderShapeValue[B, Abs] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
    sv.dmap(s => SubOnly.lift(s))
  }

  def toSub[A, B, C](rep: A)(implicit shape: DecoderShape[A, B, C, Abs]): DecoderShapeValue[OutputSubData[B, B], Abs] = {
    val rep1 = rep
    val shape1 = shape
    val sv = new DecoderShapeValue[B, Abs] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
    sv.dmap(s => OutputSubData.simpleLift(s))
  }

}