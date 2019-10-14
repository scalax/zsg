package asuna.test.circe.test1

import asuna.test.AsunaCirceEncoder
import io.circe.Encoder
import asuna.test.model._

trait Poly1 {

  import Poly2._
  import asuna.test.CircePoly._

  implicit def test01_en_implicit[T](implicit i: Encoder[T]): Encoder.AsObject[Test01[T]] = AsunaCirceEncoder.implicitEncoder
  implicit def test02_en_implicit: Encoder.AsObject[Test02]                               = AsunaCirceEncoder.implicitEncoder
  implicit def test03_en_implicit: Encoder.AsObject[Test03]                               = AsunaCirceEncoder.implicitEncoder

}

object Poly1 extends Poly1

trait Poly2 {

  import Poly1._
  import asuna.test.CircePoly._

  implicit def test04_en_implicit: Encoder.AsObject[Test04] = AsunaCirceEncoder.implicitEncoder

}

object Poly2 extends Poly2

object Asuna {

  import io.circe.syntax._
  import Poly1._
  import Poly2._

  val i1Json = Instance.i1.asJson
  val i2Json = Instance.i2.asJson
  val i3Json = Instance.i3.asJson

}
