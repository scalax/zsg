package net.scalax.asuna.mapper.encoder

import net.scalax.asuna.core.decoder.SplitData
import net.scalax.asuna.core.formatter.FormatterShape
import shapeless._

trait HListFormatterRepShapeHelper {

  implicit def hlistFormatterImplicit1[RepCol, EncoderDataCol, DecoderDataCol]: FormatterShape.Aux[HNil, HNil, HNil, RepCol, EncoderDataCol, DecoderDataCol] = {
    new FormatterShape[HNil, RepCol, EncoderDataCol, DecoderDataCol] {
      override type Target = HNil
      override type Data   = HNil
      override def wrapRep(base: HNil): HNil                                                     = base
      override def toLawRep(base: HNil, oldRep: RepCol): RepCol                                  = oldRep
      override def buildData(data: HNil, rep: HNil, oldData: EncoderDataCol): EncoderDataCol     = oldData
      override def takeData(rep: HNil, oldData: DecoderDataCol): SplitData[HNil, DecoderDataCol] = SplitData(HNil, oldData)
    }
  }

  implicit def hlistFormatterImplicit2[A, B <: HList, H, I <: HList, M, N <: HList, RepCol, EncoderDataCol, DecoderDataCol](
      implicit head: Lazy[FormatterShape.Aux[A, H, M, RepCol, EncoderDataCol, DecoderDataCol]]
    , tail: Lazy[FormatterShape.Aux[B, I, N, RepCol, EncoderDataCol, DecoderDataCol]]
  ): FormatterShape.Aux[A :: B, H :: I, M :: N, RepCol, EncoderDataCol, DecoderDataCol] = {

    new FormatterShape[A :: B, RepCol, EncoderDataCol, DecoderDataCol] {
      self =>

      override type Target = M :: N
      override type Data   = H :: I

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.value.wrapRep(headRep) :: tail.value.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N, oldRep: RepCol): RepCol = {
        val headRep :: tailRep = base
        val tailReps           = tail.value.toLawRep(tailRep, oldRep)
        head.value.toLawRep(headRep, tailReps)
      }

      override def buildData(data: H :: I, rep: M :: N, oldData: EncoderDataCol): EncoderDataCol = {
        val h :: i   = data
        val m :: n   = rep
        val tailData = tail.value.buildData(i, n, oldData)
        head.value.buildData(h, m, tailData)
      }

      override def takeData(rep: M :: N, oldData: DecoderDataCol): SplitData[H :: I, DecoderDataCol] = {
        val headRep :: tailRep = rep
        val newData1           = head.value.takeData(headRep, oldData)
        val newData2           = tail.value.takeData(tailRep, newData1.left)
        SplitData(newData1.current :: newData2.current, newData2.left)
      }

    }

  }

}
