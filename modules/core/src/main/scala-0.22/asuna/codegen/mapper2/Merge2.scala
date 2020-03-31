package asuna
class Merge2[X1 , X2, Target]
object Merge2 {
         inline given  nodetag1_merge2_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag,
            Target1 <: TupleTag
        ]( given 
            nodeTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1]
        ): Merge2[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[Target1]] =
            new Merge2[NodeTag1[X1_C1] , NodeTag1[X2_C1] , NodeTag1[Target1]]
         inline given  tupletag1_merge2_implicit[
            X1_C1 , X2_C1,
            Target1
        ]( given 
            tupleTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1]
        ): Merge2[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[Target1]] =
            new Merge2[TupleTag1[X1_C1] , TupleTag1[X2_C1] , TupleTag1[Target1]]
         inline given  nodetag2_merge2_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]( given 
            nodeTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1] , nodeTagImplicit2: Merge2[X1_C2 , X2_C2 , Target2]
        ): Merge2[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[Target1 , Target2]] =
            new Merge2[NodeTag2[X1_C1 , X1_C2] , NodeTag2[X2_C1 , X2_C2] , NodeTag2[Target1 , Target2]]
         inline given  tupletag2_merge2_implicit[
            X1_C1 , X1_C2 , X2_C1 , X2_C2,
            Target1 , Target2
        ]( given 
            tupleTagImplicit1: Merge2[X1_C1 , X2_C1 , Target1] , tupleTagImplicit2: Merge2[X1_C2 , X2_C2 , Target2]
        ): Merge2[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[Target1 , Target2]] =
            new Merge2[TupleTag2[X1_C1 , X1_C2] , TupleTag2[X2_C1 , X2_C2] , TupleTag2[Target1 , Target2]]
}
