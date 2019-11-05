package asuna.testkit.circe.encoder

import asuna.{AsunaTuple0, Context2, Plus2}
import io.circe.Json

object AsunaSealedEncoder {

  trait JsonEncoder[M, T, II] {
    def p(model: M, classTags: T, labelled: II): Option[(String, Json)]
  }

  class ii[H] extends Context2[JsonEncoder[H, *, *]] {

    override def start: JsonEncoder[H, AsunaTuple0, AsunaTuple0] = new JsonEncoder[H, AsunaTuple0, AsunaTuple0] {
      override def p(model: H, name: AsunaTuple0, obj: AsunaTuple0): Option[(String, Json)] = Option.empty
    }

    override def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonEncoder[H, X1, X2], y: JsonEncoder[H, Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): JsonEncoder[H, Z1, Z2] = {
      (model, obj, name) =>
        val a = x.p(model, p.takeHead1(obj), p.takeHead2(name))
        a.orElse(y.p(model, p.takeTail1(obj), p.takeTail2(name)))
    }
  }
  //编译期调试辅助函数开始

  /*trait ImplicitApply1[H] {
    def generic[R <: TupleTag](implicit ll: AsunaSealedGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: TupleTag] {
    def encoder[I <: TypeHList](
      implicit
      app: Application[KContext[H], R, I],
      cv1: AsunaSealedLabelledGeneric[H, I#H],
      cv2: AsunaSealedClassGeneric[H, I#T#H]
    ): Encoder.AsObject[H]

    def tag: R = throw new Exception("debuging...")
    def fetchApplication[I <: TypeHList](
      implicit
      app: Application[KContext[H], R, I]
    ): I#H = throw new Exception("debugging...")
  }*/
  //编译期调试辅助函数结束

}
