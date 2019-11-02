import io.circe.{Encoder, Json, JsonObject, ObjectEncoder}
import org.scalax.asuna.mapper.item._
import org.scalax.asuna.mapper._
import org.scalax.asuna.mapper.append.macroImpl.{AsunaGeneric, AsunaGetterGeneric, AsunaNameGeneric}

object Test01 extends App {

  trait JsonEncoder1[T, II] {
    def p(obj: T, m: List[(String, Json)]): List[(String, Json)]
    def toJsonObject: ObjectEncoder[T] = ObjectEncoder.instance(s => JsonObject.fromIterable(p(s, List.empty)))
  }

  trait JsonEncoder2[T, II] {
    def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]
    def toJsonObject(name: II): ObjectEncoder[T] =
      ObjectEncoder.instance(s => JsonObject.fromIterable(p(s, name, List.empty)))
  }

  class KContext extends KindContext {
    type M[I <: TypeParam] = JsonEncoder2[I#H, I#T#H]
  }

  val ii = new Context[KContext] {
    override def isReverse: Boolean = false
    override def useHList: Boolean  = true
    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](x: JsonEncoder2[X#H, X#T#H],
                                                                        y: JsonEncoder2[Y#H, Y#T#H],
                                                                        pp: Plus[X, Y, Z]): JsonEncoder2[Z#H, Z#T#H] = new JsonEncoder2[Z#H, Z#T#H] {
      override def p(obj: Z#H, name: Z#T#H, m: List[(String, Json)]): List[(String, Json)] = {
        x.p(pp.takeTail(obj), pp.sub.takeTail(name), y.p(pp.takeHead(obj), pp.sub.takeHead(name), m))
      }
    }

    override def start: JsonEncoder2[XyyItem0, XyyItem0] = {
      new JsonEncoder2[XyyItem0, XyyItem0] {
        override def p(obj: XyyItem0, name: XyyItem0, m: List[(String, Json)]): List[(String, Json)] = m
      }
    }
  }

  implicit def circeEncoderImplicit[T](implicit t: Encoder[T]): Application[KContext, T, TypeParam2[T, String]] =
    new Application[KContext, T, TypeParam2[T, String]] {
      override def application(context: Context[KContext]): JsonEncoder2[T, String] = {
        new JsonEncoder2[T, String] {
          override def p(tt: T, name: String, m: List[(String, Json)]): List[(String, Json)] = {
            ((name, t.apply(tt))) :: m
          }
        }
      }
    }

  def appendTag[T, I <: TypeParam](tag: AppendTag[T])(implicit p: Application[KContext, T, I]): KContext#M[I] = p.application(ii)

  type DebugMessage = Message

  val jsonPro1                                                                                  = appendTag(BuildTagContect.tag(new AppendTag[String], new AppendTag[Int], new AppendTag[Long]))
  val jsonPro2                                                                                  = appendTag(BuildTagContect.tag(new AppendTag[Float], new AppendTag[Float], new AppendTag[Int]))
  val jsonPro1Type: JsonEncoder2[XyyItem3[String, Int, Long], XyyItem3[String, String, String]] = jsonPro1
  val jsonPro2Type: JsonEncoder2[XyyItem3[Float, Float, Int], XyyItem3[String, String, String]] = jsonPro2

  object JsonSetter {
    def encoder[H, R <: ItemTag, I <: TypeParam](
        implicit ll: AsunaGeneric.Aux[H, R]
      , app: Application[KContext, R, I]
      , cv1: AsunaNameGeneric.Aux[H, I#T#H]
      , cv2: AsunaGetterGeneric.Aux[H, I#H]
    ): ObjectEncoder[H] = {
      app.application(ii).toJsonObject(cv1.names.withContext(ii)).contramapObject(mm => cv2.getter(mm).withContext(ii))
    }
  }

  case class Foo(bar: String, age: Int)

  implicit def fooImplicit: ObjectEncoder[Foo] = JsonSetter.encoder

  import io.circe.syntax._

  println(Foo("bar name", 2222).asJson.noSpaces) //{"bar":"bar name","age":2222}

  case class Test03(bar: String, date: java.util.Date)
  //AsunaGeneric.init[Test03].generic.tag.debug(ii)
  // error message:
  /*[error] E:\pro\workspace\asuna\sample\src\main\scala\MacroTest1.scala:93:46:
  [error] Application not found.
  [error] ItemType    : java.util.Date
  [error] KindContext : Test01.KContext
  [error] Column Index: Asuna.Number: 2
  [error]
  [error] Number: 3 :-<>-: Number: 2 Means index = 3 * 22 + 2 = 68(1 based)
  [error]
  [error]   AsunaGeneric.init[Test03].generic.tag.debug(ii)
  [error]                                              ^
  [error] one error found
  [error] (sample / Compile / compileIncremental) Compilation failed
  [error] Total time: 1 s, completed 2019-6-7 14:18:29*/


}
