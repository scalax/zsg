package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataTagEncoderShapeHelper {

  implicit def atomicShapeImplicit1[A, C]: EncoderShape[TagAbs[A, C], A, TagAbs[A, C], C] = {
    new EncoderShape[TagAbs[A, C], A, TagAbs[A, C], C] {
      override def wrapRep(base: TagAbs[A, C]): TagAbs[A, C] = base
      override def toLawRep(base: TagAbs[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def buildData(data: A, rep: TagAbs[A, C]): DataGroup = DataGroup(List(data))
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