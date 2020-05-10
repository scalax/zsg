package asuna.testkit.circe.encoder

import asuna.{AsunaTuple0, Context3, Plus3}
import io.circe.Json

class AsunaSealedContext[H] extends Context3[SealedTraitSelector[H]#JsonEncoder] {
  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: SealedTraitSelector[H]#JsonEncoder[X1, X2, X3], y: SealedTraitSelector[H]#JsonEncoder[Y1, Y2, Y3])(
    plus: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
  ): SealedTraitSelector[H]#JsonEncoder[Z1, Z2, Z3] = {
    val con = SealedTraitSelector[H]
    new con.JsonEncoder[Z1, Z2, Z3] {
      override def p(model: H, classTags: Z2, labelled: Z3): Option[(String, Json)] = {
        val a = x.p(model, plus.takeHead2(classTags), plus.takeHead3(labelled))
        a.orElse(y.p(model, plus.takeTail2(classTags), plus.takeTail3(labelled)))
      }
    }
  }

  override def start: SealedTraitSelector[H]#JsonEncoder[AsunaTuple0, AsunaTuple0, AsunaTuple0] = {
    val con = SealedTraitSelector[H]
    new con.JsonEncoder[AsunaTuple0, AsunaTuple0, AsunaTuple0] {
      override def p(model: H, classTags: AsunaTuple0, labelled: AsunaTuple0): Option[(String, Json)] = Option.empty
    }
  }
}
