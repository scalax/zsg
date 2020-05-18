package zsg.testkit.circe.test2

import zsg.testkit.model._

object Instance {

  import io.circe.syntax._
  import io.circe.generic.auto._

  val i1 = Test01(2, "test01", 123).asJson
  val i2 = Test02("test02", 123).asJson
  val i3 = Test03("test06", 123, Option(Test04("test07", 789, List(Test03("test06", 456, Option.empty))))).asJson

  val i6: Test05[String] = Test06("test06", 2)
  val i7: Test05[String] = Test07("7", 2)
  val i8: Test05[String] = Test08("test08", 2)
  val i9: Test05[String] = Test09

  val i6Json = i6.asJson
  val i7Json = i7.asJson
  val i8Json = i8.asJson
  val i9Json = i9.asJson

}
