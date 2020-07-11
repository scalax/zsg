package zsg.testkit.circe.encoder.debug

import zsg.PropertyTag
import zsg.testkit.circe.encoder.JsonObjectAppender

import scala.annotation.implicitNotFound

@implicitNotFound(
  "\nImplicit for io.circe.Encoder or JsonObjectAppender not found\nColumn index: ${ColumnIndex} (0-based)\nColumn name : ${ColumnName}\nColumn type : ${ColumnType}"
)
class JsonObjectColumnInfo[ColumnName, ColumnIndex, ColumnType, NameType]

object JsonObjectColumnInfo {
  implicit final def zsgCirceEncoder[ColumnName, ColumnIndex, T, N](implicit
    t: JsonObjectAppender[PropertyTag[T], N, T]
  ): JsonObjectColumnInfo[ColumnName, ColumnIndex, T, N] = new JsonObjectColumnInfo[ColumnName, ColumnIndex, T, N]
}
