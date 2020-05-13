package asuna.testkit.circe.encoder

import asuna.{Context3, Plus3, ZsgTuple0}
import io.circe.Json

object AsunaJsonObjectContext extends Context3[JsonObjectContent] {
  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonObjectContent[X1, X2, X3], y: JsonObjectContent[Y1, Y2, Y3])(
    p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
  ): JsonObjectContent[Z1, Z2, Z3] = new JsonObjectContent[Z1, Z2, Z3] {
    override def toAppender(name: Z3): JsonObjectAppender[Z2] = {
      val appender1 = x.toAppender(p.takeHead3(name))
      val appender2 = y.toAppender(p.takeTail3(name))
      new JsonObjectAppender[Z2] {
        override def appendField(tt: Z2, m: List[(String, Json)]): List[(String, Json)] = {
          val m1 = appender1.appendField(p.takeHead2(tt), m)
          appender2.appendField(p.takeTail2(tt), m1)
        }
      }
    }
  }

  override val start: JsonObjectContent[ZsgTuple0, ZsgTuple0, ZsgTuple0] = JsonObjectContentAsuna0
}

private object JsonObjectAppenderAsuna0 extends JsonObjectAppender[ZsgTuple0] {
  override def appendField(tt: ZsgTuple0, m: List[(String, Json)]): List[(String, Json)] = m
}

private object JsonObjectContentAsuna0 extends JsonObjectContent[ZsgTuple0, ZsgTuple0, ZsgTuple0] {
  override def toAppender(name: ZsgTuple0) = JsonObjectAppenderAsuna0
}
