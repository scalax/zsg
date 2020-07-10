package zsg.debug
trait DebugCaseClass3Instance {
        given zsgTupleToDebugCaseClass3InstanceImplicit[D1 , D2 , D3] as ZsgTupleToDebugCaseClass[
            zsg.ZTuple3[D1 , D2 , D3],
            DebugCaseClass3[D1 , D2 , D3]
        ] {
            override def tupleToCaseClass(tuple: zsg.ZTuple3[D1 , D2 , D3]
            ): DebugCaseClass3[D1 , D2 , D3] = {
                DebugCaseClass3(d1 = tuple.i1 , d2 = tuple.i2 , d3 = tuple.i3)
            }
        }
}
case class DebugCaseClass3[D1 , D2 , D3](d1: D1 , d2: D2 , d3: D3) {
    def infer( using 
        d1: D1 , d2: D2 , d3: D3): DebugCaseClass3[D1 , D2 , D3] = {
        DebugCaseClass3(d1 = d1 , d2 = d2 , d3 = d3)
    }
}
