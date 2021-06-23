package zsg.testkit.circe.encoder

import io.circe.Json
import zsg.{Context, Plus, TypeHList}

class ZsgSealedContext[H] extends Context[SealedTraitSelector[H]#S] {
  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: SealedTraitSelector[H]#S[X], y: SealedTraitSelector[H]#S[Y])(
    plus: Plus[X, Y, Z]
  ): SealedTraitSelector[H]#S[Z] =
    new JsonEncoder[H, Z#Head, Z#Tail#Head] {
      override def p(model: H, classTags: Z#Head, labelled: Z#Tail#Head): Option[(String, Json)] = {
        val a = x.p(model, plus.takeHead(classTags), plus.tail.takeHead(labelled))
        a.orElse(y.p(model, plus.takeTail(classTags), plus.tail.takeTail(labelled)))
      }
    }
}

object ZsgSealedContext {
  def c[H]: ZsgSealedContext[H] = new ZsgSealedContext[H]
}
