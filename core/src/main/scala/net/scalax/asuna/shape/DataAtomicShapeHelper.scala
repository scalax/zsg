package net.scalax.asuna.shape

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup, DelayTag, TagAbs }

trait DataAtomicShapeHelper {

  implicit def atomicShapeImplicit1[A, C]: DataShape[TagAbs[A, C], A, TagAbs[A, C], C] = {
    new DataShape[TagAbs[A, C], A, TagAbs[A, C], C] {
      override def wrapRep(base: TagAbs[A, C]): TagAbs[A, C] = base
      override def toLawRep(base: TagAbs[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: TagAbs[A, C]): SplitData[A] = {
        val scala.::(head, tail) = oldData.items
        SplitData(current = head.asInstanceOf[A], left = DataGroup(items = tail))
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

}