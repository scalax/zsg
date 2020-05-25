package zsg.debug
import scala.annotation.implicitNotFound
trait DebugCaseClass5Instance {
        implicit def zsgTupleToDebugCaseClass5InstanceImplicit[D1 , D2 , D3 , D4 , D5
        ]: ZsgTupleToDebugCaseClass[
            zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple1[zsg.ZsgTuple1[D5]]],
            DebugCaseClass5[D1 , D2 , D3 , D4 , D5]
        ] = new ZsgTupleToDebugCaseClass[
            zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple1[zsg.ZsgTuple1[D5]]],
            DebugCaseClass5[D1 , D2 , D3 , D4 , D5]
        ] {
            override def tupleToCaseClass(tuple: zsg.NodeTuple2[zsg.NodeTuple2[zsg.ZsgTuple2[D1 , D2] , zsg.ZsgTuple2[D3 , D4]] , zsg.NodeTuple1[zsg.ZsgTuple1[D5]]]
            ): DebugCaseClass5[D1 , D2 , D3 , D4 , D5] = {
                DebugCaseClass5(d1 = tuple.i1.i1.i1 , d2 = tuple.i1.i1.i2 , d3 = tuple.i1.i2.i1 , d4 = tuple.i1.i2.i2 , d5 = tuple.i2.i1.i1)
            }
        }
}
case class DebugCaseClass5[D1 , D2 , D3 , D4 , D5](d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5) {
    def infer( implicit 
        d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5): DebugCaseClass5[D1 , D2 , D3 , D4 , D5] = {
        DebugCaseClass5(d1 = d1 , d2 = d2 , d3 = d3 , d4 = d4 , d5 = d5)
    }
}
