package net.scalax.asuna.core.decoder.impl

import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, DelayTag }
import net.scalax.asuna.core.decoder.{ DecoderShape, IOData, SplitData }

trait AtomicColumnDecoderShapeImplicit {

  implicit def atomicShapeImplicit1[A, C]: DecoderShape[AtomicColumn[A, C], A, AtomicColumn[A, C], C] = {
    new DecoderShape[AtomicColumn[A, C], A, AtomicColumn[A, C], C] {
      override def wrapRep(base: AtomicColumn[A, C]): AtomicColumn[A, C] = base
      override def toLawRep(base: AtomicColumn[A, C]): DataRepGroup[C] = DataRepGroup(reps = List(base.common))
      override def takeData(oldData: DataGroup, rep: AtomicColumn[A, C]): SplitData[A] = {
        val scala.::(head, tail) = oldData.items
        SplitData(current = head.asInstanceOf[A], left = DataGroup(items = tail))
      }
    }
  }

  implicit def atomicShapeImplicit2[A, C]: DecoderShape[DelayTag[A, C], IOData[A, A], DelayTag[A, C], C] = {
    new DecoderShape[DelayTag[A, C], IOData[A, A], DelayTag[A, C], C] {
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