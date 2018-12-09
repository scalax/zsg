package org.scalax.asuna.mapper.common

trait RepContentWithDefault[+Rep, Data] extends Any with RepContent[Rep, Data] {
  override def rep: Rep
  def defaultValue: Data
}
