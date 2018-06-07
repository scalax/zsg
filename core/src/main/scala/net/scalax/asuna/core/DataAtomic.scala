package net.scalax.asuna.core

trait AtomicColumn[Data, CommonCol] {
  def common: CommonCol
}
/*
trait OutputTag
trait InputTag
trait IOTag
trait SubTag
trait OutputSubTag

object AtomicColumn {

  def tagOutput[T <: AtomicColumn[_, _]](ac: T): T @@ OutputTag = tag[OutputTag](ac)
  def tagInput[T <: AtomicColumn[_, _]](ac: T): T @@ InputTag = tag[InputTag](ac)
  def tagIO[T <: AtomicColumn[_, _]](ac: T): T @@ IOTag = tag[IOTag](ac)
  def tagSub[T <: AtomicColumn[_, _]](ac: T): T @@ SubTag = tag[SubTag](ac)
  def tagOutputSub[T <: AtomicColumn[_, _]](ac: T): T @@ OutputSubTag = tag[OutputSubTag](ac)

}*/ 