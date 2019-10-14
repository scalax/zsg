package asuna.test

import asuna.macros.{DefaultValue, LazyImplicit, PropertyTag}
import asuna.{Application, Context, TypeParameter2, TypeParameter3}
import io.circe._

trait CircePoly {

  /*implicit def sealedEncoder[T](implicit t: LazyImplicit[Encoder[T]]): Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeParameter2[String, T]] =
    new Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeParameter2[String, T]] {
      override def application(context: Context[AsunaCirceEncoder.KContext]): AsunaCirceEncoder.JsonEncoder[T, String] = {
        new AsunaCirceEncoder.JsonEncoder[T, String] {
          override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.value(tt))) :: m
          }
        }
      }
    }*/

  implicit def imEncoder[T](implicit t: LazyImplicit[Encoder[T]]): Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeParameter2[String, T]] =
    new Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeParameter2[String, T]] {
      override def application(context: Context[AsunaCirceEncoder.KContext]): AsunaCirceEncoder.JsonEncoder[T, String] = {
        new AsunaCirceEncoder.JsonEncoder[T, String] {
          override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.value(tt))) :: m
          }
        }
      }
    }

  implicit def imDecoder[T](implicit dd: LazyImplicit[Decoder[T]]): Application[DecoderTest.KM, PropertyTag[T], TypeParameter3[String, T, DefaultValue[T]]] =
    new Application[DecoderTest.KM, PropertyTag[T], TypeParameter3[String, T, DefaultValue[T]]] {
      override def application(context: Context[DecoderTest.KM]): DecoderTest.JsonPro[T, String, DefaultValue[T]] = {
        new DecoderTest.JsonPro[T, String, DefaultValue[T]] {
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
