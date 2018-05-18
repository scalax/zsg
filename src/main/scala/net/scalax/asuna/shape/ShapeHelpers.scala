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
      override def takeData(oldData: DataGroup, rep: HNil): Either[NotConvert, SplitData[HNil]] = Right(SplitData(current = HNil, left = oldData))
      override def buildData(splitData: HNil, rep: HNil): Either[NotConvert, DataGroup] = Right(DataGroup(items = List.empty, subs = List.empty))
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

          override def takeData(oldData: DataGroup, rep: M :: N): Either[NotConvert, SplitData[H :: I]] =
            self.takeData(oldData, rep)

          override def buildData(splitData: H :: I, rep: M :: N): Either[NotConvert, DataGroup] =
            self.buildData(splitData, rep)
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

      override def takeData(oldData: DataGroup, rep: M :: N): Either[NotConvert, SplitData[H :: I]] = {
        val headRep :: tailRep = rep
        for {
          newData1 <- head.takeData(oldData, headRep).right
          newData2 <- tail.takeData(newData1.left, tailRep).right
        } yield {
          SplitData(newData1.current :: newData2.current, newData2.left)
        }
      }

      override def buildData(splitData: H :: I, rep: M :: N): Either[NotConvert, DataGroup] = {
        val headData :: tailData = splitData
        val headRep :: tailRep = rep
        for {
          newData1 <- head.buildData(headData, headRep).right
          newData2 <- tail.buildData(tailData, tailRep).right
        } yield {
          DataGroup(items = newData1.items ::: newData2.items, subs = newData1.subs ::: newData2.subs)
        }
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

  implicit class shapeValueExt[A](rep: A) {
    def shaped[B, C, D](implicit shape: DataShape[A, B, C, D]): DataShapeValue[B, D] = {
      val rep1 = rep
      val shape1 = shape
      new DataShapeValue[B, D] {
        override type RepType = C
        override val rep = shape1.wrapRep(rep1)
        override val shape = shape1.packed
      }
    }
  }

}