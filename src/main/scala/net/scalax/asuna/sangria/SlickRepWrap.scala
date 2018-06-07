package net.scalax.asuna.sangria

import net.scalax.asuna.core.AtomicColumn
import net.scalax.asuna.slick.umr.SlickShapeValueWrap

sealed abstract trait SlickRepAbsAbs[Rep] {
  self =>

  type DataType

  def slickCv(rep: Rep): SlickShapeValueWrap[DataType]

}

sealed abstract trait SlickRepAbs[Rep, D] extends SlickRepAbsAbs[Rep] {
  self =>

  type DataType = D
  def slickCv(rep: Rep): SlickShapeValueWrap[D]

}

sealed abstract trait SlickRepWrapAbs[Rep] extends SlickRepAbsAbs[Rep] {
  self =>
}

trait SlickRepWrap[Rep, D] extends SlickRepAbs[Rep, D] with SlickRepWrapAbs[Rep] with AtomicColumn[D, SlickRepAbsAbs[Rep]] {
  self =>

  override def common: SlickRepWrapAbs[Rep] = self

  def map[R](cv: D => R): SlickRepWrap[Rep, R] = {
    new SlickRepWrap[Rep, R] {
      override def slickCv(rep: Rep): SlickShapeValueWrap[R] = {
        self.slickCv(rep).map(cv)
      }
    }
  }

}

sealed abstract trait SlickSangriaRepWrapAbs[Rep] extends SlickRepAbsAbs[Rep] {
  self =>

  val sangraiKey: String
  val objectKey: String
}

trait SlickSangriaRepWrap[Rep, D] extends SlickRepAbs[Rep, (String, D)] with SlickSangriaRepWrapAbs[Rep] {
  self =>

  override type DataType = (String, D)

  def map[R](cv: D => R): SlickSangriaRepWrap[Rep, R] = {
    new SlickSangriaRepWrap[Rep, R] {
      override val sangraiKey = self.sangraiKey
      override val objectKey = self.objectKey
      override def slickCv(rep: Rep): SlickShapeValueWrap[(String, R)] = {
        self.slickCv(rep).map(t => (t._1, cv(t._2)))
      }
    }
  }
}