package asuna.test

import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TupleTag, TypeHList}
import asuna.macros.{AsunaSealedClassGeneric, AsunaSealedGeneric, AsunaSealedLabelledGeneric}
import io.circe.{Encoder, Json, JsonObject}

object AsunaSealedEncoder {

  def encoder[H, R <: TupleTag, I <: TypeHList](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application[KContext[H], R, I],
    cv1: AsunaSealedLabelledGeneric[H, I#H],
    cv2: AsunaSealedClassGeneric[H, I#T#H]
  ): Encoder.AsObject[H] = {
    val ii    = new ii[H]
    val names = cv1.names
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(app.application(ii).p(o, cv2.names, names).toList)
    }
  }

  trait JsonEncoder[M, T, II] {
    def p(model: M, classTags: T, labelled: II): Option[(String, Json)]
  }

  class KContext[Model] extends KindContext {
    override type M[P <: TypeHList] = JsonEncoder[Model, P#T#H, P#H]
  }

  class ii[H] extends Context[KContext[H]] {
    override def isReverse: Boolean = false

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonEncoder[H, X#T#H, X#H],
      y: JsonEncoder[H, Y#T#H, Y#H],
      plus: Plus[X, Y, Z]
    ): JsonEncoder[H, Z#T#H, Z#H] = new JsonEncoder[H, Z#T#H, Z#H] {
      override def p(model: H, obj: Z#T#H, name: Z#H): Option[(String, Json)] = {
        val a = x.p(model, plus.sub.takeHead(obj), plus.takeHead(name))
        a.orElse(y.p(model, plus.sub.takeTail(obj), plus.takeTail(name)))
      }
    }

    override def start: JsonEncoder[H, AsunaTuple0, AsunaTuple0] = new JsonEncoder[H, AsunaTuple0, AsunaTuple0] {
      override def p(model: H, name: AsunaTuple0, obj: AsunaTuple0): Option[(String, Json)] = Option.empty
    }
  }

  //编译期调试辅助函数开始
  def initEncoder[H]: ImplicitApply1[H] = new ImplicitApply1[H] {
    def asunaGeneric[R <: TupleTag](implicit ll: AsunaSealedGeneric.Aux[H, R]): ImplicitApply2[H, R] = new ImplicitApply2[H, R] {
      override def encoder[I <: TypeHList](
        implicit
        app: Application[KContext[H], R, I],
        cv1: AsunaSealedLabelledGeneric[H, I#H],
        cv2: AsunaSealedClassGeneric[H, I#T#H]
      ): Encoder.AsObject[H] = {
        val ii = new ii[H]
        Encoder.AsObject.instance { o: H =>
          JsonObject.fromIterable(app.application(ii).p(o, cv2.names, cv1.names))
        }
      }
    }
  }

  trait ImplicitApply1[H] {
    def asunaGeneric[R <: TupleTag](implicit ll: AsunaSealedGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: TupleTag] {
    def encoder[I <: TypeHList](
      implicit
      app: Application[KContext[H], R, I],
      cv1: AsunaSealedLabelledGeneric[H, I#H],
      cv2: AsunaSealedClassGeneric[H, I#T#H]
    ): Encoder.AsObject[H]

    def toTag: R = throw new Exception("123")
    def toIH[I <: TypeHList](
      implicit
      app: Application[KContext[H], R, I]
    ): I#H = throw new Exception("123")
  }
  //编译期调试辅助函数结束

}
