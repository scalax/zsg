package zsg.macros.single

class ColumnName[N]

object ColumnName {
  val any                     = new ColumnName[Any]
  def apply[N]: ColumnName[N] = any.asInstanceOf[ColumnName[N]]
}
