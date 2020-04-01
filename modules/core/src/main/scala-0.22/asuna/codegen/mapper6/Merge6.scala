package asuna
class Merge6[X1 , X2 , X3 , X4 , X5 , X6, Target]
object Merge6 {
        inline given  nodetag1_merge6_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag , X3_C1 <: TupleTag , X4_C1 <: TupleTag , X5_C1 <: TupleTag , X6_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( given 
            nodeTagImplicit1: Merge6[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , X6_C1 , Target1]
        ): Merge6[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[X4_C1] , NodeTag1[X5_C1] , NodeTag1[X6_C1] , NodeTag1[Target1]] = {
            new Merge6[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[X4_C1] , NodeTag1[X5_C1] , NodeTag1[X6_C1] , NodeTag1[Target1]]
        }
        inline given  tupletag1_merge6_implicit[
            X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , X6_C1,
            Target1
        ]( given 
            tupleTagImplicit1: Merge6[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , X6_C1 , Target1]
        ): Merge6[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[X4_C1] , TupleTag1[X5_C1] , TupleTag1[X6_C1] , TupleTag1[Target1]] = {
            new Merge6[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[X4_C1] , TupleTag1[X5_C1] , TupleTag1[X6_C1] , TupleTag1[Target1]]
        }
        inline given  nodetag2_merge6_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag , X3_C1 <: TupleTag , X3_C2 <: TupleTag , X4_C1 <: TupleTag , X4_C2 <: TupleTag , X5_C1 <: TupleTag , X5_C2 <: TupleTag , X6_C1 <: TupleTag , X6_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( given 
            nodeTagImplicit1: Merge6[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , X6_C1 , Target1] , nodeTagImplicit2: Merge6[X1_C2 , X2_C2 , X3_C2 , X4_C2 , X5_C2 , X6_C2 , Target2]
        ): Merge6[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[X4_C1 , X4_C2] , NodeTag2[X5_C1 , X5_C2] , NodeTag2[X6_C1 , X6_C2] , NodeTag2[Target1 , Target2]] = {
            new Merge6[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[X4_C1 , X4_C2] , NodeTag2[X5_C1 , X5_C2] , NodeTag2[X6_C1 , X6_C2] , NodeTag2[Target1 , Target2]]
        }
        inline given  tupletag2_merge6_implicit[
            X1_C1 , X1_C2 , X2_C1 , X2_C2 , X3_C1 , X3_C2 , X4_C1 , X4_C2 , X5_C1 , X5_C2 , X6_C1 , X6_C2,
            Target1 , Target2
        ]( given 
            tupleTagImplicit1: Merge6[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , X6_C1 , Target1] , tupleTagImplicit2: Merge6[X1_C2 , X2_C2 , X3_C2 , X4_C2 , X5_C2 , X6_C2 , Target2]
        ): Merge6[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[X4_C1 , X4_C2] , TupleTag2[X5_C1 , X5_C2] , TupleTag2[X6_C1 , X6_C2] , TupleTag2[Target1 , Target2]] = {
            new Merge6[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[X4_C1 , X4_C2] , TupleTag2[X5_C1 , X5_C2] , TupleTag2[X6_C1 , X6_C2] , TupleTag2[Target1 , Target2]]
        }
        inline given  property_tag_merge6_implicit[
        X1 , X2 , X3 , X4 , X5 , X6, Data
    ]: Merge6[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag1[X4, Data] , PropertyTag1[X5, Data] , PropertyTag1[X6, Data] , PropertyTag6[X1 , X2 , X3 , X4 , X5 , X6, Data]] = {
        new Merge6[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag1[X4, Data] , PropertyTag1[X5, Data] , PropertyTag1[X6, Data] , PropertyTag6[X1 , X2 , X3 , X4 , X5 , X6, Data]]
    }
        inline given  entirety_tag_merge6_implicit[
        X1 , X2 , X3 , X4 , X5 , X6, Data
    ]: Merge6[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag1[X4, Data] , EntiretyTag1[X5, Data] , EntiretyTag1[X6, Data] , EntiretyTag6[X1 , X2 , X3 , X4 , X5 , X6, Data]] = {
        new Merge6[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag1[X4, Data] , EntiretyTag1[X5, Data] , EntiretyTag1[X6, Data] , EntiretyTag6[X1 , X2 , X3 , X4 , X5 , X6, Data]]
    }
}
