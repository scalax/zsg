package asuna.testkit.circe.encoder

import io.circe.Json

trait JsonObjectAppender[T] {
  def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)]
}
