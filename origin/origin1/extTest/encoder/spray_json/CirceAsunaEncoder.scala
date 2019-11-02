package net.scalax.asuna.circe.spray_json

import spray.json._

trait CirceAsunaEncoder {

  type DataType

  val key: String

  def write(data: DataType): JsValue

}

trait CirceAsunaEncoderImpl[E] extends CirceAsunaEncoder {
  self =>

  override type DataType = E

}