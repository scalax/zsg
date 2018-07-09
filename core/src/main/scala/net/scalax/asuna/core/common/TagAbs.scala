package net.scalax.asuna.core.common

import net.scalax.asuna.core.decoder.IOData

abstract trait TagAbs[Data, CommonCol] {
  self =>

  def common: CommonCol

}

trait DelayTag[Data, CommonCol] {

  def toIO: IOData[Data, Data] = IOData.simpleInstance[Data]

}