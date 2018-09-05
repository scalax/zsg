package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape
import shapeless._

trait HListEncoderShapeImplicit {

  implicit def hlistEncoderImplicit1[RepCol, DataCol]: EncoderShape.Aux[HNil, HNil, HNil, RepCol, DataCol] = {
    new EncoderShape[HNil, HNil, RepCol, DataCol] {
      override type Target = HNil
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil, oldRep: RepCol): RepCol = oldRep
      override def buildData(data: HNil, rep: HNil, oldData: DataCol): DataCol = oldData
    }
  }

  implicit def hlistEncoderImplicit2[A, B <: HList, H, I <: HList, M, N <: HList, RepCol, DataCol](implicit head: Lazy[EncoderShape.Aux[A, H, M, RepCol, DataCol]], tail: Lazy[EncoderShape.Aux[B, I, N, RepCol, DataCol]]): EncoderShape.Aux[A :: B, H :: I, M :: N, RepCol, DataCol] = {

    new EncoderShape[A :: B, H :: I, RepCol, DataCol] {
      self =>

      override type Target = M :: N

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.value.wrapRep(headRep) :: tail.value.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N, oldRep: RepCol): RepCol = {
        val headRep :: tailRep = base
        val tailReps = tail.value.toLawRep(tailRep, oldRep)
        head.value.toLawRep(headRep, tailReps)
      }

      override def buildData(data: H :: I, rep: M :: N, oldData: DataCol): DataCol = {
        val h :: i = data
        val m :: n = rep
        val tailData = tail.value.buildData(i, n, oldData)
        head.value.buildData(h, m, tailData)
      }

    }

  }

}