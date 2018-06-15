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

trait DelayTag[Data, CommonCol] {

  def toIO: IOData[Data, Data] = IOData.simpleInstance[Data]

}

object DelayTag {
  trait DelayTagGen[CommonCol] {
    def apply[Data]: DelayTag[Data, CommonCol] = {
      new DelayTag[Data, CommonCol] {}
    }
  }

  def createDelayTagGeneration[CommonCol]: DelayTagGen[CommonCol] = new DelayTagGen[CommonCol] {}
}