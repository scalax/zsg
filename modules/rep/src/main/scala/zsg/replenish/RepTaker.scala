package zsg.rep

abstract class RepTaker[Input, Rep] {
  def function(i: Input): Rep
}

object RepTaker {
  private def identityImpl1[I]: RepTaker[I, I] = new RepTaker[I, I] {
    def function(i: I): I = i
  }

  private val identityImpl2: RepTaker[Any, Any] = identityImpl1[Any]

  implicit def identityImplicit[I]: RepTaker[I, I] = identityImpl2.asInstanceOf[RepTaker[I, I]]
}
