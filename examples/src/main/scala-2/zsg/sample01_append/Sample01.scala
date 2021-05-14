package zsg.sample01_append

import zsg._
import zsg.testkit.circe.CirceVersionCompat
import io.circe._
import io.circe.syntax._

object Sample01 {

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val getter = { test04: Test04 => new ZsgTuple2(new ZsgTuple2(test04.i1, test04.i2), new ZsgTuple2(test04.i3, test04.i4)) }
  val names = new ZsgTuple2(new ZsgTuple2("i1", "i2"), new ZsgTuple2("i3", "i4"))

  trait JsonObjectAppender[T, II] {
    def appendField(obj: T, name: II, m: JsonObject): JsonObject
  }

  object ii extends Context2[JsonObjectAppender] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonObjectAppender[X1, X2], y: JsonObjectAppender[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): JsonObjectAppender[Z1, Z2] =
      new JsonObjectAppender[Z1, Z2] {
        override def appendField(obj: Z1, name: Z2, m: JsonObject): JsonObject = {
          y.appendField(p.takeTail1(obj), p.takeTail2(name), x.appendField(p.takeHead1(obj), p.takeHead2(name), m))
        }
      }
  }

  val a1: JsonObjectAppender[String, String] = new JsonObjectAppender[String, String] {
    override def appendField(obj: String, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromString(obj)) +: m
    }
  }
  val a2: JsonObjectAppender[Int, String] = new JsonObjectAppender[Int, String] {
    override def appendField(obj: Int, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromInt(obj)) +: m
    }
  }
  val a3: JsonObjectAppender[Long, String] = new JsonObjectAppender[Long, String] {
    override def appendField(obj: Long, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromLong(obj)) +: m
    }
  }
  val a4: JsonObjectAppender[Long, String] = new JsonObjectAppender[Long, String] {
    override def appendField(obj: Long, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromLong(obj)) +: m
    }
  }

  val b1: JsonObjectAppender[ZsgTuple2[ZsgTuple2[String, Int], ZsgTuple2[Long, Long]], ZsgTuple2[
    ZsgTuple2[String, String],
    ZsgTuple2[String, String]
  ]] = ApplicationX2
    .applicationImplicit2(
      ApplicationX2.applicationImplicit2(
        ApplicationX2.applicationImplicit[JsonObjectAppender, Context2[JsonObjectAppender], String, String](a1),
        ApplicationX2.applicationImplicit[JsonObjectAppender, Context2[JsonObjectAppender], Int, String](a2)
      ),
      ApplicationX2.applicationImplicit2(
        ApplicationX2.applicationImplicit[JsonObjectAppender, Context2[JsonObjectAppender], Long, String](a3),
        ApplicationX2.applicationImplicit[JsonObjectAppender, Context2[JsonObjectAppender], Long, String](a4)
      )
    )
    .application(ii)

  def main(arr: Array[String]): Unit = {
    implicit val encoderTest04: CirceVersionCompat.JsonObjectEncoder[Test04] =
      CirceVersionCompat.JsonObjectEncoder.instance { o: Test04 => b1.appendField(getter(o), names, JsonObject.empty) }

    println(Test04("test04", 4, 5, 6).asJson.noSpaces) //{"i1":"test04","i2":4,"i3":5,"i4":6}
  }

}
