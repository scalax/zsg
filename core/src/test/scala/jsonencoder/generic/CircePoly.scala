package org.scalax.asuna.mapper.test

import io.circe._
import org.scalax.asuna.mapper._
import org.scalax.asuna.mapper.macroImpl.DefaultValue

trait CircePoly {

  implicit def imEncoder[T](implicit t: => Encoder[T]): Application[EncoderTest.KContext, T, TypeParameter2[String, T]] =
    new Application[EncoderTest.KContext, T, TypeParameter2[String, T]] {
      override def application(context: Context[EncoderTest.KContext]): EncoderTest.JsonEncoder[T, String] = {
        new EncoderTest.JsonEncoder[T, String] {
          override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t(tt))) :: m
          }
        }
      }
    }

  implicit def imDecoder[T](implicit dd: => Decoder[T]): Application[DecoderTest.KM, T, TypeParameter3[String, T, DefaultValue[T]]] =
    new Application[DecoderTest.KM, T, TypeParameter3[String, T, DefaultValue[T]]] {
      override def application(context: Context[DecoderTest.KM]): DecoderTest.JsonPro[T, String, DefaultValue[T]] = {
        new DecoderTest.JsonPro[T, String, DefaultValue[T]] {
          override def to(name: String, d: DefaultValue[T]): Decoder[T] = Decoder.instance { j =>
            d.value match {
              case Some(s) => Right(s)
              case _ => j.get(name)(dd)
            }
          }
        }
      }
    }

}

object CircePoly extends CircePoly
