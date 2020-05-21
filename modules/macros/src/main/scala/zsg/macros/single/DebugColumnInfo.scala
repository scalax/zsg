package zsg.macros.single

class DebugColumnInfo[ColumnIndex, ColumnName]

object DebugColumnInfo {
  def apply[ColumnIndex, ColumnName]: DebugColumnInfo[ColumnIndex, ColumnName] = new DebugColumnInfo[ColumnIndex, ColumnName]
}
