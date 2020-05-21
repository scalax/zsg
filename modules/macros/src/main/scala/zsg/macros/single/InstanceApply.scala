package zsg.macros.single

class InstanceApply {
  def to[ColumnIndex, ColumnName]: DebugColumnInfo[ColumnIndex, ColumnName] = DebugColumnInfo[ColumnIndex, ColumnName]
}
object InstanceApply {
  private val value: InstanceApply = new InstanceApply
  def apply: InstanceApply         = value
}
