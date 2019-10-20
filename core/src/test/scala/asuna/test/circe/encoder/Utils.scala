package io.circe

import java.util

object Utils {
  def jsonObjectFromMap(link: util.LinkedHashMap[String, Json]): JsonObject = JsonObject.fromLinkedHashMap(link)
}
