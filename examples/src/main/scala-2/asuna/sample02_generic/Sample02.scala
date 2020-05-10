package asuna.sample02_generic

import asuna._
import asuna.macros.ByNameImplicit
import asuna.macros.single.PropertyApply
import asuna.testkit.circe.CirceType
import io.circe.{Encoder, JsonObject}

object Sample02 {

  trait AsunaTestGeneric[C] {
    type Gen
  }

  object AsunaTestGeneric {
    type Aux[C, G] = AsunaTestGeneric[C] { type Gen = G }
    class Apply1[C] {
      def generic[G](param: => G): Aux[C, G] = new AsunaTestGeneric[C] {
        override type Gen = G
      }
    }
    def init[C]: Apply1[C] = new Apply1[C]
  }

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val test04Value = Test04(i1 = "i1", i2 = 2, i3 = 3, i4 = 4)

  val ap = PropertyApply[Test04]

  val test04PropertyTag: AsunaTuple2[AsunaTuple2[PropertyTag[String], PropertyTag[Int]], AsunaTuple2[PropertyTag[Long], PropertyTag[Long]]] =
    BuildContent.tuple2 ( BuildContent.tuple2(ap.to(_.i1), ap.to(_.i2)),  BuildContent.tuple2(ap.to(_.i3), ap.to(_.i4)))

  implicit val test04Generic = AsunaTestGeneric.init[Test04].generic(test04PropertyTag)

  trait JsonObjectAppender[IP, T, II] {
    def appendField(obj: T, name: II, m: JsonObject): JsonObject
  }

  object ii extends Context3[JsonObjectAppender] {
    override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonObjectAppender[X1, X2, X3], y: JsonObjectAppender[Y1, Y2, Y3])(
      p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
    ): JsonObjectAppender[Z1, Z2, Z3] = {
      new JsonObjectAppender[Z1, Z2, Z3] {
        override def appendField(obj: Z2, name: Z3, m: JsonObject): JsonObject = {
          y.appendField(p.takeTail2(obj), p.takeTail3(name), x.appendField(p.takeHead2(obj), p.takeHead3(name), m))
        }
      }
    }

    override def start: JsonObjectAppender[AsunaTuple0, AsunaTuple0, AsunaTuple0] = {
      new JsonObjectAppender[AsunaTuple0, AsunaTuple0, AsunaTuple0] {
        override def appendField(obj: AsunaTuple0, name: AsunaTuple0, m: JsonObject): JsonObject = m
      }
    }
  }

  implicit val test04Getter: Test04 => AsunaTuple2[AsunaTuple2[String, Int], AsunaTuple2[Long, Long]] = (foo: Test04) => {
    BuildContent.tuple2(BuildContent.tuple2(foo.i1, foo.i2), BuildContent.tuple2(foo.i3, foo.i4))
  }

  implicit val test04Labelled: AsunaTuple2[AsunaTuple2[String, String], AsunaTuple2[String, String]] =
    BuildContent.tuple2(BuildContent.tuple2("i1", "i2"), BuildContent.tuple2("i3", "i4"))

  implicit def circePropertyEncoder[T](implicit encoder: ByNameImplicit[Encoder[T]]): Application3[JsonObjectAppender, PropertyTag[T], T, String] =
    new Application3[JsonObjectAppender, PropertyTag[T], T, String] {
      override def application(context: Context3[JsonObjectAppender]): JsonObjectAppender[PropertyTag[T], T, String] = {
        new JsonObjectAppender[PropertyTag[T], T, String] {
          override def appendField(obj: T, name: String, m: JsonObject): JsonObject = {
            ((name, encoder.value(obj))) +: m
          }
        }
      }
    }

  def circeJsonObjectEncoder[H, T, I2, I3](
    implicit generic: AsunaTestGeneric.Aux[H, T],
    app: Application3[JsonObjectAppender, T, I2, I3],
    i1: H => I2,
    i2: I3
  ): CirceType.JsonObjectEncoder[H] = {
    CirceType.JsonObjectEncoder.instance { f: H => app.application(ii).appendField(i1(f), i2, JsonObject.empty) }
  }

  implicit val test04Encoder: CirceType.JsonObjectEncoder[Test04] = circeJsonObjectEncoder

  def main(i: Array[String]): Unit = {
    println("Test02 Result")
    println(test04Encoder(test04Value).noSpaces)
  }

}
