package zsg.debug
trait DebugCaseClass4Instance {
        implicit def zsgTupleToDebugCaseClass4InstanceImplicit[D1 , D2 , D3 , D4
        ]: ZsgTupleToDebugCaseClass[
            zsg.ZTuple4[D1 , D2 , D3 , D4],
            DebugCaseClass4[D1 , D2 , D3 , D4]
        ] = new ZsgTupleToDebugCaseClass[
            zsg.ZTuple4[D1 , D2 , D3 , D4],
            DebugCaseClass4[D1 , D2 , D3 , D4]
        ] {
            override def tupleToCaseClass(tuple: zsg.ZTuple4[D1 , D2 , D3 , D4]
            ): DebugCaseClass4[D1 , D2 , D3 , D4] = {
                DebugCaseClass4(d1 = tuple.i1 , d2 = tuple.i2 , d3 = tuple.i3 , d4 = tuple.i4)
            }
        }
}
case class DebugCaseClass4[D1 , D2 , D3 , D4](d1: D1 , d2: D2 , d3: D3 , d4: D4) {
    def infer( implicit 
        d1: D1 , d2: D2 , d3: D3 , d4: D4): DebugCaseClass4[D1 , D2 , D3 , D4] = {
        DebugCaseClass4(d1 = d1 , d2 = d2 , d3 = d3 , d4 = d4)
    }
}
