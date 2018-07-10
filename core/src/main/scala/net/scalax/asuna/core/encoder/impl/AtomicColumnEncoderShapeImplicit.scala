package net.scalax.asuna.core.encoder.impl

import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup }
import net.scalax.asuna.core.encoder.EncoderShape

trait AtomicColumnEncoderShapeImplicit {

  implicit def atomicShapeImplicit1[A, C]: EncoderShape[AtomicColumn[A, C], A, AtomicColumn[A, C], C] = {
    new EncoderShape[AtomicColumn[A, C], A, AtomicColumn[A, C], C] {
      override def wrapRep(base: AtomicColumn[A, C]): AtomicColumn[A, C] = base
      override def toLawRep(base: AtomicColumn[A, C]): DataRepGroup[C] = DataRepGroup(reps = List(base.common))
      override def buildData(data: A, rep: AtomicColumn[A, C]): DataGroup = DataGroup(List(data))
    }
  }
  /*implicit def atomicShapeImplicit2[A, C]: EncoderShape[DelayTag[A, C], IOData[A, A], DelayTag[A, C], C] = {
    new DataShape[DelayTag[A, C], IOData[A, A], DelayTag[A, C], C] {
      override def wrapRep(base: DelayTag[A, C]): DelayTag[A, C] = base
      override def toLawRep(base: DelayTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List.empty)
      }
      override def takeData(oldData: DataGroup, rep: DelayTag[A, C]): SplitData[IOData[A, A]] = {
        SplitData(current = rep.toIO, left = oldData)
      }
    }
  }*/
}