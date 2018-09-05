package net.scalax.asuna.shape

import net.scalax.asuna.core.common.RepGroup
import shapeless.{ ::, HNil }

import scala.language.implicitConversions

trait ShapeHelper {

  //TODO 删除下面第二个 implicit，只使用第一个，待测试
  /*implicit class anyToRepGroupExt[A](rep1: A) {
    def mixin[E](rep2: E): RepGroup[E :: A :: HNil] = {
      new RepGroup[E :: A :: HNil] {
        override val repCol = rep2 :: rep1 :: HNil
      }
    }
  }
  implicit class anyToRepGroupExt2[A <: HList](rep1: RepGroup[A]) {
    def mixin[E](rep2: E): RepGroup[E :: A] = {
      new RepGroup[E :: A] {
        override val repCol = rep2 :: rep1.repCol
      }
    }
  }*/

}