package net.scalax.asuna.shape

import net.scalax.asuna.core._
import shapeless.{ ::, HList, HNil }

import scala.language.implicitConversions

trait RepGroupShapeHelper {

  implicit class anyToRepGroupExt[A, B, C, D](rep1: A)(implicit shape: DataShape[A, B, C, D]) {
    def mixin[E, G, H](rep2: E)(implicit shape: DataShape[E, B, G, H]): RepGroup[E :: A :: HNil, B] = {
      new RepGroup[E :: A :: HNil, B] {
        override val repCol = rep2 :: rep1 :: HNil
      }
    }
  }

  implicit class anyToRepGroupExt2[A <: HList, B](rep1: RepGroup[A, B]) {
    def mixin[E, G, H](rep2: E)(implicit shape: DataShape[E, B, G, H]): RepGroup[E :: A, B] = {
      new RepGroup[E :: A, B] {
        override val repCol = rep2 :: rep1.repCol
      }
    }
  }

  implicit def hlistRepGroupImplicit[B, C <: HList, E, G, H](implicit shape: DataShape[B, E, G, H]): DataShape[RepGroup[B :: C, E], E, G, H] = {
    new DataShape[RepGroup[B :: C, E], E, G, H] {
      override def wrapRep(base: RepGroup[B :: C, E]): G = {
        val head :: _ = base.repCol
        shape.wrapRep(head)
      }
      override def toLawRep(base: G): DataRepGroup[H] = shape.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: G): Either[NotConvert, SplitData[E]] = shape.takeData(oldData, rep)
      override def buildData(splitData: E, rep: G): Either[NotConvert, DataGroup] = shape.buildData(splitData, rep)
    }
  }

  implicit def hlistRepGroupImplicit2[B, C <: HList, F, G, H, I, J](implicit shape: DataShape[RepGroup[C, F], F, J, H]): DataShape[RepGroup[B :: C, F], F, J, H] = {
    new DataShape[RepGroup[B :: C, F], F, J, H] {
      override def wrapRep(base: RepGroup[B :: C, F]): J = {
        val _ :: tail = base.repCol
        val rGroup = new RepGroup[C, F] {
          override val repCol = tail
        }
        shape.wrapRep(rGroup)
      }
      override def toLawRep(base: J): DataRepGroup[H] = shape.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: J): Either[NotConvert, SplitData[F]] = shape.takeData(oldData, rep)
      override def buildData(splitData: F, rep: J): Either[NotConvert, DataGroup] = shape.buildData(splitData, rep)
    }
  }

}