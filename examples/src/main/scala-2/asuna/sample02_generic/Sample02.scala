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

  val test04Value = Test04(i1 = "i1", i2 = 2, i3 = 3, i4 = 4)

  val ap = PropertyApply[Test04]

  val test04PropertyTag: ZTuple4[PropertyTag[String], PropertyTag[Int], PropertyTag[Long], PropertyTag[Long]] =
    BuildContent.tuple4(ap.to(_.i1), ap.to(_.i2), ap.to(_.i3), ap.to(_.i4))

  implicit val test04Generic = ZsgTestGeneric.init[Test04].generic(test04PropertyTag)

  trait JsonObjectAppender[IP, T, II] {
    def appendField(obj: T, name: II, m: JsonObject): JsonObject
  }

  class ii extends Context3[JsonObjectAppender] {
    override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonObjectAppender[X1, X2, X3], y: JsonObjectAppender[Y1, Y2, Y3])(
      p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
    ): JsonObjectAppender[Z1, Z2, Z3] =
      new JsonObjectAppender[Z1, Z2, Z3] {
        override def appendField(obj: Z2, name: Z3, m: JsonObject): JsonObject = {
          y.appendField(p.takeTail2(obj), p.takeTail3(name), x.appendField(p.takeHead2(obj), p.takeHead3(name), m))
        }
      }

    override val start: JsonObjectAppender[ZsgTuple0, ZsgTuple0, ZsgTuple0] = new JsonObjectAppender[ZsgTuple0, ZsgTuple0, ZsgTuple0] {
      override def appendField(obj: ZsgTuple0, name: ZsgTuple0, m: JsonObject): JsonObject = m
    }
  }

  implicit val test04Getter: Test04 => ZTuple4[String, Int, Long, Long] = (foo: Test04) => {
    BuildContent.tuple4(foo.i1, foo.i2, foo.i3, foo.i4)
  }

  implicit val test04Labelled: ZTuple4[String, String, String, String] =
    BuildContent.tuple4("i1", "i2", "i3", "i4")

  implicit def circePropertyEncoder[T](implicit encoder: ByNameImplicit[Encoder[T]]): JsonObjectAppender[PropertyTag[T], T, String] = {
    new JsonObjectAppender[PropertyTag[T], T, String] {
      override def appendField(obj: T, name: String, m: JsonObject): JsonObject = {
        ((name, encoder.value(obj))) +: m
      }
    }
  }

  def circeJsonObjectEncoder[H, T, I2, I3](implicit
    generic: ZsgTestGeneric.Aux[H, T],
    app: ApplicationX3[JsonObjectAppender, ii, T, I2, I3],
    i1: H => I2,
    i2: I3
  ): CirceVersionCompat.JsonObjectEncoder[H] = CirceVersionCompat.JsonObjectEncoder.instance { f: H => app.application(new ii).appendField(i1(f), i2, JsonObject.empty) }

  implicit val test04Encoder: CirceVersionCompat.JsonObjectEncoder[Test04] = circeJsonObjectEncoder

  def main(i: Array[String]): Unit = {
    println("Test02 Result")
    println(test04Encoder(test04Value).noSpaces)
  }

}
