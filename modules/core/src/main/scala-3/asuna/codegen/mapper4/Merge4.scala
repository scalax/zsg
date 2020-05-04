package asuna
class Merge4[X1 , X2 , X3 , X4, Target]
object Merge4 {
        inline given  nodetag1_merge4_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag , X3_C1 <: TupleTag , X4_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( using 
            nodeTagImplicit1: Merge4[X1_C1 , X2_C1 , X3_C1 , X4_C1 , Target1]
        )  as  Merge4[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[X4_C1] , NodeTag1[Target1]] = {
            new Merge4[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[X4_C1] , NodeTag1[Target1]]
        }
        inline given  tupletag1_merge4_implicit[
            X1_C1 , X2_C1 , X3_C1 , X4_C1,
            Target1
        ]( using 
            tupleTagImplicit1: Merge4[X1_C1 , X2_C1 , X3_C1 , X4_C1 , Target1]
        )  as  Merge4[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[X4_C1] , TupleTag1[Target1]] = {
            new Merge4[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[X4_C1] , TupleTag1[Target1]]
        }
        inline given  nodetag2_merge4_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag , X3_C1 <: TupleTag , X3_C2 <: TupleTag , X4_C1 <: TupleTag , X4_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( using 
            nodeTagImplicit1: Merge4[X1_C1 , X2_C1 , X3_C1 , X4_C1 , Target1] , nodeTagImplicit2: Merge4[X1_C2 , X2_C2 , X3_C2 , X4_C2 , Target2]
        )  as  Merge4[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[X4_C1 , X4_C2] , NodeTag2[Target1 , Target2]] = {
            new Merge4[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[X4_C1 , X4_C2] , NodeTag2[Target1 , Target2]]
        }
        inline given  tupletag2_merge4_implicit[
            X1_C1 , X1_C2 , X2_C1 , X2_C2 , X3_C1 , X3_C2 , X4_C1 , X4_C2,
            Target1 , Target2
        ]( using 
            tupleTagImplicit1: Merge4[X1_C1 , X2_C1 , X3_C1 , X4_C1 , Target1] , tupleTagImplicit2: Merge4[X1_C2 , X2_C2 , X3_C2 , X4_C2 , Target2]
        )  as  Merge4[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[X4_C1 , X4_C2] , TupleTag2[Target1 , Target2]] = {
            new Merge4[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[X4_C1 , X4_C2] , TupleTag2[Target1 , Target2]]
        }
        inline given  property_tag_merge4_implicit[
        X1 , X2 , X3 , X4, Data
    ]  as  Merge4[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag1[X4, Data] , PropertyTag4[X1 , X2 , X3 , X4, Data]] = {
        new Merge4[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag1[X4, Data] , PropertyTag4[X1 , X2 , X3 , X4, Data]]
    }
        inline given  entirety_tag_merge4_implicit[
        X1 , X2 , X3 , X4, Data
    ]  as  Merge4[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag1[X4, Data] , EntiretyTag4[X1 , X2 , X3 , X4, Data]] = {
        new Merge4[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag1[X4, Data] , EntiretyTag4[X1 , X2 , X3 , X4, Data]]
    }
}
