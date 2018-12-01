package net.scalax.asuna.mapper.common

abstract trait RepContent[+Rep, Data] {
  def rep: Rep
}
