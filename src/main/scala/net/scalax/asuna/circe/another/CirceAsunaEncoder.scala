package net.scalax.asuna.circe.aaaa

import io.circe.{ Json, JsonObject }
import net.scalax.asuna.core.common.AtomicColumn
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

  import io.circe.syntax._

  override type DataType = List[E]

  val rep: Rep

  val shape: EncoderShape[Rep, E, Rep, CirceAsunaEncoder]

  override val key: String

  def write(data: List[E]): Json = {
    val reps = shape.toLawRep(rep, List.empty)
    data.map { d =>
      val dataList = shape.buildData(d, rep, List.empty)
      val jsonMap = dataList.zip(reps).map { case (d, r) => (r.key, r.write(d.asInstanceOf[r.DataType])) }.toMap
      JsonObject.fromMap(jsonMap).asJson
    }.asJson
  }

}