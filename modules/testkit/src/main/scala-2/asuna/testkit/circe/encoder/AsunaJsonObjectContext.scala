package zsg.testkit.circe.encoder

import zsg.{Context3, Plus3, ZsgTuple0}
import io.circe.Json

object AsunaJsonObjectContext extends Context3[JsonObjectAppender] {
  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonObjectAppender[X1, X2, X3], y: JsonObjectAppender[Y1, Y2, Y3])(
    p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
  ): JsonObjectAppender[Z1, Z2, Z3] = new JsonObjectAppender[Z1, Z2, Z3] {
    override def appendField(tt: Z3, m: List[(String, Json)]): List[(String, Json)] = {
      val m1 = x.appendField(p.takeHead3(tt), m)
      y.appendField(p.takeTail3(tt), m1)
    }
  }

  override def start: JsonObjectAppender[ZsgTuple0, ZsgTuple0, ZsgTuple0] = new JsonObjectAppender[ZsgTuple0, ZsgTuple0, ZsgTuple0] {
    override def appendField(tt: ZsgTuple0, m: List[(String, Json)]): List[(String, Json)] = m
  }
}
