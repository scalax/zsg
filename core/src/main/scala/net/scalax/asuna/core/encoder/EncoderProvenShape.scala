package net.scalax.asuna.core.decoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }

trait EncoderProvenShape[U, RepCol, DataCol] {
  val dataShapeValue: EncoderShapeValue[U, RepCol, DataCol]
}

object EncoderProvenShape {

  implicit def dataProvenShapeShape[E, U, RepCol, DataCol, R <: EncoderProvenShape[U, RepCol, DataCol]]: EncoderShape[R, U, R, RepCol, DataCol] = {

    new EncoderShape[R, U, R, RepCol, DataCol] {
      self =>

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R, oldRep: List[RepCol]): List[RepCol] =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep), oldRep)

      override def buildData(data: U, rep: R, oldData: List[DataCol]): List[DataCol] =
        rep.dataShapeValue.shape.buildData(data, rep.dataShapeValue.rep, oldData)

    }

  }

}