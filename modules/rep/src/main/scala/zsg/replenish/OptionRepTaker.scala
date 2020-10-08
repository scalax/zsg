package zsg.rep

abstract class OptionRepTaker[Input, Rep] {
  def function(i: Input): Option[Rep]
}

object OptionRepTaker extends impl.OptionRepTakerImplicit1 {
  private def identityImpl1[I]: OptionRepTaker[I, I] = new OptionRepTaker[I, I] {
    def function(i: I): Option[I] = Option(i)
  }

  private val identityImpl2: OptionRepTaker[Any, Any] = identityImpl1[Any]

  implicit def identityImplicit[I]: OptionRepTaker[I, I] = identityImpl2.asInstanceOf[OptionRepTaker[I, I]]
}
