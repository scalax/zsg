package zsg.testkit.circe.encoder

import io.circe.Json
import zsg.macros.single.ColumnName
import zsg.{Application, Context, Plus, PropertyTag, TagMerge2, TypeHList, TypeHList2}

class ZsgJsonObjectContext extends Context[JsonObjectFunc] {
  /*override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonObjectAppender[X1, X2, X3], y: JsonObjectAppender[Y1, Y2, Y3])(
    p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
  ): JsonObjectAppender[Z1, Z2, Z3] =
    new JsonObjectAppender[Z1, Z2, Z3] {
      override def appendField(tt: Z3, m: List[(String, Json)]): List[(String, Json)] = {
        val m1 = y.appendField(p.takeTail3(tt), m)
        x.appendField(p.takeHead3(tt), m1)
      }
    }*/

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
