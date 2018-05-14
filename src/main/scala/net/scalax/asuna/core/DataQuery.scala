package net.scalax.asuna.core

trait DataQuery[E, U, T] {

  def rep: U

  def shape: DataShape[E, U, E, T]

}
