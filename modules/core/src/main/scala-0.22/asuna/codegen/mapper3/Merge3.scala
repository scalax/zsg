package asuna
class Merge3[X1 , X2 , X3, Target]
object Merge3 {
         inline given  nodetag1_merge3_implicit[
            X1_C1 <: TupleTag , X2_C1 <: TupleTag , X3_C1 <: TupleTag,
            Target1 <: TupleTag
        ]
        ( given 
            nodeTagImplicit1: NodeTag1[X1_C1] , nodeTagImplicit2: NodeTag1[X2_C1] , nodeTagImplicit3: NodeTag1[X3_C1]
        ): Merge3[
            NodeTag1[X1_C1 ]
                , NodeTag1[X1_C2 ]
                , NodeTag1[X1_C3 ]
            , NodeTag1[Target1 ]
        ] = {
            new Merge3[
            NodeTag1[X1_C1 ]
                , NodeTag1[X1_C2 ]
                , NodeTag1[X1_C3 ]
            , NodeTag1[Target1 ]
            ]
        }
         inline given  def tupletag1_merge3_implicit[X1_C1  , X1_C2  , X1_C3  
             , X1 
        ]
        : Merge3[
            TupleTag1[PropertyTag1[X1_C1, X1] ]
                , TupleTag1[PropertyTag1[X1_C2, X1] ]
                , TupleTag1[PropertyTag1[X1_C3, X1] ]
            , TupleTag1[
                PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
            ]
        ] = {
            new Merge3[
                TupleTag1[PropertyTag1[X1_C1, X1] ]
                    , TupleTag1[PropertyTag1[X1_C2, X1] ]
                    , TupleTag1[PropertyTag1[X1_C3, X1] ]
                , TupleTag1[
                    PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
                ]
            ]
        }
         inline given  nodetag2_merge3_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag , X2_C1 <: TupleTag , X2_C2 <: TupleTag , X3_C1 <: TupleTag , X3_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]
        ( given 
            nodeTagImplicit1: NodeTag2[X1_C1 , X1_C2] , nodeTagImplicit2: NodeTag2[X2_C1 , X2_C2] , nodeTagImplicit3: NodeTag2[X3_C1 , X3_C2]
        ): Merge3[
            NodeTag2[X1_C1  , X2_C1 ]
                , NodeTag2[X1_C2  , X2_C2 ]
                , NodeTag2[X1_C3  , X2_C3 ]
            , NodeTag2[Target1  , Target2 ]
        ] = {
            new Merge3[
            NodeTag2[X1_C1  , X2_C1 ]
                , NodeTag2[X1_C2  , X2_C2 ]
                , NodeTag2[X1_C3  , X2_C3 ]
            , NodeTag2[Target1  , Target2 ]
            ]
        }
         inline given  def tupletag2_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3  
             , X1  , X2 
        ]
        : Merge3[
            TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
                , TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
                , TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
            , TupleTag2[
                PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
                 , PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2] 
            ]
        ] = {
            new Merge3[
                TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
                    , TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
                    , TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
                , TupleTag2[
                    PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
                     , PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2] 
                ]
            ]
        }
}
