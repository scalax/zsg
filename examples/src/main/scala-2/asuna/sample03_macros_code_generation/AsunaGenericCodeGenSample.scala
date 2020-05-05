package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.{AsunaGeneric, PropertyApply}

object AsunaGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    AsunaGeneric.GenericApply[Sample10].value { pro =>
      AppendTag.lift(
        AppendTag.nodeTag(
          AppendTag.nodeTag(
            AppendTag.nodeTag(AppendTag.tag(pro.to(_.i1), pro.to(_.i2)), AppendTag.tag(pro.to(_.i3), pro.to(_.i4))),
            AppendTag.nodeTag(AppendTag.tag(pro.to(_.i5), pro.to(_.i6)), AppendTag.tag(pro.to(_.i7), pro.to(_.i8)))
          ),
          AppendTag.tag(AppendTag.nodeTag(AppendTag.tag(pro.to(_.i9), pro.to(_.i10))))
        )
      )
    }
  }

  sameType(
    implicitly[AsunaGeneric.Aux[Sample10, NodeTag2[NodeTag2[
      NodeTag2[TupleTag2[PropertyTag0[String], PropertyTag0[Int]], TupleTag2[PropertyTag0[Int], PropertyTag0[Long]]],
      NodeTag2[TupleTag2[PropertyTag0[String], PropertyTag0[List[String]]], TupleTag2[PropertyTag0[Long], PropertyTag0[Option[Long]]]]
    ], NodeTag1[NodeTag1[TupleTag2[PropertyTag0[List[Long]], PropertyTag0[String]]]]]]],
    genResult
  )

}
