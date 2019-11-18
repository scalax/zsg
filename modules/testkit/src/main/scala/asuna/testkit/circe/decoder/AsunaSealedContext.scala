package asuna.testkit.circe.decoder

import asuna.{AsunaTuple0, Context2, Plus2}
import io.circe.Decoder

class AsunaSealedContext[P] extends Context2[SealedTraitSelector[P]#JsonDecoder] {

  override def append[X1, X2, Y1, Y2, Z1, Z2](x: SealedTraitSelector[P]#JsonDecoder[X1, X2], y: SealedTraitSelector[P]#JsonDecoder[Y1, Y2])(
    p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
  ): SealedTraitSelector[P]#JsonDecoder[Z1, Z2] = {
    val con = SealedTraitSelector[P]
    new con.JsonDecoder[Z1, Z2] {
      override def to(name: Z1, toAbs: Z2): Decoder[P] = {
        val a1       = p.takeHead1(name)
        val y1       = p.takeTail1(name)
        val a2       = p.takeHead2(toAbs)
        val y2       = p.takeTail2(toAbs)
        val decoderX = x.to(a1, a2)
        val decoderY = y.to(y1, y2)
        decoderX.or(decoderY)
      }
    }

  }

  override def start: SealedTraitSelector[P]#JsonDecoder[AsunaTuple0, AsunaTuple0] = {
    val con = SealedTraitSelector[P]
    new con.JsonDecoder[AsunaTuple0, AsunaTuple0] {
      override def to(name: AsunaTuple0, tran: AsunaTuple0): Decoder[P] = {
        Decoder.failedWithMessage("Your sealed trait have no sub class")
      }
    }
  }
}
