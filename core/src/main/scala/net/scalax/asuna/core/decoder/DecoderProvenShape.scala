package net.scalax.asuna.core.decoder

trait DecoderProvenShape[U, RepCol, DataCol] {
  val dataShapeValue: DecoderShapeValue[U, RepCol, DataCol]
}

object DecoderProvenShape {

  implicit def dataProvenShapeShape[U, RepCol, DataCol, R <: DecoderProvenShape[U, RepCol, DataCol]]: DecoderShape.Aux[R, U, R, RepCol, DataCol] = {

    new DecoderShape[R, U, RepCol, DataCol] {
      self =>

      override type Target = R

      override def wrapRep(base: R): R = base

      override def toLawRep(base: R, baseRep: RepCol): RepCol =
        base.dataShapeValue.shape.toLawRep(base.dataShapeValue.shape.wrapRep(base.dataShapeValue.rep), baseRep)

      override def takeData(rep: R, oldData: DataCol): SplitData[U, DataCol] =
        rep.dataShapeValue.shape.takeData(rep.dataShapeValue.rep, oldData)

    }

  }

}