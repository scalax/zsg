package asuna.test.circe

import asuna.macros.{DefaultValue, LazyImplicit, PropertyTag, SealedTag}
import asuna.test.{AsunaCirceDecoder, AsunaCirceEncoder, AsunaSealedDecoder, AsunaSealedEncoder}
import asuna.{Application, Context, TypeParameter2, TypeParameter3}
import io.circe._

trait CircePoly {

  implicit def asunaCirceSealedEncoder[T, R](implicit t: LazyImplicit[Encoder[R]]): Application[AsunaSealedEncoder.KContext[T], SealedTag[R], TypeParameter2[String, Class[R]]] =
    new Application[AsunaSealedEncoder.KContext[T], SealedTag[R], TypeParameter2[String, Class[R]]] {
      override def application(context: Context[AsunaSealedEncoder.KContext[T]]): AsunaSealedEncoder.JsonEncoder[T, Class[R], String] = {
        new AsunaSealedEncoder.JsonEncoder[T, Class[R], String] {
          override def p(model: T, classTags: Class[R], labelled: String): Option[(String, Json)] = {
            if (classTags.isInstance(model)) {
              Some((labelled, t.value(classTags.cast(model))))
            } else {
              Option.empty
            }
          }
        }
      }
    }

  implicit def asunaCirceSealedDecoder[T, R](implicit t: LazyImplicit[Decoder[R]]): Application[AsunaSealedDecoder.KContext[T], SealedTag[R], TypeParameter2[String, R => T]] =
    new Application[AsunaSealedDecoder.KContext[T], SealedTag[R], TypeParameter2[String, R => T]] {
      override def application(context: Context[AsunaSealedDecoder.KContext[T]]): AsunaSealedDecoder.JsonPro[String, R => T, T] = new AsunaSealedDecoder.JsonPro[String, R => T, T]{
        override def to(name: String, tran: R => T): Decoder[T] = {
          Decoder.instance(j => j.get(name)(t.value).map(tran))
        }
      }
    }


  implicit def asunaCirceEncoder[T](implicit t: LazyImplicit[Encoder[T]]): Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeParameter2[String, T]] =
    new Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeParameter2[String, T]] {
      override def application(context: Context[AsunaCirceEncoder.KContext]): AsunaCirceEncoder.JsonEncoder[T, String] = {
        new AsunaCirceEncoder.JsonEncoder[T, String] {
          override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.value(tt))) :: m
          }
        }
      }
    }

  implicit def asunaCirceDecoder[T](implicit dd: LazyImplicit[Decoder[T]]): Application[AsunaCirceDecoder.KM, PropertyTag[T], TypeParameter3[String, T, DefaultValue[T]]] =
    new Application[AsunaCirceDecoder.KM, PropertyTag[T], TypeParameter3[String, T, DefaultValue[T]]] {
      override def application(context: Context[AsunaCirceDecoder.KM]): AsunaCirceDecoder.JsonPro[T, String, DefaultValue[T]] = {
        new AsunaCirceDecoder.JsonPro[T, String, DefaultValue[T]] {
          override def to(name: String, d: DefaultValue[T]): Decoder[T] = Decoder.instance { j =>
            d.value match {
              case Some(s) => Right(s)
              case _       => j.get(name)(dd.value)
            }
          }
        }
      }
    }

}

object CircePoly extends CircePoly
