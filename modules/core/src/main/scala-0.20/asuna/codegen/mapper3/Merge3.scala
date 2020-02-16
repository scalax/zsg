package asuna
class Merge3[I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , Target <: TupleTag]
object Merge3 {
given nodetag1_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag
, Target1 <: TupleTag ](given
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1]
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
given tupletag1_merge3_implicit[X1_C1  , X1_C2  , X1_C3
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
given nodetag2_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag ](given
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  ): Merge3[
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
given tupletag2_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3
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
given nodetag3_merge3_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag ](given
nodeTagImplicit1: Merge3[X1_C1  , X1_C2  , X1_C3  , Target1]
, nodeTagImplicit2: Merge3[X2_C1  , X2_C2  , X2_C3  , Target2 ]  , nodeTagImplicit3: Merge3[X3_C1  , X3_C2  , X3_C3  , Target3 ]  ): Merge3[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge3[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
given tupletag3_merge3_implicit[X1_C1  , X1_C2  , X1_C3    , X2_C1  , X2_C2  , X2_C3    , X3_C1  , X3_C2  , X3_C3
, X1  , X2  , X3
]
: Merge3[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]
]
] = {
new Merge3[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[
PropertyTag3[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1]
, PropertyTag3[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2]  , PropertyTag3[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3]
]
]
}
}
