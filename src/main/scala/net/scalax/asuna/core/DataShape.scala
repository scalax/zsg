package net.scalax.asuna.core

case class SplitData[T](current: Either[NotConvert, T], left: DataGroup)

trait NotConvert

object NotConvert {
  val value: NotConvert = new NotConvert {}
}

trait DataShape[E, U, C, T] {

  def packed: DataShape[C, U, C, T]

  def wrapRep(base: E): C

  def toLawRep(base: C): DataRepGroup[T]

  def takeData(oldData: DataGroup, rep: C): SplitData[U]

}