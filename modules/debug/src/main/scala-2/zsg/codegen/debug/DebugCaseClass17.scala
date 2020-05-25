package zsg.debug
import scala.annotation.implicitNotFound
trait DebugCaseClass17Instance {
        implicit def zsgTupleToDebugCaseClass17InstanceImplicit[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10 , D11 , D12 , D13 , D14 , D15 , D16 , D17
        ]: ZsgTupleToDebugCaseClass[
            zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple2[zsg.ZsgTuple2[D5 , D6] , zsg.ZsgTuple2[D7 , D8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D9 , D10] , zsg.ZsgTuple2[D11 , D12]] , zsg.NodeTuple2[zsg.ZsgTuple2[D13 , D14] , zsg.ZsgTuple2[D15 , D16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[D17]]]]],
            DebugCaseClass17[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10 , D11 , D12 , D13 , D14 , D15 , D16 , D17]
        ] = new ZsgTupleToDebugCaseClass[
            zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple2[zsg.ZsgTuple2[D5 , D6] , zsg.ZsgTuple2[D7 , D8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D9 , D10] , zsg.ZsgTuple2[D11 , D12]] , zsg.NodeTuple2[zsg.ZsgTuple2[D13 , D14] , zsg.ZsgTuple2[D15 , D16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[D17]]]]],
            DebugCaseClass17[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10 , D11 , D12 , D13 , D14 , D15 , D16 , D17]
        ] {
            override def tupleToCaseClass(tuple: zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple2[zsg.ZsgTuple2[D5 , D6] , zsg.ZsgTuple2[D7 , D8]]] , zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D9 , D10] , zsg.ZsgTuple2[D11 , D12]] , zsg.NodeTuple2[zsg.ZsgTuple2[D13 , D14] , zsg.ZsgTuple2[D15 , D16]]]] , zsg.NodeTuple1[zsg.NodeTuple1[zsg.NodeTuple1[zsg.ZsgTuple1[D17]]]]]
            ): DebugCaseClass17[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10 , D11 , D12 , D13 , D14 , D15 , D16 , D17] = {
                DebugCaseClass17(d1 = tuple.i1.i1.i1.i1.i1 , d2 = tuple.i1.i1.i1.i1.i2 , d3 = tuple.i1.i1.i1.i2.i1 , d4 = tuple.i1.i1.i1.i2.i2 , d5 = tuple.i1.i1.i2.i1.i1 , d6 = tuple.i1.i1.i2.i1.i2 , d7 = tuple.i1.i1.i2.i2.i1 , d8 = tuple.i1.i1.i2.i2.i2 , d9 = tuple.i1.i2.i1.i1.i1 , d10 = tuple.i1.i2.i1.i1.i2 , d11 = tuple.i1.i2.i1.i2.i1 , d12 = tuple.i1.i2.i1.i2.i2 , d13 = tuple.i1.i2.i2.i1.i1 , d14 = tuple.i1.i2.i2.i1.i2 , d15 = tuple.i1.i2.i2.i2.i1 , d16 = tuple.i1.i2.i2.i2.i2 , d17 = tuple.i2.i1.i1.i1.i1)
            }
        }
}
case class DebugCaseClass17[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10 , D11 , D12 , D13 , D14 , D15 , D16 , D17](d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5 , d6: D6 , d7: D7 , d8: D8 , d9: D9 , d10: D10 , d11: D11 , d12: D12 , d13: D13 , d14: D14 , d15: D15 , d16: D16 , d17: D17) {
    def infer( implicit 
        d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5 , d6: D6 , d7: D7 , d8: D8 , d9: D9 , d10: D10 , d11: D11 , d12: D12 , d13: D13 , d14: D14 , d15: D15 , d16: D16 , d17: D17): DebugCaseClass17[D1 , D2 , D3 , D4 , D5 , D6 , D7 , D8 , D9 , D10 , D11 , D12 , D13 , D14 , D15 , D16 , D17] = {
        DebugCaseClass17(d1 = d1 , d2 = d2 , d3 = d3 , d4 = d4 , d5 = d5 , d6 = d6 , d7 = d7 , d8 = d8 , d9 = d9 , d10 = d10 , d11 = d11 , d12 = d12 , d13 = d13 , d14 = d14 , d15 = d15 , d16 = d16 , d17 = d17)
    }
}
