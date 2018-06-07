package net.scalax.asuna.core

trait AtomicColumn[Data, CommonCol] {
  def common: CommonCol
}