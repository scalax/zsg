package org.scalax.asuna.mapper.common

trait MutiplyRepContent[+Rep, Data] extends Any with RepContent[Rep, Data] {
  override def rep: Rep
  def mutiplyModelName: List[String]
}
