package net.scalax.asuna.core

sealed abstract trait TagAbs[Data, CommonCol] {
  self =>

  def common: CommonCol

  def toOutput: OutputTag[Data, CommonCol] = new OutputTag[Data, CommonCol] {
    override def common: CommonCol = self.common
  }

  def toOutputSub: OutputSubTag[Data, CommonCol] = new OutputSubTag[Data, CommonCol] {
    override def common: CommonCol = self.common
  }

  def toSub: SubTag[Data, CommonCol] = new SubTag[Data, CommonCol] {
    override def common: CommonCol = self.common
  }
}

trait OutputTag[Data, CommonCol] extends TagAbs[Data, CommonCol]
trait OutputSubTag[Data, CommonCol] extends TagAbs[Data, CommonCol]
trait SubTag[Data, CommonCol] extends TagAbs[Data, CommonCol]
//trait InputTag
//trait IOTag
/*object AtomicColumn {

  def tagOutput[T <: AtomicColumn[_, _]](col: T): OutputTag[T] = {
    val col1 = col
    new OutputTag[T] {
      override val col = col1
    }
  }
  //def tagInput[T <: AtomicColumn[_, _]](ac: T): T @@ InputTag = tag[InputTag](ac)
  //def tagIO[T <: AtomicColumn[_, _]](ac: T): T @@ IOTag = tag[IOTag](ac)
  def tagSub[T <: AtomicColumn[_, _]](col: T): SubTag[T] = {
    val col1 = col
    new SubTag[T] {
      override val col = col1
    }
  }
  def tagOutputSub[T <: AtomicColumn[_, _]](col: T): OutputSubTag[T] = {
    val col1 = col
    new OutputSubTag[T] {
      override val col = col1
    }
  }

}*/ 