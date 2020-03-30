package asuna
class Merge4[X1 , X2 , X3 , X4, Target]
object Merge4 {
         inline given  nodetag1_merge4_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag , X3_C1 <: TupleTag , X4_C1 <: TupleTag,
            Target1 <: TupleTag
        ]
        ( given 
            nodeTagImplicit1: NodeTag1[X1_C1] , nodeTagImplicit2: NodeTag1[X2_C1] , nodeTagImplicit3: NodeTag1[X3_C1] , nodeTagImplicit4: NodeTag1[X4_C1]
        ): Merge4[
            NodeTag1[X1_C1 ]
                , NodeTag1[X1_C2 ]
                , NodeTag1[X1_C3 ]
                , NodeTag1[X1_C4 ]
            , NodeTag1[Target1 ]
        ] = {
            new Merge4[
            NodeTag1[X1_C1 ]
                , NodeTag1[X1_C2 ]
                , NodeTag1[X1_C3 ]
                , NodeTag1[X1_C4 ]
            , NodeTag1[Target1 ]
            ]
        }
         inline given  def tupletag1_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  
             , X1 
        ]
        : Merge4[
            TupleTag1[PropertyTag1[X1_C1, X1] ]
                , TupleTag1[PropertyTag1[X1_C2, X1] ]
                , TupleTag1[PropertyTag1[X1_C3, X1] ]
                , TupleTag1[PropertyTag1[X1_C4, X1] ]
            , TupleTag1[
                PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
            ]
        ] = {
            new Merge4[
                TupleTag1[PropertyTag1[X1_C1, X1] ]
                    , TupleTag1[PropertyTag1[X1_C2, X1] ]
                    , TupleTag1[PropertyTag1[X1_C3, X1] ]
                    , TupleTag1[PropertyTag1[X1_C4, X1] ]
                , TupleTag1[
                    PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
                ]
            ]
        }
         inline given  nodetag2_merge4_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag , X3_C1 <: TupleTag , X3_C2 <: TupleTag , X4_C1 <: TupleTag , X4_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]
        ( given 
            nodeTagImplicit1: NodeTag2[X1_C1 , X1_C2] , nodeTagImplicit2: NodeTag2[X2_C1 , X2_C2] , nodeTagImplicit3: NodeTag2[X3_C1 , X3_C2] , nodeTagImplicit4: NodeTag2[X4_C1 , X4_C2]
        ): Merge4[
            NodeTag2[X1_C1  , X2_C1 ]
                , NodeTag2[X1_C2  , X2_C2 ]
                , NodeTag2[X1_C3  , X2_C3 ]
                , NodeTag2[X1_C4  , X2_C4 ]
            , NodeTag2[Target1  , Target2 ]
        ] = {
            new Merge4[
            NodeTag2[X1_C1  , X2_C1 ]
                , NodeTag2[X1_C2  , X2_C2 ]
                , NodeTag2[X1_C3  , X2_C3 ]
                , NodeTag2[X1_C4  , X2_C4 ]
            , NodeTag2[Target1  , Target2 ]
            ]
        }
         inline given  def tupletag2_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4    , X2_C1  , X2_C2  , X2_C3  , X2_C4  
             , X1  , X2 
        ]
        : Merge4[
            TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
                , TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
                , TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
                , TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
            , TupleTag2[
                PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
                 , PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2] 
            ]
        ] = {
            new Merge4[
                TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
                    , TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
                    , TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
                    , TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
                , TupleTag2[
                    PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
                     , PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2] 
                ]
            ]
        }
}
