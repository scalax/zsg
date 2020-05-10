package asuna.testkit.circe.encoder

import asuna.macros.ByNameImplicit
import asuna.{Application3, Context3, PropertyTag}
import io.circe.{Encoder, Json}

trait JsonObjectContent[P, T, II] extends Any {
  def toAppender(name: II): JsonObjectAppender[T]
}

object JsonObjectContent {
  implicit final def asunaCirceEncoder[T](implicit t: ByNameImplicit[Encoder[T]]): Application3[JsonObjectContent, PropertyTag[T], T, String] = {
    val appender = new JsonObjectContent[PropertyTag[T], T, String] {
      override def toAppender(name: String): JsonObjectAppender[T] = {
        new JsonObjectAppender[T] {
          override def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)] = (name, t.value(tt)) :: m
        }
      }
    }
    new Application3[JsonObjectContent, PropertyTag[T], T, String] {
      override def application(context: Context3[JsonObjectContent]): JsonObjectContent[PropertyTag[T], T, String] = appender
    }
  }
}
