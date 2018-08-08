package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }

trait EncoderProvenShape[U, T] {
  val dataShapeValue: EncoderShapeValue[U, T]
}

object EncoderProvenShape {

  implicit def dataProvenShapeShape[E, U, T, R <: EncoderProvenShape[U, T]]: EncoderShape[R, U, R, T] = {

    new EncoderShape[R, U, R, T] {
      self =>

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R, oldRep: List[T]): List[T] =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep), oldRep)

      override def buildData(data: U, rep: R, oldData: List[Any]): List[Any] =
        rep.dataShapeValue.shape.buildData(data, rep.dataShapeValue.rep, oldData)

    }

  }

}