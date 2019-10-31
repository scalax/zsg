package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.AsunaLabelledGeneric

object AsunaLabelledGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaLabelledGeneric[Sample10, AsunaTuple2[AsunaTuple8[String, String, String, String, String, String, String, String], AsunaTuple2[String, String]]] =
    () => BuildContent.tuple2(BuildContent.tuple8("i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8"), BuildContent.tuple2("i9", "i10"))

  sameType(
    implicitly[AsunaLabelledGeneric[Sample10, AsunaTuple2[AsunaTuple8[String, String, String, String, String, String, String, String], AsunaTuple2[String, String]]]],
    genResult
  )
}
