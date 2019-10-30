package org.scalax.asuna.mapper.append.debug

import io.circe._
import org.scalax.asuna.implements.LazyImplicit
import org.scalax.asuna.mapper.append._

object MacroTest {

  trait MapperKou[H] {

    def kou[M, P, S](implicit ll: ModelApply.Aux[H, M, P, S]): ModelApply.Aux[H, M, P, S] = ll

    def kou1[M, P, S, R <: TypeParam](implicit ll: ModelApply.Aux[H, M, P, S], app: Application[KM, P, R], cv1: S <:< R#H, cv2: M <:< R#T#H): JsonPro[H] = {
      app.application(ii).compose[H] { mm: H =>
        (cv1(ll.names), cv2(ll.getter(mm)))
      }
    }

  }

  def kou[T] = new MapperKou[T] {}

  class KM extends KindContext {
    override type M[P <: TypeParam] = JsonPro[(P#H, P#T#H)]
  }

  trait JsonPro[T] {
    self =>

    def p(t: T, m: List[(String, Json)]): List[(String, Json)]
    def compose[P](u: P => T): JsonPro[P] = new JsonPro[P] {
      override def p(t: P, m: List[(String, Json)]): List[(String, Json)] = self.p(u(t), m)
    }

    def toEncoder: ObjectEncoder[T] = new ObjectEncoder[T] {
      override def encodeObject(a: T): JsonObject = {
        JsonObject.fromIterable(self.p(a, List.empty))
      }
    }

  }

  object ii extends Context[KM] {
    override def reverse: Boolean = false

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: JsonPro[(X#H, X#T#H)],
                                                                        y: JsonPro[(Y#H, Y#T#H)],
                                                                        plus: Plus[X, Y, Z]): JsonPro[(Z#H, Z#T#H)] = {
      new JsonPro[(Z#H, Z#T#H)] {
        def p(t: (Z#H, Z#T#H), m: List[(String, Json)]): List[(String, Json)] = {
          val (name, item)   = t
          val (namex, namey) = plus.take(name)
          val (itemx, itemy) = plus.sub.take(item)
          y.p((namey, itemy), x.p((namex, itemx), m))
        }
      }
    }

    override def start: JsonPro[(Item0, Item0)] = {
      new JsonPro[(Item0, Item0)] {
        override def p(t: (Item0, Item0), m: List[(String, Json)]): List[(String, Json)] = m
      }
    }
  }

  class ItemPP[T1, T2] extends TypeParam {
    override type H = T1
    override type T = ItemP1
    class ItemP1 extends TypeParam {
      override type H = T2
      override type T = Type0
    }
  }

  implicit def im[T](implicit t: LazyImplicit[Encoder[T]]): Application[KM, T, ItemPP[String, T]] = new Application[KM, T, ItemPP[String, T]] {
    override def tag: ItemTag[T] = new ItemTag[T]
    override def application(context: Context[KM]): JsonPro[(String, T)] = {
      new JsonPro[(String, T)] {
        override def p(tt: (String, T), m: List[(String, Json)]): List[(String, Json)] = {
          val (name, item) = tt
          ((name, t.value(item))) :: m
        }
      }
    }
  }

}
