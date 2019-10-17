package asuna.sample01_append

import asuna._
import io.circe._
import io.circe.syntax._

object Sample01 {

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val getter = { test04: Test04 =>
    BuildContent.item4(test04.i1, test04.i2, test04.i3, test04.i4).withContext(ii)
  }
  val names = BuildContent.item4("i1", "i2", "i3", "i4").withContext(ii)

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

  val a1: JsonEncoder[String, String] = new JsonEncoder[String, String] {
    override def appendProperty(obj: String, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromString(obj)) +: m
    }
  }
  val a2: JsonEncoder[Int, String] = new JsonEncoder[Int, String] {
    override def appendProperty(obj: Int, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromInt(obj)) +: m
    }
  }
  val a3: JsonEncoder[Long, String] = new JsonEncoder[Long, String] {
    override def appendProperty(obj: Long, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromLong(obj)) +: m
    }
  }
  val a4: JsonEncoder[Long, String] = new JsonEncoder[Long, String] {
    override def appendProperty(obj: Long, name: String, m: JsonObject): JsonObject = {
      (name, Json.fromLong(obj)) +: m
    }
  }

  val b1: JsonEncoder[Item1[String], Item1[String]] =
    ii.append[ItemTypeHList0, TypeHList2[String, String], ItemTypeHList1[TypeHList2[String, String]]](ii.start, a1, ItemTypeHListPlus1.hlistPlus1)

  val b2: JsonEncoder[Item2[String, Int], Item2[String, String]] =
    ii.append[ItemTypeHList1[TypeHList2[String, String]], TypeHList2[Int, String], ItemTypeHList2[
      TypeHList2[String, String],
      TypeHList2[Int, String]
    ]](b1, a2, ItemTypeHListPlus2.plus2)

  val b3: JsonEncoder[Item3[String, Int, Long], Item3[String, String, String]] =
    ii.append[ItemTypeHList2[TypeHList2[String, String], TypeHList2[Int, String]], TypeHList2[Long, String], ItemTypeHList3[
      TypeHList2[String, String],
      TypeHList2[Int, String],
      TypeHList2[Long, String]
    ]](b2, a3, ItemTypeHListPlus3.plus3)

  val en1: JsonEncoder[Item4[String, Int, Long, Long], Item4[String, String, String, String]] =
    ii.append[ItemTypeHList3[TypeHList2[String, String], TypeHList2[Int, String], TypeHList2[Long, String]], TypeHList2[Long, String], ItemTypeHList4[
      TypeHList2[String, String],
      TypeHList2[Int, String],
      TypeHList2[Long, String],
      TypeHList2[Long, String]
    ]](b3, a4, ItemTypeHListPlus4.plus4)

  def main(arr: Array[String]): Unit = {
    implicit val encoderTest04: Encoder.AsObject[Test04] =
      Encoder.AsObject.instance { o: Test04 =>
        en1.appendProperty(getter(o), names, JsonObject.empty)
      }

    println(Test04("test04", 4, 5, 6).asJson.noSpaces) //{"i1":"test04","i2":4,"i3":5,"i4":6}
  }

}
