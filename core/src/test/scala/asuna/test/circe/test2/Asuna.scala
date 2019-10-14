package asuna.test.circe.test2

import asuna.test.{AsunaCirceDecoder, AsunaSealedDecoder}
import io.circe.Decoder
import asuna.test.model._

trait Poly1 {

  import Poly2._
  import asuna.test.circe.CircePoly._

  implicit def test02_de_implicit: Decoder[Test02] = AsunaCirceDecoder.implicitDecoder
  implicit def test04_de_implicit: Decoder[Test04] = AsunaCirceDecoder.implicitDecoder

}

object Poly1 extends Poly1

trait Poly2 {

  import Poly1._
  import asuna.test.circe.CircePoly._

  implicit def test01_de_implicit[T](implicit de: Decoder[T]): Decoder[Test01[T]] = AsunaCirceDecoder.implicitDecoder
  implicit def test03_de_implicit: Decoder[Test03]                                = AsunaCirceDecoder.implicitDecoder

  implicit def test05_de_implicit: Decoder[Test05[String]] = AsunaSealedDecoder.sealedDecoder
  implicit def test06_de_implicit: Decoder[Test06[String]] = AsunaCirceDecoder.implicitDecoder
  implicit def test07_de_implicit: Decoder[Test07[String]] = AsunaCirceDecoder.implicitDecoder
  implicit def test08_de_implicit: Decoder[Test08]         = AsunaCirceDecoder.implicitDecoder

}

object Poly2 extends Poly2

object Asuna {

  import Poly1._
  import Poly2._

  val i1_1FromJson = Instance.i1.as[Test01[String]]
  val i1_2FromJson = Instance.i1.as[Test01[Int]]
  val i2FromJson   = Instance.i2.as[Test02]
  val i3FromJson   = Instance.i3.as[Test03]

  val i6FromJson   = Instance.i6Json.as[Test05[String]]
  val i7FromJson   = Instance.i7Json.as[Test05[String]]
  val i8FromJson   = Instance.i8Json.as[Test05[String]]

}
