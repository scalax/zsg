package net.scalax.asuna.shape

import net.scalax.asuna.core._
import shapeless._
import tag._

trait DataAtomicShapeHelper {

  implicit def atomicShapeImplicit1[A, C]: DataShape[OutputTag[A, C], A @@ OutputData, OutputTag[A, C], C] = {
    new DataShape[OutputTag[A, C], A @@ OutputData, OutputTag[A, C], C] {
      override def wrapRep(base: OutputTag[A, C]): OutputTag[A, C] = base
      override def toLawRep(base: OutputTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: OutputTag[A, C]): SplitData[A @@ OutputData] = {
        val scala.::(head, tail) = oldData.items
        SplitData(current = tag[OutputData](head.asInstanceOf[A]), left = DataGroup(items = tail))
      }
    }
  }

  implicit def atomicShapeImplicit2[A, C]: DataShape[DelayTag[A, C], IOData[A, A], DelayTag[A, C], C] = {
    new DataShape[DelayTag[A, C], IOData[A, A], DelayTag[A, C], C] {
      override def wrapRep(base: DelayTag[A, C]): DelayTag[A, C] = base
      override def toLawRep(base: DelayTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List.empty)
      }
      override def takeData(oldData: DataGroup, rep: DelayTag[A, C]): SplitData[IOData[A, A]] = {
        SplitData(current = rep.toIO, left = oldData)
      }
    }
  }

  implicit def atomicShapeImplicit3[A, C]: DataShape[SubTag[A, C], SubOnly[A], SubTag[A, C], C] = {
    new DataShape[SubTag[A, C], SubOnly[A], SubTag[A, C], C] {
      override def wrapRep(base: SubTag[A, C]): SubTag[A, C] = base
      override def toLawRep(base: SubTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: SubTag[A, C]): SplitData[SubOnly[A]] = {
        val scala.::(head, tail) = oldData.items
        SplitData(current = new SubOnly[A] {
          override def sub: A = head.asInstanceOf[A]
        }, left = DataGroup(items = tail))
      }
    }
  }

  implicit def atomicShapeImplicit4[A, C]: DataShape[OutputSubTag[A, C], OutputSubData[A, A], OutputSubTag[A, C], C] = {
    new DataShape[OutputSubTag[A, C], OutputSubData[A, A], OutputSubTag[A, C], C] {
      override def wrapRep(base: OutputSubTag[A, C]): OutputSubTag[A, C] = base
      override def toLawRep(base: OutputSubTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: OutputSubTag[A, C]): SplitData[OutputSubData[A, A]] = {
        val scala.::(head, tail) = oldData.items
        val headData = head.asInstanceOf[A]
        SplitData(current = new OutputSubData[A, A] {
          override val current = headData
          override val sub = headData
        }, left = DataGroup(items = tail))
      }
    }
  }

}