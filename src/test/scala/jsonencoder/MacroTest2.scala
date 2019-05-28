import io.circe.{Encoder, Json, JsonObject, ObjectEncoder}
import org.scalax.asuna.ii.item._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric
import org.scalax.asuna.mapper.item._

object Test02 extends App {

  trait JsonEncoder[T, II] {
    self =>

    def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]

    def to(name: II): ObjectEncoder[T] = new ObjectEncoder[T] {
      override def encodeObject(a: T): JsonObject = {
        JsonObject.fromIterable(self.p(a, name, List.empty))
      }
    }

    def compose[P](u: P => T): JsonEncoder[P, II] = new JsonEncoder[P, II] {
      override def p(t: P, name: II, m: List[(String, Json)]): List[(String, Json)] = self.p(u(t), name, m)
    }

  }

  class KContext extends KindContext {
    override type M[P <: TypeParam] = JsonEncoder[P#T#H, P#H]
  }

  object KContext {
    implicit def im[T](implicit t: ByNameImplicit[Encoder[T]]): Application[KContext, T, TypeParam2[String, T]] =
      new Application[KContext, T, TypeParam2[String, T]] {
        override def application(context: Context[KContext]): JsonEncoder[T, String] = {
          new JsonEncoder[T, String] {
            override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
              ((name, t.value(tt))) :: m
            }
          }
        }
      }
  }

  val ii = new Context[KContext] {
    override def isReverse: Boolean = true
    override def useHList: Boolean  = false

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
        x: JsonEncoder[X#T#H, X#H]
      , y: JsonEncoder[Y#T#H, Y#H]
      , plus: Plus[X, Y, Z]
    ): JsonEncoder[Z#T#H, Z#H] = new JsonEncoder[Z#T#H, Z#H] {
      override def p(obj: Z#T#H, name: Z#H, m: List[(String, Json)]): List[(String, Json)] =
        x.p(plus.sub.takeTail(obj), plus.takeTail(name), y.p(plus.sub.takeHead(obj), plus.takeHead(name), m))
    }

    override def start: JsonEncoder[XyyItem0, XyyItem0] = new JsonEncoder[XyyItem0, XyyItem0] {
      override def p(name: XyyItem0, obj: XyyItem0, m: List[(String, Json)]): List[(String, Json)] = m
    }
  }

  object JsoSetter {
    def fetchEncoder[H] = new MapperKou[H]
    class MapperKou[H] {
      def encoder[R <: org.scalax.asuna.mapper.item.ItemTag, I <: TypeParam, U, NN <: TypeParam2.Aux[U, R#XyyItemType]](
          implicit ll: AsunaGeneric.Aux[H, R, U]
        , app: Application[KContext, R, org.scalax.asuna.ii.item.EatXyyType2[org.scalax.asuna.ii.item.TypeParam2[String, String], org.scalax.asuna.ii.item.TypeParam2[String, Int]]]
        //, cv1: U <:< I#H
        //, cv2: R#XyyItemType <:< I#T#H
      ): ObjectEncoder[H] = {
        /*app
          .application(ii)
          .compose[H](u = { mm: H =>
            ll.getter(mm)
          })
          .to(ll.names)*/
        throw new Exception("imim")
      }
    }
  }

  case class Test01(i1: String, i2: Int)
  case class Test02(i3: String, i4: Int)

  val iiii1122: org.scalax.asuna.ii.item.EatXyyType2[org.scalax.asuna.ii.item.TypeParam2[String, String], org.scalax.asuna.ii.item.TypeParam2[String, Int]] =
    throw new Exception("in")

  iiii1122: TypeParam2.Aux[XyyItem2[String, String], XyyItem2[String, Int]]

  type IIBB = iiii1122.type

  val aa: IIBB#T#T = throw new Exception("imm")

  trait Poly1 {

    implicit def implicit1 = JsoSetter.fetchEncoder[Test01].encoder

  }

}
