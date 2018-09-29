package net.scalax.asuna.circe

import net.scalax.asuna.circe.aaaa.{CirceAsunaEncoderImpl, EncoderPoly}

object JsonEncoderHelper {
  def toJson[D](data: D)(implicit cv: CirceAsunaEncoderImpl[D, EncoderPoly]) = cv.write(data)
  def fetchEncoder[D](implicit cv: CirceAsunaEncoderImpl[D, EncoderPoly])    = cv
}
