package zsg.debug
trait DebugCaseClass4Instance {
        given zsgTupleToDebugCaseClass4InstanceImplicit[D1 , D2 , D3 , D4] as ZsgTupleToDebugCaseClass[
            zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]],
            DebugCaseClass4[D1 , D2 , D3 , D4]
        ] {
            override def tupleToCaseClass(tuple: zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]]
            ): DebugCaseClass4[D1 , D2 , D3 , D4] = {
                DebugCaseClass4(d1 = tuple.i1.i1 , d2 = tuple.i1.i2 , d3 = tuple.i2.i1 , d4 = tuple.i2.i2)
            }
        }
}
case class DebugCaseClass4[D1 , D2 , D3 , D4](d1: D1 , d2: D2 , d3: D3 , d4: D4) {
    def infer( using 
        d1: D1 , d2: D2 , d3: D3 , d4: D4): DebugCaseClass4[D1 , D2 , D3 , D4] = {
        DebugCaseClass4(d1 = d1 , d2 = d2 , d3 = d3 , d4 = d4)
    }
}
