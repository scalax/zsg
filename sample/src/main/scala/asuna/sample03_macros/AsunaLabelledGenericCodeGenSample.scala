package asuna.test02

import asuna._
import asuna.macros.AsunaLabelledGeneric

object AsunaLabelledGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult =
    AsunaLabelledGeneric.init[Sample10].name(BuildContent.nodeItem2(BuildContent.item8("i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8"), BuildContent.item2("i9", "i10")))

  sameType(implicitly[AsunaLabelledGeneric[Sample10, Item2[Item8[String, String, String, String, String, String, String, String], Item2[String, String]]]], genResult)
}
