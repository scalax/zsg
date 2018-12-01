package net.scalax.asuna.mapper.common

trait RepContentWithNonDefault[+Rep, Data] extends RepContent[Rep, Data] {
  override def rep: Rep
}
