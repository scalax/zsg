package asuna.sample02_generic

import asuna._
import asuna.macros.{ByNameImplicit}
import asuna.macros.single.{PropertyApply, PropertyTag}
import io.circe.{Encoder, JsonObject}

object Sample02 {

  trait AsunaTestGeneric[C] {
    type Gen <: TupleTag
  }

  object AsunaTestGeneric {
    type Aux[C, G <: TupleTag] = AsunaTestGeneric[C] { type Gen = G }
    class Apply1[C] {
      def generic[G <: TupleTag](param: => AppendTag[G]): Aux[C, G] = new AsunaTestGeneric[C] {
        override type Gen = G
      }
    }
    def init[C]: Apply1[C] = new Apply1[C]
  }

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val test04Value = Test04(i1 = "i1", i2 = 2, i3 = 3, i4 = 4)

  val ap = PropertyApply[Test04]

  val test04PropertyTag: AppendTag[TupleTag4[PropertyTag[String], PropertyTag[Int], PropertyTag[Long], PropertyTag[Long]]] =
    BuildTag.lift(BuildTag.tag(ap.to(_.i1), ap.to(_.i2), ap.to(_.i3), ap.to(_.i4)))

  implicit val test04Generic = AsunaTestGeneric.init[Test04].generic(test04PropertyTag)

  trait JsonObjectAppender[T, II] {
    def appendField(obj: T, name: II, m: JsonObject): JsonObject
  }

  object ii extends Context2[JsonObjectAppender] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonObjectAppender[X1, X2], y: JsonObjectAppender[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): JsonObjectAppender[Z1, Z2] = { (obj, name, m) =>
      y.appendField(p.takeTail1(obj), p.takeTail2(name), x.appendField(p.takeHead1(obj), p.takeHead2(name), m))
    }

    override def start: JsonObjectAppender[AsunaTuple0, AsunaTuple0] = { (name, obj, m) =>
      m
    }
  }

  implicit val test04Getter: Test04 => AsunaTuple4[String, Int, Long, Long] = (foo: Test04) => {
    BuildContent.tuple4(foo.i1, foo.i2, foo.i3, foo.i4)
  }

  implicit val test04Labelled: AsunaTuple4[String, String, String, String] =
    BuildContent.tuple4("i1", "i2", "i3", "i4")

  implicit def circePropertyEncoder[T](implicit encoder: ByNameImplicit[Encoder[T]]): Application2[JsonObjectAppender, PropertyTag[T], T, String] =
    new Application2[JsonObjectAppender, PropertyTag[T], T, String] {
      override def application(context: Context2[JsonObjectAppender]): JsonObjectAppender[T, String] = {
        new JsonObjectAppender[T, String] {
          override def appendField(obj: T, name: String, m: JsonObject): JsonObject = {
            ((name, encoder.value(obj))) +: m
          }
        }
      }
    }

  def circeJsonObjectEncoder[H, T <: TupleTag, I2, I3](
    implicit generic: AsunaTestGeneric.Aux[H, T],
    app: Application2[JsonObjectAppender, T, I2, I3],
    i1: H => I2,
    i2: I3
  ): Encoder.AsObject[H] = {
    Encoder.AsObject.instance { f: H =>
      app.application(ii).appendField(i1(f), i2, JsonObject.empty)
    }
  }

  implicit val test04Encoder: Encoder.AsObject[Test04] = circeJsonObjectEncoder

  def main(i: Array[String]): Unit = {
    println("Test02 Result")
    println(test04Encoder(test04Value).noSpaces)
  }

}
