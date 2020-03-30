package asuna
class Merge1[X1, Target]
object Merge1 {
         inline given  nodetag1_merge1_implicit[
            X1_C1 <: TupleTag,
            Target1 <: TupleTag
        ]
        ( given 
            nodeTagImplicit1: NodeTag1[X1_C1]
        ): Merge1[
            NodeTag1[X1_C1 ]
            , NodeTag1[Target1 ]
        ] = {
            new Merge1[
            NodeTag1[X1_C1 ]
            , NodeTag1[Target1 ]
            ]
        }
         inline given  def tupletag1_merge1_implicit[X1_C1  
             , X1 
        ]
        : Merge1[
            TupleTag1[PropertyTag1[X1_C1, X1] ]
            , TupleTag1[
                PropertyTag1[ X1_C1 ,  X1]
            ]
        ] = {
            new Merge1[
                TupleTag1[PropertyTag1[X1_C1, X1] ]
                , TupleTag1[
                    PropertyTag1[ X1_C1 ,  X1]
                ]
            ]
        }
         inline given  nodetag2_merge1_implicit[
            X1_C1 <: TupleTag , X1_C2 <: TupleTag,
            Target1 <: TupleTag , Target2 <: TupleTag
        ]
        ( given 
            nodeTagImplicit1: NodeTag2[X1_C1 , X1_C2]
        ): Merge1[
            NodeTag2[X1_C1  , X2_C1 ]
            , NodeTag2[Target1  , Target2 ]
        ] = {
            new Merge1[
            NodeTag2[X1_C1  , X2_C1 ]
            , NodeTag2[Target1  , Target2 ]
            ]
        }
         inline given  def tupletag2_merge1_implicit[X1_C1    , X2_C1  
             , X1  , X2 
        ]
        : Merge1[
            TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
            , TupleTag2[
                PropertyTag1[ X1_C1 ,  X1]
                 , PropertyTag1[ X2_C1 ,  X2] 
            ]
        ] = {
            new Merge1[
                TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
                , TupleTag2[
                    PropertyTag1[ X1_C1 ,  X1]
                     , PropertyTag1[ X2_C1 ,  X2] 
                ]
            ]
        }
}
