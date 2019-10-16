package asuna.test01

import asuna._
import io.circe._
import io.circe.syntax._

object Test01 {

  case class Test04(i1: String, i2: Int, i3: Long, i4: Long)

  val getter = { test04: Test04 =>
    BuildContent.item4(test04.i1, test04.i2, test04.i3, test04.i4).withContext(ii)
  }
  val names = BuildContent.item4("i1", "i2", "i3", "i4").withContext(ii)

  trait JsonEncoder[T, II] {
    def p(obj: T, name: II, m: List[(String, Json)]): List[(String, Json)]
  }

  class KContext extends KindContext {
    override type M[P <: TypeParameter] = JsonEncoder[P#H, P#T#H]
  }

  object ii extends Context[KContext] {
    override def isReverse: Boolean = false

    override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](
      x: JsonEncoder[X#H, X#T#H],
      y: JsonEncoder[Y#H, Y#T#H],
      plus: Plus[X, Y, Z]
    ): JsonEncoder[Z#H, Z#T#H] = new JsonEncoder[Z#H, Z#T#H] {
      override def p(obj: Z#H, name: Z#T#H, m: List[(String, Json)]): List[(String, Json)] =
        x.p(plus.takeHead(obj), plus.sub.takeHead(name), y.p(plus.takeTail(obj), plus.sub.takeTail(name), m))
    }

    override def start: JsonEncoder[Item0, Item0] = new JsonEncoder[Item0, Item0] {
      override def p(name: Item0, obj: Item0, m: List[(String, Json)]): List[(String, Json)] = m
    }
  }

  val a1: JsonEncoder[String, String] = new JsonEncoder[String, String] {
    override def p(obj: String, name: String, m: List[(String, Json)]): List[(String, Json)] = {
      (name, Json.fromString(obj)) :: m
    }
  }
  val a2: JsonEncoder[Int, String] = new JsonEncoder[Int, String] {
    override def p(obj: Int, name: String, m: List[(String, Json)]): List[(String, Json)] = {
      (name, Json.fromInt(obj)) :: m
    }
  }
  val a3: JsonEncoder[Long, String] = new JsonEncoder[Long, String] {
    override def p(obj: Long, name: String, m: List[(String, Json)]): List[(String, Json)] = {
      (name, Json.fromLong(obj)) :: m
    }
  }
  val a4: JsonEncoder[Long, String] = new JsonEncoder[Long, String] {
    override def p(obj: Long, name: String, m: List[(String, Json)]): List[(String, Json)] = {
      (name, Json.fromLong(obj)) :: m
    }
  }

  val b1: JsonEncoder[Item1[String], Item1[String]] =
    ii.append[ItemTypeParameter0, TypeParameter2[String, String], ItemTypeParameter1[TypeParameter2[String, String]]](ii.start, a1, ItemTypeParameterPlus1.hlistPlus1)
  val b2: JsonEncoder[Item2[String, Int], Item2[String, String]] =
    ii.append[ItemTypeParameter1[TypeParameter2[String, String]],
              TypeParameter2[Int, String],
              ItemTypeParameter2[
                TypeParameter2[String, String],
                TypeParameter2[Int, String]
              ]](b1, a2, ItemTypeParameterPlus2.plus2)

  val b3: JsonEncoder[Item3[String, Int, Long], Item3[String, String, String]] =
    ii.append[ItemTypeParameter2[TypeParameter2[String, String], TypeParameter2[Int, String]],
              TypeParameter2[Long, String],
              ItemTypeParameter3[
                TypeParameter2[String, String],
                TypeParameter2[Int, String],
                TypeParameter2[Long, String]
              ]](b2, a3, ItemTypeParameterPlus3.plus3)

  val b4: JsonEncoder[Item4[String, Int, Long, Long], Item4[String, String, String, String]] =
    ii.append[ItemTypeParameter3[TypeParameter2[String, String], TypeParameter2[Int, String], TypeParameter2[Long, String]],
              TypeParameter2[Long, String],
              ItemTypeParameter4[
                TypeParameter2[String, String],
                TypeParameter2[Int, String],
                TypeParameter2[Long, String],
                TypeParameter2[Long, String]
              ]](b3, a4, ItemTypeParameterPlus4.plus4)

  def main(arr: Array[String]): Unit = {
    implicit val encoderTest04: Encoder.AsObject[Test04] =
      Encoder.AsObject.instance { o: Test04 =>
        JsonObject.fromIterable(b4.p(getter(o), names, List.empty))
      }

    println(Test04("test04", 4, 5, 6).asJson.noSpaces) //{"i1":"test04","i2":4,"i3":5,"i4":6}
  }

}
