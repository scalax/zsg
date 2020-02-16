package asuna
class Merge2[I1 <: TupleTag  , I2 <: TupleTag  , Target <: TupleTag]
object Merge2 {
implicit def nodetag1_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag
, Target1 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
): Merge2[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[Target1 ]
] = {
new Merge2[
NodeTag1[X1_C1 ]
, NodeTag1[X1_C2 ]
, NodeTag1[Target1 ]
]
}
implicit def tupletag1_merge2_implicit[X1_C1  , X1_C2
, X1
]
: Merge2[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
]
] = {
new Merge2[
TupleTag1[PropertyTag1[X1_C1, X1] ]
, TupleTag1[PropertyTag1[X1_C2, X1] ]
, TupleTag1[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
]
]
}
implicit def nodetag2_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
, nodeTagImplicit2: Merge2[X2_C1  , X2_C2  , Target2 ]  ): Merge2[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[Target1  , Target2 ]
] = {
new Merge2[
NodeTag2[X1_C1  , X2_C1 ]
, NodeTag2[X1_C2  , X2_C2 ]
, NodeTag2[Target1  , Target2 ]
]
}
implicit def tupletag2_merge2_implicit[X1_C1  , X1_C2    , X2_C1  , X2_C2
, X1  , X2
]
: Merge2[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]
]
] = {
new Merge2[
TupleTag2[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2] ]
, TupleTag2[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2] ]
, TupleTag2[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]
]
]
}
implicit def nodetag3_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
, nodeTagImplicit2: Merge2[X2_C1  , X2_C2  , Target2 ]  , nodeTagImplicit3: Merge2[X3_C1  , X3_C2  , Target3 ]  ): Merge2[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[Target1  , Target2  , Target3 ]
] = {
new Merge2[
NodeTag3[X1_C1  , X2_C1  , X3_C1 ]
, NodeTag3[X1_C2  , X2_C2  , X3_C2 ]
, NodeTag3[Target1  , Target2  , Target3 ]
]
}
implicit def tupletag3_merge2_implicit[X1_C1  , X1_C2    , X2_C1  , X2_C2    , X3_C1  , X3_C2
, X1  , X2  , X3
]
: Merge2[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]
]
] = {
new Merge2[
TupleTag3[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3] ]
, TupleTag3[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3] ]
, TupleTag3[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]
]
]
}
implicit def nodetag4_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
, nodeTagImplicit2: Merge2[X2_C1  , X2_C2  , Target2 ]  , nodeTagImplicit3: Merge2[X3_C1  , X3_C2  , Target3 ]  , nodeTagImplicit4: Merge2[X4_C1  , X4_C2  , Target4 ]  ): Merge2[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
] = {
new Merge2[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[X1_C2  , X2_C2  , X3_C2  , X4_C2 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
]
}
implicit def tupletag4_merge2_implicit[X1_C1  , X1_C2    , X2_C1  , X2_C2    , X3_C1  , X3_C2    , X4_C1  , X4_C2
, X1  , X2  , X3  , X4
]
: Merge2[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]
]
] = {
new Merge2[
TupleTag4[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4] ]
, TupleTag4[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4] ]
, TupleTag4[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]
]
]
}
implicit def nodetag5_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
, nodeTagImplicit2: Merge2[X2_C1  , X2_C2  , Target2 ]  , nodeTagImplicit3: Merge2[X3_C1  , X3_C2  , Target3 ]  , nodeTagImplicit4: Merge2[X4_C1  , X4_C2  , Target4 ]  , nodeTagImplicit5: Merge2[X5_C1  , X5_C2  , Target5 ]  ): Merge2[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
] = {
new Merge2[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
]
}
implicit def tupletag5_merge2_implicit[X1_C1  , X1_C2    , X2_C1  , X2_C2    , X3_C1  , X3_C2    , X4_C1  , X4_C2    , X5_C1  , X5_C2
, X1  , X2  , X3  , X4  , X5
]
: Merge2[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]
]
] = {
new Merge2[
TupleTag5[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5] ]
, TupleTag5[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5] ]
, TupleTag5[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]
]
]
}
implicit def nodetag6_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
, nodeTagImplicit2: Merge2[X2_C1  , X2_C2  , Target2 ]  , nodeTagImplicit3: Merge2[X3_C1  , X3_C2  , Target3 ]  , nodeTagImplicit4: Merge2[X4_C1  , X4_C2  , Target4 ]  , nodeTagImplicit5: Merge2[X5_C1  , X5_C2  , Target5 ]  , nodeTagImplicit6: Merge2[X6_C1  , X6_C2  , Target6 ]  ): Merge2[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
] = {
new Merge2[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
]
}
implicit def tupletag6_merge2_implicit[X1_C1  , X1_C2    , X2_C1  , X2_C2    , X3_C1  , X3_C2    , X4_C1  , X4_C2    , X5_C1  , X5_C2    , X6_C1  , X6_C2
, X1  , X2  , X3  , X4  , X5  , X6
]
: Merge2[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]  , PropertyTag2[ X6_C1 ,  X6_C2 ,  X6]
]
] = {
new Merge2[
TupleTag6[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6] ]
, TupleTag6[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6] ]
, TupleTag6[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]  , PropertyTag2[ X6_C1 ,  X6_C2 ,  X6]
]
]
}
implicit def nodetag7_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
, nodeTagImplicit2: Merge2[X2_C1  , X2_C2  , Target2 ]  , nodeTagImplicit3: Merge2[X3_C1  , X3_C2  , Target3 ]  , nodeTagImplicit4: Merge2[X4_C1  , X4_C2  , Target4 ]  , nodeTagImplicit5: Merge2[X5_C1  , X5_C2  , Target5 ]  , nodeTagImplicit6: Merge2[X6_C1  , X6_C2  , Target6 ]  , nodeTagImplicit7: Merge2[X7_C1  , X7_C2  , Target7 ]  ): Merge2[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
] = {
new Merge2[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
]
}
implicit def tupletag7_merge2_implicit[X1_C1  , X1_C2    , X2_C1  , X2_C2    , X3_C1  , X3_C2    , X4_C1  , X4_C2    , X5_C1  , X5_C2    , X6_C1  , X6_C2    , X7_C1  , X7_C2
, X1  , X2  , X3  , X4  , X5  , X6  , X7
]
: Merge2[
TupleTag7[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7] ]
, TupleTag7[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7] ]
, TupleTag7[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]  , PropertyTag2[ X6_C1 ,  X6_C2 ,  X6]  , PropertyTag2[ X7_C1 ,  X7_C2 ,  X7]
]
] = {
new Merge2[
TupleTag7[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7] ]
, TupleTag7[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7] ]
, TupleTag7[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]  , PropertyTag2[ X6_C1 ,  X6_C2 ,  X6]  , PropertyTag2[ X7_C1 ,  X7_C2 ,  X7]
]
]
}
implicit def nodetag8_merge2_implicit[X1_C1 <: TupleTag  , X1_C2 <: TupleTag    , X2_C1 <: TupleTag  , X2_C2 <: TupleTag    , X3_C1 <: TupleTag  , X3_C2 <: TupleTag    , X4_C1 <: TupleTag  , X4_C2 <: TupleTag    , X5_C1 <: TupleTag  , X5_C2 <: TupleTag    , X6_C1 <: TupleTag  , X6_C2 <: TupleTag    , X7_C1 <: TupleTag  , X7_C2 <: TupleTag    , X8_C1 <: TupleTag  , X8_C2 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag  , Target8 <: TupleTag
]
(implicit
nodeTagImplicit1: Merge2[X1_C1  , X1_C2  , Target1 ]
, nodeTagImplicit2: Merge2[X2_C1  , X2_C2  , Target2 ]  , nodeTagImplicit3: Merge2[X3_C1  , X3_C2  , Target3 ]  , nodeTagImplicit4: Merge2[X4_C1  , X4_C2  , Target4 ]  , nodeTagImplicit5: Merge2[X5_C1  , X5_C2  , Target5 ]  , nodeTagImplicit6: Merge2[X6_C1  , X6_C2  , Target6 ]  , nodeTagImplicit7: Merge2[X7_C1  , X7_C2  , Target7 ]  , nodeTagImplicit8: Merge2[X8_C1  , X8_C2  , Target8 ]  ): Merge2[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
] = {
new Merge2[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2  , X6_C2  , X7_C2  , X8_C2 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
]
}
implicit def tupletag8_merge2_implicit[X1_C1  , X1_C2    , X2_C1  , X2_C2    , X3_C1  , X3_C2    , X4_C1  , X4_C2    , X5_C1  , X5_C2    , X6_C1  , X6_C2    , X7_C1  , X7_C2    , X8_C1  , X8_C2
, X1  , X2  , X3  , X4  , X5  , X6  , X7  , X8
]
: Merge2[
TupleTag8[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7]  , PropertyTag1[X8_C1, X8] ]
, TupleTag8[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7]  , PropertyTag1[X8_C2, X8] ]
, TupleTag8[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]  , PropertyTag2[ X6_C1 ,  X6_C2 ,  X6]  , PropertyTag2[ X7_C1 ,  X7_C2 ,  X7]  , PropertyTag2[ X8_C1 ,  X8_C2 ,  X8]
]
] = {
new Merge2[
TupleTag8[PropertyTag1[X1_C1, X1]  , PropertyTag1[X2_C1, X2]  , PropertyTag1[X3_C1, X3]  , PropertyTag1[X4_C1, X4]  , PropertyTag1[X5_C1, X5]  , PropertyTag1[X6_C1, X6]  , PropertyTag1[X7_C1, X7]  , PropertyTag1[X8_C1, X8] ]
, TupleTag8[PropertyTag1[X1_C2, X1]  , PropertyTag1[X2_C2, X2]  , PropertyTag1[X3_C2, X3]  , PropertyTag1[X4_C2, X4]  , PropertyTag1[X5_C2, X5]  , PropertyTag1[X6_C2, X6]  , PropertyTag1[X7_C2, X7]  , PropertyTag1[X8_C2, X8] ]
, TupleTag8[
PropertyTag2[ X1_C1 ,  X1_C2 ,  X1]
, PropertyTag2[ X2_C1 ,  X2_C2 ,  X2]  , PropertyTag2[ X3_C1 ,  X3_C2 ,  X3]  , PropertyTag2[ X4_C1 ,  X4_C2 ,  X4]  , PropertyTag2[ X5_C1 ,  X5_C2 ,  X5]  , PropertyTag2[ X6_C1 ,  X6_C2 ,  X6]  , PropertyTag2[ X7_C1 ,  X7_C2 ,  X7]  , PropertyTag2[ X8_C1 ,  X8_C2 ,  X8]
]
]
}
}
