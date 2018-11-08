package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.core.formatter.FormatterShape

abstract sealed trait RepColumnContent[+Rep, Data] {

  def rep: Rep
  def columnInfo: MacroColumnInfo
  def defaultValue: Option[Data]

}

trait SingleRepContent[+Rep, Data] extends RepColumnContent[Rep, Data] {

  override def rep: Rep
  override def columnInfo: SingleColumnInfo
  override def defaultValue: Option[Data]

}

object SingleRepContent {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[SingleRepContent[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new DecoderShape[SingleRepContent[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: SingleRepContent[D, T]): M                  = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                 = shape1.buildRep(base, oldRep)
      override def takeData(rep: M, oldData: DataCol): SplitData[T, DataCol] = shape1.takeData(rep, oldData)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[SingleRepContent[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new EncoderShape[SingleRepContent[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: SingleRepContent[D, T]): M              = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol             = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol = shape1.buildData(data, rep, oldData)
    }
  }

  implicit def shapeFuncImplicit3333[D, T, M, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[D, T, M, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[SingleRepContent[D, T], T, M, RepCol, EncoderDataCol, DecoderDataCol] = {
    implicit val shape1 = shape
    new FormatterShape[SingleRepContent[D, T], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: SingleRepContent[D, T]): M                                = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                               = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: EncoderDataCol): EncoderDataCol     = shape1.buildData(data, rep, oldData)
      override def takeData(rep: M, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = shape1.takeData(rep, oldData)
    }
  }
}

trait MutiplyRepContent[+Rep, Data] extends RepColumnContent[Rep, Data] {

  override def rep: Rep
  override def columnInfo: MutiplyColumnInfo
  override def defaultValue: Option[Data]

}

object MutiplyRepContent {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[MutiplyRepContent[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new DecoderShape[MutiplyRepContent[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: MutiplyRepContent[D, T]): M                 = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                 = shape1.buildRep(base, oldRep)
      override def takeData(rep: M, oldData: DataCol): SplitData[T, DataCol] = shape1.takeData(rep, oldData)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[MutiplyRepContent[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new EncoderShape[MutiplyRepContent[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: MutiplyRepContent[D, T]): M             = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol             = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol = shape1.buildData(data, rep, oldData)
    }
  }

  implicit def shapeFuncImplicit3333[D, T, M, RepCol, EncoderDataCol, DecoderDataCol](
      implicit shape: FormatterShape.Aux[D, T, M, RepCol, EncoderDataCol, DecoderDataCol]
  ): FormatterShape.Aux[MutiplyRepContent[D, T], T, M, RepCol, EncoderDataCol, DecoderDataCol] = {
    implicit val shape1 = shape
    new FormatterShape[MutiplyRepContent[D, T], RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: MutiplyRepContent[D, T]): M                               = shape1.wrapRep(base.rep)
      override def buildRep(base: M, oldRep: RepCol): RepCol                               = shape1.buildRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: EncoderDataCol): EncoderDataCol     = shape1.buildData(data, rep, oldData)
      override def takeData(rep: M, oldData: DecoderDataCol): SplitData[T, DecoderDataCol] = shape1.takeData(rep, oldData)
    }
  }
}
