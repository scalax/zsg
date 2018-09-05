package net.scalax.asuna.helper

trait MacroColumnInfo {

  val tableColumnName: String
  val modelColumnName: String

  val tableColumnSymbol: Symbol
  val modelColumnSymbol: Symbol

}

case class MacroColumnInfoImpl(
  override val tableColumnName: String,
  override val tableColumnSymbol: Symbol,
  override val modelColumnName: String,
  override val modelColumnSymbol: Symbol) extends MacroColumnInfo