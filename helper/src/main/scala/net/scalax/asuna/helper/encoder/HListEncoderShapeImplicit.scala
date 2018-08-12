package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape
import shapeless.{ ::, HList, HNil }

trait HListEncoderShapeImplicit {

  implicit def hlistEncoderImplicit1[RepCol, DataCol]: EncoderShape[HNil, HNil, HNil, RepCol, DataCol] = {
    new EncoderShape[HNil, HNil, HNil, RepCol, DataCol] {
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil, oldRep: RepCol): RepCol = oldRep
      override def buildData(data: HNil, rep: HNil, oldData: DataCol): DataCol = oldData
    }
  }

  implicit def hlistEncoderImplicit2[A, B <: HList, H, I <: HList, M, N <: HList, RepCol, DataCol](implicit head: EncoderShape[A, H, M, RepCol, DataCol], tail: EncoderShape[B, I, N, RepCol, DataCol]): EncoderShape[A :: B, H :: I, M :: N, RepCol, DataCol] = {

    new EncoderShape[A :: B, H :: I, M :: N, RepCol, DataCol] {
      self =>

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.wrapRep(headRep) :: tail.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N, oldRep: RepCol): RepCol = {
        val headRep :: tailRep = base
        val tailReps = tail.toLawRep(tailRep, oldRep)
        head.toLawRep(headRep, tailReps)
        //DataRepGroup(reps = headGroup.reps ::: tailGroup.reps)
      }

      override def buildData(data: H :: I, rep: M :: N, oldData: DataCol): DataCol = {
        val h :: i = data
        val m :: n = rep
        val tailData = tail.buildData(i, n, oldData)
        head.buildData(h, m, tailData)
      }

    }

  }

}