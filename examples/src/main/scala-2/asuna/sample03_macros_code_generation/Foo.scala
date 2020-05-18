package zsg.sample03_macros_code_generation

sealed trait Foo

class Bar1                  extends Foo
case class Bar2(ii: String) extends Foo
class Bar3(val age: Int)    extends Foo
case class Bar4()           extends Foo
