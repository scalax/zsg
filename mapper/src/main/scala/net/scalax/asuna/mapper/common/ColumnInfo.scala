package net.scalax.asuna.mapper.common

abstract sealed trait MacroColumnInfo {

  val tableColumnSymbol: Symbol
  val modelColumnSymbols: List[Symbol]

}

trait SingleColumnInfo extends MacroColumnInfo {

  override val tableColumnSymbol: Symbol
  val singleModelSymbol: Symbol
  override lazy val modelColumnSymbols: List[Symbol] = List(singleModelSymbol)

}

trait MutiplyColumnInfo extends MacroColumnInfo {

  override val tableColumnSymbol: Symbol
  val mutiplyModelSymbol: List[Symbol]
  override lazy val modelColumnSymbols: List[Symbol] = mutiplyModelSymbol

}

object MacroColumnInfo {
  def apply(tableColumnSymbol: Symbol, symbol1: Symbol): SingleColumnInfo = {
    val tableColumnSymbol1 = tableColumnSymbol
    new SingleColumnInfo {
      override val tableColumnSymbol = tableColumnSymbol1
      override val singleModelSymbol = symbol1
    }
  }

  def apply(tableColumnSymbol: Symbol, symbol1: Symbol, symbol2: Symbol, symbols: Symbol*): MutiplyColumnInfo = {
    val tableColumnSymbol1 = tableColumnSymbol
    new MutiplyColumnInfo {
      override val tableColumnSymbol  = tableColumnSymbol1
      override val mutiplyModelSymbol = symbol1 :: symbol2 :: symbols.toList
    }
  }
}
