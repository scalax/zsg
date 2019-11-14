package asuna.testkit.circe.encoder

import asuna.macros.{ByNameImplicit, PropertyTag}
import asuna.{Application2, Context2}
import io.circe.{Encoder, Json}

trait JsonObjectAppender[T, II] extends Any {
  def appendField(tt: T, name: II, m: java.util.LinkedHashMap[String, Json]): Unit
}

object JsonObjectAppender {
  implicit final def asunaCirceEncoder[T](implicit t: ByNameImplicit[Encoder[T]]): Application2[JsonObjectAppender, PropertyTag[T], T, String] = {
    context => (tt, name, m) =>
      m.put(name, t.value(tt))
  }
}
