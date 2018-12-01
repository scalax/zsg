package net.scalax.asuna.mapper.common

trait RepContentWithDefault[+Rep, Data] extends RepContent[Rep, Data] {
  override def rep: Rep
  def defaultValue: Data
}
