package asuna.sample01_append

import asuna._
import asuna.support.heterogeneous._
import asuna.support.{TypeHListPlus1, TypeHListPlus2, TypeHListPlus3, TypeHListPlus4}
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

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonObjectAppender[X#H, X#T#H],
      y: JsonObjectAppender[Y#H, Y#T#H],
      plus: Plus[X, Y, Z]
    ): JsonObjectAppender[Z#H, Z#T#H] = new JsonObjectAppender[Z#H, Z#T#H] {
      override def appendField(obj: Z#H, name: Z#T#H, m: JsonObject): JsonObject =
        y.appendField(plus.takeTail(obj), plus.sub.takeTail(name), x.appendField(plus.takeHead(obj), plus.sub.takeHead(name), m))
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

  val b1: JsonObjectAppender[AsunaTuple1[Long], AsunaTuple1[String]] =
    ii.append[TupleTypeHList0, TypeHList2[Long, String], TupleTypeHList1[TypeHList2[Long, String]]](ii.start, a4, TypeHListPlus1.plus1)

  val b2: JsonObjectAppender[AsunaTuple2[Long, Long], AsunaTuple2[String, String]] =
    ii.append[TupleTypeHList1[TypeHList2[Long, String]], TypeHList2[Long, String], TupleTypeHList2[
      TypeHList2[Long, String],
      TypeHList2[Long, String]
    ]](b1, a3, TypeHListPlus2.plus2)

  val b3: JsonObjectAppender[AsunaTuple3[Int, Long, Long], AsunaTuple3[String, String, String]] =
    ii.append[TupleTypeHList2[TypeHList2[Long, String], TypeHList2[Long, String]], TypeHList2[Int, String], TupleTypeHList3[
      TypeHList2[Int, String],
      TypeHList2[Long, String],
      TypeHList2[Long, String]
    ]](b2, a2, TypeHListPlus3.plus3)

  val en1: JsonObjectAppender[AsunaTuple4[String, Int, Long, Long], AsunaTuple4[String, String, String, String]] =
    ii.append[TupleTypeHList3[TypeHList2[Int, String], TypeHList2[Long, String], TypeHList2[Long, String]], TypeHList2[String, String], TupleTypeHList4[
      TypeHList2[String, String],
      TypeHList2[Int, String],
      TypeHList2[Long, String],
      TypeHList2[Long, String]
    ]](b3, a1, TypeHListPlus4.plus4)

  def main(arr: Array[String]): Unit = {
    implicit val encoderTest04: Encoder.AsObject[Test04] =
      Encoder.AsObject.instance { o: Test04 =>
        en1.appendField(getter(o), names, JsonObject.empty)
      }

    println(Test04("test04", 4, 5, 6).asJson.noSpaces) //{"i1":"test04","i2":4,"i3":5,"i4":6}
  }

}
