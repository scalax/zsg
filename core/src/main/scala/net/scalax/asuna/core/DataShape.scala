package net.scalax.asuna.core

case class SplitData[T](current: T, left: DataGroup)

trait NotConvert

object NotConvert {
  val value: NotConvert = new NotConvert {}
}

trait DataShape[-E, U, C, T] {
  self =>

  def packed: DataShape[C, U, C, T] = {
    new DataShape[C, U, C, T] {
      subSelf =>
      override def packed: DataShape[C, U, C, T] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C): DataRepGroup[T] = self.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: C): Either[NotConvert, SplitData[U]] = self.takeData(oldData, rep)
      override def buildData(splitData: U, rep: C): Either[NotConvert, DataGroup] = self.buildData(splitData, rep)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C): DataRepGroup[T]
  def takeData(oldData: DataGroup, rep: C): Either[NotConvert, SplitData[U]]
  def buildData(splitData: U, rep: C): Either[NotConvert, DataGroup]

}

object DataShape {

  implicit def atomicShapeImplicit[A, B, C](implicit cv: B <:< AtomicColumn[A, C]): DataShape[B, A, B, C] = {
    new DataShape[B, A, B, C] {
      override def wrapRep(base: B): B = base
      override def toLawRep(base: B): DataRepGroup[C] = DataRepGroup(reps = List(base.common))
      override def takeData(oldData: DataGroup, rep: B): Either[NotConvert, SplitData[A]] = {
        val head :: tail = oldData.items
        Right(SplitData(current = head.asInstanceOf[A], left = DataGroup(items = tail)))
      }
      override def buildData(splitData: A, rep: B): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData)))
      }
    }
  }

}