package net.scalax.asuna.core.common

trait CommonShapeValue[U, RepCol, DataCol] {
  self =>

  type RepType
  val rep: RepType
  val shape: CommonShape.Aux[RepType, RepType, RepCol, DataCol]

}