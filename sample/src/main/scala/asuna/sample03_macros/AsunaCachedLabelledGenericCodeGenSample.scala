package asuna.test02

import asuna._
import asuna.macros.AsunaCachedLabelledGeneric

object AsunaCachedLabelledGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = AsunaCachedLabelledGeneric
    .init[Sample10]
    .name(classOf[Sample10].getCanonicalName, BuildContent.nodeItem2(BuildContent.item8("i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8"), BuildContent.item2("i9", "i10")))

  sameType(
    implicitly[AsunaCachedLabelledGeneric[Sample10, Item2[Item8[String, String, String, String, String, String, String, String], Item2[String, String]]]],
    genResult
  )

}
