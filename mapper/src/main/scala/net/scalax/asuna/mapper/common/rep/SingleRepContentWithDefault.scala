package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.formatter.FormatterShape

import scala.language.implicitConversions

trait SingleRepContentWithDefault[+Rep, Data] extends SingleRepContent[Rep, Data] with RepContentWithDefault[Rep, Data] {
  override def rep: Rep
  override def singleModelName: String
  override def defaultValue: Data
}

object SingleRepContentWithDefault {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[SingleRepContentWithDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new DecoderShape[SingleRepContentWithDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => SingleRepContentWithDefault[D, T]): M    = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                 = shape1.buildRep(base, oldRep)
      override def takeData(rep: M, oldData: DataCol): SplitData[T, DataCol] = shape1.takeData(rep, oldData)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[SingleRepContentWithDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new EncoderShape[SingleRepContentWithDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => SingleRepContentWithDefault[D, T]): M = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol              = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol  = shape1.buildData(data, rep, oldData)
    }
  }

  implicit def shapeFuncImplicit3333[D, T, M, RepCol, EncoderDataCol, DecoderDataCol](
      shape: FormatterShape.Aux[D, T, M, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[SingleRepContentWithDefault[D, T], T, M, RepCol, EncoderDataCol, DecoderDataCol] = {
    val shape1 = shape
    new FormatterShape[SingleRepContentWithDefault[D, T], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => SingleRepContentWithDefault[D, T]): M                  = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                               = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: EncoderDataCol): EncoderDataCol     = shape1.buildData(data, rep, oldData)
      override def takeData(rep: M, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = shape1.takeData(rep, oldData)
    }
  }
}
