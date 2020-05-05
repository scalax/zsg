package io.circe

import java.util

object Utils {
  final def jsonObjectFromMap(link: util.LinkedHashMap[String, Json]): JsonObject = JsonObject.fromLinkedHashMap(link)
}
