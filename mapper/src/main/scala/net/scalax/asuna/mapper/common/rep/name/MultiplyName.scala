package net.scalax.asuna.mapper.common

trait MultiplyName {
  def multiplyName: List[String]
}

object MultiplyName {
  class MultiplyNameImpl(override val multiplyName: List[String]) extends MultiplyName

  def name(n: List[String]): MultiplyName = {
    new MultiplyNameImpl(n)
  }
}
