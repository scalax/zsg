package zsg.rep

trait RepFunction[Input, Rep, Output] {
  def function(i: Input, r: Rep): Output
}
