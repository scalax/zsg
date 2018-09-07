package net.scalax.asuna.helper.decoder

import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }
import shapeless.{ ::, HList, HNil, Lazy }

trait HListDecoderShapeImplicit {

  implicit def hlistDecoderImplicit1[RepCol, DataCol]: DecoderShape.Aux[HNil, HNil, HNil, RepCol, DataCol] = {
    new DecoderShape[HNil, HNil, RepCol, DataCol] {
      self =>
      override type Target = HNil
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil, oldRep: RepCol): RepCol = oldRep
      override def takeData(rep: HNil, oldData: DataCol): SplitData[HNil, DataCol] = SplitData(current = HNil, left = oldData)
    }
  }

  implicit def hlistDecoderImplicit2[A, B <: HList, H, I <: HList, M, N <: HList, RepCol, DataCol](implicit head: Lazy[DecoderShape.Aux[A, H, M, RepCol, DataCol]], tail: Lazy[DecoderShape.Aux[B, I, N, RepCol, DataCol]]): DecoderShape.Aux[A :: B, H :: I, M :: N, RepCol, DataCol] = {

    new DecoderShape[A :: B, H :: I, RepCol, DataCol] {
      self =>

      override type Target = M :: N

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.value.wrapRep(headRep) :: tail.value.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N, repCol: RepCol): RepCol = {
        val headRep :: tailRep = base
        /*val repCol1 = head.toLawRep(headRep, repCol)
        tail.toLawRep(tailRep, repCol1)*/
        val repCol1 = tail.value.toLawRep(tailRep, repCol)
        head.value.toLawRep(headRep, repCol1)
      }

      override def takeData(rep: M :: N, oldData: DataCol): SplitData[H :: I, DataCol] = {
        val headRep :: tailRep = rep
        val newData1 = head.value.takeData(headRep, oldData)
        val newData2 = tail.value.takeData(tailRep, newData1.left)
        SplitData(newData1.current :: newData2.current, newData2.left)
      }

    }

  }

}