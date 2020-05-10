package asuna.testkit.circe.decoder

import asuna.{Application3, Context3}
import asuna.macros.ByNameImplicit
import asuna.macros.single.SealedTag
import io.circe.Decoder

class SealedTraitSelector[P] {

  trait JsonDecoder[PU, II, T] {
    def to(name: II, tran: T): Decoder[P]
  }

}

object SealedTraitSelector {

  def apply[T]: SealedTraitSelector[T] = value.asInstanceOf[SealedTraitSelector[T]]
  val value: SealedTraitSelector[Any]  = new SealedTraitSelector[Any]

  implicit def asunaCirceSealedDecoder[T, R](
    implicit t: ByNameImplicit[Decoder[R]]
  ): Application3[SealedTraitSelector[T]#JsonDecoder, SealedTag[R], String, R => T] = new Application3[SealedTraitSelector[T]#JsonDecoder, SealedTag[R], String, R => T] {
    override def application(context: Context3[SealedTraitSelector[T]#JsonDecoder]): SealedTraitSelector[T]#JsonDecoder[SealedTag[R], String, R => T] = {
      val con = SealedTraitSelector[T]
      new con.JsonDecoder[SealedTag[R], String, R => T] {
        override def to(name: String, tran: R => T): Decoder[T] = {
          Decoder.instance(j => j.get(name)(t.value).right.map(tran))
        }
      }
    }
  }

}
