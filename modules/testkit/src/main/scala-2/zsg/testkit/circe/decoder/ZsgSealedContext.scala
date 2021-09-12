package zsg.testkit.circe.decoder

import zsg.{Context, Plus, TypeHList}
import io.circe.Decoder

class ZsgSealedContext[P] extends Context[SealedTraitSelector[P]] {
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
