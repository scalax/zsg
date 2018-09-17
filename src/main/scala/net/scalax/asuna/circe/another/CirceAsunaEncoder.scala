package net.scalax.asuna.circe.aaaa

import io.circe.{Encoder, Json, JsonObject}
import net.scalax.asuna.core.encoder.EncoderShape

trait CirceAsunaEncoder {

  type DataType

  val key: String

  def write(data: DataType): Json

}

trait CirceAsunaEncoderImpl[E] extends CirceAsunaEncoder {
  self =>

  override type DataType = E

}

trait ListCirceAsunaEncoder[Rep, E] extends CirceAsunaEncoder {
  self =>

  override type DataType = List[E]

  val rep: Rep

  val shape: EncoderShape.Aux[Rep, E, Rep, List[CirceAsunaEncoder], List[(String, Json)]]

  val listEncoder = implicitly[Encoder[List[Json]]]

  override val key: String

  override def write(data: List[E]): Json = {
    listEncoder(data.map { d =>
      val dataList = shape.buildData(d, rep, List.empty)
      Json.fromJsonObject(JsonObject.fromIterable(dataList))
    })
  }

}

trait OptionCirceAsunaEncoder[Rep, E] extends CirceAsunaEncoder {
  self =>

  override type DataType = Option[E]

  val rep: Rep

  val shape: EncoderShape.Aux[Rep, E, Rep, List[CirceAsunaEncoder], List[(String, Json)]]

  val optEncoder = implicitly[Encoder[Option[Json]]]

  override val key: String

  override def write(data: Option[E]): Json = {
    optEncoder(data.map { d =>
      val dataList = shape.buildData(d, rep, List.empty)
      Json.fromJsonObject(JsonObject.fromIterable(dataList))
    })
  }

}
