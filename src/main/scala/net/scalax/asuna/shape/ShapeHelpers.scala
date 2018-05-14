package net.scalax.asuna.shape

import net.scalax.asuna.core._
import shapeless._

trait ShapeHelpers {

  implicit def hlistDateShape[A, B <: HList, H, I <: HList, M, N <: HList, J](
      implicit head: DataShape[A, H, M, J],
      tail: DataShape[B, I, N, J]): DataShape[A :: B, H :: I, M :: N, J] = {

    new DataShape[A :: B, H :: I, M :: N, J] {
      self =>

      override def packed: DataShape[M :: N, H :: I, M :: N, J] = {
        new DataShape[M :: N, H :: I, M :: N, J] {
          subSelf =>

          override def packed: DataShape[M :: N, H :: I, M :: N, J] = subSelf

          override def wrapRep(base: M :: N): M :: N = base

          override def toLawRep(base: M :: N): DataRepGroup[J] = {
            self.toLawRep(base)
          }

          override def takeData(oldData: DataGroup): SplitData[H :: I] = {
            self.takeData(oldData)
          }

        }
      }

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.wrapRep(headRep) :: tail.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N): DataRepGroup[J] = {
        val headRep :: tailRep = base
        val headGroup = head.toLawRep(headRep)
        val tailGroup = tail.toLawRep(tailRep)
        DataRepGroup(reps = headGroup.reps ::: tailGroup.reps,
                     subs = headGroup.subs ::: tailGroup.subs)
      }

      override def takeData(oldData: DataGroup): SplitData[H :: I] = {
        val newData1 = head.takeData(oldData)
        val newData2 = tail.takeData(newData1.left)
        val d = for {
          d1 <- newData1.current
          d2 <- newData2.current
        } yield {
          d1 :: d2
        }
        SplitData(d, newData2.left)
      }

    }

  }

}
