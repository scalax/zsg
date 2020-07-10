package zsg.debug
trait DebugCaseClass2Instance {
        implicit def zsgTupleToDebugCaseClass2InstanceImplicit[D1 , D2
        ]: ZsgTupleToDebugCaseClass[
            zsg.ZTuple2[D1 , D2],
            DebugCaseClass2[D1 , D2]
        ] = new ZsgTupleToDebugCaseClass[
            zsg.ZTuple2[D1 , D2],
            DebugCaseClass2[D1 , D2]
        ] {
            override def tupleToCaseClass(tuple: zsg.ZTuple2[D1 , D2]
            ): DebugCaseClass2[D1 , D2] = {
                DebugCaseClass2(d1 = tuple.i1 , d2 = tuple.i2)
            }
        }
}
case class DebugCaseClass2[D1 , D2](d1: D1 , d2: D2) {
    def infer( implicit 
        d1: D1 , d2: D2): DebugCaseClass2[D1 , D2] = {
        DebugCaseClass2(d1 = d1 , d2 = d2)
    }
}
