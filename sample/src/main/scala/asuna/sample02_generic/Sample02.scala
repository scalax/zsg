package asuna.sample02_generic

import asuna._
import asuna.macros.{LazyImplicit, PropertyApply, PropertyTag}
import io.circe.{Encoder, JsonObject}

object Sample02 {

  trait AsunaTestGeneric[C] {
    type Gen <: ItemTag
  }

  object AsunaTestGeneric {
    type Aux[C, G <: ItemTag] = AsunaTestGeneric[C] { type Gen = G }
    class Apply1[C] {
      def generic[G <: ItemTag](param: => AppendTag[G]): Aux[C, G] = new AsunaTestGeneric[C] {
        override type Gen = G
      }
    }
    def init[C]: Apply1[C] = new Apply1[C]
  }

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val test04Value = Test04(i1 = "i1", i2 = 2, i3 = 3, i4 = 4)

  val ap = PropertyApply[Test04]

  val test04PropertyTag
    : AppendTag[ItemTag4[PropertyTag[String], `Number： 1`, PropertyTag[Int], `Number： 2`, PropertyTag[Long], `Number： 3`, PropertyTag[Long], `Number： 4`]] =
    BuildContent.lift(BuildContent.tag(ap.to(_.i1), ap.to(_.i2), ap.to(_.i3), ap.to(_.i4)))

  implicit val test04Generic = AsunaTestGeneric.init[Test04].generic(test04PropertyTag)

  trait JsonEncoder[T, II] {
    def appendProperty(obj: T, name: II, m: JsonObject): JsonObject
  }

  class KContext extends KindContext {
    override type M[P <: TypeHList] = JsonEncoder[P#H, P#T#H]
  }

  object ii extends Context[KContext] {
    override def isReverse: Boolean = false

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonEncoder[X#H, X#T#H],
      y: JsonEncoder[Y#H, Y#T#H],
      plus: Plus[X, Y, Z]
    ): JsonEncoder[Z#H, Z#T#H] = new JsonEncoder[Z#H, Z#T#H] {
      override def appendProperty(obj: Z#H, name: Z#T#H, m: JsonObject): JsonObject =
        x.appendProperty(plus.takeHead(obj), plus.sub.takeHead(name), y.appendProperty(plus.takeTail(obj), plus.sub.takeTail(name), m))
    }

    override def start: JsonEncoder[Item0, Item0] = new JsonEncoder[Item0, Item0] {
      override def appendProperty(name: Item0, obj: Item0, m: JsonObject): JsonObject = m
    }
  }

  implicit val test04Getter: Test04 => Item4[String, Int, Long, Long] = (foo: Test04) => {
    BuildContent.item4(foo.i1, foo.i2, foo.i3, foo.i4).withContext(ii)
  }

  implicit val test04Labelled: Item4[String, String, String, String] =
    BuildContent.item4("i1", "i2", "i3", "i4").withContext(ii)

  implicit def circePropertyEncoder[T](implicit encoder: LazyImplicit[Encoder[T]]): Application[KContext, PropertyTag[T], TypeHList2[T, String]] =
    new Application[KContext, PropertyTag[T], TypeHList2[T, String]] {
      override def application(context: Context[KContext]): JsonEncoder[T, String] = {
        new JsonEncoder[T, String] {
          override def appendProperty(obj: T, name: String, m: JsonObject): JsonObject = {
            ((name, encoder.value(obj))) +: m
          }
        }
      }
    }

  def circeJsonObjectEncoder[H, T <: ItemTag, I <: TypeHList](
    implicit generic: AsunaTestGeneric.Aux[H, T],
    app: Application[KContext, T, I],
    i1: H => I#H,
    i2: I#T#H
  ): Encoder.AsObject[H] = {
    Encoder.AsObject.instance { f: H =>
      app.application(ii).appendProperty(i1(f), i2, JsonObject.empty)
    }
  }

  implicit val test04Encoder: Encoder.AsObject[Test04] = circeJsonObjectEncoder

  def main(i: Array[String]): Unit = {
    println("Test02 Result")
    println(test04Encoder(test04Value).noSpaces)
  }

}
