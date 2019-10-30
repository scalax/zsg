package asuna.test.circe

import asuna.macros.{DefaultValue, LazyImplicit, PropertyTag, SealedTag}
import asuna.test.{AsunaCirceDecoder, AsunaCirceEncoder, AsunaSealedDecoder, AsunaSealedEncoder}
import asuna.{Application, Context, TypeHList2, TypeHList3}
import io.circe._

class JsonDecoderApply[T](val dd: LazyImplicit[Decoder[T]]) extends AnyVal with AsunaCirceDecoder.JsonPro[T, String, DefaultValue[T]] {
  override def to(name: String, d: DefaultValue[T]): Decoder[T] = Decoder.instance { j =>
    d.value match {
      case Some(s) => Right(s)
      case _       => j.get(name)(dd.value)
    }
  }
}

class JsonDecoderApplicationApply[T](val dd: LazyImplicit[Decoder[T]])
    extends AnyVal
    with Application[AsunaCirceDecoder.KM, PropertyTag[T], TypeHList3[String, T, DefaultValue[T]]] {
  override def application(context: Context[AsunaCirceDecoder.KM]): AsunaCirceDecoder.JsonPro[T, String, DefaultValue[T]] = new JsonDecoderApply(dd)
}

trait DecoderCircePoly {

  implicit def asunaCirceSealedDecoder[T, R](
    implicit t: LazyImplicit[Decoder[R]]
  ): Application[AsunaSealedDecoder.KContext[T], SealedTag[R], TypeHList2[String, R => T]] =
    new Application[AsunaSealedDecoder.KContext[T], SealedTag[R], TypeHList2[String, R => T]] {
      override def application(context: Context[AsunaSealedDecoder.KContext[T]]): AsunaSealedDecoder.JsonPro[String, R => T, T] =
        new AsunaSealedDecoder.JsonPro[String, R => T, T] {
          override def to(name: String, tran: R => T): Decoder[T] = {
            Decoder.instance(j => j.get(name)(t.value).map(tran))
          }
        }
    }

  implicit def asunaCirceDecoder[T](implicit dd: LazyImplicit[Decoder[T]]): Application[AsunaCirceDecoder.KM, PropertyTag[T], TypeHList3[String, T, DefaultValue[T]]] =
    new JsonDecoderApplicationApply(dd)

}

object DecoderCircePoly extends DecoderCircePoly
