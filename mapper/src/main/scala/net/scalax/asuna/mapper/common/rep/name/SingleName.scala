package org.scalax.asuna.mapper.common

trait SingleName {
  def singleName: String
}

object SingleName {
  class SingleNameImpl(override val singleName: String) extends SingleName

  def name(n: String): SingleName = {
    new SingleNameImpl(n)
  }
}
