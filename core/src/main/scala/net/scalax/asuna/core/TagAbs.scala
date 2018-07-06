package net.scalax.asuna.core

abstract trait TagAbs[Data, CommonCol] {
  self =>

  def common: CommonCol

}

trait DelayTag[Data, CommonCol] {

  def toIO: IOData[Data, Data] = IOData.simpleInstance[Data]

}