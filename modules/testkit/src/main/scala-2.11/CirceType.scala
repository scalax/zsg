package asuna.testkit.circe

import io.circe.ObjectEncoder

object CirceType {

  type JsonObjectEncoder[T] = ObjectEncoder[T]
  val JsonObjectEncoder = ObjectEncoder

}
