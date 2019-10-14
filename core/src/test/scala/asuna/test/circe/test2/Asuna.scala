package asuna.test.circe.test2

import asuna.test.AsunaCirceDecoder
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

}

object Poly2 extends Poly2

object Asuna {

  import Poly1._
  import Poly2._

  val i1_1Json = Instance.i1.as[Test01[String]]
  val i1_2Json = Instance.i1.as[Test01[Int]]
  val i2Json = Instance.i2.as[Test02]
  val i3Json = Instance.i3.as[Test03]

}
