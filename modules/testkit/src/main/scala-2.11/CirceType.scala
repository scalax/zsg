package zsg.testkit.circe

import io.circe.ObjectEncoder

object CirceType {

  type JsonObjectEncoder[T] = ObjectEncoder[T]
  @inline val JsonObjectEncoder = ObjectEncoder

}
