package zsg.testkit.circe.encoder

import io.circe.Json
import zsg.{Context, Plus, TypeHList}

class ZsgJsonObjectContext extends Context[JsonObjectFunc] {
  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: JsonObjectAppender[X#Head, X#Tail#Head],
    y: JsonObjectAppender[Y#Head, Y#Tail#Head]
  )(plus: Plus[X, Y, Z]): JsonObjectAppender[Z#Head, Z#Tail#Head] = new JsonObjectAppender[Z#Head, Z#Tail#Head] {
    override def appendField(tt: Z#Tail#Head, m: List[(String, Json)]): List[(String, Json)] = {
      val m1 = y.appendField(plus.tail.takeTail(tt), m)
      x.appendField(plus.tail.takeHead(tt), m1)
    }
  }
}

object ZsgJsonObjectContext {
  val value: ZsgJsonObjectContext = new ZsgJsonObjectContext
}
