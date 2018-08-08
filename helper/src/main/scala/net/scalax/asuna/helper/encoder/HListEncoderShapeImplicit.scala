package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.EncoderShape
import shapeless.{ ::, HList, HNil }

trait HListEncoderShapeImplicit {

  implicit def hlistEncoderImplicit1[T]: EncoderShape[HNil, HNil, HNil, T] = {
    new EncoderShape[HNil, HNil, HNil, T] {
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil, oldRep: List[T]): List[T] = oldRep
      override def buildData(data: HNil, rep: HNil, oldData: List[Any]): List[Any] = oldData
    }
  }

  implicit def hlistEncoderImplicit2[A, B <: HList, H, I <: HList, M, N <: HList, J](implicit head: EncoderShape[A, H, M, J], tail: EncoderShape[B, I, N, J]): EncoderShape[A :: B, H :: I, M :: N, J] = {

    new EncoderShape[A :: B, H :: I, M :: N, J] {
      self =>

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.wrapRep(headRep) :: tail.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N, oldRep: List[J]): List[J] = {
        val headRep :: tailRep = base
        val tailReps = tail.toLawRep(tailRep, oldRep)
        head.toLawRep(headRep, tailReps)
        //DataRepGroup(reps = headGroup.reps ::: tailGroup.reps)
      }

      override def buildData(data: H :: I, rep: M :: N, oldData: List[Any]): List[Any] = {
        val h :: i = data
        val m :: n = rep
        val tailData = tail.buildData(i, n, oldData)
        head.buildData(h, m, tailData)
      }

    }

  }

}