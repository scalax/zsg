package zsg.testkit.circe.encoder.debug

import zsg.PropertyTag
import zsg.testkit.circe.encoder.JsonObjectContent

import scala.annotation.implicitNotFound

@implicitNotFound(
  "\nImplicit for io.circe.Encoder or JsonObjectContent not found\nColumn index: ${ColumnIndex} (0-based)\nColumn name : ${ColumnName}\nColumn type : ${ColumnType}"
)
class JsonObjectColumnInfo[ColumnName, ColumnIndex, ColumnType](val objectContent: JsonObjectContent[PropertyTag[ColumnType], ColumnType, String])

object JsonObjectColumnInfo {
  implicit final def zsgCirceEncoder[ColumnName, ColumnIndex, T](
    implicit t: JsonObjectContent[PropertyTag[T], T, String]
  ): JsonObjectColumnInfo[ColumnName, ColumnIndex, T] = new JsonObjectColumnInfo[ColumnName, ColumnIndex, T](t)
}
