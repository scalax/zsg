package org.scalax.asuna.mapper.common

trait RepContentWithNonDefault[+Rep, Data] extends Any with RepContent[Rep, Data] {
  override def rep: Rep
}
