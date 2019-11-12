package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.{AsunaGeneric, PropertyApply, PropertyTag}

object AsunaGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    val pro = PropertyApply[Sample10]
    AsunaGeneric.init[Sample10].init1 {
      BuildTag.lift(
        BuildTag.nodeTag(
          BuildTag.tag(pro.to(_.i1), pro.to(_.i2), pro.to(_.i3), pro.to(_.i4), pro.to(_.i5), pro.to(_.i6), pro.to(_.i7), pro.to(_.i8)),
          BuildTag.tag(pro.to(_.i9), pro.to(_.i10))
        )
      )
    }
  }

  sameType(
    implicitly[AsunaGeneric.Aux[Sample10, NodeTag2[TupleTag8[PropertyTag[String], PropertyTag[Int], PropertyTag[Int], PropertyTag[Long], PropertyTag[String], PropertyTag[
      List[String]
    ], PropertyTag[Long], PropertyTag[Option[Long]]], TupleTag2[PropertyTag[List[Long]], PropertyTag[String]]]]],
    genResult
  )

}
