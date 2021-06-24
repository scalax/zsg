package zsg.testkit.circe.decoder

import zsg.macros.ByNameImplicit
import zsg.macros.single.SealedTag
import io.circe.Decoder
import zsg.{Application, TypeFunction, TypeHList, TypeHList2}

class SealedTraitSelector[P] extends TypeFunction {
  override type H[T <: TypeHList] = JsonDecoder[P, T#Head, T#Tail#Head]
}

object SealedTraitSelector {
  implicit def implicit1[P, S <: P](implicit
    t: ByNameImplicit[Decoder[S]]
  ): Application[SealedTraitSelector[P], ZsgSealedContext[P], SealedTag[S], TypeHList2[SealedTag[S], String]] =
    new Application[SealedTraitSelector[P], ZsgSealedContext[P], SealedTag[S], TypeHList2[SealedTag[S], String]] {
      override def application(context: ZsgSealedContext[P]): SealedTraitSelector[P]#H[TypeHList2[SealedTag[S], String]] =
        new JsonDecoder[P, SealedTag[S], String] {
          override def to(name: String): Decoder[P] = {
            Decoder.instance(j => j.get(name)(t.value): Decoder.Result[S])
          }
        }
    }
}

trait JsonDecoder[P, PU, II] {
  def to(name: II): Decoder[P]
}
