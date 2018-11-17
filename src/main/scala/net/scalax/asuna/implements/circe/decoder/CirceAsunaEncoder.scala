package net.scalax.asuna.circe.aaaa

import io.circe.{DecodingFailure, Json}

trait CirceAsunaDecoder {

  type DataType

  val key: String

  def write(json: Json): Either[DecodingFailure, DataType]

}

trait CirceAsunaDecoderImpl[E] extends CirceAsunaDecoder {
  self =>

  override type DataType = E

}
