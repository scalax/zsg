package asuna
class Merge1[I1 <: TupleTag  , Target <: TupleTag]
object Merge1 {
given nodetag1_merge1_implicit[X1_C1 <: TupleTag
, Target1 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
): Merge1[
NodeTag1[X1_C1 ]
, NodeTag1[Target1 ]
] = {
new Merge1[
NodeTag1[X1_C1 ]
, NodeTag1[Target1 ]
]
}
given tupletag1_merge1_implicit[X1_C1
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
given nodetag2_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  ): Merge1[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[Target1  , Target2 ]
] = {
new Merge1[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[Target1  , Target2 ]
]
}
given tupletag2_merge1_implicit[X1_C1    , X2_C1
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
given nodetag3_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag    , X3_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  , nodeTagImplicit3: Merge1[X3_C1  , Target3 ]  ): Merge1[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge1[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
given tupletag3_merge1_implicit[X1_C1    , X2_C1    , X3_C1
, X1  , X2  , X3
]
: Merge1[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[
PropertyTag1[ X1_C1 ,  X1]
, PropertyTag1[ X2_C1 ,  X2]  , PropertyTag1[ X3_C1 ,  X3]
]
] = {
new Merge1[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[
PropertyTag1[ X1_C1 ,  X1]
, PropertyTag1[ X2_C1 ,  X2]  , PropertyTag1[ X3_C1 ,  X3]
]
]
}
}
