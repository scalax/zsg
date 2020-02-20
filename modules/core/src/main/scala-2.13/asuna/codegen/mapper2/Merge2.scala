package asuna
class Merge2[I1 <: TupleTag, I2 <: TupleTag, Target <: TupleTag]
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
  implicit def tupletag1_merge2_implicit[X1_C1, X1_C2, X1]: Merge2[
    TupleTag1[PropertyTag1[X1_C1, X1]],
    TupleTag1[PropertyTag1[X1_C2, X1]],
    TupleTag1[
      PropertyTag2[X1_C1, X1_C2, X1]
    ]
  ] = {
    new Merge2[
      TupleTag1[PropertyTag1[X1_C1, X1]],
      TupleTag1[PropertyTag1[X1_C2, X1]],
      TupleTag1[
        PropertyTag2[X1_C1, X1_C2, X1]
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
  implicit def tupletag2_merge2_implicit[X1_C1, X1_C2, X2_C1, X2_C2, X1, X2]: Merge2[
    TupleTag2[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2]],
    TupleTag2[PropertyTag1[X1_C2, X1], PropertyTag1[X2_C2, X2]],
    TupleTag2[
      PropertyTag2[X1_C1, X1_C2, X1],
      PropertyTag2[X2_C1, X2_C2, X2]
    ]
  ] = {
    new Merge2[
      TupleTag2[PropertyTag1[X1_C1, X1], PropertyTag1[X2_C1, X2]],
      TupleTag2[PropertyTag1[X1_C2, X1], PropertyTag1[X2_C2, X2]],
      TupleTag2[
        PropertyTag2[X1_C1, X1_C2, X1],
        PropertyTag2[X2_C1, X2_C2, X2]
      ]
    ]
  }
}
