package asuna
class Merge1[I1 <: TupleTag  , Target <: TupleTag]
object Merge1 {
implicit def nodetag1_merge1_implicit[X1_C1 <: TupleTag
, Target1 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge1[X1_C1  , Target1 ]
): Merge1[
NodeTag1[X1_C1 ]
, NodeTag1[Target1 ]
] = {
new Merge1[
NodeTag1[X1_C1 ]
, NodeTag1[Target1 ]
]
}
implicit def tupletag1_merge1_implicit[X1_C1
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
implicit def nodetag2_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge1[X1_C1  , Target1 ]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  ): Merge1[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[Target1  , Target2 ]
] = {
new Merge1[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[Target1  , Target2 ]
]
}
implicit def tupletag2_merge1_implicit[X1_C1    , X2_C1
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
