package asuna.testkit.circe.encoder

import asuna.{AsunaTuple0, Context2, Plus2}
import io.circe.Json

class AsunaSealedContext[H] extends Context2[SealedTraitSelector[H]#JsonEncoder] {

  override final def append[X1, X2, Y1, Y2, Z1, Z2](x: SealedTraitSelector[H]#JsonEncoder[X1, X2], y: SealedTraitSelector[H]#JsonEncoder[Y1, Y2])(
    plus: Plus2[X1, X2, Y1, Y2, Z1, Z2]
  ): SealedTraitSelector[H]#JsonEncoder[Z1, Z2] = {
    val con = SealedTraitSelector[H]
    new con.JsonEncoder[Z1, Z2] {
      override def p(model: H, classTags: Z1, labelled: Z2): Option[(String, Json)] = {
        val a = x.p(model, plus.takeHead1(classTags), plus.takeHead2(labelled))
        a.orElse(y.p(model, plus.takeTail1(classTags), plus.takeTail2(labelled)))
      }
    }

  }

  override final val start: SealedTraitSelector[H]#JsonEncoder[AsunaTuple0, AsunaTuple0] = {
    val con = SealedTraitSelector[H]
    new con.JsonEncoder[AsunaTuple0, AsunaTuple0] {
      override def p(model: H, classTags: AsunaTuple0, labelled: AsunaTuple0): Option[(String, Json)] = Option.empty
    }
  }

}
