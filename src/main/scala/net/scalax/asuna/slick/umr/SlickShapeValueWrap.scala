package net.scalax.asuna.slick.umr

import slick.lifted.{ FlatShapeLevel, Shape }
import net.scalax.asuna.core._

trait SlickShapeValueWrapAbs {
  self =>

  type Data
  type Rep
  type TargetRep
  type OutPut
  type Level <: FlatShapeLevel
  val rep: Rep
  val shape: Shape[Level, Rep, Data, TargetRep]
  val dataToList: Data => OutPut

}

trait SlickShapeValueWrap[F] extends SlickShapeValueWrapAbs with TagAbs[F, SlickShapeValueWrapAbs] {
  self =>

  override type OutPut = F

  override def common: SlickShapeValueWrapAbs = self

  def map[H](t: F => H): SlickShapeValueWrap[H] = {
    new SlickShapeValueWrap[H] {
      override type Data = self.Data
      override type Rep = self.Rep
      override type TargetRep = self.TargetRep
      override type Level = self.Level
      override val rep = self.rep
      override val shape = self.shape
      override val dataToList = { (s: Data) => t(self.dataToList(s)) }
    }
  }
}