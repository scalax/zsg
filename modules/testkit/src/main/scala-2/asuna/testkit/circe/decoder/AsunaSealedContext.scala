package asuna.testkit.circe.decoder

import asuna.{Context3, Plus3, ZsgTuple0}
import io.circe.Decoder

class AsunaSealedContext[P] extends Context3[SealedTraitSelector[P]#JsonDecoder] {

  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: SealedTraitSelector[P]#JsonDecoder[X1, X2, X3], y: SealedTraitSelector[P]#JsonDecoder[Y1, Y2, Y3])(
    p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
  ): SealedTraitSelector[P]#JsonDecoder[Z1, Z2, Z3] = {
    val con = SealedTraitSelector[P]
    new con.JsonDecoder[Z1, Z2, Z3] {
      override def to(name: Z2, toAbs: Z3): Decoder[P] = {
        val a1       = p.takeHead2(name)
        val y1       = p.takeTail2(name)
        val a2       = p.takeHead3(toAbs)
        val y2       = p.takeTail3(toAbs)
        val decoderX = x.to(a1, a2)
        val decoderY = y.to(y1, y2)
        decoderX.or(decoderY)
      }
    }
  }

  override def start: SealedTraitSelector[P]#JsonDecoder[ZsgTuple0, ZsgTuple0, ZsgTuple0] = {
    val con = SealedTraitSelector[P]
    new con.JsonDecoder[ZsgTuple0, ZsgTuple0, ZsgTuple0] {
      override def to(name: ZsgTuple0, tran: ZsgTuple0): Decoder[P] = {
        Decoder.failedWithMessage("Your sealed trait have no sub class")
      }
    }
  }
}
