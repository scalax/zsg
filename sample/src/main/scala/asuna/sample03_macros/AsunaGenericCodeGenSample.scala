package asuna.test02

import asuna._
import asuna.macros.{AsunaGeneric, PropertyApply, PropertyTag}

object AsunaGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    val pro = PropertyApply[Sample10]
    AsunaGeneric.init[Sample10].init1 {
      BuildContent.lift(
        BuildContent.nodeTag(
          BuildContent.tag(pro.to(_.i1), pro.to(_.i2), pro.to(_.i3), pro.to(_.i4), pro.to(_.i5), pro.to(_.i6), pro.to(_.i7), pro.to(_.i8)),
          BuildContent.tag(pro.to(_.i9), pro.to(_.i10))
        )
      )
    }
  }

  sameType(
    implicitly[AsunaGeneric.Aux[Sample10, NodeTag2[ItemTag8[
      PropertyTag[String],
      `Number： 1`,
      PropertyTag[Int],
      `Number： 2`,
      PropertyTag[Int],
      `Number： 3`,
      PropertyTag[Long],
      `Number： 4`,
      PropertyTag[String],
      `Number： 5`,
      PropertyTag[List[String]],
      `Number： 6`,
      PropertyTag[Long],
      `Number： 7`,
      PropertyTag[Option[Long]],
      `Number： 8`
    ], `Number： 1`, ItemTag2[PropertyTag[List[Long]], `Number： 1`, PropertyTag[String], `Number： 2`], `Number： 2`]]],
    genResult
  )

}
