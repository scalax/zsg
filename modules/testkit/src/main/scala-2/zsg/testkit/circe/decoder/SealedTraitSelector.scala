package zsg.testkit.circe.decoder

import zsg.macros.ByNameImplicit
import zsg.macros.single.SealedTag
import io.circe.Decoder
import zsg.TypeHList

class SealedTraitSelector[P] {
  type S[T <: TypeHList] = JsonDecoder[P, T#Head, T#Tail#Head]
}

trait JsonDecoder[P, PU, II] {
  def to(name: II): Decoder[P]
}

object JsonDecoder {

  implicit def zsgCirceSealedDecoder[T, R <: T](implicit
    t: ByNameImplicit[Decoder[R]]
  ): JsonDecoder[T, SealedTag[R], String] = {
    new JsonDecoder[T, SealedTag[R], String] {
      override def to(name: String): Decoder[T] = {
        Decoder.instance(j => j.get(name)(t.value): Decoder.Result[R])
      }
    }
  }

}
