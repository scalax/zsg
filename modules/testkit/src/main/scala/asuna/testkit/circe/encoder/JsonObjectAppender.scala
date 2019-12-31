package asuna.testkit.circe.encoder

import java.util

import asuna.macros.ByNameImplicit
import asuna.macros.single.PropertyTag
import asuna.{Application2, Context2}
import io.circe.{Encoder, Json}

abstract class JsonObjectAppender[T, II] {
  def appendField(tt: T, name: II, m: java.util.LinkedHashMap[String, Json]): Unit
}

object JsonObjectAppender {
  implicit final def asunaCirceEncoder[T](implicit t: ByNameImplicit[Encoder[T]]): Application2[JsonObjectAppender, PropertyTag[T], T, String] = {
    val appender = new JsonObjectAppender[T, String] {
      override def appendField(tt: T, name: String, m: util.LinkedHashMap[String, Json]): Unit = {
        m.put(name, t.value(tt))
      }
    }
    new Application2[JsonObjectAppender, PropertyTag[T], T, String] {
      override def application(context: Context2[JsonObjectAppender]): JsonObjectAppender[T, String] = {
        appender
      }
    }
  }
}
