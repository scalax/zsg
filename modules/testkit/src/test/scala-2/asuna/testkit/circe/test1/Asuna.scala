package zsg.testkit.circe.test1

import java.net.URI

import io.circe.Encoder
import zsg.macros.single.ZsgDebugChecker
import zsg.testkit.circe.encoder.AsunaJsonObjectContext
import zsg.testkit.model._
import zsg.testkit.circe.{ACirce, CirceType}

trait Poly1 {

  import Poly2._

  implicit def test01_en_implicit[T](implicit i: Encoder[T]): CirceType.JsonObjectEncoder[Test01[T]] = ACirce.encodeCaseClass
  implicit def test02_en_implicit: CirceType.JsonObjectEncoder[Test02]                               = ACirce.encodeCaseClass
  implicit def test03_en_implicit: CirceType.JsonObjectEncoder[Test03]                               = ACirce.encodeCaseClass

  implicit def test05_en_implicit: CirceType.JsonObjectEncoder[Test05[String]] = ACirce.encodeSealed

  case class Test111(i3: String, i4: Long, i44: Int)

  val enCon1                               = ACirce.debugEncodeCaseClass[Test111]
  implicit val i: enCon1.EncoderObjectType = enCon1.toEncoder(enCon1.checker.checkCaseClass(enCon1.checker.context)(enCon1.instance))

}

object Poly1 extends Poly1

trait Poly2 {

  import Poly1._

  implicit def test04_en_implicit: CirceType.JsonObjectEncoder[Test04] = ACirce.encodeCaseClass

  implicit def test06_en_implicit: CirceType.JsonObjectEncoder[Test06[String]] = ACirce.encodeCaseClass
  implicit def test07_en_implicit: CirceType.JsonObjectEncoder[Test07[String]] = ACirce.encodeCaseClass
  implicit def test08_en_implicit: CirceType.JsonObjectEncoder[Test08]         = ACirce.encodeCaseClass
  implicit def test09_en_implicit: CirceType.JsonObjectEncoder[Test09.type]    = ACirce.encodeCaseObject

}

object Poly2 extends Poly2

object Asuna {

  import io.circe.syntax._
  import Poly1._
  import Poly2._

  val i1Json = Instance.i1.asJson
  val i2Json = Instance.i2.asJson
  val i3Json = Instance.i3.asJson

  val i6Json = Instance.i6.asJson
  val i7Json = Instance.i7.asJson
  val i8Json = Instance.i8.asJson
  val i9Json = Instance.i9.asJson

}
