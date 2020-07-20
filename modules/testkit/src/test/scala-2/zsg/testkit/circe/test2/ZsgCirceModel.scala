package zsg.testkit.circe.test2

import zsg.testkit.circe.ACirce
import io.circe.Decoder
import zsg.testkit.model._

trait ZsgCirceImplicit1 {

  import ZsgCirceImplicit2._

  implicit def test02_de_implicit: Decoder[Test02] = ACirce.decodeCaseClass
  implicit def test04_de_implicit: Decoder[Test04] = ACirce.decodeCaseClass

}

object ZsgCirceImplicit1 extends ZsgCirceImplicit1

trait ZsgCirceImplicit2 {

  import ZsgCirceImplicit1._

  implicit def test01_de_implicit[T](implicit de: Decoder[T]): Decoder[Test01[T]] = ACirce.decodeCaseClass
  implicit def test03_de_implicit: Decoder[Test03]                                = ACirce.decodeCaseClass

  implicit def test05_de_implicit: Decoder[Test05[String]] = ACirce.decodeSealed
  implicit def test06_de_implicit: Decoder[Test06[String]] = ACirce.decodeCaseClass
  implicit def test07_de_implicit: Decoder[Test07[String]] = ACirce.decodeCaseClass
  implicit def test08_de_implicit: Decoder[Test08]         = ACirce.decodeCaseClass
  implicit def test09_de_implicit: Decoder[Test09.type]    = Decoder.instance(f => Right(Test09))

}

object ZsgCirceImplicit2 extends ZsgCirceImplicit2

object ZsgCirceModel {

  import ZsgCirceImplicit1._
  import ZsgCirceImplicit2._

  val i1_1FromJson = Instance.i1.as[Test01[String]]
  val i1_2FromJson = Instance.i1.as[Test01[Int]]
  val i2FromJson   = Instance.i2.as[Test02]
  val i3FromJson   = Instance.i3.as[Test03]

  val i6FromJson = Instance.i6Json.as[Test05[String]]
  val i7FromJson = Instance.i7Json.as[Test05[String]]
  val i8FromJson = Instance.i8Json.as[Test05[String]]
  val i9FromJson = Instance.i9Json.as[Test05[String]]

}
