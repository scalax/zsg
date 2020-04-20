package asuna
class Merge1[X1, Target]
object Merge1 {
        implicit def  nodetag1_merge1_implicit[
            X1_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( implicit 
            nodeTagImplicit1: Merge1[X1_C1 , Target1]
        ): Merge1[NodeTag1[X1_C1] , NodeTag1[Target1]] = {
            new Merge1[NodeTag1[X1_C1] , NodeTag1[Target1]]
        }
        implicit def  tupletag1_merge1_implicit[
            X1_C1,
            Target1
        ]( implicit 
            tupleTagImplicit1: Merge1[X1_C1 , Target1]
        ): Merge1[TupleTag1[X1_C1] , TupleTag1[Target1]] = {
            new Merge1[TupleTag1[X1_C1] , TupleTag1[Target1]]
        }
        implicit def  nodetag2_merge1_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( implicit 
            nodeTagImplicit1: Merge1[X1_C1 , Target1] , nodeTagImplicit2: Merge1[X1_C2 , Target2]
        ): Merge1[NodeTag2[X1_C1 , X1_C2] , NodeTag2[Target1 , Target2]] = {
            new Merge1[NodeTag2[X1_C1 , X1_C2] , NodeTag2[Target1 , Target2]]
        }
        implicit def  tupletag2_merge1_implicit[
            X1_C1 , X1_C2,
            Target1 , Target2
        ]( implicit 
            tupleTagImplicit1: Merge1[X1_C1 , Target1] , tupleTagImplicit2: Merge1[X1_C2 , Target2]
        ): Merge1[TupleTag2[X1_C1 , X1_C2] , TupleTag2[Target1 , Target2]] = {
            new Merge1[TupleTag2[X1_C1 , X1_C2] , TupleTag2[Target1 , Target2]]
        }
    implicit def  property_tag_merge1_implicit[
        X1, Data
    ]: Merge1[PropertyTag1[X1, Data] , PropertyTag1[X1, Data]] = {
        new Merge1[PropertyTag1[X1, Data] , PropertyTag1[X1, Data]]
    }
    implicit def  entirety_tag_merge1_implicit[
        X1, Data
    ]: Merge1[EntiretyTag1[X1, Data] , EntiretyTag1[X1, Data]] = {
        new Merge1[EntiretyTag1[X1, Data] , EntiretyTag1[X1, Data]]
    }
}
