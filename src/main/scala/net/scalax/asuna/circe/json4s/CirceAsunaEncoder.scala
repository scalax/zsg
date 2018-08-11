package net.scalax.asuna.circe.json4s

import org.json4s.JsonAST.JValue

trait CirceAsunaEncoder {

  type DataType

  val key: String

  def write(data: DataType): JValue

}

trait CirceAsunaEncoderImpl[E] extends CirceAsunaEncoder {
  self =>

  override type DataType = E

}