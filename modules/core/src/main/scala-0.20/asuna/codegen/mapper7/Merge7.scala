package asuna
class Merge7[I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , I5 <: TupleTag  , I6 <: TupleTag  , I7 <: TupleTag  , Target <: TupleTag]
object Merge7 {
given nodetag1_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag
, Target1 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
): Merge7[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[X1_C4 ]
, NodeTag1[X1_C5 ]
, NodeTag1[X1_C6 ]
, NodeTag1[X1_C7 ]
, NodeTag1[Target1 ]
] = {
new Merge7[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[X1_C3 ]
, NodeTag1[X1_C4 ]
, NodeTag1[X1_C5 ]
, NodeTag1[X1_C6 ]
, NodeTag1[X1_C7 ]
, NodeTag1[Target1 ]
]
}
given tupletag1_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7
, X1
]
: Merge7[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[PropertyTag1[X1_C3, X1] ]
, TupleTag1[PropertyTag1[X1_C4, X1] ]
, TupleTag1[PropertyTag1[X1_C5, X1] ]
, TupleTag1[PropertyTag1[X1_C6, X1] ]
, TupleTag1[PropertyTag1[X1_C7, X1] ]
, TupleTag1[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
]
] = {
new Merge7[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[PropertyTag1[X1_C3, X1] ]
, TupleTag1[PropertyTag1[X1_C4, X1] ]
, TupleTag1[PropertyTag1[X1_C5, X1] ]
, TupleTag1[PropertyTag1[X1_C6, X1] ]
, TupleTag1[PropertyTag1[X1_C7, X1] ]
, TupleTag1[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
]
]
}
given nodetag2_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
, nodeTagImplicit2: Merge7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , Target2 ]  ): Merge7[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[X1_C4  , X2_C4 ]
, NodeTag2[X1_C5  , X2_C5 ]
, NodeTag2[X1_C6  , X2_C6 ]
, NodeTag2[X1_C7  , X2_C7 ]
, NodeTag2[Target1  , Target2 ]
] = {
new Merge7[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[X1_C3  , X2_C3 ]
, NodeTag2[X1_C4  , X2_C4 ]
, NodeTag2[X1_C5  , X2_C5 ]
, NodeTag2[X1_C6  , X2_C6 ]
, NodeTag2[X1_C7  , X2_C7 ]
, NodeTag2[Target1  , Target2 ]
]
}
given tupletag2_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7
, X1  , X2
]
: Merge7[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
, TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
, TupleTag2[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2] ]
, TupleTag2[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2] ]
, TupleTag2[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2] ]
, TupleTag2[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]
]
] = {
new Merge7[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2] ]
, TupleTag2[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2] ]
, TupleTag2[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2] ]
, TupleTag2[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2] ]
, TupleTag2[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2] ]
, TupleTag2[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]
]
]
}
given nodetag3_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
, nodeTagImplicit2: Merge7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , Target2 ]  , nodeTagImplicit3: Merge7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , Target3 ]  ): Merge7[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[X1_C5  , X2_C5  , X3_C5 ]
, NodeTag3[X1_C6  , X2_C6  , X3_C6 ]
, NodeTag3[X1_C7  , X2_C7  , X3_C7 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge7[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[X1_C5  , X2_C5  , X3_C5 ]
, NodeTag3[X1_C6  , X2_C6  , X3_C6 ]
, NodeTag3[X1_C7  , X2_C7  , X3_C7 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
given tupletag3_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7
, X1  , X2  , X3
]
: Merge7[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3] ]
, TupleTag3[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3] ]
, TupleTag3[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3] ]
, TupleTag3[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3] ]
, TupleTag3[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]
]
] = {
new Merge7[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3] ]
, TupleTag3[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3] ]
, TupleTag3[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3] ]
, TupleTag3[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3] ]
, TupleTag3[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]
]
]
}
given nodetag4_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
, nodeTagImplicit2: Merge7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , Target2 ]  , nodeTagImplicit3: Merge7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , Target3 ]  , nodeTagImplicit4: Merge7[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , Target4 ]  ): Merge7[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, NodeTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, NodeTag4[X1_C7  , X2_C7  , X3_C7  , X4_C7 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
] = {
new Merge7[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[X1_C5  , X2_C5  , X3_C5  , X4_C5 ]
, NodeTag4[X1_C6  , X2_C6  , X3_C6  , X4_C6 ]
, NodeTag4[X1_C7  , X2_C7  , X3_C7  , X4_C7 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
]
}
given tupletag4_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7
, X1  , X2  , X3  , X4
]
: Merge7[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4] ]
, TupleTag4[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4] ]
, TupleTag4[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4] ]
, TupleTag4[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4] ]
, TupleTag4[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]
]
] = {
new Merge7[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4] ]
, TupleTag4[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4] ]
, TupleTag4[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4] ]
, TupleTag4[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4] ]
, TupleTag4[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]
]
]
}
given nodetag5_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
, nodeTagImplicit2: Merge7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , Target2 ]  , nodeTagImplicit3: Merge7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , Target3 ]  , nodeTagImplicit4: Merge7[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , Target4 ]  , nodeTagImplicit5: Merge7[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , Target5 ]  ): Merge7[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, NodeTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, NodeTag5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
] = {
new Merge7[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5 ]
, NodeTag5[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6 ]
, NodeTag5[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
]
}
given tupletag5_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7
, X1  , X2  , X3  , X4  , X5
]
: Merge7[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5] ]
, TupleTag5[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5] ]
, TupleTag5[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5] ]
, TupleTag5[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5] ]
, TupleTag5[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]
]
] = {
new Merge7[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5] ]
, TupleTag5[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5] ]
, TupleTag5[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5] ]
, TupleTag5[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5] ]
, TupleTag5[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]
]
]
}
given nodetag6_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag  , X6_C5 <: TupleTag  , X6_C6 <: TupleTag  , X6_C7 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
, nodeTagImplicit2: Merge7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , Target2 ]  , nodeTagImplicit3: Merge7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , Target3 ]  , nodeTagImplicit4: Merge7[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , Target4 ]  , nodeTagImplicit5: Merge7[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , Target5 ]  , nodeTagImplicit6: Merge7[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , Target6 ]  ): Merge7[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, NodeTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, NodeTag6[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
] = {
new Merge7[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5 ]
, NodeTag6[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6 ]
, NodeTag6[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
]
}
given tupletag6_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7    , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7
, X1  , X2  , X3  , X4  , X5  , X6
]
: Merge7[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6] ]
, TupleTag6[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6] ]
, TupleTag6[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6] ]
, TupleTag6[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5]  , PropertyTag1[X6_C7, X6] ]
, TupleTag6[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]  , PropertyTag7[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6_C7 ,  X6]
]
] = {
new Merge7[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6] ]
, TupleTag6[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6] ]
, TupleTag6[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6] ]
, TupleTag6[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5]  , PropertyTag1[X6_C7, X6] ]
, TupleTag6[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]  , PropertyTag7[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6_C7 ,  X6]
]
]
}
given nodetag7_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag  , X6_C5 <: TupleTag  , X6_C6 <: TupleTag  , X6_C7 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag  , X7_C3 <: TupleTag  , X7_C4 <: TupleTag  , X7_C5 <: TupleTag  , X7_C6 <: TupleTag  , X7_C7 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
, nodeTagImplicit2: Merge7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , Target2 ]  , nodeTagImplicit3: Merge7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , Target3 ]  , nodeTagImplicit4: Merge7[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , Target4 ]  , nodeTagImplicit5: Merge7[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , Target5 ]  , nodeTagImplicit6: Merge7[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , Target6 ]  , nodeTagImplicit7: Merge7[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , Target7 ]  ): Merge7[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, NodeTag7[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4 ]
, NodeTag7[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5 ]
, NodeTag7[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6 ]
, NodeTag7[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
] = {
new Merge7[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3 ]
, NodeTag7[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4 ]
, NodeTag7[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5 ]
, NodeTag7[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6 ]
, NodeTag7[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
]
}
given tupletag7_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7    , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7    , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7
, X1  , X2  , X3  , X4  , X5  , X6  , X7
]
: Merge7[
TupleTag7[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7] ]
, TupleTag7[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7] ]
, TupleTag7[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7] ]
, TupleTag7[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6]  , PropertyTag1[X7_C4, X7] ]
, TupleTag7[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6]  , PropertyTag1[X7_C5, X7] ]
, TupleTag7[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6]  , PropertyTag1[X7_C6, X7] ]
, TupleTag7[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5]  , PropertyTag1[X6_C7, X6]  , PropertyTag1[X7_C7, X7] ]
, TupleTag7[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]  , PropertyTag7[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6_C7 ,  X6]  , PropertyTag7[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7_C4 ,  X7_C5 ,  X7_C6 ,  X7_C7 ,  X7]
]
] = {
new Merge7[
TupleTag7[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7] ]
, TupleTag7[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7] ]
, TupleTag7[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7] ]
, TupleTag7[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6]  , PropertyTag1[X7_C4, X7] ]
, TupleTag7[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6]  , PropertyTag1[X7_C5, X7] ]
, TupleTag7[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6]  , PropertyTag1[X7_C6, X7] ]
, TupleTag7[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5]  , PropertyTag1[X6_C7, X6]  , PropertyTag1[X7_C7, X7] ]
, TupleTag7[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]  , PropertyTag7[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6_C7 ,  X6]  , PropertyTag7[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7_C4 ,  X7_C5 ,  X7_C6 ,  X7_C7 ,  X7]
]
]
}
given nodetag8_merge7_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag  , X1_C5 <: TupleTag  , X1_C6 <: TupleTag  , X1_C7 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag  , X2_C5 <: TupleTag  , X2_C6 <: TupleTag  , X2_C7 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag  , X3_C5 <: TupleTag  , X3_C6 <: TupleTag  , X3_C7 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag  , X4_C5 <: TupleTag  , X4_C6 <: TupleTag  , X4_C7 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag  , X5_C5 <: TupleTag  , X5_C6 <: TupleTag  , X5_C7 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag  , X6_C5 <: TupleTag  , X6_C6 <: TupleTag  , X6_C7 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag  , X7_C3 <: TupleTag  , X7_C4 <: TupleTag  , X7_C5 <: TupleTag  , X7_C6 <: TupleTag  , X7_C7 <: TupleTag    , X8_C1 <: TupleTag  , X8_C2 <: TupleTag  , X8_C3 <: TupleTag  , X8_C4 <: TupleTag  , X8_C5 <: TupleTag  , X8_C6 <: TupleTag  , X8_C7 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag  , Target8 <: TupleTag ](given
nodeTagImplicit1: Merge7[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , Target1]
, nodeTagImplicit2: Merge7[X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , Target2 ]  , nodeTagImplicit3: Merge7[X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7  , Target3 ]  , nodeTagImplicit4: Merge7[X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7  , Target4 ]  , nodeTagImplicit5: Merge7[X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7  , Target5 ]  , nodeTagImplicit6: Merge7[X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7  , Target6 ]  , nodeTagImplicit7: Merge7[X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7  , Target7 ]  , nodeTagImplicit8: Merge7[X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7  , Target8 ]  ): Merge7[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, NodeTag8[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ]
, NodeTag8[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5 ]
, NodeTag8[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6 ]
, NodeTag8[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
] = {
new Merge7[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3  , X7_C3  , X8_C3 ]
, NodeTag8[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4  , X7_C4  , X8_C4 ]
, NodeTag8[X1_C5  , X2_C5  , X3_C5  , X4_C5  , X5_C5  , X6_C5  , X7_C5  , X8_C5 ]
, NodeTag8[X1_C6  , X2_C6  , X3_C6  , X4_C6  , X5_C6  , X6_C6  , X7_C6  , X8_C6 ]
, NodeTag8[X1_C7  , X2_C7  , X3_C7  , X4_C7  , X5_C7  , X6_C7  , X7_C7  , X8_C7 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
]
}
given tupletag8_merge7_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7    , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7    , X3_C1  , X3_C2  , X3_C3  , X3_C4  , X3_C5  , X3_C6  , X3_C7    , X4_C1  , X4_C2  , X4_C3  , X4_C4  , X4_C5  , X4_C6  , X4_C7    , X5_C1  , X5_C2  , X5_C3  , X5_C4  , X5_C5  , X5_C6  , X5_C7    , X6_C1  , X6_C2  , X6_C3  , X6_C4  , X6_C5  , X6_C6  , X6_C7    , X7_C1  , X7_C2  , X7_C3  , X7_C4  , X7_C5  , X7_C6  , X7_C7    , X8_C1  , X8_C2  , X8_C3  , X8_C4  , X8_C5  , X8_C6  , X8_C7
, X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8
]
: Merge7[
TupleTag8[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7]  , PropertyTag1[X8_C1, X8] ]
, TupleTag8[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7]  , PropertyTag1[X8_C2, X8] ]
, TupleTag8[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7]  , PropertyTag1[X8_C3, X8] ]
, TupleTag8[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6]  , PropertyTag1[X7_C4, X7]  , PropertyTag1[X8_C4, X8] ]
, TupleTag8[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6]  , PropertyTag1[X7_C5, X7]  , PropertyTag1[X8_C5, X8] ]
, TupleTag8[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6]  , PropertyTag1[X7_C6, X7]  , PropertyTag1[X8_C6, X8] ]
, TupleTag8[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5]  , PropertyTag1[X6_C7, X6]  , PropertyTag1[X7_C7, X7]  , PropertyTag1[X8_C7, X8] ]
, TupleTag8[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]  , PropertyTag7[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6_C7 ,  X6]  , PropertyTag7[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7_C4 ,  X7_C5 ,  X7_C6 ,  X7_C7 ,  X7]  , PropertyTag7[ X8_C1 ,  X8_C2 ,  X8_C3 ,  X8_C4 ,  X8_C5 ,  X8_C6 ,  X8_C7 ,  X8]
]
] = {
new Merge7[
TupleTag8[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7]  , PropertyTag1[X8_C1, X8] ]
, TupleTag8[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7]  , PropertyTag1[X8_C2, X8] ]
, TupleTag8[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6]  , PropertyTag1[X7_C3, X7]  , PropertyTag1[X8_C3, X8] ]
, TupleTag8[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6]  , PropertyTag1[X7_C4, X7]  , PropertyTag1[X8_C4, X8] ]
, TupleTag8[PropertyTag1[X1_C5, X1]  , PropertyTag1[X2_C5, X2]  , PropertyTag1[X3_C5, X3]  , PropertyTag1[X4_C5, X4]  , PropertyTag1[X5_C5, X5]  , PropertyTag1[X6_C5, X6]  , PropertyTag1[X7_C5, X7]  , PropertyTag1[X8_C5, X8] ]
, TupleTag8[PropertyTag1[X1_C6, X1]  , PropertyTag1[X2_C6, X2]  , PropertyTag1[X3_C6, X3]  , PropertyTag1[X4_C6, X4]  , PropertyTag1[X5_C6, X5]  , PropertyTag1[X6_C6, X6]  , PropertyTag1[X7_C6, X7]  , PropertyTag1[X8_C6, X8] ]
, TupleTag8[PropertyTag1[X1_C7, X1]  , PropertyTag1[X2_C7, X2]  , PropertyTag1[X3_C7, X3]  , PropertyTag1[X4_C7, X4]  , PropertyTag1[X5_C7, X5]  , PropertyTag1[X6_C7, X6]  , PropertyTag1[X7_C7, X7]  , PropertyTag1[X8_C7, X8] ]
, TupleTag8[
PropertyTag7[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1_C5 ,  X1_C6 ,  X1_C7 ,  X1]
, PropertyTag7[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2_C5 ,  X2_C6 ,  X2_C7 ,  X2]  , PropertyTag7[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3_C5 ,  X3_C6 ,  X3_C7 ,  X3]  , PropertyTag7[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4_C5 ,  X4_C6 ,  X4_C7 ,  X4]  , PropertyTag7[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5_C5 ,  X5_C6 ,  X5_C7 ,  X5]  , PropertyTag7[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6_C5 ,  X6_C6 ,  X6_C7 ,  X6]  , PropertyTag7[ X7_C1 ,  X7_C2 ,  X7_C3 ,  X7_C4 ,  X7_C5 ,  X7_C6 ,  X7_C7 ,  X7]  , PropertyTag7[ X8_C1 ,  X8_C2 ,  X8_C3 ,  X8_C4 ,  X8_C5 ,  X8_C6 ,  X8_C7 ,  X8]
]
]
}
}
