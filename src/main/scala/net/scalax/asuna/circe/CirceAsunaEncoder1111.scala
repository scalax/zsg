package net.scalax.asuna.circe

import io.circe.JsonObject
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }

import scala.language.experimental.macros

trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
  def write(data: DataType): JsonObject
}

object asunaCirceImpl extends EncoderHelper[CirceAsunaEncoder] with EncoderWrapperHelper[CirceAsunaEncoder, ACirceEncoderWrapper] {

  override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, CirceAsunaEncoder]): ACirceEncoderWrapper[Out, D] = {
    val shape1 = shape
    val rep1 = rep
    new ACirceEncoderWrapper[Out, D] {
      override def write(data: D): JsonObject = {
        val reps = shape1.toLawRep(shape1.wrapRep(rep1)).reps
        val dataList = shape1.buildData(data, shape1.wrapRep(rep1))
        val map = reps.zip(dataList.items).map {
          case (r, d) =>
            val dItem = d.asInstanceOf[r.DataType]
            (r.key, r.write(dItem))
        }.toMap
        JsonObject.fromMap(map)
      }
    }
  }

}

trait CirceAsunaEncoderHelper extends LawCirceAsunaEncoderHelperImplicitProvider11111 {

  implicit def caseOnlyEncoderImplicit[Case]: ForTableInput[EmptyCirceTable, Case, CirceAsunaEncoder] = macro EncoderMapper.EncoderMapperImpl.impl[EmptyCirceTable, Case, CirceAsunaEncoder]

  val asunaCirce = asunaCirceImpl

}