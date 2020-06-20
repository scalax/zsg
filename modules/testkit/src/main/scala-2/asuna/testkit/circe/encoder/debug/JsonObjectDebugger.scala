package zsg.testkit.circe.encoder.debug

import zsg.PropertyTag
import zsg.macros.single.DebugColumnInfo

class JsonObjectDebugger[PropertyTypeTag, NameTag, PropertyInfoTag, Target](val target: Target)

object JsonObjectDebugger {

  implicit final def zsgCirceEncoder[PropertyTypeTag, NameTag, ColumnIndex, ColumnName, Target]
    : JsonObjectDebugger[PropertyTag[PropertyTypeTag], NameTag, DebugColumnInfo[ColumnIndex, ColumnName], JsonObjectColumnInfo[
      ColumnName,
      ColumnIndex,
      PropertyTypeTag,
      NameTag
    ]] =
    new JsonObjectDebugger[PropertyTag[PropertyTypeTag], NameTag, DebugColumnInfo[ColumnIndex, ColumnName], JsonObjectColumnInfo[
      ColumnName,
      ColumnIndex,
      PropertyTypeTag,
      NameTag
    ]](
      new JsonObjectColumnInfo[ColumnName, ColumnIndex, PropertyTypeTag, NameTag]
    )

}
