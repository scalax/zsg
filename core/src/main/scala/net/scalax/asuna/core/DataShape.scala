package net.scalax.asuna.core

import net.scalax.asuna.shape.{ DataAtomicShapeHelper, HListShapeHelper, ListShapeHelper, RepGroupShapeHelper }

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
      //override def buildData(splitData: U, rep: C): Either[NotConvert, DataGroup] = self.buildData(splitData, rep)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C): DataRepGroup[T]
  def takeData(oldData: DataGroup, rep: C): Either[NotConvert, SplitData[U]]
  //def buildData(splitData: U, rep: C): Either[NotConvert, DataGroup]

}

object DataShape extends HListShapeHelper with DataAtomicShapeHelper with ListShapeHelper with RepGroupShapeHelper