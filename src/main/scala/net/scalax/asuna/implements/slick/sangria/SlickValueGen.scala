package org.scalax.asuna.sangria

trait SlickValueGen[Rep] {
  def getData[DataType](r: SlickSangriaRepWrap[Rep, DataType]): DataType
}
