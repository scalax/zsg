package asuna.testkit.circe.encoder

import asuna.{AsunaTuple0, Context2, Plus2}
import io.circe.Json

object AsunaJsonObjectContext extends Context2[JsonObjectAppender] {

  override final def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonObjectAppender[X1, X2], y: JsonObjectAppender[Y1, Y2])(
    p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
  ): JsonObjectAppender[Z1, Z2] = { (obj, name, m) =>
    y.appendField(p.takeTail1(obj), p.takeTail2(name), m)
    x.appendField(p.takeHead1(obj), p.takeHead2(name), m)
  }

  override final val start: JsonObjectAppender[AsunaTuple0, AsunaTuple0] = { (_: AsunaTuple0, _: AsunaTuple0, _: java.util.LinkedHashMap[String, Json]) =>
    ()
  }

}
