package zsg.sample01_append

import zsg._
import zsg.testkit.circe.CirceVersionCompat
import io.circe._
import io.circe.syntax._

object Sample01 {

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val getter = { test04: Test04 => new ZsgTuple2(new ZsgTuple2(test04.i1, test04.i2), new ZsgTuple2(test04.i3, test04.i4)) }
  val names  = new ZsgTuple2(new ZsgTuple2("i1", "i2"), new ZsgTuple2("i3", "i4"))

  trait JsonObjectAppender[T, II] {
    def appendField(obj: T, name: II, m: JsonObject): JsonObject
  }

  class iiTypeContext extends TypeFunction {
    override type H[T <: TypeHList] = JsonObjectAppender[T#Head, T#Tail#Head]
  }
  object ii extends Context[iiTypeContext] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonObjectAppender[X#Head, X#Tail#Head],
      y: JsonObjectAppender[Y#Head, Y#Tail#Head]
    )(plus: Plus[X, Y, Z]): JsonObjectAppender[Z#Head, Z#Tail#Head] = new JsonObjectAppender[Z#Head, Z#Tail#Head] {
      override def appendField(obj: Z#Head, name: Z#Tail#Head, m: JsonObject): JsonObject =
        x.appendField(plus.takeHead(obj), plus.tail.takeHead(name), y.appendField(plus.takeTail(obj), plus.tail.takeTail(name), m))
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
  ]] = Application
    .applicationImplicit2(
      Application.applicationImplicit2(
        new Application[iiTypeContext, PropertyTag[String], TypeAlias.TypeHList2[String, String]] {
          override def application(context: Context[iiTypeContext]): JsonObjectAppender[String, String] = a1
        },
        new Application[iiTypeContext, PropertyTag[String], TypeAlias.TypeHList2[Int, String]] {
          override def application(context: Context[iiTypeContext]): JsonObjectAppender[Int, String] = a2
        }
      ),
      Application.applicationImplicit2(
        new Application[iiTypeContext, PropertyTag[String], TypeAlias.TypeHList2[Long, String]] {
          override def application(context: Context[iiTypeContext]): JsonObjectAppender[Long, String] = a3
        },
        new Application[iiTypeContext, PropertyTag[String], TypeAlias.TypeHList2[Long, String]] {
          override def application(context: Context[iiTypeContext]): JsonObjectAppender[Long, String] = a4
        }
      )
    )
    .application(ii)

  def main(arr: Array[String]): Unit = {
    implicit val encoderTest04: CirceVersionCompat.JsonObjectEncoder[Test04] =
      CirceVersionCompat.JsonObjectEncoder.instance { o: Test04 => b1.appendField(getter(o), names, JsonObject.empty) }

    for {
      i1 <- 0 to 10
      i2 <- 0 to 10
      i3 <- 0 to 10
      i4 <- 0 to 10
    } {
      assert(Test04(s"test$i1", i2, i3, i4).asJson.noSpaces == s"""{"i1":"test$i1","i2":$i2,"i3":$i3,"i4":$i4}""")
    }
    println(Test04("test04", 4, 5, 6).asJson.noSpaces) // {"i1":"test04","i2":4,"i3":5,"i4":6}
  }

}
