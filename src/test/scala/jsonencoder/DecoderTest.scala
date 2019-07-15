package org.scalax.asuna.mapper.test

import io.circe._
import org.scalax.asuna.mapper.item.{Item0, ItemTag}
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
    def to(name: II): Decoder[T]
  }

  object ii extends Context[KM] {
    override def isReverse: Boolean = false
    override def useHList: Boolean  = true

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: JsonPro[X#T#H, X#H], y: JsonPro[Y#T#H, Y#H], plus: Plus[X, Y, Z]): JsonPro[Z#T#H, Z#H] = {
      new JsonPro[Z#T#H, Z#H] {
        override def to(name: Z#H): Decoder[Z#T#H] = {
          val xx1 = plus.takeTail(name)
          val yy1 = plus.takeHead(name)
          for {
            x1 <- x.to(xx1)
            y1 <- y.to(yy1)
          } yield {
            plus.sub.plus(x1, y1)
          }
        }
      }
    }

    override def start: JsonPro[Item0, Item0] = {
      new JsonPro[Item0, Item0] {
        override def to(name: Item0): Decoder[Item0] = Decoder.instance { j => Right(Item0) }
      }
    }
  }

}
