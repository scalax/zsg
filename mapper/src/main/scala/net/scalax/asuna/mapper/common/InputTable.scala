package net.scalax.asuna.helper.encoder

trait InputTable[Table, OutPut] {
  def inputTable(table: Table): OutPut
}

object InputTable {
  def apply[T, O](f: T => O): InputTable[T, O] = new InputTable[T, O] {
    override def inputTable(table: T): O = f(table)
  }
}
