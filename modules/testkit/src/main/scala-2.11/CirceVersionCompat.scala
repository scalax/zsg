package zsg.testkit.circe

import io.circe.ObjectEncoder

object CirceVersionCompat {

  type JsonObjectEncoder[T] = ObjectEncoder[T]
  @inline val JsonObjectEncoder = ObjectEncoder

}
