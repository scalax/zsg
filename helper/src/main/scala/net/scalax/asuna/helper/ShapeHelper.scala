package net.scalax.asuna.shape

import net.scalax.asuna.core.common.RepGroup
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import shapeless.{ ::, HNil }

import scala.language.implicitConversions

trait ShapeHelper {

  implicit def liftToShapeValueExtendsionMethod[A, B, C, D](rep: A)(implicit shape: DecoderShape[A, B, C, D]): DecoderShapeValue[B, D] = {
    val rep1 = rep
    val shape1 = shape
    new DecoderShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

  implicit def liftToEncoderShapeValueExtendsionMethod2[A, B, C, D](rep: A)(implicit shape: EncoderShape[A, B, C, D]): EncoderShapeValue[B, D] = {
    val rep1 = rep
    val shape1 = shape
    new EncoderShapeValue[B, D] {
      override type RepType = C
      override val rep = shape1.wrapRep(rep1)
      override val shape = shape1.packed
    }
  }

  //TODO 删除下面第二个 implicit，只使用第一个，待测试
  implicit class anyToRepGroupExt[A](rep1: A) {
    def mixin[E](rep2: E): RepGroup[E :: A :: HNil] = {
      new RepGroup[E :: A :: HNil] {
        override val repCol = rep2 :: rep1 :: HNil
      }
    }
  }
  /*implicit class anyToRepGroupExt2[A <: HList](rep1: RepGroup[A]) {
    def mixin[E](rep2: E): RepGroup[E :: A] = {
      new RepGroup[E :: A] {
        override val repCol = rep2 :: rep1.repCol
      }
    }
  }*/
}