package net.scalax.asuna.core.common

trait CommonProvenShape[U, RepCol, DataCol] {
  val dataShapeValue: CommonShapeValue[U, RepCol, DataCol]
}