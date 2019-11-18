package asuna.testkit.circe.decoder

import asuna.Application2
import asuna.macros.{ByNameImplicit, SealedTag}
import io.circe.Decoder

class SealedTraitSelector[P] {

  trait JsonDecoder[II, T] {
    def to(name: II, tran: T): Decoder[P]
  }

}

object SealedTraitSelector {

  def apply[T]: SealedTraitSelector[T] = value.asInstanceOf[SealedTraitSelector[T]]
  val value: SealedTraitSelector[Any]  = new SealedTraitSelector[Any]

  implicit def asunaCirceSealedDecoder[T, R](
    implicit t: ByNameImplicit[Decoder[R]]
  ): Application2[SealedTraitSelector[T]#JsonDecoder, SealedTag[R], String, R => T] = { context =>
    val con = SealedTraitSelector[T]
    new con.JsonDecoder[String, R => T] {
      override def to(name: String, tran: R => T): Decoder[T] = {
        Decoder.instance(j => j.get(name)(t.value).map(tran))

      }
    }
  }

}
