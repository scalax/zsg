package asuna.testkit.circe.encoder

import asuna.macros.ByNameImplicit
import asuna.macros.single.PropertyTag
import asuna.{Application2, Context2}
import io.circe.{Encoder, Json}

trait JsonObjectContent[T, II] extends Any {
  def toAppender(name: II): JsonObjectAppender[T]
}

object JsonObjectContent {
  implicit final def asunaCirceEncoder[T](implicit t: ByNameImplicit[Encoder[T]]): Application2[JsonObjectContent, PropertyTag[T], T, String] = {
    val appender = new JsonObjectContent[T, String] {
      override def toAppender(name: String): JsonObjectAppender[T] = {
        new JsonObjectAppender[T] {
          override def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)] = (name, t.value(tt)) :: m
        }
      }
    }
    new Application2[JsonObjectContent, PropertyTag[T], T, String] {
      override def application(context: Context2[JsonObjectContent]): JsonObjectContent[T, String] = appender
    }
  }
}
