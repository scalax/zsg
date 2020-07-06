package zsg.testkit.circe.decoder

import zsg.{Context4, Plus4, ZsgTuple0}
import io.circe.Decoder

class ZsgDecoderContext extends Context4[JsonDecoderPro] {
  override def append[X1, X2, X3, X4, Y1, Y2, Y3, Y4, Z1, Z2, Z3, Z4](x: JsonDecoderPro[X1, X2, X3, X4], y: JsonDecoderPro[Y1, Y2, Y3, Y4])(
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
    }

  override def start: JsonDecoderPro[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0] =
    new JsonDecoderPro[ZsgTuple0, ZsgTuple0, ZsgTuple0, ZsgTuple0] {
      override def to(name: ZsgTuple0, defaultValue: ZsgTuple0): Decoder[ZsgTuple0] = {
        val zeroValue = Right(ZsgTuple0.value)
        Decoder.instance { _ => zeroValue }
      }
    }
}

object ZsgDecoderContext {
  implicit val value: ZsgDecoderContext = new ZsgDecoderContext
}
