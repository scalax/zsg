package zsg.testkit.circe.decoder

import zsg.{Application, Context, Plus, PropertyTag, TypeHList, TypeHList3}
import io.circe.Decoder
import zsg.macros.single.DefaultValue

class ZsgDecoderContext extends Context[JsonDecoderFunc] {
  /*override def append[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4](x: JsonDecoderPro[X1, X2, X3, X4], y: JsonDecoderPro[Y1, Y2, Y3, Y4])(
    p: Plus4[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4]
  ): JsonDecoderPro[Z1, Z2, Z3, Z4] =
    new JsonDecoderPro[Z1, Z2, Z3, Z4] {
      override def to(name: Z3, default: Z4): Decoder[Z2] = {
        val xx1 = p.takeHead3(name)
        val xx2 = p.takeHead4(default)
        val yy1 = p.takeTail3(name)
        val yy2 = p.takeTail4(default)
        for {
          x1 <- x.to(xx1, xx2)
          y1 <- y.to(yy1, yy2)
        } yield {
          p.plus2(x1, y1)
        }
      }
    }*/

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: JsonDecoderPro[X#Head, X#Tail#Head, X#Tail#Tail#Head],
    y: JsonDecoderPro[Y#Head, Y#Tail#Head, Y#Tail#Tail#Head]
  )(
    plus: Plus[X, Y, Z]
  ): JsonDecoderPro[Z#Head, Z#Tail#Head, Z#Tail#Tail#Head] = {
    new JsonDecoderPro[Z#Head, Z#Tail#Head, Z#Tail#Tail#Head] {
      override def to(name: Z#Tail#Head, defaultValue: Z#Tail#Tail#Head): Decoder[Z#Head] = {
        val xx1 = plus.tail.takeHead(name)
        val xx2 = plus.tail.tail.takeHead(defaultValue)
        val yy1 = plus.tail.takeTail(name)
        val yy2 = plus.tail.tail.takeTail(defaultValue)
        for {
          x1 <- x.to(xx1, xx2)
          y1 <- y.to(yy1, yy2)
        } yield plus.plus(x1, y1)
      }
    }
  }
}

object ZsgDecoderContext {
  val value: ZsgDecoderContext = new ZsgDecoderContext
}
