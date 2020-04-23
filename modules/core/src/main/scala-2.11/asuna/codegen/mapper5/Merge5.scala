package asuna
class Merge5[X1 , X2 , X3 , X4 , X5, Target]
object Merge5 {
        implicit def  nodetag1_merge5_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag , X3_C1 <: TupleTag , X4_C1 <: TupleTag , X5_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( implicit 
            nodeTagImplicit1: Merge5[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , Target1]
        )  :  Merge5[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[X4_C1] , NodeTag1[X5_C1] , NodeTag1[Target1]] = {
            new Merge5[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[X3_C1] , NodeTag1[X4_C1] , NodeTag1[X5_C1] , NodeTag1[Target1]]
        }
        implicit def  tupletag1_merge5_implicit[
            X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1,
            Target1
        ]( implicit 
            tupleTagImplicit1: Merge5[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , Target1]
        )  :  Merge5[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[X4_C1] , TupleTag1[X5_C1] , TupleTag1[Target1]] = {
            new Merge5[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[X3_C1] , TupleTag1[X4_C1] , TupleTag1[X5_C1] , TupleTag1[Target1]]
        }
        implicit def  nodetag2_merge5_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag , X3_C1 <: TupleTag , X3_C2 <: TupleTag , X4_C1 <: TupleTag , X4_C2 <: TupleTag , X5_C1 <: TupleTag , X5_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( implicit 
            nodeTagImplicit1: Merge5[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , Target1] , nodeTagImplicit2: Merge5[X1_C2 , X2_C2 , X3_C2 , X4_C2 , X5_C2 , Target2]
        )  :  Merge5[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[X4_C1 , X4_C2] , NodeTag2[X5_C1 , X5_C2] , NodeTag2[Target1 , Target2]] = {
            new Merge5[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[X3_C1 , X3_C2] , NodeTag2[X4_C1 , X4_C2] , NodeTag2[X5_C1 , X5_C2] , NodeTag2[Target1 , Target2]]
        }
        implicit def  tupletag2_merge5_implicit[
            X1_C1 , X1_C2 , X2_C1 , X2_C2 , X3_C1 , X3_C2 , X4_C1 , X4_C2 , X5_C1 , X5_C2,
            Target1 , Target2
        ]( implicit 
            tupleTagImplicit1: Merge5[X1_C1 , X2_C1 , X3_C1 , X4_C1 , X5_C1 , Target1] , tupleTagImplicit2: Merge5[X1_C2 , X2_C2 , X3_C2 , X4_C2 , X5_C2 , Target2]
        )  :  Merge5[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[X4_C1 , X4_C2] , TupleTag2[X5_C1 , X5_C2] , TupleTag2[Target1 , Target2]] = {
            new Merge5[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[X3_C1 , X3_C2] , TupleTag2[X4_C1 , X4_C2] , TupleTag2[X5_C1 , X5_C2] , TupleTag2[Target1 , Target2]]
        }
    implicit def  property_tag_merge5_implicit[
        X1 , X2 , X3 , X4 , X5, Data
    ]  :  Merge5[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag1[X4, Data] , PropertyTag1[X5, Data] , PropertyTag5[X1 , X2 , X3 , X4 , X5, Data]] = {
        new Merge5[PropertyTag1[X1, Data] , PropertyTag1[X2, Data] , PropertyTag1[X3, Data] , PropertyTag1[X4, Data] , PropertyTag1[X5, Data] , PropertyTag5[X1 , X2 , X3 , X4 , X5, Data]]
    }
    implicit def  entirety_tag_merge5_implicit[
        X1 , X2 , X3 , X4 , X5, Data
    ]  :  Merge5[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag1[X4, Data] , EntiretyTag1[X5, Data] , EntiretyTag5[X1 , X2 , X3 , X4 , X5, Data]] = {
        new Merge5[EntiretyTag1[X1, Data] , EntiretyTag1[X2, Data] , EntiretyTag1[X3, Data] , EntiretyTag1[X4, Data] , EntiretyTag1[X5, Data] , EntiretyTag5[X1 , X2 , X3 , X4 , X5, Data]]
    }
}
