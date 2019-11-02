package io.circe

import java.util

object JsonObjectHelper {
  final def fromLinkedHashMap(map: util.LinkedHashMap[String, Json]): JsonObject = JsonObject.fromLinkedHashMap(map)
}
