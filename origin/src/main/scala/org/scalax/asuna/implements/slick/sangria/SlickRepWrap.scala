package org.scalax.asuna.sangria

import org.scalax.asuna.slick.umr.SlickShapeValueWrap

sealed abstract trait SlickRepAbs[Rep] {
  self =>

  type DataType

  val sangraiKey: Option[String]

  def slickCv(rep: Rep): SlickShapeValueWrap[DataType]

}

trait SlickRepWrap[Rep, D] extends SlickRepAbs[Rep] {
  self =>

  type DataType = D

  def slickCv(rep: Rep): SlickShapeValueWrap[D]

  def map[R](cv: D => R): SlickRepWrap[Rep, R] = {
    new SlickRepWrap[Rep, R] {
      override val sangraiKey = self.sangraiKey
      override def slickCv(rep: Rep): SlickShapeValueWrap[R] = {
        self.slickCv(rep).map(cv)
      }
    }
  }

}

trait SlickSangriaRepWrap[Rep, D] extends SlickRepWrap[Rep, (String, D)] {
  self =>

  val objectKey: String

  override type DataType = (String, D)

  def valueMap[R](cv: D => R): SlickSangriaRepWrap[Rep, R] = {
    new SlickSangriaRepWrap[Rep, R] {
      override val sangraiKey = self.sangraiKey
      override val objectKey  = self.objectKey
      override def slickCv(rep: Rep): SlickShapeValueWrap[(String, R)] = {
        self.slickCv(rep).map(r => (r._1, cv(r._2)))
      }
    }
  }
}
