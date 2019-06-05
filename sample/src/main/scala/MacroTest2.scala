import io.circe.{Encoder, Json, JsonObject, ObjectEncoder}
import org.scalax.asuna.mapper.item._
import org.scalax.asuna.mapper._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append.macroImpl.AsunaGeneric

object Test02 extends App {

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
        , cv1: R#NameType <:< I#H
        , cv2: R#GenericType <:< I#T#H
      ): ObjectEncoder[H] = {
        app.application(ii).addName(ll.names).contramapObject(mm => ll.getter(mm))
      }
    }
  }

  case class Test01(i1: String, i2: Int)
  case class Test02(i3: String, i4: Int)

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

    implicit def implicit1 = JsoSetter.fetchEncoder[Test01].encoder

    val mi = implicit1.apply(Test01("1234", 12)).noSpaces

    // debug
    case class Test03(i3: String, i4: java.util.Date)

    // error message:
    /*[error] E:\pro\workspace\asuna\sample\src\main\scala\MacroTest2.scala:79:58:
    [error] Application not found.
    [error] ItemType: java.util.Date
    [error] KindContext: Test02.KContext
    [error] Message    :第2列i4找不到 implicit
    [error]     AsunaGeneric.init[Test03].generic.debugInstance.debug(ii)
    [error]                                                          ^
    [error] one error found
    [error] (sample / Compile / compileIncremental) Compilation failed
    [error] Total time: 3 s, completed 2019-6-5 18:39:01*/
    //AsunaGeneric.init[Test03].generic.debugInstance.debug(ii)
  }

  object Poly1 extends Poly1

  {
    println(Poly1.mi)
  }





}
