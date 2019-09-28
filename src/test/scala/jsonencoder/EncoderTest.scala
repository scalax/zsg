package org.scalax.asuna.mapper.test

import io.circe.{Encoder, Json, JsonObject, ObjectEncoder}
import org.scalax.asuna.mapper.item._
import org.scalax.asuna.mapper._
import org.scalax.asuna.mapper.append.macroImpl.{AsunaGeneric, AsunaGetterGeneric, AsunaNameGeneric}

object EncoderTest {

  def initEncoder[H]: ImplicitApply1[H] =
    new ImplicitApply1[H] {
      def encoder[R <: ItemTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R] = new ImplicitApply2[H, R] {
        override def encoder[I <: TypeParam](
          implicit
          app: Application[KContext, R, I],
          cv1: AsunaNameGeneric.Aux[H, I#H],
          cv2: AsunaGetterGeneric.Aux[H, I#T#H]
        ): Encoder[H] = {
          app.application(ii).addName(cv1.names.withContext(ii)).contramapObject(mm => cv2.getter(mm).withContext(ii))
        }
      }
    }

  trait ImplicitApply1[H] {
    def encoder[R <: ItemTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: ItemTag] {
    def encoder[I <: TypeParam](
      implicit
      app: Application[KContext, R, I],
      cv1: AsunaNameGeneric.Aux[H, I#H],
      cv2: AsunaGetterGeneric.Aux[H, I#T#H]
    ): Encoder[H]

    def toR: R = throw new Exception("123")
    def toIH[I <: TypeParam](
      implicit
      app: Application[KContext, R, I]
    ): I#H = throw new Exception("123")
  }

  def implicitEncoder[H, R <: ItemTag, I <: TypeParam](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application[KContext, R, I],
    cv1: AsunaNameGeneric.Aux[H, I#H],
    cv2: AsunaGetterGeneric.Aux[H, I#T#H]
  ): Encoder[H] = {
    app.application(ii).addName(cv1.names.withContext(ii)).contramapObject(mm => cv2.getter(mm).withContext(ii))
  }

  trait JsonEncoder[T, II] {
    self =>

    def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]

    def addName(name: II): ObjectEncoder[T] = ObjectEncoder.instance { i =>
      JsonObject.fromIterable(self.p(i, name, List.empty))
    }

  }

  class KContext extends KindContext {
    override type M[P <: TypeParam] = JsonEncoder[P#T#H, P#H]
  }

  object ii extends Context[KContext] {
    override def isReverse: Boolean = false
    override def useHList: Boolean  = false

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
      x: JsonEncoder[X#T#H, X#H],
      y: JsonEncoder[Y#T#H, Y#H],
      plus: Plus[X, Y, Z]
    ): JsonEncoder[Z#T#H, Z#H] = new JsonEncoder[Z#T#H, Z#H] {
      override def p(obj: Z#T#H, name: Z#H, m: List[(String, Json)]): List[(String, Json)] =
        x.p(plus.sub.takeTail(obj), plus.takeTail(name), y.p(plus.sub.takeHead(obj), plus.takeHead(name), m))
    }

    override def start: JsonEncoder[Item0, Item0] = new JsonEncoder[Item0, Item0] {
      override def p(name: Item0, obj: Item0, m: List[(String, Json)]): List[(String, Json)] = m
    }
  }

  def mm[T] = new MP[T] {}

  trait MP[I] {
    def iii[H](implicit g: AsunaGetterGeneric.Aux[I, H]): I => ContextContent[H] = g.getter
  }

}
