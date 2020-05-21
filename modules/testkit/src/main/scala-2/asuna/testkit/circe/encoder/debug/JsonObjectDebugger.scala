package zsg.testkit.circe.encoder.debug

import zsg.PropertyTag
import zsg.macros.single.DebugColumnInfo

class JsonObjectDebugger[PropertyTypeTag, PropertyInfoTag, Target](val target: Target)

object JsonObjectDebugger {

  implicit final def zsgCirceEncoder[PropertyTypeTag, ColumnIndex, ColumnName, Target]
    : JsonObjectDebugger[PropertyTag[PropertyTypeTag], DebugColumnInfo[ColumnIndex, ColumnName], JsonObjectColumnInfo[ColumnName, ColumnIndex, PropertyTypeTag]] =
    new JsonObjectDebugger[PropertyTag[PropertyTypeTag], DebugColumnInfo[ColumnIndex, ColumnName], JsonObjectColumnInfo[ColumnName, ColumnIndex, PropertyTypeTag]](
      new JsonObjectColumnInfo[ColumnName, ColumnIndex, PropertyTypeTag]
    )

}
