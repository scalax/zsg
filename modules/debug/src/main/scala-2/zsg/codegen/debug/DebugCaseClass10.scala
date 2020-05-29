package zsg.debug
trait DebugCaseClass10Instance {
        implicit def zsgTupleToDebugCaseClass10InstanceImplicit[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10
        ]: ZsgTupleToDebugCaseClass[
            zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple2[zsg.ZsgTuple2[D5 , D6] , zsg.ZsgTuple2[D7 , D8]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple2[D9 , D10]]]],
            DebugCaseClass10[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10]
        ] = new ZsgTupleToDebugCaseClass[
            zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple2[zsg.ZsgTuple2[D5 , D6] , zsg.ZsgTuple2[D7 , D8]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple2[D9 , D10]]]],
            DebugCaseClass10[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10]
        ] {
            override def tupleToCaseClass(tuple: zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple2[zsg.ZsgTuple2[D5 , D6] , zsg.ZsgTuple2[D7 , D8]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple2[D9 , D10]]]]
            ): DebugCaseClass10[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10] = {
                DebugCaseClass10(d1 = tuple.i1.i1.i1.i1 , d2 = tuple.i1.i1.i1.i2 , d3 = tuple.i1.i1.i2.i1 , d4 = tuple.i1.i1.i2.i2 , d5 = tuple.i1.i2.i1.i1 , d6 = tuple.i1.i2.i1.i2 , d7 = tuple.i1.i2.i2.i1 , d8 = tuple.i1.i2.i2.i2 , d9 = tuple.i2.i1.i1.i1 , d10 = tuple.i2.i1.i1.i2)
            }
        }
}
case class DebugCaseClass10[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10](d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5 , d6: D6 , d7: D7 , d8: D8 , d9: D9 , d10: D10) {
    def infer( implicit 
        d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5 , d6: D6 , d7: D7 , d8: D8 , d9: D9 , d10: D10): DebugCaseClass10[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10] = {
        DebugCaseClass10(d1 = d1 , d2 = d2 , d3 = d3 , d4 = d4 , d5 = d5 , d6 = d6 , d7 = d7 , d8 = d8 , d9 = d9 , d10 = d10)
    }
}
