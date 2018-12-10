package org.scalax.asuna.mapper.common

trait SingleRepContent[+Rep, Data] extends Any with RepContent[Rep, Data] {
  override def rep: Rep
  def singleModelName: String
}
