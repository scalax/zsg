package org.scalax.asuna.mapper.common

abstract trait RepContent[+Rep, Data] extends Any {
  def rep: Rep
}
