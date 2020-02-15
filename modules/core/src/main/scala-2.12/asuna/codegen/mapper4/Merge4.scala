package asuna
class Merge4[I1 <: TupleTag  , I2 <: TupleTag  , I3 <: TupleTag  , I4 <: TupleTag  , Target <: TupleTag]
object Merge4 {
implicit def nodetag1_merge4_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag
, Target1 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge4[X1_C1  , X1_C2  , X1_C3  , X1_C4  , Target1 ]
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
implicit def tupletag1_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4
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
implicit def nodetag2_merge4_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge4[X1_C1  , X1_C2  , X1_C3  , X1_C4  , Target1 ]
, nodeTagImplicit2: Merge4[X2_C1  , X2_C2  , X2_C3  , X2_C4  , Target2 ]  ): Merge4[
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
implicit def tupletag2_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4    , X2_C1  , X2_C2  , X2_C3  , X2_C4
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
implicit def nodetag3_merge4_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge4[X1_C1  , X1_C2  , X1_C3  , X1_C4  , Target1 ]
, nodeTagImplicit2: Merge4[X2_C1  , X2_C2  , X2_C3  , X2_C4  , Target2 ]  , nodeTagImplicit3: Merge4[X3_C1  , X3_C2  , X3_C3  , X3_C4  , Target3 ]  ): Merge4[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge4[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[X1_C3  , X2_C3  , X3_C3 ]
, NodeTag3[X1_C4  , X2_C4  , X3_C4 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
implicit def tupletag3_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4    , X2_C1  , X2_C2  , X2_C3  , X2_C4    , X3_C1  , X3_C2  , X3_C3  , X3_C4
, X1  , X2  , X3
]
: Merge4[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3] ]
, TupleTag3[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]
]
] = {
new Merge4[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3] ]
, TupleTag3[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3] ]
, TupleTag3[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]
]
]
}
implicit def nodetag4_merge4_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge4[X1_C1  , X1_C2  , X1_C3  , X1_C4  , Target1 ]
, nodeTagImplicit2: Merge4[X2_C1  , X2_C2  , X2_C3  , X2_C4  , Target2 ]  , nodeTagImplicit3: Merge4[X3_C1  , X3_C2  , X3_C3  , X3_C4  , Target3 ]  , nodeTagImplicit4: Merge4[X4_C1  , X4_C2  , X4_C3  , X4_C4  , Target4 ]  ): Merge4[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
] = {
new Merge4[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[X1_C3  , X2_C3  , X3_C3  , X4_C3 ]
, NodeTag4[X1_C4  , X2_C4  , X3_C4  , X4_C4 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
]
}
implicit def tupletag4_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4    , X2_C1  , X2_C2  , X2_C3  , X2_C4    , X3_C1  , X3_C2  , X3_C3  , X3_C4    , X4_C1  , X4_C2  , X4_C3  , X4_C4
, X1  , X2  , X3  , X4
]
: Merge4[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4] ]
, TupleTag4[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]  , PropertyTag4[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4]
]
] = {
new Merge4[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4] ]
, TupleTag4[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4] ]
, TupleTag4[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]  , PropertyTag4[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4]
]
]
}
implicit def nodetag5_merge4_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge4[X1_C1  , X1_C2  , X1_C3  , X1_C4  , Target1 ]
, nodeTagImplicit2: Merge4[X2_C1  , X2_C2  , X2_C3  , X2_C4  , Target2 ]  , nodeTagImplicit3: Merge4[X3_C1  , X3_C2  , X3_C3  , X3_C4  , Target3 ]  , nodeTagImplicit4: Merge4[X4_C1  , X4_C2  , X4_C3  , X4_C4  , Target4 ]  , nodeTagImplicit5: Merge4[X5_C1  , X5_C2  , X5_C3  , X5_C4  , Target5 ]  ): Merge4[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
] = {
new Merge4[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3 ]
, NodeTag5[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
]
}
implicit def tupletag5_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4    , X2_C1  , X2_C2  , X2_C3  , X2_C4    , X3_C1  , X3_C2  , X3_C3  , X3_C4    , X4_C1  , X4_C2  , X4_C3  , X4_C4    , X5_C1  , X5_C2  , X5_C3  , X5_C4
, X1  , X2  , X3  , X4  , X5
]
: Merge4[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5] ]
, TupleTag5[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]  , PropertyTag4[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4]  , PropertyTag4[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5]
]
] = {
new Merge4[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5] ]
, TupleTag5[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5] ]
, TupleTag5[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]  , PropertyTag4[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4]  , PropertyTag4[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5]
]
]
}
implicit def nodetag6_merge4_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag  , X1_C3 <: TupleTag  , X1_C4 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag  , X2_C3 <: TupleTag  , X2_C4 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag  , X3_C3 <: TupleTag  , X3_C4 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag  , X4_C3 <: TupleTag  , X4_C4 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag  , X5_C3 <: TupleTag  , X5_C4 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag  , X6_C3 <: TupleTag  , X6_C4 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge4[X1_C1  , X1_C2  , X1_C3  , X1_C4  , Target1 ]
, nodeTagImplicit2: Merge4[X2_C1  , X2_C2  , X2_C3  , X2_C4  , Target2 ]  , nodeTagImplicit3: Merge4[X3_C1  , X3_C2  , X3_C3  , X3_C4  , Target3 ]  , nodeTagImplicit4: Merge4[X4_C1  , X4_C2  , X4_C3  , X4_C4  , Target4 ]  , nodeTagImplicit5: Merge4[X5_C1  , X5_C2  , X5_C3  , X5_C4  , Target5 ]  , nodeTagImplicit6: Merge4[X6_C1  , X6_C2  , X6_C3  , X6_C4  , Target6 ]  ): Merge4[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
] = {
new Merge4[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[X1_C3  , X2_C3  , X3_C3  , X4_C3  , X5_C3  , X6_C3 ]
, NodeTag6[X1_C4  , X2_C4  , X3_C4  , X4_C4  , X5_C4  , X6_C4 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
]
}
implicit def tupletag6_merge4_implicit[X1_C1  , X1_C2  , X1_C3  , X1_C4    , X2_C1  , X2_C2  , X2_C3  , X2_C4    , X3_C1  , X3_C2  , X3_C3  , X3_C4    , X4_C1  , X4_C2  , X4_C3  , X4_C4    , X5_C1  , X5_C2  , X5_C3  , X5_C4    , X6_C1  , X6_C2  , X6_C3  , X6_C4
, X1  , X2  , X3  , X4  , X5  , X6
]
: Merge4[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6] ]
, TupleTag6[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]  , PropertyTag4[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4]  , PropertyTag4[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5]  , PropertyTag4[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6]
]
] = {
new Merge4[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[PropertyTag1[X1_C3, X1]  , PropertyTag1[X2_C3, X2]  , PropertyTag1[X3_C3, X3]  , PropertyTag1[X4_C3, X4]  , PropertyTag1[X5_C3, X5]  , PropertyTag1[X6_C3, X6] ]
, TupleTag6[PropertyTag1[X1_C4, X1]  , PropertyTag1[X2_C4, X2]  , PropertyTag1[X3_C4, X3]  , PropertyTag1[X4_C4, X4]  , PropertyTag1[X5_C4, X5]  , PropertyTag1[X6_C4, X6] ]
, TupleTag6[
PropertyTag4[ X1_C1 ,  X1_C2 ,  X1_C3 ,  X1_C4 ,  X1]
, PropertyTag4[ X2_C1 ,  X2_C2 ,  X2_C3 ,  X2_C4 ,  X2]  , PropertyTag4[ X3_C1 ,  X3_C2 ,  X3_C3 ,  X3_C4 ,  X3]  , PropertyTag4[ X4_C1 ,  X4_C2 ,  X4_C3 ,  X4_C4 ,  X4]  , PropertyTag4[ X5_C1 ,  X5_C2 ,  X5_C3 ,  X5_C4 ,  X5]  , PropertyTag4[ X6_C1 ,  X6_C2 ,  X6_C3 ,  X6_C4 ,  X6]
]
]
}
}
