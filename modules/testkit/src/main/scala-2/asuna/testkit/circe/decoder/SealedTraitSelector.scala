package zsg.testkit.circe.decoder

import zsg.macros.ByNameImplicit
import zsg.macros.single.SealedTag
import io.circe.Decoder
import zsg.Context2

class SealedTraitSelector[P] {
  trait JsonDecoder[PU, II] {
    def to(name: II): Decoder[P]
  }
}

object SealedTraitSelector {

  val value: SealedTraitSelector[Any]  = new SealedTraitSelector[Any]
  def apply[T]: SealedTraitSelector[T] = value.asInstanceOf[SealedTraitSelector[T]]

  implicit def zsgCirceSealedDecoder[T, R <: T](implicit t: ByNameImplicit[Decoder[R]]): SealedTraitSelector[T]#JsonDecoder[SealedTag[R], String] = {
    val con = SealedTraitSelector[T]
    new con.JsonDecoder[SealedTag[R], String] {
      override def to(name: String): Decoder[T] = {
        Decoder.instance(j => j.get(name)(t.value): Decoder.Result[R])
      }
    }
  }

  implicit def c[H]: Context2[SealedTraitSelector[H]#JsonDecoder] = new ZsgSealedContext[H]

}
