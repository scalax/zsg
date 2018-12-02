package org.scalax.asuna.mapper.common

import org.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import org.scalax.asuna.core.encoder.EncoderShape
import org.scalax.asuna.core.formatter.FormatterShape

trait MutiplyRepContentWithNonDefault[+Rep, Data] extends Any with MutiplyRepContent[Rep, Data] with RepContentWithNonDefault[Rep, Data] {
  override def rep: Rep
  override def mutiplyModelName: List[String]
}

object MutiplyRepContentWithNonDefault {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[MutiplyRepContentWithNonDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new DecoderShape[MutiplyRepContentWithNonDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => MutiplyRepContentWithNonDefault[D, T]): M = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                  = shape1.buildRep(base, oldRep)
      override def takeData(rep: M, oldData: DataCol): SplitData[T, DataCol]  = shape1.takeData(rep, oldData)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[MutiplyRepContentWithNonDefault[D, T], T, M, RepCol, DataCol] = {
    val shape1 = shape
    new EncoderShape[MutiplyRepContentWithNonDefault[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => MutiplyRepContentWithNonDefault[D, T]): M = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                  = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol      = shape1.buildData(data, rep, oldData)
    }
  }

  implicit def shapeFuncImplicit3333[D, T, M, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[D, T, M, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[MutiplyRepContentWithNonDefault[D, T], T, M, RepCol, EncoderDataCol, DecoderDataCol] = {
    val shape1 = shape
    new FormatterShape[MutiplyRepContentWithNonDefault[D, T], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: => MutiplyRepContentWithNonDefault[D, T]): M              = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                               = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: EncoderDataCol): EncoderDataCol     = shape1.buildData(data, rep, oldData)
      override def takeData(rep: M, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = shape1.takeData(rep, oldData)
    }
  }
}
