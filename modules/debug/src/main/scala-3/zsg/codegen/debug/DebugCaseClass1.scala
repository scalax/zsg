package zsg.debug
import scala.annotation.implicitNotFound
trait DebugCaseClass1Instance {
        given zsgTupleToDebugCaseClass1InstanceImplicit[D1] as ZsgTupleToDebugCaseClass[
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
    def infer( using 
        d1: D1): DebugCaseClass1[D1] = {
        DebugCaseClass1(d1 = d1)
    }
}
