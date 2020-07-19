package zsg.testkit.circe.test2

import zsg.testkit.model.{Test01, Test02, Test03, Test05}

object CirceModel {

  import io.circe.generic.auto._

  val i1_1FromJson = Instance.i1.as[Test01[String]]
  val i1_2FromJson = Instance.i1.as[Test01[Int]]
  val i2FromJson   = Instance.i2.as[Test02]
  val i3FromJson   = Instance.i3.as[Test03]

  val i6FromJson = Instance.i6Json.as[Test05[String]]
  val i7FromJson = Instance.i7Json.as[Test05[String]]
  val i8FromJson = Instance.i8Json.as[Test05[String]]
  val i9FromJson = Instance.i9Json.as[Test05[String]]

}
