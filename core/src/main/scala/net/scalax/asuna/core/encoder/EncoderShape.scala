package net.scalax.asuna.core.encoder

trait EncoderShapeAbs[-E, U, C, RepCol, DataCol] {
  self =>
  def packed: EncoderShapeAbs[C, U, C, RepCol, DataCol] = {
    new EncoderShapeAbs[C, U, C, RepCol, DataCol] {
      subSelf =>
      override def packed: EncoderShapeAbs[C, U, C, RepCol, DataCol] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C, oldRep: RepCol): RepCol = self.toLawRep(base, oldRep)
      override def buildData(data: U, rep: C, oldData: DataCol): DataCol = self.buildData(data, rep, oldData)
    }
  }
  def wrapRep(base: E): C
  def toLawRep(base: C, oldRep: RepCol): RepCol
  def buildData(data: U, rep: C, oldData: DataCol): DataCol
}

trait EncoderShape[-E, U, C, R, D] extends EncoderShapeAbs[E, U, C, List[R], List[D]] {
  self =>
  override def packed: EncoderShape[C, U, C, R, D] = {
    new EncoderShape[C, U, C, R, D] {
      subSelf =>
      override def packed: EncoderShape[C, U, C, R, D] = subSelf
      override def wrapRep(base: C): C = base
      override def toLawRep(base: C, oldRep: List[R]): List[R] = self.toLawRep(base, oldRep)
      override def buildData(data: U, rep: C, oldData: List[D]): List[D] = self.buildData(data, rep, oldData)
    }
  }
}

object EncoderShape