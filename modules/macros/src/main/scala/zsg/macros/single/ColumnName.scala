package zsg.macros.single

class ColumnName[N <: String]

object ColumnName {
  val any                               = new ColumnName[Nothing]
  def apply[N <: String]: ColumnName[N] = any.asInstanceOf[ColumnName[N]]
}
