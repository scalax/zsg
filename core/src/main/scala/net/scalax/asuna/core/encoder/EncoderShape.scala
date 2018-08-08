package net.scalax.asuna.core.encoder

import net.scalax.asuna.core.encoder.impl.{ AtomicColumnEncoderShapeImplicit, ListEncoderShapeImplicit }

trait EncoderShape[-E, U, C, T] {
  self =>
  def packed: EncoderShape[C, U, C, T] = {
    new EncoderShape[C, U, C, T] {
      subSelf =>
      override def packed: EncoderShape[C, U, C, T] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C, oldRep: List[T]): List[T] = self.toLawRep(base, oldRep)
      override def buildData(data: U, rep: C, oldData: List[Any]): List[Any] = self.buildData(data, rep, oldData)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C, oldRep: List[T]): List[T]
  def buildData(data: U, rep: C, oldData: List[Any]): List[Any]
}

object EncoderShape extends ListEncoderShapeImplicit with AtomicColumnEncoderShapeImplicit