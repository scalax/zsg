package net.scalax.asuna.shape

import net.scalax.asuna.core._
import shapeless._

import scala.language.implicitConversions

trait ShapeHelpers {

  implicit def hnilDateShape[J]: DataShape[HNil, HNil, HNil, J] = {
    new DataShape[HNil, HNil, HNil, J] { self =>
      override def packed: DataShape[HNil, HNil, HNil, J] = self
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil): DataRepGroup[J] = DataRepGroup(reps = List.empty, subs = List.empty)
      override def takeData(oldData: DataGroup, rep: HNil): SplitData[HNil] = SplitData(current = Right(HNil), left = oldData)
    }
  }

  implicit def hlistDateShape[A, B <: HList, H, I <: HList, M, N <: HList, J](implicit head: DataShape[A, H, M, J], tail: DataShape[B, I, N, J]): DataShape[A :: B, H :: I, M :: N, J] = {

    new DataShape[A :: B, H :: I, M :: N, J] {
      self =>

      override def packed: DataShape[M :: N, H :: I, M :: N, J] = {
        new DataShape[M :: N, H :: I, M :: N, J] {
          subSelf =>

          override def packed: DataShape[M :: N, H :: I, M :: N, J] = subSelf

          override def wrapRep(base: M :: N): M :: N = base

          override def toLawRep(base: M :: N): DataRepGroup[J] = self.toLawRep(base)

          override def takeData(oldData: DataGroup, rep: M :: N): SplitData[H :: I] =
            self.takeData(oldData, rep)

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
        DataRepGroup(
          reps = headGroup.reps ::: tailGroup.reps,
          subs = headGroup.subs ::: tailGroup.subs)
      }

      override def takeData(oldData: DataGroup, rep: M :: N): SplitData[H :: I] = {
        val headRep :: tailRep = rep

        val newData1 = head.takeData(oldData, headRep)
        val newData2 = tail.takeData(newData1.left, tailRep)

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

  implicit def toShapeValue[A, B, C, D](rep: A)(implicit shape: DataShape[A, B, C, D]): DataShapeValue[B, D] = {
    val rep1 = rep
    val shape1 = shape
    new DataShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

}