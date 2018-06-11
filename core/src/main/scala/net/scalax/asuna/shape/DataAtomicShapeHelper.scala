package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataAtomicShapeHelper {
  /*implicit def atomicShapeImplicit[A, C]: DataShape[OutputTag[A, C], DataModel[EmptyData, A, EmptyData], OutputTag[A, C], C] = {
    new DataShape[OutputTag[A, C], DataModel[EmptyData, A, EmptyData], OutputTag[A, C], C] {
      override def wrapRep(base: OutputTag[A, C]): OutputTag[A, C] = base
      override def toLawRep(base: OutputTag[A, C]): DataRepGroup[C] = {
        val base1: OutputTag[A, C] = base
        DataRepGroup(reps = List(base1.common))
      }
      override def takeData(oldData: DataGroup, rep: OutputTag[A, C]): Either[NotConvert, SplitData[DataModel[EmptyData, A, EmptyData]]] = {
        val scala.::(head, tail) = oldData.items
        Right(SplitData(current = head.asInstanceOf[A], left = DataGroup(items = tail)))
      }
      override def buildData(splitData: DataModel[EmptyData, A, EmptyData], rep: OutputTag[A, C]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData.current.apply(EmptyData.emptyData))))
      }
    }
  }*/
  implicit def atomicShapeImplicit[A, C]: DataShape[OutputTag[A, C], A, OutputTag[A, C], C] = {
    new DataShape[OutputTag[A, C], A, OutputTag[A, C], C] {
      override def wrapRep(base: OutputTag[A, C]): OutputTag[A, C] = base
      override def toLawRep(base: OutputTag[A, C]): DataRepGroup[C] = {
        val base1: OutputTag[A, C] = base
        DataRepGroup(reps = List(base1.common))
      }
      override def takeData(oldData: DataGroup, rep: OutputTag[A, C]): Either[NotConvert, SplitData[A]] = {
        val scala.::(head, tail) = oldData.items
        Right(SplitData(current = head.asInstanceOf[A], left = DataGroup(items = tail)))
      }
      /*override def buildData(splitData: A, rep: OutputTag[A, C]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData)))
      }*/
    }
  }

}