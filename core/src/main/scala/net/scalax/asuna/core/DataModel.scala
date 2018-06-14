package net.scalax.asuna.core

sealed abstract trait AbsDataModel
trait OutputData extends AbsDataModel
trait IOData[Input, Output] extends AbsDataModel {
  def apply(i: Input): Output
}
trait OutputSubData[Output, Sub] extends AbsDataModel {
  def current: Output
  def sub: Sub
}

trait DataModel[A, B, C] extends AbsDataModel {
  self =>

  def current: A => B
  def sub: C
  /*def toImpl: DataModelImpl[A, B, C] = {
    self match {
      case m: DataModelImpl[A, B, C] => m
      case _ => DataModelImpl(current = self.current, sub = self.sub)
    }
  }*/
}
/*object DataModel {

  def simpleDModelDirectTran[T]: DModelDirectTran[T, T] = {
    new DModelDirectTran[T, T] {
      override def tran(model: T): T = model
    }
  }

  def compile[A <: HList, B, C](model: A)(implicit cv2: DModelHListTran[A, B], cv3: DModelDirectTran[B, C] = simpleDModelDirectTran[B]): C = {
    cv3.tran(cv2.tran(model))
  }

  trait DModelHListTran[T, R] {
    def tran(model: T): R
  }

  trait DModelDirectTran[T, R] {
    def tran(model: T): R
  }

}

case class DataModelImpl[A, B, C](override val current: A => B, override val sub: C) extends DataModel[A, B, C]*/
trait EmptyData

object EmptyData {
  val value: EmptyData = new EmptyData {}
}