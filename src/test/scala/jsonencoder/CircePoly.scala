package org.scalax.asuna.mapper.test

import io.circe._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.item.TypeParam2
import org.scalax.asuna.mapper._

trait CircePoly[Poly] {

  type CirceEncoder[I] = EncoderContent[I, Poly]
  type CirceDecoder[I] = DecoderContent[I, Poly]

  implicit def encoderContentImplicit2[A](implicit e: EncoderContent[A, Poly]): Encoder[A] = e.encoder
  implicit def decoderContentImplicit2[A](implicit e: DecoderContent[A, Poly]): Decoder[A] = e.decoder

  implicit def imEncoder[T](implicit t: ByNameImplicit[Encoder[T]]): Application[EncoderTest.KContext, T, TypeParam2[String, T]] =
    new Application[EncoderTest.KContext, T, TypeParam2[String, T]] {
      override def application(context: Context[EncoderTest.KContext]): EncoderTest.JsonEncoder[T, String] = {
        new EncoderTest.JsonEncoder[T, String] {
          override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.value(tt))) :: m
          }
        }
      }
    }

  implicit def imDecoder[T](implicit dd: ByNameImplicit[Decoder[T]]): Application[DecoderTest.KM, T, TypeParam2[String, T]] =
    new Application[DecoderTest.KM, T, TypeParam2[String, T]] {
      override def application(context: Context[DecoderTest.KM]): DecoderTest.JsonPro[T, String] = {
        new DecoderTest.JsonPro[T, String] {
          override def d(j: JsonObject, name: String): Either[String, T] = {
            j(name).map(jj => dd.value.decodeJson(jj).left.map(_.message)).getOrElse(Left(s"找不到属性:${name}"))
          }
        }
      }
    }

}

trait CircePolyGetter[Poly] {

  def toJson[M](m: M)(implicit encoder: EncoderContent[M, Poly]): Json   = encoder.encoder(m)
  def fromJson[M](j: Json)(implicit decoder: DecoderContent[M, Poly]): M = decoder.decoder(j.hcursor).right.get

}
