package asuna.testkit.circe

import io.circe.Encoder

object CirceType {

  type JsonObjectEncoder[T] = Encoder.AsObject[T]
  val JsonObjectEncoder = Encoder.AsObject

}
