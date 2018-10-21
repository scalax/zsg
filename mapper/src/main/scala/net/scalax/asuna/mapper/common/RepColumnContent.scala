package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.formatter.FormatterShape

trait RepColumnContent[+Rep, Data] {

  val rep: Rep
  val columnInfo: MacroColumnInfo

}

object RepColumnContent {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[RepColumnContent[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new DecoderShape[RepColumnContent[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: RepColumnContent[D, T]): M                  = shape1.wrapRep(base.rep)
      override def toLawRep(base: M, oldRep: RepCol): RepCol                 = shape1.toLawRep(base, oldRep)
      override def takeData(rep: M, oldData: DataCol): SplitData[T, DataCol] = shape1.takeData(rep, oldData)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[RepColumnContent[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new EncoderShape[RepColumnContent[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: RepColumnContent[D, T]): M              = shape1.wrapRep(base.rep)
      override def toLawRep(base: M, oldRep: RepCol): RepCol             = shape1.toLawRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol = shape1.buildData(data, rep, oldData)
    }
  }

  implicit def shapeFuncImplicit3333[D, T, M, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[D, T, M, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[RepColumnContent[D, T], T, M, RepCol, EncoderDataCol, DecoderDataCol] = {
    implicit val shape1 = shape
    new FormatterShape[RepColumnContent[D, T], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: RepColumnContent[D, T]): M                                = shape1.wrapRep(base.rep)
      override def toLawRep(base: M, oldRep: RepCol): RepCol                               = shape1.toLawRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: EncoderDataCol): EncoderDataCol     = shape1.buildData(data, rep, oldData)
      override def takeData(rep: M, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = shape1.takeData(rep, oldData)
    }
  }
}
