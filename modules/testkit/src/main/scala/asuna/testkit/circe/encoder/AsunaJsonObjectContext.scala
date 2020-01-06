package asuna.testkit.circe.encoder

import asuna.{AsunaTuple0, Context2, Plus2}
import io.circe.Json

object AsunaJsonObjectContext extends Context2[JsonObjectContent] {

  override final def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonObjectContent[X1, X2], y: JsonObjectContent[Y1, Y2])(
    p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
  ): JsonObjectContent[Z1, Z2] = new JsonObjectContent[Z1, Z2] {
    override def toAppender(name: Z2): JsonObjectAppender[Z1] = {
      val appender1 = x.toAppender(p.takeHead2(name))
      val appender2 = y.toAppender(p.takeTail2(name))
      new JsonObjectAppender[Z1] {
        override def appendField(tt: Z1, m: List[(String, Json)]): List[(String, Json)] = {
          val m1 = appender1.appendField(p.takeHead1(tt), m)
          appender2.appendField(p.takeTail1(tt), m1)
        }
      }
    }
  }

  override final val start: JsonObjectContent[AsunaTuple0, AsunaTuple0] = new JsonObjectContent[AsunaTuple0, AsunaTuple0] {
    override def toAppender(name: AsunaTuple0): JsonObjectAppender[AsunaTuple0] = new JsonObjectAppender[AsunaTuple0] {
      override def appendField(tt: AsunaTuple0, m: List[(String, Json)]): List[(String, Json)] = m
    }
  }

}
