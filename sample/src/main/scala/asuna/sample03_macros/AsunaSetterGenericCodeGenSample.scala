package asuna.sample03_macros

import asuna._
import asuna.macros.{AsunaDefaultValueGeneric, AsunaSetterGeneric, DefaultValue, PropertySetter}

object AsunaSetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    val pro = PropertySetter[Sample10]
    AsunaSetterGeneric
      .init[Sample10]
      .to(
        BuildContent.lift(
          BuildContent.nodeTag(
            BuildContent.tag(pro.to(_.i1), pro.to(_.i2), pro.to(_.i3), pro.to(_.i4), pro.to(_.i5), pro.to(_.i6), pro.to(_.i7), pro.to(_.i8)),
            BuildContent.tag(pro.to(_.i9), pro.to(_.i10))
          )
        )
      ) { i =>
        Sample10(i.i1.i1, i.i1.i2, i.i1.i3, i.i1.i4, i.i1.i5, i.i1.i6, i.i1.i7, i.i1.i8, i.i2.i1, i.i2.i2)
      }
  }

  sameType(implicitly[AsunaSetterGeneric[Sample10, Item2[Item8[String, Int, Int, Long, String, List[String], Long, Option[Long]], Item2[List[Long], String]]]], genResult)

}
