package zsg.testkit.circe.encoder.debug

import zsg.{Context3, Plus3, ZsgTuple0}

object JsonObjectDebuggerContext extends Context3[JsonObjectDebugger] {
  override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonObjectDebugger[X1, X2, X3], y: JsonObjectDebugger[Y1, Y2, Y3])(
    p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
  ): JsonObjectDebugger[Z1, Z2, Z3]                                       = new JsonObjectDebugger[Z1, Z2, Z3](p.plus3(x.target, y.target))
  override val start: JsonObjectDebugger[ZsgTuple0, ZsgTuple0, ZsgTuple0] = new JsonObjectDebugger[ZsgTuple0, ZsgTuple0, ZsgTuple0](ZsgTuple0.value)
}
