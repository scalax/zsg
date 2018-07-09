package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.{DataGroup, DataRepGroup}
import net.scalax.asuna.core.decoder.impl.{ListDecoderShapeImplicit, TagAbsDecoderShapeImplicit}

trait DecoderShape[-E, U, C, T] {
  self =>
  def packed: DecoderShape[C, U, C, T] = {
    new DecoderShape[C, U, C, T] {
      subSelf =>
      override def packed: DecoderShape[C, U, C, T] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C): DataRepGroup[T] = self.toLawRep(base)
      override def takeData(oldData: DataGroup, rep: C): SplitData[U] = self.takeData(oldData, rep)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C): DataRepGroup[T]
  def takeData(oldData: DataGroup, rep: C): SplitData[U]
}

object DecoderShape extends ListDecoderShapeImplicit with TagAbsDecoderShapeImplicit