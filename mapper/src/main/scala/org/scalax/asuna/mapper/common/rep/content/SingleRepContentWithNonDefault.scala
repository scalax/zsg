package org.scalax.asuna.mapper.common

import org.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import org.scalax.asuna.core.encoder.EncoderShape
import org.scalax.asuna.core.formatter.FormatterShape
import org.scalax.asuna.mapper.Placeholder

import scala.language.implicitConversions

trait SingleRepContentWithNonDefault[+Rep, Data] extends Any with SingleRepContent[Rep, Data] with RepContentWithNonDefault[Rep, Data] {
  override def rep: Rep
  override def singleModelName: String
}

object SingleRepContentWithNonDefault {

  class PlaceholderSingleRepContentWithNonDefault[Data](override val singleModelName: String)
      extends AnyVal
      with SingleRepContentWithNonDefault[Placeholder, Data] {
    override def rep: Placeholder = Placeholder.value
  }

  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[SingleRepContentWithNonDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new DecoderShape[SingleRepContentWithNonDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => SingleRepContentWithNonDefault[D, T]): M = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                 = shape1.buildRep(base, oldRep)
      override def takeData(rep: M, oldData: DataCol): SplitData[T, DataCol] = shape1.takeData(rep, oldData)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[SingleRepContentWithNonDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new EncoderShape[SingleRepContentWithNonDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => SingleRepContentWithNonDefault[D, T]): M = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                 = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol     = shape1.buildData(data, rep, oldData)
    }
  }

  implicit def shapeFuncImplicit3333[D, T, M, RepCol, EncoderDataCol, DecoderDataCol](
      shape: FormatterShape.Aux[D, T, M, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[SingleRepContentWithNonDefault[D, T], T, M, RepCol, EncoderDataCol, DecoderDataCol] = {
    val shape1 = shape
    new FormatterShape[SingleRepContentWithNonDefault[D, T], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => SingleRepContentWithNonDefault[D, T]): M               = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                               = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: EncoderDataCol): EncoderDataCol     = shape1.buildData(data, rep, oldData)
      override def takeData(rep: M, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = shape1.takeData(rep, oldData)
    }
  }
}
