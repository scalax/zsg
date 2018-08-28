package net.scalax.asuna.circe.aaaa

import io.circe.Json

trait CirceAsunaDecoder {

  type DataType

  val key: String

  def write(json: Json): Either[Exception, DataType]

}

trait CirceAsunaDecoderImpl[E] extends CirceAsunaDecoder {
  self =>

  override type DataType = E

}