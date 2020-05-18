package zsg.testkit.circe

import io.circe.Encoder

object CirceType {

  type JsonObjectEncoder[T] = Encoder.AsObject[T]
  @inline val JsonObjectEncoder = Encoder.AsObject

}
