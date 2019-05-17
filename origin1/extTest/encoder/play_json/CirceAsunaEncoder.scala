package net.scalax.asuna.circe.play_json

import play.api.libs.json.JsValue

trait CirceAsunaEncoder {

  type DataType

  val key: String

  def write(data: DataType): JsValue

}

trait CirceAsunaEncoderImpl[E] extends CirceAsunaEncoder {
  self =>

  override type DataType = E

}