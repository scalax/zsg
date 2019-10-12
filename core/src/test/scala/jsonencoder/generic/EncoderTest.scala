package org.scalax.asuna.mapper.test

import io.circe.{Encoder, Json, JsonObject}
import org.scalax.asuna.mapper._
import org.scalax.asuna.mapper.macroImpl.{AsunaGeneric, AsunaGetterGeneric, AsunaNameGeneric}

object EncoderTest {

  def implicitEncoder[H, R <: ItemTag, I <: TypeParameter](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application[KContext, R, I],
    cv1: AsunaNameGeneric.Aux[H, I#H],
    cv2: AsunaGetterGeneric.Aux[H, I#T#H]
  ): Encoder.AsObject[H] = {
    val names = cv1.names.withContext(ii)
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(app.application(ii).p(cv2.getter(o).withContext(ii), names, List.empty))
    }
  }

  trait JsonEncoder[T, II] {
    def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]
  }

  class KContext extends KindContext {
    override type M[P <: TypeParameter] = JsonEncoder[P#T#H, P#H]
  }

  object ii extends Context[KContext] {
    override def isReverse: Boolean = false

    override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](
      x: JsonEncoder[X#T#H, X#H],
      y: JsonEncoder[Y#T#H, Y#H],
      plus: Plus[X, Y, Z]
    ): JsonEncoder[Z#T#H, Z#H] = new JsonEncoder[Z#T#H, Z#H] {
      override def p(obj: Z#T#H, name: Z#H, m: List[(String, Json)]): List[(String, Json)] =
        x.p(plus.sub.takeHead(obj), plus.takeHead(name), y.p(plus.sub.takeTail(obj), plus.takeTail(name), m))
    }

    override def start: JsonEncoder[Item0, Item0] = new JsonEncoder[Item0, Item0] {
      override def p(name: Item0, obj: Item0, m: List[(String, Json)]): List[(String, Json)] = m
    }
  }

  //编译期调试辅助函数开始
  def initEncoder[H]: ImplicitApply1[H] = new ImplicitApply1[H] {
    def asunaGeneric[R <: ItemTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R] = new ImplicitApply2[H, R] {
      override def encoder[I <: TypeParameter](
        implicit
        app: Application[KContext, R, I],
        cv1: AsunaNameGeneric.Aux[H, I#H],
        cv2: AsunaGetterGeneric.Aux[H, I#T#H]
      ): Encoder.AsObject[H] = {
        Encoder.AsObject.instance { o: H =>
          JsonObject.fromIterable(app.application(ii).p(cv2.getter(o).withContext(ii), cv1.names.withContext(ii), List.empty))
        }
      }
    }
  }

  trait ImplicitApply1[H] {
    def asunaGeneric[R <: ItemTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: ItemTag] {
    def encoder[I <: TypeParameter](
      implicit
      app: Application[KContext, R, I],
      cv1: AsunaNameGeneric.Aux[H, I#H],
      cv2: AsunaGetterGeneric.Aux[H, I#T#H]
    ): Encoder.AsObject[H]

    def toTag: R = throw new Exception("123")
    def toIH[I <: TypeParameter](
      implicit
      app: Application[KContext, R, I]
    ): I#H = throw new Exception("123")
  }
  //编译期调试辅助函数结束

}
