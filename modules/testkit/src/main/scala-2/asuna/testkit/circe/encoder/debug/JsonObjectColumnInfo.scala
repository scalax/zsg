package zsg.testkit.circe.encoder.debug

import zsg.macros.ByNameImplicit
import zsg.{DebugMessage1, PropertyTag}
import zsg.testkit.circe.encoder.JsonObjectContent

import scala.annotation.implicitNotFound

@implicitNotFound(
  "\nImplicit for io.circe.Encoder or JsonObjectContent not found\nColumn index: ${ColumnIndex} (0-based)\nColumn name : ${ColumnName}\nColumn type : ${ColumnType}"
)
class JsonObjectColumnInfo[ColumnName, ColumnIndex, ColumnType] extends DebugMessage1[JsonObjectColumnInfo[ColumnName, ColumnIndex, ColumnType]]

object JsonObjectColumnInfo {

  implicit final def zsgCirceEncoder[ColumnName, ColumnIndex, T](
    implicit t: ByNameImplicit[JsonObjectContent[PropertyTag[T], T, String]]
  ): JsonObjectColumnInfo[ColumnName, ColumnIndex, T] = new JsonObjectColumnInfo[ColumnName, ColumnIndex, T]

}
