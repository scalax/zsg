package asuna.sample01_append

import asuna._
import asuna.support.heterogeneous._
import asuna.support.{
  HListToTupleTypeHListPlus4,
  HListTypeHList1,
  HListTypeHList2,
  HListTypeHList3,
  HListTypeHList4,
  HListTypeHListPlus1,
  HListTypeHListPlus2,
  HListTypeHListPlus3,
  HListTypeHListPlus4
}
import io.circe._
import io.circe.syntax._

object Sample01 {

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val getter = { test04: Test04 =>
    BuildContent.tuple4(test04.i1, test04.i2, test04.i3, test04.i4)
  }
  val names = BuildContent.tuple4("i1", "i2", "i3", "i4")

  trait JsonObjectAppender[T, II] {
    def appendField(obj: T, name: II, m: JsonObject): JsonObject
  }

  class KContext extends KindContext {
    override type M[P <: TypeHList] = JsonObjectAppender[P#H, P#T#H]
  }

  object ii extends Context[KContext] {
    override def isReverse: Boolean = false

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonObjectAppender[X#H, X#T#H],
      y: JsonObjectAppender[Y#H, Y#T#H],
      plus: Plus[X, Y, Z]
    ): JsonObjectAppender[Z#H, Z#T#H] = new JsonObjectAppender[Z#H, Z#T#H] {
      override def appendField(obj: Z#H, name: Z#T#H, m: JsonObject): JsonObject =
        x.appendField(plus.takeHead(obj), plus.sub.takeHead(name), y.appendField(plus.takeTail(obj), plus.sub.takeTail(name), m))
    }

    override def start: JsonObjectAppender[AsunaTuple0, AsunaTuple0] = new JsonObjectAppender[AsunaTuple0, AsunaTuple0] {
      override def appendField(name: AsunaTuple0, obj: AsunaTuple0, m: JsonObject): JsonObject = m
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

  val b1: JsonObjectAppender[String :: HNil, String :: HNil] =
    ii.append[TupleTypeHList0, TypeHList2[String, String], HListTypeHList1[TypeHList2[String, String]]](ii.start, a1, HListTypeHListPlus1.plus1)

  val b2: JsonObjectAppender[Int :: String :: HNil, String :: String :: HNil] =
    ii.append[HListTypeHList1[TypeHList2[String, String]], TypeHList2[Int, String], HListTypeHList2[
      TypeHList2[String, String],
      TypeHList2[Int, String]
    ]](b1, a2, HListTypeHListPlus2.plus2)

  val b3: JsonObjectAppender[Long :: Int :: String :: HNil, String :: String :: String :: HNil] =
    ii.append[HListTypeHList2[TypeHList2[String, String], TypeHList2[Int, String]], TypeHList2[Long, String], HListTypeHList3[
      TypeHList2[String, String],
      TypeHList2[Int, String],
      TypeHList2[Long, String]
    ]](b2, a3, HListTypeHListPlus3.plus3)

  val en1: JsonObjectAppender[AsunaTuple4[String, Int, Long, Long], AsunaTuple4[String, String, String, String]] =
    ii.append[HListTypeHList3[TypeHList2[String, String], TypeHList2[Int, String], TypeHList2[Long, String]], TypeHList2[Long, String], TupleTypeHList4[
      TypeHList2[String, String],
      TypeHList2[Int, String],
      TypeHList2[Long, String],
      TypeHList2[Long, String]
    ]](b3, a4, HListToTupleTypeHListPlus4.plus4)

  def main(arr: Array[String]): Unit = {
    implicit val encoderTest04: Encoder.AsObject[Test04] =
      Encoder.AsObject.instance { o: Test04 =>
        en1.appendField(getter(o), names, JsonObject.empty)
      }

    println(Test04("test04", 4, 5, 6).asJson.noSpaces) //{"i1":"test04","i2":4,"i3":5,"i4":6}
  }

}
