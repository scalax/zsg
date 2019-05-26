import io.circe.{Encoder, Json, JsonObject, ObjectEncoder}
import org.scalax.asuna.ii.item.{TypeParam2, XyyItem0}
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric
import org.scalax.asuna.mapper.item._

object Test02 extends App {

  trait JsonEncoder[T, II] {
    self =>

    def p(name: II, obj: T, m: List[(String, Json)]): List[(String, Json)]

    def to(name: II): ObjectEncoder[T] = new ObjectEncoder[T] {
      override def encodeObject(a: T): JsonObject = {
        JsonObject.fromIterable(self.p(name, a, List.empty))
      }
    }

    def compose[P](u: P => T): JsonEncoder[P, II] = new JsonEncoder[P, II] {
      override def p(name: II, t: P, m: List[(String, Json)]): List[(String, Json)] = self.p(name, u(t), m)
    }

  }

  class KContext[PP] extends KindContext {
    override type M[P <: TypeParam] = JsonEncoder[P#T#H, P#H]
  }

  def ii[PP] = new Context[KContext[PP]] {
    override def isReverse: Boolean = true
    override def useHList: Boolean  = false

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
      x: JsonEncoder[X#T#H, X#H],
      y: JsonEncoder[Y#T#H, Y#H],
      plus: Plus[X, Y, Z]
    ): JsonEncoder[Z#T#H, Z#H] = new JsonEncoder[Z#T#H, Z#H] {
      override def p(name: Z#H, obj: Z#T#H, m: List[(String, Json)]): List[(String, Json)] =
        x.p(plus.takeTail(name), plus.sub.takeTail(obj), y.p(plus.takeHead(name), plus.sub.takeHead(obj), m))
    }

    override def start: JsonEncoder[XyyItem0, XyyItem0] = new JsonEncoder[XyyItem0, XyyItem0] {
      override def p(name: XyyItem0, obj: XyyItem0, m: List[(String, Json)]): List[(String, Json)] = m
    }
  }

  class JsoSetter[II] {
    def fetchEncoder[H] = new MapperKou[H]
    class MapperKou[H] {
      def encoder[R <: org.scalax.asuna.mapper.item.ItemTag, I <: TypeParam, U](
          implicit ll: AsunaGeneric.Aux[H, R, U]
        , app: Application[KContext[II], R, I]
        , cv1: U <:< I#H
        , cv2: R#XyyItemType <:< I#T#H
      ): ObjectEncoder[H] = {
        app
          .application(ii)
          .compose[H](u = { mm: H =>
            cv2(ll.getter(mm))
          })
          .to(cv1(ll.names))
      }
    }
  }

  def mp[T] = new JsoSetter[T]

  case class Test01(i1: String, i2: Int)
  case class Test02(i3: String, i4: Int)

  def im[T, PP](implicit t: ByNameImplicit[Encoder[T]]): Application[KContext[PP], T, TypeParam2[String, T]] =
    new Application[KContext[PP], T, TypeParam2[String, T]] {
      override def application(context: Context[KContext[PP]]): JsonEncoder[T, String] = {
        new JsonEncoder[T, String] {
          override def p(name: String, tt: T, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.value(tt))) :: m
          }
        }
      }
    }

  trait Poly1 {

    implicit def im1[T](implicit t: ByNameImplicit[Encoder[T]]) = im[T, Poly1](t)

    implicit def implicit1 = mp[Poly1].fetchEncoder[Test01].encoder

  }

  object Poly1 extends Poly1

  trait Poly2 {

    implicit def im1[T](implicit t: ByNameImplicit[Encoder[T]]) = im[T, Poly2](t)

    implicit def implicit2 = mp[Poly2].fetchEncoder[Test02].encoder

  }

  object Poly2 extends Poly2

}
