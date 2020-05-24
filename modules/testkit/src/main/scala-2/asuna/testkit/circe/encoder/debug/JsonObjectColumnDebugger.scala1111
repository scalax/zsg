package zsg.testkit.circe.encoder.debug

import zsg.PropertyTag
import zsg.testkit.circe.encoder.JsonObjectContent

class JsonObjectColumnDebugger[ColumnName, ColumnIndex, ColumnType] {
  def debug(implicit t: JsonObjectColumnInfo[ColumnName, ColumnIndex, ColumnType]): JsonObjectContent[PropertyTag[ColumnType], ColumnType, String] = t.objectContent
}
