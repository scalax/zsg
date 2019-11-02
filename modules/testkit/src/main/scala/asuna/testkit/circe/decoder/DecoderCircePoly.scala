package asuna.testkit.circe.decoder

import asuna.macros.{ByNameImplicit, DefaultValue, PropertyTag, SealedTag}
import asuna.{Application, TypeHList2, TypeHList3}
import io.circe._

trait DecoderCircePoly {

  implicit def asunaCirceSealedDecoder[T, R](
    implicit t: ByNameImplicit[Decoder[R]]
  ): Application[AsunaSealedDecoder.KContext[T], SealedTag[R], TypeHList2[String, R => T]] = {
    context =>
      { (name: String, tran: R => T) =>
        Decoder.instance(j => j.get(name)(t.value).map(tran))
      }
  }

  implicit def asunaCirceDecoder[T](
    implicit dd: ByNameImplicit[Decoder[T]]
  ): Application[AsunaCirceDecoder.KM, PropertyTag[T], TypeHList3[String, T, DefaultValue[T]]] = {
    context =>
      { (name: String, defaultValue: DefaultValue[T]) =>
        Decoder.instance { j =>
          defaultValue.value.map(s => Right(s)).getOrElse(j.get(name)(dd.value))
        }
      }
  }

}

object DecoderCircePoly extends DecoderCircePoly
