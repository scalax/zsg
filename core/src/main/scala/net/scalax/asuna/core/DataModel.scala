package net.scalax.asuna.core

trait DataModel[A, B, C] {
  self =>

  val current: A => B
  val sub: C

  def toImpl: DataModelImpl[A, B, C] = {
    self match {
      case m: DataModelImpl[A, B, C] => m
      case _ => DataModelImpl(current = self.current, sub = self.sub)
    }
  }

}

case class DataModelImpl[A, B, C](override val current: A => B, override val sub: C) extends DataModel[A, B, C]

trait EmptyData

object EmptyData {
  val emptyData: EmptyData = new EmptyData {}
}