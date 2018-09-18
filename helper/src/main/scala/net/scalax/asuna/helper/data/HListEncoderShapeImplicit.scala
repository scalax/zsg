package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo

trait HListEncoderShapeWrap[Rep, Data] {

  val rep: Rep
  val columnInfo: MacroColumnInfo

}

object HListEncoderShapeWrap {
  implicit def shapeFuncImplicit1111[D, T, M, RepCol, DataCol](
      implicit shape: DecoderShape.Aux[D, T, M, RepCol, DataCol]
  ): DecoderShape.Aux[HListEncoderShapeWrap[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new DecoderShape[HListEncoderShapeWrap[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: HListEncoderShapeWrap[D, T]): M             = shape1.wrapRep(base.rep)
      override def toLawRep(base: M, oldRep: RepCol): RepCol                 = shape1.toLawRep(base, oldRep)
      override def takeData(oldData: M, rep: DataCol): SplitData[T, DataCol] = shape1.takeData(oldData, rep)
    }
  }

  implicit def shapeFuncImplicit2222[D, T, M, RepCol, DataCol](
      implicit shape: EncoderShape.Aux[D, T, M, RepCol, DataCol]
  ): EncoderShape.Aux[HListEncoderShapeWrap[D, T], T, M, RepCol, DataCol] = {
    implicit val shape1 = shape
    new EncoderShape[HListEncoderShapeWrap[D, T], RepCol, DataCol] {
      override type Target = M
      override type Data   = T
      override def wrapRep(base: HListEncoderShapeWrap[D, T]): M         = shape1.wrapRep(base.rep)
      override def toLawRep(base: M, oldRep: RepCol): RepCol             = shape1.toLawRep(base, oldRep)
      override def buildData(data: T, rep: M, oldData: DataCol): DataCol = shape1.buildData(data, rep, oldData)
    }
  }
}
