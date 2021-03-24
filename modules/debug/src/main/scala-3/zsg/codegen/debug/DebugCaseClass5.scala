package zsg.debug
trait DebugCaseClass5Instance {
        given [D1 , D2 , D3 , D4 , D5]: ZsgTupleToDebugCaseClass[
            zsg.ZTuple5[D1 , D2 , D3 , D4 , D5],
            DebugCaseClass5[D1 , D2 , D3 , D4 , D5]
        ] = new ZsgTupleToDebugCaseClass[
            zsg.ZTuple5[D1 , D2 , D3 , D4 , D5],
            DebugCaseClass5[D1 , D2 , D3 , D4 , D5]
        ] {
            override def tupleToCaseClass(tuple: zsg.ZTuple5[D1 , D2 , D3 , D4 , D5]
            ): DebugCaseClass5[D1 , D2 , D3 , D4 , D5] = {
                DebugCaseClass5(d1 = tuple.i1 , d2 = tuple.i2 , d3 = tuple.i3 , d4 = tuple.i4 , d5 = tuple.i5)
            }
        }
}
case class DebugCaseClass5[D1 , D2 , D3 , D4 , D5](d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5) {
    def infer( using 
        d1: D1 , d2: D2 , d3: D3 , d4: D4 , d5: D5): DebugCaseClass5[D1 , D2 , D3 , D4 , D5] = {
        DebugCaseClass5(d1 = d1 , d2 = d2 , d3 = d3 , d4 = d4 , d5 = d5)
    }
}
