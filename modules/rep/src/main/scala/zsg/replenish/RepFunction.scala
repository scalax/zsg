package zsg.rep

trait RepFunction[Input, Rep, Output] {
  def function(i: Input, r: Rep): Output
}

object RepFunction {
  private def identityImpl1[I, Rep]: RepFunction[I, Rep, I] = new RepFunction[I, Rep, I] {
    def function(i: I, r: Rep): I = i
  }

  private val identityImpl2: RepFunction[Any, Any, Any] = identityImpl1[Any, Any]

  def identity[I, Rep]: RepFunction[I, Rep, I] = identityImpl2.asInstanceOf[RepFunction[I, Rep, I]]

  def apply[Input, Rep, Output](i: (Input, Rep) => Output): RepFunction[Input, Rep, Output] = new RepFunction[Input, Rep, Output] {
    override def function(ii: Input, r: Rep): Output = i(ii, r)
  }
}
