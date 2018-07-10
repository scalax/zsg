package net.scalax.asuna.core.encoder

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import net.scalax.asuna.core.encoder.impl.{ AtomicColumnEncoderShapeImplicit, ListEncoderShapeImplicit }

trait EncoderShape[-E, U, C, T] {
  self =>
  def packed: EncoderShape[C, U, C, T] = {
    new EncoderShape[C, U, C, T] {
      subSelf =>
      override def packed: EncoderShape[C, U, C, T] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C): DataRepGroup[T] = self.toLawRep(base)
      override def buildData(data: U, rep: C): DataGroup = self.buildData(data, rep)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C): DataRepGroup[T]
  def buildData(data: U, rep: C): DataGroup
}

object EncoderShape extends ListEncoderShapeImplicit with AtomicColumnEncoderShapeImplicit