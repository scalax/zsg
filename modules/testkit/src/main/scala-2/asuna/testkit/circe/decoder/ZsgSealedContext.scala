package zsg.testkit.circe.decoder

import zsg.{Context2, Plus2, ZsgTuple0}
import io.circe.Decoder

class ZsgSealedContext[P] extends Context2[SealedTraitSelector[P]#JsonDecoder] {

  override def append[X1, X2, Y1, Y2, Z1, Z2](x: SealedTraitSelector[P]#JsonDecoder[X1, X2], y: SealedTraitSelector[P]#JsonDecoder[Y1, Y2])(
    p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
  ): SealedTraitSelector[P]#JsonDecoder[Z1, Z2] = {
    val con = SealedTraitSelector[P]
    new con.JsonDecoder[Z1, Z2] {
      override def to(name: Z2): Decoder[P] = {
        val a1       = p.takeHead2(name)
        val a2       = p.takeTail2(name)
        val decoderX = x.to(a1)
        val decoderY = y.to(a2)
        decoderX.or(decoderY)
      }
    }
  }

  override val start: SealedTraitSelector[P]#JsonDecoder[ZsgTuple0, ZsgTuple0] = {
    val con = SealedTraitSelector[P]
    new con.JsonDecoder[ZsgTuple0, ZsgTuple0] {
      override def to(name: ZsgTuple0): Decoder[P] = {
        Decoder.failedWithMessage("Your sealed trait have no sub class")
      }
    }
  }

}

object ZsgSealedContext {
  def c[H]: ZsgSealedContext[H] = new ZsgSealedContext[H]
}
