package net.scalax.asuna.mapper.common

import net.scalax.asuna.core.common.{++::, RNil, RepGroup}

trait ShapeHelper {

  implicit class anyToRepGroupExt[A](rep1: A) {
    def mixin[E](rep2: E): RepGroup[E ++:: A ++:: RNil] = {
      new RepGroup[E ++:: A ++:: RNil] {
        override val repCol = rep2 ++:: rep1 ++:: RNil.value
      }
    }
  }

}
