package net.scalax.asuna.mapper.common

abstract sealed trait MacroColumnInfo {

  def tableColumnSymbol: Symbol
  def tableColumnName: String
  def modelColumnSymbols: List[Symbol]

}

trait SingleColumnInfo extends MacroColumnInfo {

  override def tableColumnSymbol: Symbol
  override def tableColumnName: String

  def singleModelSymbol: Symbol
  def singleModelName: String = singleModelSymbol.name

  override def modelColumnSymbols: List[Symbol]

}

trait MutiplyColumnInfo extends MacroColumnInfo {

  override def tableColumnSymbol: Symbol
  override def tableColumnName: String

  def mutiplyModelSymbol: List[Symbol]
  def mutiplyModelName: List[String]

  override def modelColumnSymbols: List[Symbol]

}

object MacroColumnInfo {

  class SingleColumnInfoImpl(override val tableColumnSymbol: Symbol, override val singleModelSymbol: Symbol) extends SingleColumnInfo {
    override def tableColumnName: String          = tableColumnSymbol.name
    override def modelColumnSymbols: List[Symbol] = List(tableColumnSymbol)
  }
  class MutiplyColumnInfoImpl(override val tableColumnSymbol: Symbol, override val mutiplyModelSymbol: List[Symbol]) extends MutiplyColumnInfo {
    override def tableColumnName: String          = tableColumnSymbol.name
    override def mutiplyModelName: List[String]   = mutiplyModelSymbol.map(_.name)
    override def modelColumnSymbols: List[Symbol] = mutiplyModelSymbol
  }

  def apply(tableColumnSymbol: Symbol, symbol1: Symbol): SingleColumnInfo = {
    new SingleColumnInfoImpl(tableColumnSymbol = tableColumnSymbol, singleModelSymbol = symbol1)
  }

  def apply(tableColumnSymbol: Symbol, symbol1: Symbol, symbol2: Symbol, symbols: Symbol*): MutiplyColumnInfo = {
    new MutiplyColumnInfoImpl(tableColumnSymbol = tableColumnSymbol, mutiplyModelSymbol = symbol1 :: symbol2 :: symbols.toList)
  }
}
