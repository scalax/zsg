package net.scalax.asuna.core.common

trait CommonShape[-Rep, RepCol] {
  self =>

  type Target

  def packed: CommonShape.Aux[Target, Target, RepCol] = {
    new CommonShape[Target, RepCol] {
      subSelf =>
      override type Target = self.Target
      override def packed: CommonShape.Aux[self.Target, self.Target, RepCol] = subSelf
      override def wrapRep(base: self.Target): self.Target                   = base
      override def buildRep(base: Target, oldRep: RepCol): RepCol            = self.buildRep(base, oldRep)
    }
  }
  def wrapRep(base: Rep): Target
  def buildRep(base: Target, oldRep: RepCol): RepCol

}

object CommonShape {
  type Aux[Rep, T, RepCol] = CommonShape[Rep, RepCol] { type Target = T }
}
