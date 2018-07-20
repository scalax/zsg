package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacoColumnInfo
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper }

trait CirceAsunaEncoder {

  type DataType

  def write(data: DataType): (String, Json)

}

trait CirceAsunaEncoderImpl[E] extends AtomicColumn[E, CirceAsunaEncoder] with CirceAsunaEncoder {
  self =>

  override type DataType = E
  override def common: CirceAsunaEncoder = self

}

trait CirceAsunaEncoderHelper {

  implicit def columnEncoderWithPropertyName[A](implicit mColumnInfo: MacoColumnInfo, encoder: Encoder[A]): EncoderShape[Placeholder[A], A, CirceAsunaEncoderImpl[A], CirceAsunaEncoder] = {
    new EncoderShape[Placeholder[A], A, CirceAsunaEncoderImpl[A], CirceAsunaEncoder] {
      override def wrapRep(base: Placeholder[A]): CirceAsunaEncoderImpl[A] =
        new CirceAsunaEncoderImpl[A] {
          override def write(data: A): (String, Json) = (mColumnInfo.modelColumnName, encoder(data))
        }
      override def toLawRep(base: CirceAsunaEncoderImpl[A]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
      override def buildData(data: A, rep: CirceAsunaEncoderImpl[A]): DataGroup = DataGroup(List(data))
    }
  }

  trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
    def write(data: DataType): JsonObject
  }

  object asunaCirce extends EncoderHelper[CirceAsunaEncoder] with EncoderWrapperHelper[CirceAsunaEncoder, ACirceEncoderWrapper] {
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
              r.write(dItem)
          }.toMap
          JsonObject.fromMap(map)
        }
      }
    }
  }

}