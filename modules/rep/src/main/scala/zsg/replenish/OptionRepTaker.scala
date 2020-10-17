package zsg.rep

import zsg.macros.utils.PlaceHolder

abstract class OptionRepTaker[Input, Rep] {
  def function(i: Input): Option[Rep]
}

object OptionRepTaker extends impl.OptionRepTakerImplicit1 {
  private def identityImpl1[I]: OptionRepTaker[I, I] = new OptionRepTaker[I, I] {
    def function(i: I): Option[I] = Some(i)
  }

  private val identityImpl2: OptionRepTaker[Any, Any] = identityImpl1[Any]

  implicit def identityImplicit[I]: OptionRepTaker[I, I] = identityImpl2.asInstanceOf[OptionRepTaker[I, I]]

  private def emptyImpl3[I2]: OptionRepTaker[PlaceHolder, I2] = new OptionRepTaker[PlaceHolder, I2] {
    def function(i: PlaceHolder): Option[I2] = Option.empty
  }

  private val emptyImpl4: OptionRepTaker[PlaceHolder, Any] = emptyImpl3[Any]

  implicit def emptyImplicit2[I]: OptionRepTaker[PlaceHolder, I] = emptyImpl4.asInstanceOf[OptionRepTaker[PlaceHolder, I]]
}
