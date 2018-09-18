package net.scalax.asuna.core.common

trait CommonShape[-Rep, RepCol, DataCol] {
  self =>

  type Target

  def packed: CommonShape.Aux[Target, Target, RepCol, DataCol] = {
    new CommonShape[Target, RepCol, DataCol] {
      subSelf =>
      override type Target = self.Target
      override def packed: CommonShape.Aux[self.Target, self.Target, RepCol, DataCol] = subSelf
      override def wrapRep(base: self.Target): self.Target                            = base
      override def toLawRep(base: Target, oldRep: RepCol): RepCol                     = self.toLawRep(base, oldRep)
    }
  }
  def wrapRep(base: Rep): Target
  def toLawRep(base: Target, oldRep: RepCol): RepCol

}

object CommonShape {
  type Aux[Rep, T, RepCol, DataCol] = CommonShape[Rep, RepCol, DataCol] { type Target = T }
}
