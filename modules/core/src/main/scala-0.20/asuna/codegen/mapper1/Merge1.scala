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
given tupletag1_merge1_implicit[X1_C1  ]
: Merge1[
TupleTag1[X1_C1 ]
, TupleTag1[
MergeProperty1[X1_C1
]
]
] = {
new Merge1[
TupleTag1[X1_C1 ]
, TupleTag1[
MergeProperty1[X1_C1
]
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
given tupletag2_merge1_implicit[X1_C1    , X2_C1  ]
: Merge1[
TupleTag2[X1_C1  , X2_C1 ]
, TupleTag2[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]
]
] = {
new Merge1[
TupleTag2[X1_C1  , X2_C1 ]
, TupleTag2[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]
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
given tupletag3_merge1_implicit[X1_C1    , X2_C1    , X3_C1  ]
: Merge1[
TupleTag3[X1_C1  , X2_C1  , X3_C1 ]
, TupleTag3[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]
]
] = {
new Merge1[
TupleTag3[X1_C1  , X2_C1  , X3_C1 ]
, TupleTag3[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]
]
]
}
given nodetag4_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag    , X3_C1 <: TupleTag    , X4_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  , nodeTagImplicit3: Merge1[X3_C1  , Target3 ]  , nodeTagImplicit4: Merge1[X4_C1  , Target4 ]  ): Merge1[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
] = {
new Merge1[
NodeTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, NodeTag4[Target1  , Target2  , Target3  , Target4 ]
]
}
given tupletag4_merge1_implicit[X1_C1    , X2_C1    , X3_C1    , X4_C1  ]
: Merge1[
TupleTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, TupleTag4[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]
]
] = {
new Merge1[
TupleTag4[X1_C1  , X2_C1  , X3_C1  , X4_C1 ]
, TupleTag4[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]
]
]
}
given nodetag5_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag    , X3_C1 <: TupleTag    , X4_C1 <: TupleTag    , X5_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  , nodeTagImplicit3: Merge1[X3_C1  , Target3 ]  , nodeTagImplicit4: Merge1[X4_C1  , Target4 ]  , nodeTagImplicit5: Merge1[X5_C1  , Target5 ]  ): Merge1[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
] = {
new Merge1[
NodeTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, NodeTag5[Target1  , Target2  , Target3  , Target4  , Target5 ]
]
}
given tupletag5_merge1_implicit[X1_C1    , X2_C1    , X3_C1    , X4_C1    , X5_C1  ]
: Merge1[
TupleTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, TupleTag5[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]
]
] = {
new Merge1[
TupleTag5[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 ]
, TupleTag5[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]
]
]
}
given nodetag6_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag    , X3_C1 <: TupleTag    , X4_C1 <: TupleTag    , X5_C1 <: TupleTag    , X6_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  , nodeTagImplicit3: Merge1[X3_C1  , Target3 ]  , nodeTagImplicit4: Merge1[X4_C1  , Target4 ]  , nodeTagImplicit5: Merge1[X5_C1  , Target5 ]  , nodeTagImplicit6: Merge1[X6_C1  , Target6 ]  ): Merge1[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
] = {
new Merge1[
NodeTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, NodeTag6[Target1  , Target2  , Target3  , Target4  , Target5  , Target6 ]
]
}
given tupletag6_merge1_implicit[X1_C1    , X2_C1    , X3_C1    , X4_C1    , X5_C1    , X6_C1  ]
: Merge1[
TupleTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, TupleTag6[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]  , MergeProperty1[X6_C1 ]
]
] = {
new Merge1[
TupleTag6[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1 ]
, TupleTag6[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]  , MergeProperty1[X6_C1 ]
]
]
}
given nodetag7_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag    , X3_C1 <: TupleTag    , X4_C1 <: TupleTag    , X5_C1 <: TupleTag    , X6_C1 <: TupleTag    , X7_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  , nodeTagImplicit3: Merge1[X3_C1  , Target3 ]  , nodeTagImplicit4: Merge1[X4_C1  , Target4 ]  , nodeTagImplicit5: Merge1[X5_C1  , Target5 ]  , nodeTagImplicit6: Merge1[X6_C1  , Target6 ]  , nodeTagImplicit7: Merge1[X7_C1  , Target7 ]  ): Merge1[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
] = {
new Merge1[
NodeTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, NodeTag7[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7 ]
]
}
given tupletag7_merge1_implicit[X1_C1    , X2_C1    , X3_C1    , X4_C1    , X5_C1    , X6_C1    , X7_C1  ]
: Merge1[
TupleTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, TupleTag7[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]  , MergeProperty1[X6_C1 ]  , MergeProperty1[X7_C1 ]
]
] = {
new Merge1[
TupleTag7[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1 ]
, TupleTag7[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]  , MergeProperty1[X6_C1 ]  , MergeProperty1[X7_C1 ]
]
]
}
given nodetag8_merge1_implicit[X1_C1 <: TupleTag    , X2_C1 <: TupleTag    , X3_C1 <: TupleTag    , X4_C1 <: TupleTag    , X5_C1 <: TupleTag    , X6_C1 <: TupleTag    , X7_C1 <: TupleTag    , X8_C1 <: TupleTag
, Target1 <: TupleTag  , Target2 <: TupleTag  , Target3 <: TupleTag  , Target4 <: TupleTag  , Target5 <: TupleTag  , Target6 <: TupleTag  , Target7 <: TupleTag  , Target8 <: TupleTag ](given
nodeTagImplicit1: Merge1[X1_C1  , Target1]
, nodeTagImplicit2: Merge1[X2_C1  , Target2 ]  , nodeTagImplicit3: Merge1[X3_C1  , Target3 ]  , nodeTagImplicit4: Merge1[X4_C1  , Target4 ]  , nodeTagImplicit5: Merge1[X5_C1  , Target5 ]  , nodeTagImplicit6: Merge1[X6_C1  , Target6 ]  , nodeTagImplicit7: Merge1[X7_C1  , Target7 ]  , nodeTagImplicit8: Merge1[X8_C1  , Target8 ]  ): Merge1[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
] = {
new Merge1[
NodeTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, NodeTag8[Target1  , Target2  , Target3  , Target4  , Target5  , Target6  , Target7  , Target8 ]
]
}
given tupletag8_merge1_implicit[X1_C1    , X2_C1    , X3_C1    , X4_C1    , X5_C1    , X6_C1    , X7_C1    , X8_C1  ]
: Merge1[
TupleTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, TupleTag8[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]  , MergeProperty1[X6_C1 ]  , MergeProperty1[X7_C1 ]  , MergeProperty1[X8_C1 ]
]
] = {
new Merge1[
TupleTag8[X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1  , X6_C1  , X7_C1  , X8_C1 ]
, TupleTag8[
MergeProperty1[X1_C1
]
, MergeProperty1[X2_C1 ]  , MergeProperty1[X3_C1 ]  , MergeProperty1[X4_C1 ]  , MergeProperty1[X5_C1 ]  , MergeProperty1[X6_C1 ]  , MergeProperty1[X7_C1 ]  , MergeProperty1[X8_C1 ]
]
]
}
}
