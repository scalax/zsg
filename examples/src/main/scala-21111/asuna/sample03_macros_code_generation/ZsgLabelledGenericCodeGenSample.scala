package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgLabelledGeneric

object ZsgLabelledGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: ZsgLabelledGeneric[Sample10, ZTuple10[String, String, String, String, String, String, String, String, String, String]] =
    ZsgLabelledGeneric.value(BuildContent.tuple10("i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8", "i9", "i10"))

  sameType(implicitly[ZsgLabelledGeneric[Sample10, ZTuple10[String, String, String, String, String, String, String, String, String, String]]], genResult)
}
