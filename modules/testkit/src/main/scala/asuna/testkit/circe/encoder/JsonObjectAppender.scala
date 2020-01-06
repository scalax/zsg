package asuna.testkit.circe.encoder

import io.circe.Json

abstract class JsonObjectAppender[T] {
  def appendField(tt: T, m: java.util.LinkedHashMap[String, Json]): Unit
}
