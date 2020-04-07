package asuna.testkit.circe.test3

import asuna.testkit.circe.ACirce
import asuna.testkit.model._
import io.circe.Encoder
import io.circe.syntax._

trait Poly1 {

  implicit val test12_en_implicit: Encoder[Test12Trait]  = ACirce.encodeTuple
  implicit def test10_de_implicit[T]: Encoder[Test10[T]] = ACirce.mapTupleEncoder[Test10[T], Test13TraitImpl[T], Test12Trait]
  implicit val test14_en_implicit: Encoder[Test14]       = ACirce.encodeCaseClass

}

object Poly1 extends Poly1

object Asuna {

  import Poly1._

  val i10Json = Instance.i10.asJson
  val i14Json = Instance.i14.asJson

}
