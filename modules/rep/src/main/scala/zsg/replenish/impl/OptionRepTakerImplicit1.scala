package zsg.rep.impl

import zsg.rep.OptionRepTaker

trait OptionRepTakerImplicit1 {
  private def identityImpl3[T, I]: OptionRepTaker[T, I] = new OptionRepTaker[T, I] {
    def function(i: T): Option[I] = Option.empty
  }

  private val identityImpl4: OptionRepTaker[Any, Any] = identityImpl3[Any, Any]

  implicit def identityImplicit2[T, I]: OptionRepTaker[T, I] = identityImpl4.asInstanceOf[OptionRepTaker[T, I]]
}
