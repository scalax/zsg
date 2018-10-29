package net.scalax.asuna.mapper.common

trait MacroColumnInfo {

  val tableColumnSymbol: Symbol
  val modelColumnSymbols: List[Symbol]

}

case class MacroColumnInfoImpl(
    override val tableColumnSymbol: Symbol
  , override val modelColumnSymbols: List[Symbol]
) extends MacroColumnInfo
