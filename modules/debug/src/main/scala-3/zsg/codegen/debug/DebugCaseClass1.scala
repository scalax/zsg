package zsg.debug
trait DebugCaseClass1Instance {
        given zsgTupleToDebugCaseClass1InstanceImplicit[D1] as ZsgTupleToDebugCaseClass[
            zsg.ZTuple1[D1],
            DebugCaseClass1[D1]
        ] {
            override def tupleToCaseClass(tuple: zsg.ZTuple1[D1]
            ): DebugCaseClass1[D1] = {
                DebugCaseClass1(d1 = tuple.i1)
            }
        }
}
case class DebugCaseClass1[D1](d1: D1) {
    def infer( using 
        d1: D1): DebugCaseClass1[D1] = {
        DebugCaseClass1(d1 = d1)
    }
}
