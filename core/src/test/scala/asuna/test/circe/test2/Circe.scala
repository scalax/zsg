package asuna.test.circe.test2

import asuna.test.model.{Test01, Test02, Test03}

object Circe {

  import io.circe.generic.auto._

  val i1_1Json = Instance.i1.as[Test01[String]]
  val i1_2Json = Instance.i1.as[Test01[Int]]
  val i2Json   = Instance.i2.as[Test02]
  val i3Json   = Instance.i3.as[Test03]

}
