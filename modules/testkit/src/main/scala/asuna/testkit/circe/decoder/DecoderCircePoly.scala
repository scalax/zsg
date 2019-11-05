package asuna.testkit.circe.decoder

import asuna.macros.{ByNameImplicit, DefaultValue, PropertyTag, SealedTag}
import asuna.testkit.circe.decoder.AsunaSealedDecoder.JsonPro
import asuna.{Application2, Application3}
import io.circe._

trait DecoderCircePoly {

  implicit def asunaCirceSealedDecoder[T, R](
    implicit t: ByNameImplicit[Decoder[R]]
  ): Application2[JsonPro[*, *, T], SealedTag[R], String, R => T] = {
    context =>
      { (name: String, tran: R => T) =>
        Decoder.instance(j => j.get(name)(t.value).map(tran))
      }
  }

  implicit def asunaCirceDecoder[T](
    implicit dd: ByNameImplicit[Decoder[T]]
  ): Application3[AsunaCirceDecoder.JsonPro, PropertyTag[T], T, String, DefaultValue[T]] = {
    context =>
      { (name: String, defaultValue: DefaultValue[T]) =>
        Decoder.instance { j =>
          defaultValue.value.map(s => Right(s)).getOrElse(j.get(name)(dd.value))
        }
      }
  }

}

object DecoderCircePoly extends DecoderCircePoly
