package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }

trait DecoderProvenShape[U, T] {
  val dataShapeValue: DecoderShapeValue[U, T]
}

object DecoderProvenShape {

  implicit def dataProvenShapeShape[E, U, T, R <: DecoderProvenShape[U, T]]: DecoderShape[R, U, R, T] = {

    new DecoderShape[R, U, R, T] {
      self =>

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R): DataRepGroup[T] =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep))

      override def takeData(oldData: DataGroup, rep: R): SplitData[U] =
        rep.dataShapeValue.shape.takeData(oldData, rep.dataShapeValue.rep)

    }

  }

}