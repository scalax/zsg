package net.scalax.asuna.core

import net.scalax.asuna.shape.{ DataAtomicShapeHelper, ListShapeHelper }

case class SplitData[T](current: T, left: DataGroup)

trait DataShape[-E, U, C, T] {
  self =>
  def packed: DataShape[C, U, C, T] = {
    new DataShape[C, U, C, T] {
      subSelf =>
      override def packed: DataShape[C, U, C, T] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C): DataRepGroup[T] = self.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: C): SplitData[U] = self.takeData(oldData, rep)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C): DataRepGroup[T]
  def takeData(oldData: DataGroup, rep: C): SplitData[U]
}

object DataShape extends ListShapeHelper with DataAtomicShapeHelper