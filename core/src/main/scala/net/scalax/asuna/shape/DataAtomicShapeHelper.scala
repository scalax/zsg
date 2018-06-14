package net.scalax.asuna.shape

import net.scalax.asuna.core._
import shapeless._
import tag._

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
  /*implicit def atomicShapeImplicit1[A, C]: DataShape[OutputTag[A, C], DataModel[EmptyData, A, EmptyData], OutputTag[A, C], C] = {
    new DataShape[OutputTag[A, C], DataModel[EmptyData, A, EmptyData], OutputTag[A, C], C] {
      override def wrapRep(base: OutputTag[A, C]): OutputTag[A, C] = base
      override def toLawRep(base: OutputTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: OutputTag[A, C]): SplitData[DataModel[EmptyData, A, EmptyData]] = {
        val scala.::(head, tail) = oldData.items
        SplitData(current = DataModelImpl(current = { (_: EmptyData) => head.asInstanceOf[A] }, sub = EmptyData.value), left = DataGroup(items = tail))
      }
    }
  }

  implicit def atomicShapeImplicit2[A, C]: DataShape[SubTag[A, C], DataModel[EmptyData, EmptyData, A], SubTag[A, C], C] = {
    new DataShape[SubTag[A, C], DataModel[EmptyData, EmptyData, A], SubTag[A, C], C] {
      override def wrapRep(base: SubTag[A, C]): SubTag[A, C] = base
      override def toLawRep(base: SubTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: SubTag[A, C]): SplitData[DataModel[EmptyData, EmptyData, A]] = {
        val scala.::(head, tail) = oldData.items
        val currentData = head.asInstanceOf[A]
        SplitData(current = DataModelImpl(current = { (_: EmptyData) => EmptyData.value }, sub = currentData), left = DataGroup(items = tail))
      }
    }
  }

  implicit def atomicShapeImplicit3[A, C]: DataShape[OutputSubTag[A, C], DataModel[EmptyData, A, A], OutputSubTag[A, C], C] = {
    new DataShape[OutputSubTag[A, C], DataModel[EmptyData, A, A], OutputSubTag[A, C], C] {
      override def wrapRep(base: OutputSubTag[A, C]): OutputSubTag[A, C] = base
      override def toLawRep(base: OutputSubTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: OutputSubTag[A, C]): SplitData[DataModel[EmptyData, A, A]] = {
        val scala.::(head, tail) = oldData.items
        val currentData = head.asInstanceOf[A]
        SplitData(current = DataModelImpl(current = { (_: EmptyData) => currentData }, sub = currentData), left = DataGroup(items = tail))
      }
    }
  }*/

  implicit def atomicShapeImplicit1[A, C]: DataShape[OutputTag[A, C], A @@ OutputData, OutputTag[A, C], C] = {
    new DataShape[OutputTag[A, C], A @@ OutputData, OutputTag[A, C], C] {
      override def wrapRep(base: OutputTag[A, C]): OutputTag[A, C] = base
      override def toLawRep(base: OutputTag[A, C]): DataRepGroup[C] = {
        DataRepGroup(reps = List(base.common))
      }
      override def takeData(oldData: DataGroup, rep: OutputTag[A, C]): SplitData[A @@ OutputData] = {
        val scala.::(head, tail) = oldData.items
        SplitData(current = tag[OutputData](head.asInstanceOf[A]), left = DataGroup(items = tail))
        //SplitData(current = DataModelImpl(current = { (_: EmptyData) => head.asInstanceOf[A] }, sub = EmptyData.value), left = DataGroup(items = tail))
      }
    }
  }

}