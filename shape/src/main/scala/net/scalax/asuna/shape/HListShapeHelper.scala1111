package net.scalax.asuna.shape

import net.scalax.asuna.core._
import shapeless._

import scala.language.implicitConversions

trait HListShapeHelper {

  implicit def hnilDateShape[J]: DataShape[HNil, HNil, HNil, J] = {
    new DataShape[HNil, HNil, HNil, J] { self =>
      override def wrapRep(base: HNil): HNil = base
      override def toLawRep(base: HNil): DataRepGroup[J] = DataRepGroup(reps = List.empty)
      override def takeData(oldData: DataGroup, rep: HNil): Either[NotConvert, SplitData[HNil]] = Right(SplitData(current = HNil, left = oldData))
      override def buildData(splitData: HNil, rep: HNil): Either[NotConvert, DataGroup] = Right(DataGroup(items = List.empty))
    }
  }

  implicit def hlistDateShape[A, B <: HList, H, I <: HList, M, N <: HList, J](implicit head: DataShape[A, H, M, J], tail: DataShape[B, I, N, J]): DataShape[A :: B, H :: I, M :: N, J] = {

    new DataShape[A :: B, H :: I, M :: N, J] {
      self =>

      override def wrapRep(base: A :: B): M :: N = {
        val headRep :: tailRep = base
        head.wrapRep(headRep) :: tail.wrapRep(tailRep)
      }

      override def toLawRep(base: M :: N): DataRepGroup[J] = {
        val headRep :: tailRep = base
        val headGroup = head.toLawRep(headRep)
        val tailGroup = tail.toLawRep(tailRep)
        DataRepGroup(
          reps = headGroup.reps ::: tailGroup.reps)
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
          DataGroup(items = newData1.items ::: newData2.items)
        }
      }

    }

  }

}