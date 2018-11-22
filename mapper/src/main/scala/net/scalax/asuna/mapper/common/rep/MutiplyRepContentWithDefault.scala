package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.formatter.FormatterShape

trait MutiplyRepContentWithDefault[+Rep, Data] extends MutiplyRepContent[Rep, Data] with RepContentWithDefault[Rep, Data] {
  override def rep: Rep
  override def mutiplyModelName: List[String]
  override def defaultValue: Data
}

object MutiplyRepContentWithDefault {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[MutiplyRepContentWithDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new DecoderShape[MutiplyRepContentWithDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => MutiplyRepContentWithDefault[D, T]): M   = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                 = shape1.buildRep(base, oldRep)
      override def takeData(rep: M, oldData: DataCol): SplitData[T, DataCol] = shape1.takeData(rep, oldData)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[MutiplyRepContentWithDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new EncoderShape[MutiplyRepContentWithDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => MutiplyRepContentWithDefault[D, T]): M = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol               = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol   = shape1.buildData(data, rep, oldData)
    }
  }

  implicit def shapeFuncImplicit3333[D, T, M, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[D, T, M, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[MutiplyRepContentWithDefault[D, T], T, M, RepCol, EncoderDataCol, DecoderDataCol] = {
    val shape1 = shape
    new FormatterShape[MutiplyRepContentWithDefault[D, T], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => MutiplyRepContentWithDefault[D, T]): M                 = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                               = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: EncoderDataCol): EncoderDataCol     = shape1.buildData(data, rep, oldData)
      override def takeData(rep: M, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = shape1.takeData(rep, oldData)
    }
  }
}
