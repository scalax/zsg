package net.scalax.asuna.mapper.common

trait SingleRepContent[+Rep, Data] extends RepContent[Rep, Data] {
  override def rep: Rep
  def singleModelName: String
}
