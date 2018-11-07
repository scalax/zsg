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

  override lazy val modelColumnSymbols: List[Symbol] = List(singleModelSymbol)

}

/*class SingleColumnInfoImpl(_tableColumnSymbol: => Symbol, _tableColumnName: => String, _singleModelSymbol: => Symbol, _singleModelName: => String)
    extends SingleColumnInfo {
  override lazy val tableColumnSymbol: Symbol = _tableColumnSymbol
  override lazy val tableColumnName: String   = _tableColumnName
  override lazy val singleModelSymbol: Symbol = _singleModelSymbol
  override lazy val singleModelName: String   = _singleModelName
}*/

trait MutiplyColumnInfo extends MacroColumnInfo {

  override def tableColumnSymbol: Symbol
  override def tableColumnName: String = tableColumnSymbol.name

  def mutiplyModelSymbol: List[Symbol]
  def mutiplyModelName: List[String] = mutiplyModelSymbol.map(_.name)

  override lazy val modelColumnSymbols: List[Symbol] = mutiplyModelSymbol

}

/*class MutiplyColumnInfoImpl(_tableColumnSymbol: => Symbol,
                            _tableColumnName: => String,
                            _mutiplyModelSymbol: => List[Symbol],
                            _mutiplyModelName: => List[String])
    extends MutiplyColumnInfo {
  override lazy val tableColumnSymbol: Symbol        = _tableColumnSymbol
  override lazy val tableColumnName: String          = _tableColumnName
  override lazy val mutiplyModelSymbol: List[Symbol] = _mutiplyModelSymbol
  override lazy val mutiplyModelName: List[String]   = _mutiplyModelName
}*/

object MacroColumnInfo {
  /*def apply(tableColumnSymbol: Symbol, symbol1: Symbol): SingleColumnInfo = {
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
  }*/
}
