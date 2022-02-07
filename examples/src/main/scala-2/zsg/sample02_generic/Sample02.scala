package zsg.sample02_generic

import zsg._
import zsg.macros.ByNameImplicit
import zsg.macros.single.PropertyApply
import zsg.testkit.circe.CirceVersionCompat
import io.circe.{Encoder, JsonObject}

object Sample02 {

  trait ZsgTestGeneric[C] {
    type Gen
  }

  object ZsgTestGeneric {
    type Aux[C, G] = ZsgTestGeneric[C] { type Gen = G }
    class Apply1[C] {
      def generic[G](param: => G): Aux[C, G] =
        new ZsgTestGeneric[C] {
          override type Gen = G
        }
    }
    def init[C]: Apply1[C] = new Apply1[C]
  }

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val ap = PropertyApply[Test04]

  val test04PropertyTag: ItemTag2[ItemTag2[PropertyTag[String], PropertyTag[Int]], ItemTag2[PropertyTag[Long], PropertyTag[Long]]] =
    new ItemTag2

  implicit val test04Generic = ZsgTestGeneric.init[Test04].generic(test04PropertyTag)

  trait JsonObjectAppender[T, II] {
    def appendField(obj: T, name: II, m: JsonObject): JsonObject
  }

  class IITypeContext extends TypeFunction {
    override type H[T <: TypeHList] = JsonObjectAppender[T#Head, T#Tail#Head]
  }
  class ii extends Context[IITypeContext] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonObjectAppender[X#Head, X#Tail#Head],
      y: JsonObjectAppender[Y#Head, Y#Tail#Head]
    )(plus: Plus[X, Y, Z]): JsonObjectAppender[Z#Head, Z#Tail#Head] = new JsonObjectAppender[Z#Head, Z#Tail#Head] {
      override def appendField(obj: Z#Head, name: Z#Tail#Head, m: JsonObject): JsonObject =
        x.appendField(plus.takeHead(obj), plus.tail.takeHead(name), y.appendField(plus.takeTail(obj), plus.tail.takeTail(name), m))
    }
  }

  implicit val test04Getter: Test04 => ZsgTuple2[ZsgTuple2[String, Int], ZsgTuple2[Long, Long]] = (foo: Test04) => {
    new ZsgTuple2(new ZsgTuple2(foo.i1, foo.i2), new ZsgTuple2(foo.i3, foo.i4))
  }

  implicit val test04Labelled: ZsgTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]] =
    new ZsgTuple2(new ZsgTuple2("i1", "i2"), new ZsgTuple2("i3", "i4"))

  implicit def circePropertyEncoder[T](implicit
    encoder: ByNameImplicit[Encoder[T]]
  ): Application[IITypeContext, PropertyTag[T], TypeAlias.TypeHList2[T, String]] =
    new Application[IITypeContext, PropertyTag[T], TypeAlias.TypeHList2[T, String]] {
      override def application(context: Context[IITypeContext]): JsonObjectAppender[T, String] = new JsonObjectAppender[T, String] {
        override def appendField(obj: T, name: String, m: JsonObject): JsonObject = {
          ((name, encoder.value(obj))) +: m
        }
      }
    }

  def circeJsonObjectEncoder[H, T, I <: TypeHList](implicit
    generic: ZsgTestGeneric.Aux[H, T],
    app: Application[IITypeContext, T, I],
    i1: H => I#Head,
    i2: I#Tail#Head
  ): CirceVersionCompat.JsonObjectEncoder[H] = CirceVersionCompat.JsonObjectEncoder.instance { f: H =>
    app.application(new ii).appendField(i1(f), i2, JsonObject.empty)
  }

  implicit val test04Encoder: CirceVersionCompat.JsonObjectEncoder[Test04] = circeJsonObjectEncoder

  def main(i: Array[String]): Unit = {
    val test04Value = Test04(i1 = "i1", i2 = 2, i3 = 3, i4 = 4)
    for {
      i1 <- 0 to 10
      i2 <- 0 to 10
      i3 <- 0 to 10
      i4 <- 0 to 10
    } {
      val model = Test04(i1 = s"i$i1", i2 = i2, i3 = i3, i4 = i4)
      val str   = test04Encoder(model).noSpaces
      assert(str == s"""{"i1":"i$i1","i2":$i2,"i3":$i3,"i4":$i4}""")
    }
    println(test04Encoder(test04Value).noSpaces) // {"i1":"i1","i2":2,"i3":3,"i4":4}

  }

}
