package zsg.testkit.circe.decoder

import zsg.{Context, Plus, TypeHList}
import io.circe.Decoder

class ZsgDecoderContext extends Context[JsonDecoderFunc] {
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
