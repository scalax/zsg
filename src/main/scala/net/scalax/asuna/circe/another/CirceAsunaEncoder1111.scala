package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.circe.another.CirceEncoderConfirmOrder
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
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

trait CirceAsunaEncoderHelper {

  //implicit def caseOnlyEncoderImplicit[Case]: ForTableInput[EmptyCirceTable, Case, CirceAsunaEncoder] = macro EncoderMapper.EncoderMapperImpl.impl[EmptyCirceTable, Case, CirceAsunaEncoder]

  implicit def columnEncoderWithPropertyName[D](implicit mColumnInfo: MacroColumnInfo, enc: CirceEncoderConfirmOrder[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
    def exsistingCirceEncoderToShape(proName: String, circeEncoder: Encoder[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName + "1111"
          override def write(data: D): Json = circeEncoder(data)
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))

        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
      }
    }

    def asunaInputTableToShape(proName: String, asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName + "2222"
          override def write(data: D): Json = {
            import io.circe.syntax._
            asunaCirceImpl.effect(asunaEncoder.input(EmptyCirceTable.value)).write(data).asJson
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
      }
    }
    (enc.encoderOpt, enc.inputTableOpt) match {
      case (Some(encoder), None) => exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, encoder)
      case (None, Some(inputTable)) => asunaInputTableToShape(mColumnInfo.modelColumnName, inputTable)
      //case n1: CirceEncoderContent[D] => exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, n1.circeEncoder)
      //case n2: AsunaEncoderContent[D] => asunaInputTableToShape(mColumnInfo.modelColumnName, n2.asunaEncoder)
    }
  }

  val asunaCirce = asunaCirceImpl

}