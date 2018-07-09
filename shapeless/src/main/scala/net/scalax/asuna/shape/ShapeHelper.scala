package net.scalax.asuna.shape

import net.scalax.asuna.core._
import net.scalax.asuna.core.common.RepGroup
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue }
import shapeless.{ ::, HList, HNil }

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

  implicit class anyToRepGroupExt[A, B, C, D](rep1: A)(implicit shape: DecoderShape[A, B, C, D]) {
    def mixin[E, G, H](rep2: E)(implicit shape: DecoderShape[E, B, G, H]): RepGroup[E :: A :: HNil, B] = {
      new RepGroup[E :: A :: HNil, B] {
        override val repCol = rep2 :: rep1 :: HNil
      }
    }
  }

  implicit class anyToRepGroupExt2[A <: HList, B](rep1: RepGroup[A, B]) {
    def mixin[E, G, H](rep2: E)(implicit shape: DecoderShape[E, B, G, H]): RepGroup[E :: A, B] = {
      new RepGroup[E :: A, B] {
        override val repCol = rep2 :: rep1.repCol
      }
    }
  }

}