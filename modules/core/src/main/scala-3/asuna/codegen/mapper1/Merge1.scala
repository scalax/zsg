package asuna
class Merge1[X1, Target]
object Merge1 {
        inline given  nodetag1_merge1_implicit[
            X1_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( using 
            nodeTagImplicit1: Merge1[X1_C1 , Target1]
        )  as  Merge1[NodeTag1[X1_C1] , NodeTag1[Target1]] = {
            new Merge1[NodeTag1[X1_C1] , NodeTag1[Target1]]
        }
        inline given  tupletag1_merge1_implicit[
            X1_C1,
            Target1
        ]( using 
            tupleTagImplicit1: Merge1[X1_C1 , Target1]
        )  as  Merge1[TupleTag1[X1_C1] , TupleTag1[Target1]] = {
            new Merge1[TupleTag1[X1_C1] , TupleTag1[Target1]]
        }
        inline given  nodetag2_merge1_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( using 
            nodeTagImplicit1: Merge1[X1_C1 , Target1] , nodeTagImplicit2: Merge1[X1_C2 , Target2]
        )  as  Merge1[NodeTag2[X1_C1 , X1_C2] , NodeTag2[Target1 , Target2]] = {
            new Merge1[NodeTag2[X1_C1 , X1_C2] , NodeTag2[Target1 , Target2]]
        }
        inline given  tupletag2_merge1_implicit[
            X1_C1 , X1_C2,
            Target1 , Target2
        ]( using 
            tupleTagImplicit1: Merge1[X1_C1 , Target1] , tupleTagImplicit2: Merge1[X1_C2 , Target2]
        )  as  Merge1[TupleTag2[X1_C1 , X1_C2] , TupleTag2[Target1 , Target2]] = {
            new Merge1[TupleTag2[X1_C1 , X1_C2] , TupleTag2[Target1 , Target2]]
        }
        inline given  property_tag_merge1_implicit[
        X1, Data
    ]  as  Merge1[PropertyTag1[X1, Data] , PropertyTag1[X1, Data]] = {
        new Merge1[PropertyTag1[X1, Data] , PropertyTag1[X1, Data]]
    }
        inline given  entirety_tag_merge1_implicit[
        X1, Data
    ]  as  Merge1[EntiretyTag1[X1, Data] , EntiretyTag1[X1, Data]] = {
        new Merge1[EntiretyTag1[X1, Data] , EntiretyTag1[X1, Data]]
    }
}
