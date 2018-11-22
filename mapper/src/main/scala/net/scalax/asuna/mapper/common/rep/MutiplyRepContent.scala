package net.scalax.asuna.mapper.common

trait MutiplyRepContent[+Rep, Data] extends RepContent[Rep, Data] {
  override def rep: Rep
  def mutiplyModelName: List[String]
}
