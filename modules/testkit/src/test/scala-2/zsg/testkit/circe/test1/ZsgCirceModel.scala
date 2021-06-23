package zsg.testkit.circe.test1

import io.circe.Encoder
import zsg.Application
import zsg.testkit.model._
import zsg.testkit.circe.{ACirce, CirceVersionCompat}

trait ZsgCirceImplicit1 {

  import ZsgCirceImplicit2._

  implicit def test01_en_implicit[T](implicit i: Encoder[T]): CirceVersionCompat.JsonObjectEncoder[Test01[T]] = ACirce.encodeCaseClass
  implicit def test02_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test02]                               = ACirce.encodeCaseClass
  implicit def test03_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test03]                               = ACirce.encodeCaseClass

  implicit def test05_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test05[String]] = ACirce.encodeSealed

  case class Test111(i3: String, i4: Long, i44: Int)

}

object ZsgCirceImplicit1 extends ZsgCirceImplicit1

trait ZsgCirceImplicit2 {

  import ZsgCirceImplicit1._

  implicit def test04_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test04] = ACirce.encodeCaseClass

  implicit def test06_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test06[String]] = ACirce.encodeCaseClass
  implicit def test07_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test07[String]] = ACirce.encodeCaseClass
  implicit def test08_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test08]         = ACirce.encodeCaseClass
  implicit def test09_en_implicit: CirceVersionCompat.JsonObjectEncoder[Test09.type]    = ACirce.encodeCaseObject

}

object ZsgCirceImplicit2 extends ZsgCirceImplicit2

object ZsgCirceModel {

  import io.circe.syntax._
  import ZsgCirceImplicit1._
  import ZsgCirceImplicit2._

  val i1Json = Instance.i1.asJson
  val i2Json = Instance.i2.asJson
  val i3Json = Instance.i3.asJson

  val i6Json = Instance.i6.asJson
  val i7Json = Instance.i7.asJson
  val i8Json = Instance.i8.asJson
  val i9Json = Instance.i9.asJson

}
