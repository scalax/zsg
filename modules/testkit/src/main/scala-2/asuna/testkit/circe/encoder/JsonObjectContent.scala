package zsg.testkit.circe.encoder

import zsg.macros.ByNameImplicit
import zsg.PropertyTag
import io.circe.{Encoder, Json}

trait JsonObjectContent[P, T, II] extends Any {
  def toAppender(name: II): JsonObjectAppender[T]
}

object JsonObjectContent {

  @inline implicit final def asunaCirceEncoder[T](implicit t: ByNameImplicit[Encoder[T]]): JsonObjectContent[PropertyTag[T], T, String] =
    new JsonObjectContent[PropertyTag[T], T, String] {
      override def toAppender(name: String): JsonObjectAppender[T] = {
        new JsonObjectAppender[T] {
          override def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)] = (name, t.value(tt)) :: m
        }
      }
    }

}
