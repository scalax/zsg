package zsg.debug
trait DebugCaseClass6Instance {
  implicit def zsgTupleToDebugCaseClass6InstanceImplicit[D1, D2, D3, D4, D5, D6]: ZsgTupleToDebugCaseClass[
    zsg.ZTuple6[D1, D2, D3, D4, D5, D6],
    DebugCaseClass6[D1, D2, D3, D4, D5, D6]
  ] =
    new ZsgTupleToDebugCaseClass[
      zsg.ZTuple6[D1, D2, D3, D4, D5, D6],
      DebugCaseClass6[D1, D2, D3, D4, D5, D6]
    ] {
      override def tupleToCaseClass(tuple: zsg.ZTuple6[D1, D2, D3, D4, D5, D6]): DebugCaseClass6[D1, D2, D3, D4, D5, D6] = {
        DebugCaseClass6(d1 = tuple.i1, d2 = tuple.i2, d3 = tuple.i3, d4 = tuple.i4, d5 = tuple.i5, d6 = tuple.i6)
      }
    }
}
case class DebugCaseClass6[D1, D2, D3, D4, D5, D6](d1: D1, d2: D2, d3: D3, d4: D4, d5: D5, d6: D6) {
  def infer(implicit d1: D1, d2: D2, d3: D3, d4: D4, d5: D5, d6: D6): DebugCaseClass6[D1, D2, D3, D4, D5, D6] = {
    DebugCaseClass6(d1 = d1, d2 = d2, d3 = d3, d4 = d4, d5 = d5, d6 = d6)
  }
}
