package asuna
class Merge2[I1 <: TupleTag, I2 <: TupleTag, Target <: TupleTag]
trait MergeProperty2[I1, I2]
object Merge2 {
  implicit def nodetag1_merge2_implicit[X1_C1 <: TupleTag, X1_C2 <: TupleTag, Target1 <: TupleTag](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1]
  ): Merge2[
    NodeTag1[X1_C1],
    NodeTag1[X1_C2],
    NodeTag1[Target1]
  ] = {
    new Merge2[
      NodeTag1[X1_C1],
      NodeTag1[X1_C2],
      NodeTag1[Target1]
    ]
  }
  implicit def tupletag1_merge2_implicit[X1_C1, X1_C2]: Merge2[
    TupleTag1[X1_C1],
    TupleTag1[X1_C2],
    TupleTag1[
      MergeProperty2[X1_C1, X1_C2]
    ]
  ] = {
    new Merge2[
      TupleTag1[X1_C1],
      TupleTag1[X1_C2],
      TupleTag1[
        MergeProperty2[X1_C1, X1_C2]
      ]
    ]
  }
  implicit def nodetag2_merge2_implicit[X1_C1 <: TupleTag, X1_C2 <: TupleTag, X2_C1 <: TupleTag, X2_C2 <: TupleTag, Target1 <: TupleTag, Target2 <: TupleTag](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1],
    nodeTagImplicit2: Merge2[X2_C1, X2_C2, Target2]
  ): Merge2[
    NodeTag2[X1_C1, X2_C1],
    NodeTag2[X1_C2, X2_C2],
    NodeTag2[Target1, Target2]
  ] = {
    new Merge2[
      NodeTag2[X1_C1, X2_C1],
      NodeTag2[X1_C2, X2_C2],
      NodeTag2[Target1, Target2]
    ]
  }
  implicit def tupletag2_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2]: Merge2[
    TupleTag2[X1_C1, X2_C1],
    TupleTag2[X1_C2, X2_C2],
    TupleTag2[
      MergeProperty2[X1_C1, X1_C2],
      MergeProperty2[X2_C1, X2_C2]
    ]
  ] = {
    new Merge2[
      TupleTag2[X1_C1, X2_C1],
      TupleTag2[X1_C2, X2_C2],
      TupleTag2[
        MergeProperty2[X1_C1, X1_C2],
        MergeProperty2[X2_C1, X2_C2]
      ]
    ]
  }
  implicit def nodetag3_merge2_implicit[
    X1_C1 <: TupleTag,
    X1_C2 <: TupleTag,
    X2_C1 <: TupleTag,
    X2_C2 <: TupleTag,
    X3_C1 <: TupleTag,
    X3_C2 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1],
    nodeTagImplicit2: Merge2[X2_C1, X2_C2, Target2],
    nodeTagImplicit3: Merge2[X3_C1, X3_C2, Target3]
  ): Merge2[
    NodeTag3[X1_C1, X2_C1, X3_C1],
    NodeTag3[X1_C2, X2_C2, X3_C2],
    NodeTag3[Target1, Target2, Target3]
  ] = {
    new Merge2[
      NodeTag3[X1_C1, X2_C1, X3_C1],
      NodeTag3[X1_C2, X2_C2, X3_C2],
      NodeTag3[Target1, Target2, Target3]
    ]
  }
  implicit def tupletag3_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2, X3_C1, X3_C2]: Merge2[
    TupleTag3[X1_C1, X2_C1, X3_C1],
    TupleTag3[X1_C2, X2_C2, X3_C2],
    TupleTag3[
      MergeProperty2[X1_C1, X1_C2],
      MergeProperty2[X2_C1, X2_C2],
      MergeProperty2[X3_C1, X3_C2]
    ]
  ] = {
    new Merge2[
      TupleTag3[X1_C1, X2_C1, X3_C1],
      TupleTag3[X1_C2, X2_C2, X3_C2],
      TupleTag3[
        MergeProperty2[X1_C1, X1_C2],
        MergeProperty2[X2_C1, X2_C2],
        MergeProperty2[X3_C1, X3_C2]
      ]
    ]
  }
  implicit def nodetag4_merge2_implicit[
    X1_C1 <: TupleTag,
    X1_C2 <: TupleTag,
    X2_C1 <: TupleTag,
    X2_C2 <: TupleTag,
    X3_C1 <: TupleTag,
    X3_C2 <: TupleTag,
    X4_C1 <: TupleTag,
    X4_C2 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1],
    nodeTagImplicit2: Merge2[X2_C1, X2_C2, Target2],
    nodeTagImplicit3: Merge2[X3_C1, X3_C2, Target3],
    nodeTagImplicit4: Merge2[X4_C1, X4_C2, Target4]
  ): Merge2[
    NodeTag4[X1_C1, X2_C1, X3_C1, X4_C1],
    NodeTag4[X1_C2, X2_C2, X3_C2, X4_C2],
    NodeTag4[Target1, Target2, Target3, Target4]
  ] = {
    new Merge2[
      NodeTag4[X1_C1, X2_C1, X3_C1, X4_C1],
      NodeTag4[X1_C2, X2_C2, X3_C2, X4_C2],
      NodeTag4[Target1, Target2, Target3, Target4]
    ]
  }
  implicit def tupletag4_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2, X3_C1, X3_C2, X4_C1, X4_C2]: Merge2[
    TupleTag4[X1_C1, X2_C1, X3_C1, X4_C1],
    TupleTag4[X1_C2, X2_C2, X3_C2, X4_C2],
    TupleTag4[
      MergeProperty2[X1_C1, X1_C2],
      MergeProperty2[X2_C1, X2_C2],
      MergeProperty2[X3_C1, X3_C2],
      MergeProperty2[X4_C1, X4_C2]
    ]
  ] = {
    new Merge2[
      TupleTag4[X1_C1, X2_C1, X3_C1, X4_C1],
      TupleTag4[X1_C2, X2_C2, X3_C2, X4_C2],
      TupleTag4[
        MergeProperty2[X1_C1, X1_C2],
        MergeProperty2[X2_C1, X2_C2],
        MergeProperty2[X3_C1, X3_C2],
        MergeProperty2[X4_C1, X4_C2]
      ]
    ]
  }
  implicit def nodetag5_merge2_implicit[
    X1_C1 <: TupleTag,
    X1_C2 <: TupleTag,
    X2_C1 <: TupleTag,
    X2_C2 <: TupleTag,
    X3_C1 <: TupleTag,
    X3_C2 <: TupleTag,
    X4_C1 <: TupleTag,
    X4_C2 <: TupleTag,
    X5_C1 <: TupleTag,
    X5_C2 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag,
    Target5 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1],
    nodeTagImplicit2: Merge2[X2_C1, X2_C2, Target2],
    nodeTagImplicit3: Merge2[X3_C1, X3_C2, Target3],
    nodeTagImplicit4: Merge2[X4_C1, X4_C2, Target4],
    nodeTagImplicit5: Merge2[X5_C1, X5_C2, Target5]
  ): Merge2[
    NodeTag5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1],
    NodeTag5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2],
    NodeTag5[Target1, Target2, Target3, Target4, Target5]
  ] = {
    new Merge2[
      NodeTag5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1],
      NodeTag5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2],
      NodeTag5[Target1, Target2, Target3, Target4, Target5]
    ]
  }
  implicit def tupletag5_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2, X3_C1, X3_C2, X4_C1, X4_C2, X5_C1, X5_C2]: Merge2[
    TupleTag5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1],
    TupleTag5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2],
    TupleTag5[
      MergeProperty2[X1_C1, X1_C2],
      MergeProperty2[X2_C1, X2_C2],
      MergeProperty2[X3_C1, X3_C2],
      MergeProperty2[X4_C1, X4_C2],
      MergeProperty2[X5_C1, X5_C2]
    ]
  ] = {
    new Merge2[
      TupleTag5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1],
      TupleTag5[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2],
      TupleTag5[
        MergeProperty2[X1_C1, X1_C2],
        MergeProperty2[X2_C1, X2_C2],
        MergeProperty2[X3_C1, X3_C2],
        MergeProperty2[X4_C1, X4_C2],
        MergeProperty2[X5_C1, X5_C2]
      ]
    ]
  }
  implicit def nodetag6_merge2_implicit[
    X1_C1 <: TupleTag,
    X1_C2 <: TupleTag,
    X2_C1 <: TupleTag,
    X2_C2 <: TupleTag,
    X3_C1 <: TupleTag,
    X3_C2 <: TupleTag,
    X4_C1 <: TupleTag,
    X4_C2 <: TupleTag,
    X5_C1 <: TupleTag,
    X5_C2 <: TupleTag,
    X6_C1 <: TupleTag,
    X6_C2 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag,
    Target5 <: TupleTag,
    Target6 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1],
    nodeTagImplicit2: Merge2[X2_C1, X2_C2, Target2],
    nodeTagImplicit3: Merge2[X3_C1, X3_C2, Target3],
    nodeTagImplicit4: Merge2[X4_C1, X4_C2, Target4],
    nodeTagImplicit5: Merge2[X5_C1, X5_C2, Target5],
    nodeTagImplicit6: Merge2[X6_C1, X6_C2, Target6]
  ): Merge2[
    NodeTag6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1],
    NodeTag6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2],
    NodeTag6[Target1, Target2, Target3, Target4, Target5, Target6]
  ] = {
    new Merge2[
      NodeTag6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1],
      NodeTag6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2],
      NodeTag6[Target1, Target2, Target3, Target4, Target5, Target6]
    ]
  }
  implicit def tupletag6_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2, X3_C1, X3_C2, X4_C1, X4_C2, X5_C1, X5_C2, X6_C1, X6_C2]: Merge2[
    TupleTag6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1],
    TupleTag6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2],
    TupleTag6[
      MergeProperty2[X1_C1, X1_C2],
      MergeProperty2[X2_C1, X2_C2],
      MergeProperty2[X3_C1, X3_C2],
      MergeProperty2[X4_C1, X4_C2],
      MergeProperty2[X5_C1, X5_C2],
      MergeProperty2[X6_C1, X6_C2]
    ]
  ] = {
    new Merge2[
      TupleTag6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1],
      TupleTag6[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2],
      TupleTag6[
        MergeProperty2[X1_C1, X1_C2],
        MergeProperty2[X2_C1, X2_C2],
        MergeProperty2[X3_C1, X3_C2],
        MergeProperty2[X4_C1, X4_C2],
        MergeProperty2[X5_C1, X5_C2],
        MergeProperty2[X6_C1, X6_C2]
      ]
    ]
  }
  implicit def nodetag7_merge2_implicit[
    X1_C1 <: TupleTag,
    X1_C2 <: TupleTag,
    X2_C1 <: TupleTag,
    X2_C2 <: TupleTag,
    X3_C1 <: TupleTag,
    X3_C2 <: TupleTag,
    X4_C1 <: TupleTag,
    X4_C2 <: TupleTag,
    X5_C1 <: TupleTag,
    X5_C2 <: TupleTag,
    X6_C1 <: TupleTag,
    X6_C2 <: TupleTag,
    X7_C1 <: TupleTag,
    X7_C2 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag,
    Target5 <: TupleTag,
    Target6 <: TupleTag,
    Target7 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1],
    nodeTagImplicit2: Merge2[X2_C1, X2_C2, Target2],
    nodeTagImplicit3: Merge2[X3_C1, X3_C2, Target3],
    nodeTagImplicit4: Merge2[X4_C1, X4_C2, Target4],
    nodeTagImplicit5: Merge2[X5_C1, X5_C2, Target5],
    nodeTagImplicit6: Merge2[X6_C1, X6_C2, Target6],
    nodeTagImplicit7: Merge2[X7_C1, X7_C2, Target7]
  ): Merge2[
    NodeTag7[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1],
    NodeTag7[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2],
    NodeTag7[Target1, Target2, Target3, Target4, Target5, Target6, Target7]
  ] = {
    new Merge2[
      NodeTag7[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1],
      NodeTag7[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2],
      NodeTag7[Target1, Target2, Target3, Target4, Target5, Target6, Target7]
    ]
  }
  implicit def tupletag7_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2, X3_C1, X3_C2, X4_C1, X4_C2, X5_C1, X5_C2, X6_C1, X6_C2, X7_C1, X7_C2]: Merge2[
    TupleTag7[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1],
    TupleTag7[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2],
    TupleTag7[
      MergeProperty2[X1_C1, X1_C2],
      MergeProperty2[X2_C1, X2_C2],
      MergeProperty2[X3_C1, X3_C2],
      MergeProperty2[X4_C1, X4_C2],
      MergeProperty2[X5_C1, X5_C2],
      MergeProperty2[X6_C1, X6_C2],
      MergeProperty2[X7_C1, X7_C2]
    ]
  ] = {
    new Merge2[
      TupleTag7[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1],
      TupleTag7[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2],
      TupleTag7[
        MergeProperty2[X1_C1, X1_C2],
        MergeProperty2[X2_C1, X2_C2],
        MergeProperty2[X3_C1, X3_C2],
        MergeProperty2[X4_C1, X4_C2],
        MergeProperty2[X5_C1, X5_C2],
        MergeProperty2[X6_C1, X6_C2],
        MergeProperty2[X7_C1, X7_C2]
      ]
    ]
  }
  implicit def nodetag8_merge2_implicit[
    X1_C1 <: TupleTag,
    X1_C2 <: TupleTag,
    X2_C1 <: TupleTag,
    X2_C2 <: TupleTag,
    X3_C1 <: TupleTag,
    X3_C2 <: TupleTag,
    X4_C1 <: TupleTag,
    X4_C2 <: TupleTag,
    X5_C1 <: TupleTag,
    X5_C2 <: TupleTag,
    X6_C1 <: TupleTag,
    X6_C2 <: TupleTag,
    X7_C1 <: TupleTag,
    X7_C2 <: TupleTag,
    X8_C1 <: TupleTag,
    X8_C2 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag,
    Target5 <: TupleTag,
    Target6 <: TupleTag,
    Target7 <: TupleTag,
    Target8 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge2[X1_C1, X1_C2, Target1],
    nodeTagImplicit2: Merge2[X2_C1, X2_C2, Target2],
    nodeTagImplicit3: Merge2[X3_C1, X3_C2, Target3],
    nodeTagImplicit4: Merge2[X4_C1, X4_C2, Target4],
    nodeTagImplicit5: Merge2[X5_C1, X5_C2, Target5],
    nodeTagImplicit6: Merge2[X6_C1, X6_C2, Target6],
    nodeTagImplicit7: Merge2[X7_C1, X7_C2, Target7],
    nodeTagImplicit8: Merge2[X8_C1, X8_C2, Target8]
  ): Merge2[
    NodeTag8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1],
    NodeTag8[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2],
    NodeTag8[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8]
  ] = {
    new Merge2[
      NodeTag8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1],
      NodeTag8[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2],
      NodeTag8[Target1, Target2, Target3, Target4, Target5, Target6, Target7, Target8]
    ]
  }
  implicit def tupletag8_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2, X3_C1, X3_C2, X4_C1, X4_C2, X5_C1, X5_C2, X6_C1, X6_C2, X7_C1, X7_C2, X8_C1, X8_C2]: Merge2[
    TupleTag8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1],
    TupleTag8[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2],
    TupleTag8[
      MergeProperty2[X1_C1, X1_C2],
      MergeProperty2[X2_C1, X2_C2],
      MergeProperty2[X3_C1, X3_C2],
      MergeProperty2[X4_C1, X4_C2],
      MergeProperty2[X5_C1, X5_C2],
      MergeProperty2[X6_C1, X6_C2],
      MergeProperty2[X7_C1, X7_C2],
      MergeProperty2[X8_C1, X8_C2]
    ]
  ] = {
    new Merge2[
      TupleTag8[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X7_C1, X8_C1],
      TupleTag8[X1_C2, X2_C2, X3_C2, X4_C2, X5_C2, X6_C2, X7_C2, X8_C2],
      TupleTag8[
        MergeProperty2[X1_C1, X1_C2],
        MergeProperty2[X2_C1, X2_C2],
        MergeProperty2[X3_C1, X3_C2],
        MergeProperty2[X4_C1, X4_C2],
        MergeProperty2[X5_C1, X5_C2],
        MergeProperty2[X6_C1, X6_C2],
        MergeProperty2[X7_C1, X7_C2],
        MergeProperty2[X8_C1, X8_C2]
      ]
    ]
  }
}
