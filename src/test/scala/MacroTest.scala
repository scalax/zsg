package org.scalax.asuna.mapper.append.debug

import io.circe._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append._

object MacroTest {

  class MapperKou[H] {

    def kou[M, P, S](implicit ll: ModelApply.Aux[H, M, P, S]): ModelApply.Aux[H, M, P, S] = ll

    def kou1[M, P, S, R <: TypeParam](implicit ll: ModelApply.Aux[H, M, P, S],
                                      app: Application[KM, P, R],
                                      cv1: S <:< R#H,
                                      cv2: M <:< R#T#H,
                                      cv3: R#T#H <:< M): IIII[H] = {
      app
        .application(ii)
        .compose[H](u = { mm: H =>
          cv2(ll.getter(mm))
        }, p1 = { p: R#T#H =>
          ll.setter(cv3(p))
        })
        .to(cv1(ll.names))
    }

  }

  def kou[T] = new MapperKou[T]

  class KM extends KindContext {
    override type M[P <: TypeParam] = JsonPro[P#T#H, P#H]
  }

  trait IIII[I] {
    def encoder: ObjectEncoder[I]
    def decoder: Decoder[I]
  }

  trait JsonPro[T, II] {
    self =>

    def p(name: II, obj: T, m: List[(String, Json)]): List[(String, Json)]
    def d(j: JsonObject, name: II): Either[String, T]

    def compose[P](u: P => T, p1: T => P): JsonPro[P, II] = new JsonPro[P, II] {
      override def p(name: II, t: P, m: List[(String, Json)]): List[(String, Json)] = self.p(name, u(t), m)
      override def d(jj: JsonObject, name: II): Either[String, P]                   = self.d(jj, name).right.map(p1)
    }

    def to(name: II): IIII[T] = new IIII[T] {
      override val encoder: ObjectEncoder[T] = new ObjectEncoder[T] {
        override def encodeObject(a: T): JsonObject = {
          JsonObject.fromIterable(self.p(name, a, List.empty))
        }
      }
      override val decoder: Decoder[T] = Decoder.decodeJsonObject.emap(j => d(j, name))
    }

  }

  object ii extends Context[KM] {
    override def reverse: Boolean = false

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: JsonPro[X#T#H, X#H], y: JsonPro[Y#T#H, Y#H], plus: Plus[X, Y, Z]): JsonPro[Z#T#H, Z#H] = {
      new JsonPro[Z#T#H, Z#H] {
        override def p(name: Z#H, t: Z#T#H, m: List[(String, Json)]): List[(String, Json)] = {
          val (namex, namey) = plus.take(name)
          val (itemx, itemy) = plus.sub.take(t)
          y.p(namey, itemy, x.p(namex, itemx, m))
        }
        override def d(j: JsonObject, name: Z#H): Either[String, Z#T#H] = {
          val (xx1, yy1) = plus.take(name)
          x.d(j, xx1).right.flatMap { x1 =>
            y.d(j, yy1).right.map { y1 =>
              plus.sub.plus(x1, y1)
            }
          }
        }

      }
    }

    override def start: JsonPro[Item0, Item0] = {
      new JsonPro[Item0, Item0] {
        override def p(name: Item0, t: Item0, m: List[(String, Json)]): List[(String, Json)] = m
        override def d(j: JsonObject, name: Item0): Either[String, Item0]                    = Right(Item.apply0)
      }
    }
  }

  class ItemPP[T2] extends TypeParam {
    override type H = String
    override type T = ItemP1

    class ItemP1 extends TypeParam {
      override type H = T2
      override type T = Type0
    }
  }

  implicit def im[T](implicit t: ByNameImplicit[Encoder[T]], dd: ByNameImplicit[Decoder[T]]): Application[KM, T, ItemPP[T]] =
    new Application[KM, T, ItemPP[T]] {
      override def tag: ItemTag[T] = new ItemTag[T]
      override def application(context: Context[KM]): JsonPro[T, String] = {
        new JsonPro[T, String] {
          override def p(name: String, tt: T, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.value(tt))) :: m
          }
          override def d(j: JsonObject, name: String): Either[String, T] = {
            j(name).map(jj => dd.value.decodeJson(jj).left.map(_.message)).getOrElse(Left(s"找不到属性:${name}"))
          }
        }
      }
    }

}
