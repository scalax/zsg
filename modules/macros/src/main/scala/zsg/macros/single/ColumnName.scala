package zsg.macros.single

class ColumnName[N <: StringName]

object ColumnName {
  def apply[N <: StringName] = new ColumnName[N]
}
