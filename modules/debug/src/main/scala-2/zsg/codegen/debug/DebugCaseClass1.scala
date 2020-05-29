package zsg.debug
trait DebugCaseClass1Instance {
        implicit def zsgTupleToDebugCaseClass1InstanceImplicit[D1
        ]: ZsgTupleToDebugCaseClass[
            zsg.ZsgTuple1[D1],
            DebugCaseClass1[D1]
        ] = new ZsgTupleToDebugCaseClass[
            zsg.ZsgTuple1[D1],
            DebugCaseClass1[D1]
        ] {
            override def tupleToCaseClass(tuple: zsg.ZsgTuple1[D1]
            ): DebugCaseClass1[D1] = {
                DebugCaseClass1(d1 = tuple.i1)
            }
        }
}
case class DebugCaseClass1[D1](d1: D1) {
    def infer( implicit 
        d1: D1): DebugCaseClass1[D1] = {
        DebugCaseClass1(d1 = d1)
    }
}
