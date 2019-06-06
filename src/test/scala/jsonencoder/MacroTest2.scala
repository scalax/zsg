import java.util.Date

import io.circe.{Encoder, Json, JsonObject, ObjectEncoder}
import org.scalax.asuna.mapper.item._
import org.scalax.asuna.mapper._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append.macroImpl.{AsunaGeneric, AsunaGetterGeneric, AsunaNameGeneric}

object AsunaTest02 extends App {

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

  val ii = new Context[KContext] {
    override def isReverse: Boolean = false
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
      def encoder[R <: org.scalax.asuna.mapper.append.macroImpl.WrapTag, I <: TypeParam](
          implicit ll: AsunaGeneric.Aux[H, R]
        , app: Application[KContext, R#Tag, I]
        , cv1: AsunaNameGeneric.Aux[H, I#H]
        , cv2: AsunaGetterGeneric.Aux[H, I#T#H]
      ): ObjectEncoder[H] = {
        app.application(ii).addName(cv1.names).contramapObject(mm => cv2.getter(mm))
      }
    }
  }

  case class Test01(i1: String, i2: Date)
  case class Test02(i3: String, i4: Int)

  def mm[T] = new MP[T] {}

  trait MP[I] {
    def iii[H](implicit g: AsunaGetterGeneric.Aux[I, H]): I => H = g.getter
  }

  trait Poly1 {

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

    implicit def implicit1: ObjectEncoder[Test02] = JsoSetter.fetchEncoder[Test02].encoder
    //implicit def implicit2 = AsunaGeneric.init[Test01].generic.debugInstance.debug(ii)

    val mi = implicit1(Test02("1234", 12)).noSpaces

  }

  object Poly1 extends Poly1

  {
    println(Poly1.mi)
  }

}
