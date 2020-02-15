package asuna
class Merge1[I1 <: TupleTag, Target <: TupleTag]
object Merge1 {
  implicit def nodetag1_merge1_implicit[X1_C1 <: TupleTag, Target1 <: TupleTag](
    implicit
    nodeTagImplicit1: Merge1[X1_C1, Target1]
  ): Merge1[
    NodeTag1[X1_C1],
    NodeTag1[Target1]
  ] = {
    new Merge1[
      NodeTag1[X1_C1],
      NodeTag1[Target1]
    ]
  }
  implicit def tupletag1_merge1_implicit[X1_C1, X1]: Merge1[
    TupleTag1[PropertyTag1[X1_C1, X1]],
    TupleTag1[
      PropertyTag1[X1_C1, X1]
    ]
  ] = {
    new Merge1[
      TupleTag1[PropertyTag1[X1_C1, X1]],
      TupleTag1[
        PropertyTag1[X1_C1, X1]
      ]
    ]
  }
  implicit def nodetag2_merge1_implicit[X1_C1 <: TupleTag, X2_C1 <: TupleTag, Target1 <: TupleTag, Target2 <: TupleTag](
    implicit
    nodeTagImplicit1: Merge1[X1_C1, Target1],
    nodeTagImplicit2: Merge1[X2_C1, Target2]
  ): Merge1[
    NodeTag2[X1_C1, X2_C1],
    NodeTag2[Target1, Target2]
  ] = {
    new Merge1[
      NodeTag2[X1_C1, X2_C1],
      NodeTag2[Target1, Target2]
    ]
  }
  implicit def tupletag2_merge1_implicit[X1_C1, X2_C1, X1, X2]: Merge1[
    TupleTag2[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2]],
    TupleTag2[
      PropertyTag1[X1_C1, X1],
      PropertyTag1[X2_C1, X2]
    ]
  ] = {
    new Merge1[
      TupleTag2[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2]],
      TupleTag2[
        PropertyTag1[X1_C1, X1],
        PropertyTag1[X2_C1, X2]
      ]
    ]
  }
  implicit def nodetag3_merge1_implicit[X1_C1 <: TupleTag, X2_C1 <: TupleTag, X3_C1 <: TupleTag, Target1 <: TupleTag, Target2 <: TupleTag, Target3 <: TupleTag](
    implicit
    nodeTagImplicit1: Merge1[X1_C1, Target1],
    nodeTagImplicit2: Merge1[X2_C1, Target2],
    nodeTagImplicit3: Merge1[X3_C1, Target3]
  ): Merge1[
    NodeTag3[X1_C1, X2_C1, X3_C1],
    NodeTag3[Target1, Target2, Target3]
  ] = {
    new Merge1[
      NodeTag3[X1_C1, X2_C1, X3_C1],
      NodeTag3[Target1, Target2, Target3]
    ]
  }
  implicit def tupletag3_merge1_implicit[X1_C1, X2_C1, X3_C1, X1, X2, X3]: Merge1[
    TupleTag3[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3]],
    TupleTag3[
      PropertyTag1[X1_C1, X1],
      PropertyTag1[X2_C1, X2],
      PropertyTag1[X3_C1, X3]
    ]
  ] = {
    new Merge1[
      TupleTag3[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3]],
      TupleTag3[
        PropertyTag1[X1_C1, X1],
        PropertyTag1[X2_C1, X2],
        PropertyTag1[X3_C1, X3]
      ]
    ]
  }
  implicit def nodetag4_merge1_implicit[
    X1_C1 <: TupleTag,
    X2_C1 <: TupleTag,
    X3_C1 <: TupleTag,
    X4_C1 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge1[X1_C1, Target1],
    nodeTagImplicit2: Merge1[X2_C1, Target2],
    nodeTagImplicit3: Merge1[X3_C1, Target3],
    nodeTagImplicit4: Merge1[X4_C1, Target4]
  ): Merge1[
    NodeTag4[X1_C1, X2_C1, X3_C1, X4_C1],
    NodeTag4[Target1, Target2, Target3, Target4]
  ] = {
    new Merge1[
      NodeTag4[X1_C1, X2_C1, X3_C1, X4_C1],
      NodeTag4[Target1, Target2, Target3, Target4]
    ]
  }
  implicit def tupletag4_merge1_implicit[X1_C1, X2_C1, X3_C1, X4_C1, X1, X2, X3, X4]: Merge1[
    TupleTag4[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3], PropertyTag1[X4_C1, X4]],
    TupleTag4[
      PropertyTag1[X1_C1, X1],
      PropertyTag1[X2_C1, X2],
      PropertyTag1[X3_C1, X3],
      PropertyTag1[X4_C1, X4]
    ]
  ] = {
    new Merge1[
      TupleTag4[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3], PropertyTag1[X4_C1, X4]],
      TupleTag4[
        PropertyTag1[X1_C1, X1],
        PropertyTag1[X2_C1, X2],
        PropertyTag1[X3_C1, X3],
        PropertyTag1[X4_C1, X4]
      ]
    ]
  }
  implicit def nodetag5_merge1_implicit[
    X1_C1 <: TupleTag,
    X2_C1 <: TupleTag,
    X3_C1 <: TupleTag,
    X4_C1 <: TupleTag,
    X5_C1 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag,
    Target5 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge1[X1_C1, Target1],
    nodeTagImplicit2: Merge1[X2_C1, Target2],
    nodeTagImplicit3: Merge1[X3_C1, Target3],
    nodeTagImplicit4: Merge1[X4_C1, Target4],
    nodeTagImplicit5: Merge1[X5_C1, Target5]
  ): Merge1[
    NodeTag5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1],
    NodeTag5[Target1, Target2, Target3, Target4, Target5]
  ] = {
    new Merge1[
      NodeTag5[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1],
      NodeTag5[Target1, Target2, Target3, Target4, Target5]
    ]
  }
  implicit def tupletag5_merge1_implicit[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X1, X2, X3, X4, X5]: Merge1[
    TupleTag5[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3], PropertyTag1[X4_C1, X4], PropertyTag1[X5_C1, X5]],
    TupleTag5[
      PropertyTag1[X1_C1, X1],
      PropertyTag1[X2_C1, X2],
      PropertyTag1[X3_C1, X3],
      PropertyTag1[X4_C1, X4],
      PropertyTag1[X5_C1, X5]
    ]
  ] = {
    new Merge1[
      TupleTag5[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3], PropertyTag1[X4_C1, X4], PropertyTag1[X5_C1, X5]],
      TupleTag5[
        PropertyTag1[X1_C1, X1],
        PropertyTag1[X2_C1, X2],
        PropertyTag1[X3_C1, X3],
        PropertyTag1[X4_C1, X4],
        PropertyTag1[X5_C1, X5]
      ]
    ]
  }
  implicit def nodetag6_merge1_implicit[
    X1_C1 <: TupleTag,
    X2_C1 <: TupleTag,
    X3_C1 <: TupleTag,
    X4_C1 <: TupleTag,
    X5_C1 <: TupleTag,
    X6_C1 <: TupleTag,
    Target1 <: TupleTag,
    Target2 <: TupleTag,
    Target3 <: TupleTag,
    Target4 <: TupleTag,
    Target5 <: TupleTag,
    Target6 <: TupleTag
  ](
    implicit
    nodeTagImplicit1: Merge1[X1_C1, Target1],
    nodeTagImplicit2: Merge1[X2_C1, Target2],
    nodeTagImplicit3: Merge1[X3_C1, Target3],
    nodeTagImplicit4: Merge1[X4_C1, Target4],
    nodeTagImplicit5: Merge1[X5_C1, Target5],
    nodeTagImplicit6: Merge1[X6_C1, Target6]
  ): Merge1[
    NodeTag6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1],
    NodeTag6[Target1, Target2, Target3, Target4, Target5, Target6]
  ] = {
    new Merge1[
      NodeTag6[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1],
      NodeTag6[Target1, Target2, Target3, Target4, Target5, Target6]
    ]
  }
  implicit def tupletag6_merge1_implicit[X1_C1, X2_C1, X3_C1, X4_C1, X5_C1, X6_C1, X1, X2, X3, X4, X5, X6]: Merge1[
    TupleTag6[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3], PropertyTag1[X4_C1, X4], PropertyTag1[X5_C1, X5], PropertyTag1[X6_C1, X6]],
    TupleTag6[
      PropertyTag1[X1_C1, X1],
      PropertyTag1[X2_C1, X2],
      PropertyTag1[X3_C1, X3],
      PropertyTag1[X4_C1, X4],
      PropertyTag1[X5_C1, X5],
      PropertyTag1[X6_C1, X6]
    ]
  ] = {
    new Merge1[
      TupleTag6[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2], PropertyTag1[X3_C1, X3], PropertyTag1[X4_C1, X4], PropertyTag1[X5_C1, X5], PropertyTag1[X6_C1, X6]],
      TupleTag6[
        PropertyTag1[X1_C1, X1],
        PropertyTag1[X2_C1, X2],
        PropertyTag1[X3_C1, X3],
        PropertyTag1[X4_C1, X4],
        PropertyTag1[X5_C1, X5],
        PropertyTag1[X6_C1, X6]
      ]
    ]
  }
}
