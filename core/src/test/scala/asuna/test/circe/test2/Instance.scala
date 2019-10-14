package asuna.test.circe.test2

import asuna.test.model._

object Instance {

  import io.circe.syntax._
  import io.circe.generic.auto._

  val i1 = Test01(2, "test01", 123).asJson
  val i2 = Test02("test02", 123).asJson
  val i3 = Test03("test06", 123, Option(Test04("test07", 789, List(Test03("test06", 456, Option.empty))))).asJson

}
