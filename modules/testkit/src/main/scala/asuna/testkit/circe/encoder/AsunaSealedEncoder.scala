package asuna.testkit.circe.encoder

import asuna.{AsunaTuple0, Context2, Plus2}
import io.circe.Json

object AsunaSealedEncoder {

  class II[H] {
    trait JsonEncoder[T, II] {
      def p(model: H, classTags: T, labelled: II): Option[(String, Json)]
    }
  }

  object II {
    val value: II[Any]  = new II[Any]
    def apply[T]: II[T] = value.asInstanceOf[II[T]]
  }

  class asunaSealedContext[H] extends Context2[II[H]#JsonEncoder] {

    override def append[X1, X2, Y1, Y2, Z1, Z2](x: II[H]#JsonEncoder[X1, X2], y: II[H]#JsonEncoder[Y1, Y2])(
      plus: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): II[H]#JsonEncoder[Z1, Z2] = {
      val con = II[H]
      new con.JsonEncoder[Z1, Z2] {
        override def p(model: H, classTags: Z1, labelled: Z2): Option[(String, Json)] = {
          val a = x.p(model, plus.takeHead1(classTags), plus.takeHead2(labelled))
          a.orElse(y.p(model, plus.takeTail1(classTags), plus.takeTail2(labelled)))
        }
      }

    }

    override def start: II[H]#JsonEncoder[AsunaTuple0, AsunaTuple0] = {
      val con = II[H]
      new con.JsonEncoder[AsunaTuple0, AsunaTuple0] {
        override def p(model: H, classTags: AsunaTuple0, labelled: AsunaTuple0): Option[(String, Json)] = Option.empty
      }
    }

  }

}
