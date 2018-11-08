package net.scalax.asuna.mapper.common

abstract sealed trait MacroColumnInfo {

  def tableColumnSymbol: Symbol
  def tableColumnName: String
  def modelColumnSymbols: List[Symbol]

}

trait SingleColumnInfo extends MacroColumnInfo {

  override def tableColumnSymbol: Symbol
  override def tableColumnName: String = tableColumnSymbol.name

  def singleModelSymbol: Symbol
  def singleModelName: String = singleModelSymbol.name

  override def modelColumnSymbols: List[Symbol] = List(singleModelSymbol)

}

trait MutiplyColumnInfo extends MacroColumnInfo {

  override def tableColumnSymbol: Symbol
  override def tableColumnName: String = tableColumnSymbol.name

  def mutiplyModelSymbol: List[Symbol]
  def mutiplyModelName: List[String] = mutiplyModelSymbol.map(_.name)

  override def modelColumnSymbols: List[Symbol] = mutiplyModelSymbol

}

object MacroColumnInfo {

  class SingleColumnInfoImpl(override val tableColumnSymbol: Symbol, override val singleModelSymbol: Symbol)         extends SingleColumnInfo
  class MutiplyColumnInfoImpl(override val tableColumnSymbol: Symbol, override val mutiplyModelSymbol: List[Symbol]) extends MutiplyColumnInfo

  def apply(tableColumnSymbol: Symbol, symbol1: Symbol): SingleColumnInfo = {
    /*val tableColumnSymbol1 = tableColumnSymbol
    new SingleColumnInfo {
      override val tableColumnSymbol = tableColumnSymbol1
      override val singleModelSymbol = symbol1
    }*/
    new SingleColumnInfoImpl(tableColumnSymbol = tableColumnSymbol, singleModelSymbol = symbol1)
  }

  def apply(tableColumnSymbol: Symbol, symbol1: Symbol, symbol2: Symbol, symbols: Symbol*): MutiplyColumnInfo = {
    /*val tableColumnSymbol1 = tableColumnSymbol
    new MutiplyColumnInfo {
      override val tableColumnSymbol  = tableColumnSymbol1
      override val mutiplyModelSymbol = symbol1 :: symbol2 :: symbols.toList
    }*/
    new MutiplyColumnInfoImpl(tableColumnSymbol = tableColumnSymbol, mutiplyModelSymbol = symbol1 :: symbol2 :: symbols.toList)
  }
}
