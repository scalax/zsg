package org.scalax.asuna.mapper.test

import io.circe._
import org.scalax.asuna.mapper.item.{ItemTag, XyyItem0}
import org.scalax.asuna.mapper.append.macroImpl.{AsunaGeneric, AsunaNameGeneric, AsunaSetterGeneric}
import org.scalax.asuna.mapper._

class DecoderContent[A, Poly](val decoder: Decoder[A]) extends AnyVal

object DecoderTest {

  def implicitDecoder[T, Poly, R <: ItemTag, I <: TypeParam](
      implicit ll: AsunaGeneric.Aux[T, R]
    , app: Application[KM, R, I]
    , cv1: AsunaNameGeneric.Aux[T, I#H]
    , cv3: AsunaSetterGeneric.Aux[T, I#T#H]
  ): DecoderContent[T, Poly] = {
    new DecoderContent[T, Poly](app.application(ii).to(cv1.names.withContext(ii)).map(mm => cv3.setter(mm)))
  }

  class KM extends KindContext {
    override type M[P <: TypeParam] = JsonPro[P#T#H, P#H]
  }

  trait JsonPro[T, II] {
    self =>
    def d(j: JsonObject, name: II): Either[String, T]
    def to(name: II): Decoder[T] = Decoder.decodeJsonObject.emap(j => d(j, name))
  }

  object ii extends Context[KM] {
    override def isReverse: Boolean = false
    override def useHList: Boolean  = true

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: JsonPro[X#T#H, X#H], y: JsonPro[Y#T#H, Y#H], plus: Plus[X, Y, Z]): JsonPro[Z#T#H, Z#H] = {
      new JsonPro[Z#T#H, Z#H] {
        override def d(j: JsonObject, name: Z#H): Either[String, Z#T#H] = {
          val (xx1, yy1) = (plus.takeHead(name), plus.takeTail(name))
          x.d(j, yy1).right.flatMap { x1 =>
            y.d(j, xx1).right.map { y1 =>
              plus.sub.plus(x1, y1)
            }
          }
        }
      }
    }

    override def start: JsonPro[XyyItem0, XyyItem0] = {
      new JsonPro[XyyItem0, XyyItem0] {
        override def d(j: JsonObject, name: XyyItem0): Either[String, XyyItem0] = Right(new XyyItem0 {})
      }
    }
  }

}
