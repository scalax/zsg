package org.scalax.asuna.core.common

trait CommonShapeValue[U, RepCol] {
  self =>

  type RepType
  val rep: RepType
  val shape: CommonShape.Aux[RepType, RepType, RepCol]

}
