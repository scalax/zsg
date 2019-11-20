package asuna.testkit.circe.decoder

import asuna.{AsunaTuple0, Context3, Plus3}
import io.circe.Decoder

object AsunaDecoderContext extends Context3[JsonDecoderPro] {

  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonDecoderPro[X1, X2, X3], y: JsonDecoderPro[Y1, Y2, Y3])(
    p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
  ): JsonDecoderPro[Z1, Z2, Z3] = { (name, default) =>
    val xx1 = p.takeHead2(name)
    val xx2 = p.takeHead3(default)
    val yy1 = p.takeTail2(name)
    val yy2 = p.takeTail3(default)
    for {
      x1 <- x.to(xx1, xx2)
      y1 <- y.to(yy1, yy2)
    } yield {
      p.plus1(x1, y1)
    }
  }

  override def start: JsonDecoderPro[AsunaTuple0, AsunaTuple0, AsunaTuple0] = {
    val zeroValue = Right(AsunaTuple0.value)
    (name, default) =>
      Decoder.instance { _ =>
        zeroValue
      }
  }
}
