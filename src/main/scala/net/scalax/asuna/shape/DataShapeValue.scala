package net.scalax.asuna.shape

import net.scalax.asuna.core._

trait DataShapeValue[U, T] {
  self =>

  type RepType
  val rep: RepType
  val shape: DataShape[RepType, U, RepType, T]

  def <>[F](cv: U => Option[F])(reCv: F => Option[U]): DataShapeValue[F, T] = new DataShapeValue[F, T] {
    override type RepType = self.RepType
    override val rep = self.rep
    override val shape = new DataShape[self.RepType, F, self.RepType, T] {
      innerSelf =>

      override def packed: DataShape[self.RepType, F, self.RepType, T] = innerSelf
      override def wrapRep(base: self.RepType): self.RepType = base
      override def toLawRep(base: self.RepType): DataRepGroup[T] = self.shape.toLawRep(self.rep)
      override def takeData(oldData: DataGroup, rep: self.RepType): Either[NotConvert, SplitData[F]] = {
        val data = self.shape.takeData(oldData, rep)

        data.right.flatMap { d =>
          val current = cv(d.current)
          current match {
            case Some(s) => Right(SplitData(
              current = s,
              left = d.left))
            case None =>
              Left(NotConvert.value)
          }
        }
      }

      override def buildData(splitData: F, rep: RepType): Either[NotConvert, DataGroup] = {
        reCv(splitData) match {
          case Some(s) =>
            self.shape.buildData(s, rep)
          case _ =>
            Left(NotConvert.value)
        }
      }
    }
  }
}

object DataShapeValue {

  implicit def dataShapeValueShape[U, T, R <: DataShapeValue[U, T]]: DataShape[R, U, R, T] = {

    new DataShape[R, U, R, T] {
      self =>

      override def packed: DataShape[R, U, R, T] = self
      override def wrapRep(base: R): R = base
      override def toLawRep(base: R): DataRepGroup[T] = base.shape.toLawRep(base.shape.wrapRep(base.rep))
      override def takeData(oldData: DataGroup, rep: R): Either[NotConvert, SplitData[U]] = rep.shape.takeData(oldData, rep.rep)
      override def buildData(splitData: U, rep: R): Either[NotConvert, DataGroup] = rep.shape.buildData(splitData, rep.rep)
    }

  }

}