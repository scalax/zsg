package zsg.testkit.circe.decoder

import zsg.{Application, Context, Plus, TypeHList, TypeHList2}
import io.circe.Decoder
import zsg.macros.single.SealedTag

class ZsgSealedContext[P] extends Context[SealedTraitSelector[P]] {

  /*override def append[X1, X2, Y1, Y2, Z1, Z2](x: SealedTraitSelector[P]#JsonDecoder[X1, X2], y: SealedTraitSelector[P]#JsonDecoder[Y1, Y2])(
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
  }*/

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: SealedTraitSelector[P]#H[X], y: SealedTraitSelector[P]#H[Y])(
    plus: Plus[X, Y, Z]
  ): JsonDecoder[P, Z#Head, Z#Tail#Head] = {
    new JsonDecoder[P, Z#Head, Z#Tail#Head] {
      override def to(name: Z#Tail#Head): Decoder[P] = {
        val a1       = plus.tail.takeHead(name)
        val a2       = plus.tail.takeTail(name)
        val decoderX = x.to(a1)
        val decoderY = y.to(a2)
        decoderX.or(decoderY)
      }
    }
  }
}

object ZsgSealedContext {
  def c[H]: ZsgSealedContext[H] = new ZsgSealedContext[H]
}
