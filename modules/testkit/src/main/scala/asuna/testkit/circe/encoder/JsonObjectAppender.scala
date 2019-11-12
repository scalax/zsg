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
  //new circe_support.JsonAppenderApplication(t)
}

package circe_support {

  final class JsonAppenderApplication[T](private val t: ByNameImplicit[Encoder[T]]) extends AnyVal with Application2[JsonObjectAppender, PropertyTag[T], T, String] {
    override def application(context: Context2[JsonObjectAppender]): JsonAppenderImpl[T] = new JsonAppenderImpl(t)
  }

  final class JsonAppenderImpl[T](private val t: ByNameImplicit[Encoder[T]]) extends AnyVal with JsonObjectAppender[T, String] {
    override def appendField(tt: T, name: String, m: java.util.LinkedHashMap[String, Json]): Unit = m.put(name, t.value(tt))
  }

}
