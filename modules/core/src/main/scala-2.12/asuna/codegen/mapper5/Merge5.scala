package asuna
class Merge5[X1 , X2 , X3 , X4 , X5, Target]
object Merge5 {
         implicit def  nodetag1_merge5_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag , X3_C1 <: TupleTag , X4_C1 <: TupleTag , X5_C1 <: TupleTag,
            Target1 <: TupleTag
        ]
        ( implicit 
            nodeTagImplicit1: NodeTag1[X1_C1] , nodeTagImplicit2: NodeTag1[X2_C1] , nodeTagImplicit3: NodeTag1[X3_C1] , nodeTagImplicit4: NodeTag1[X4_C1] , nodeTagImplicit5: NodeTag1[X5_C1]
        ): Merge5[
            NodeTag1[X1_C1 ]
                , NodeTag1[X1_C2 ]
                , NodeTag1[X1_C3 ]
                , NodeTag1[X1_C4 ]
                , NodeTag1[X1_C5 ]
            , NodeTag1[Target1 ]
        ] = {
            new Merge5[
            NodeTag1[X1_C1 ]
                , NodeTag1[X1_C2 ]
                , NodeTag1[X1_C3 ]
                , NodeTag1[X1_C4 ]
                , NodeTag1[X1_C5 ]
            , NodeTag1[Target1 ]
            ]
        }
         implicit def  def tupletag1_merge5_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  
             , X1 
        ]
        : Merge5[
            TupleTag1[PropertyTag1[X1_C1, X1] ]
                , TupleTag1[PropertyTag1[X1_C2, X1] ]
                , TupleTag1[PropertyTag1[X1_C3, X1] ]
                , TupleTag1[PropertyTag1[X1_C4, X1] ]
                , TupleTag1[PropertyTag1[X1_C5, X1] ]
            , TupleTag1[
                PropertyTag5[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1]
            ]
        ] = {
            new Merge5[
                TupleTag1[PropertyTag1[X1_C1, X1] ]
                    , TupleTag1[PropertyTag1[X1_C2, X1] ]
                    , TupleTag1[PropertyTag1[X1_C3, X1] ]
                    , TupleTag1[PropertyTag1[X1_C4, X1] ]
                    , TupleTag1[PropertyTag1[X1_C5, X1] ]
                , TupleTag1[
                    PropertyTag5[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1]
                ]
            ]
        }
         implicit def  nodetag2_merge5_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag , X3_C1 <: TupleTag , X3_C2 <: TupleTag , X4_C1 <: TupleTag , X4_C2 <: TupleTag , X5_C1 <: TupleTag , X5_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]
        ( implicit 
            nodeTagImplicit1: NodeTag2[X1_C1 , X1_C2] , nodeTagImplicit2: NodeTag2[X2_C1 , X2_C2] , nodeTagImplicit3: NodeTag2[X3_C1 , X3_C2] , nodeTagImplicit4: NodeTag2[X4_C1 , X4_C2] , nodeTagImplicit5: NodeTag2[X5_C1 , X5_C2]
        ): Merge5[
            NodeTag2[X1_C1  , X2_C1 ]
                , NodeTag2[X1_C2  , X2_C2 ]
                , NodeTag2[X1_C3  , X2_C3 ]
                , NodeTag2[X1_C4  , X2_C4 ]
                , NodeTag2[X1_C5  , X2_C5 ]
            , NodeTag2[Target1  , Target2 ]
        ] = {
            new Merge5[
            NodeTag2[X1_C1  , X2_C1 ]
                , NodeTag2[X1_C2  , X2_C2 ]
                , NodeTag2[X1_C3  , X2_C3 ]
                , NodeTag2[X1_C4  , X2_C4 ]
                , NodeTag2[X1_C5  , X2_C5 ]
            , NodeTag2[Target1  , Target2 ]
            ]
        }
         implicit def  def tupletag2_merge5_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  
             , X1  , X2 
        ]
        : Merge5[
            TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
                , TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
                , TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
                , TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
                , TupleTag2[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2] ]
            , TupleTag2[
                PropertyTag5[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1]
                 , PropertyTag5[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2] 
            ]
        ] = {
            new Merge5[
                TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
                    , TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
                    , TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
                    , TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
                    , TupleTag2[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2] ]
                , TupleTag2[
                    PropertyTag5[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1]
                     , PropertyTag5[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2] 
                ]
            ]
        }
}
