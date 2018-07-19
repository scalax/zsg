package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import net.scalax.asuna.core.encoder.EncoderShape
import shapeless.{ ::, HList, HNil }

trait HListEncoderShapeImplicit1111 {

  implicit def hlistEncoderImplicit1[T]: EncoderShape[HNil, HNil, HNil, T] = {
    new EncoderShape[HNil, HNil, HNil, T] {
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil): DataRepGroup[T] = DataRepGroup[T](List.empty)
      override def buildData(data: HNil, rep: HNil): DataGroup = DataGroup(List.empty)
    }
  }

  implicit def hlistEncoderImplicit2[A, B <: HList, H, I <: HList, M, N <: HList, J](implicit head: EncoderShape[A, H, M, J], tail: EncoderShape[B, I, N, J]): EncoderShape[A :: B, H :: I, M :: N, J] = {

    new EncoderShape[A :: B, H :: I, M :: N, J] {
      self =>

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.wrapRep(headRep) :: tail.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N): DataRepGroup[J] = {
        val headRep :: tailRep = base
        val headGroup = head.toLawRep(headRep)
        val tailGroup = tail.toLawRep(tailRep)
        DataRepGroup(reps = headGroup.reps ::: tailGroup.reps)
      }

      override def buildData(data: H :: I, rep: M :: N): DataGroup = {
        val h :: i = data
        val m :: n = rep
        val DataGroup(headData) = head.buildData(h, m)
        val DataGroup(tailData) = tail.buildData(i, n)
        DataGroup(headData ::: tailData)
      }

    }

  }

}