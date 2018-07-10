package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }

trait EncoderProvenShape[U, T] {
  val dataShapeValue: EncoderShapeValue[U, T]
}

object EncoderProvenShape {

  implicit def dataProvenShapeShape[E, U, T, R <: EncoderProvenShape[U, T]]: EncoderShape[R, U, R, T] = {

    new EncoderShape[R, U, R, T] {
      self =>

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R): DataRepGroup[T] =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep))

      override def buildData(data: U, rep: R): DataGroup =
        rep.dataShapeValue.shape.buildData(data, rep.dataShapeValue.rep)

    }

  }

}