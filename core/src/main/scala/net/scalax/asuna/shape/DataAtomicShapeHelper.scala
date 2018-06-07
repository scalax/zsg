package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataAtomicShapeHelper {

  implicit def atomicShapeImplicit[A, B, C](implicit cv: B <:< AtomicColumn[A, C]): DataShape[B, A, B, C] = {
    new DataShape[B, A, B, C] {
      override def wrapRep(base: B): B = base
      override def toLawRep(base: B): DataRepGroup[C] = DataRepGroup(reps = List(base.common))
      override def takeData(oldData: DataGroup, rep: B): Either[NotConvert, SplitData[A]] = {
        val scala.::(head, tail) = oldData.items
        Right(SplitData(current = head.asInstanceOf[A], left = DataGroup(items = tail)))
      }
      override def buildData(splitData: A, rep: B): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData)))
      }
    }
  }

}