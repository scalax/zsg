package net.scalax.asuna.core.common

trait Placeholder[T]

object Placeholder {
  def value[T]: Placeholder[T] = new Placeholder[T] {}
}