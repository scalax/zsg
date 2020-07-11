package zsg.testkit.circe

import io.circe.Encoder

object CirceVersionCompat {

  type JsonObjectEncoder[T] = Encoder.AsObject[T]
  @inline val JsonObjectEncoder = Encoder.AsObject

}
