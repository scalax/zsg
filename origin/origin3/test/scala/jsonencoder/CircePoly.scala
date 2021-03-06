package org.scalax.asuna.mapper.test

import io.circe._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.item.TypeParam2
import org.scalax.asuna.mapper._

trait CircePoly {

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
          override def to(name: String): Decoder[T] = Decoder.instance(j => j.get(name)(dd.value))
        }
      }
    }

}

object CircePoly extends CircePoly