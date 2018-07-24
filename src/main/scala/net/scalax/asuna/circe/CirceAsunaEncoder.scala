package net.scalax.asuna.circe

import io.circe.{ Json, JsonObject }
import net.scalax.asuna.core.{ AsunaEncoderContent, CirceEncoderContent }
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }

import scala.language.experimental.macros

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

  implicit def caseOnlyEncoderImplicit[Case]: ForTableInput[EmptyCirceTable, Case, CirceAsunaEncoder] = macro EncoderMapper.EncoderMapperImpl.impl[EmptyCirceTable, Case, CirceAsunaEncoder]

  implicit def columnEncoderWithPropertyName[D, T](implicit mColumnInfo: MacroColumnInfo, enc: CirceEncoderContent.Aux[D, T], circeAndAsunaEncoderContent: AsunaEncoderContent[D, T]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
    (enc.encoderOpt, circeAndAsunaEncoderContent.asunaEncoderOpt) match {

      case (Some(circeEncoder), None) =>
        new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
          override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
            override def write(data: D): (String, Json) = (mColumnInfo.modelColumnName, circeEncoder(data))
          }
          override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
          override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
        }

      case (None, Some(asunaEncoder)) =>
        new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
          override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
            override def write(data: D): (String, Json) = {
              import io.circe.syntax._
              (mColumnInfo.modelColumnName, asunaCirce.effect(asunaEncoder.input(EmptyCirceTable.value)).write(data).asJson)
            }
          }
          override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
          override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
        }

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