package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaSetterGeneric

object AsunaSetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult
    : AsunaSetterGeneric[Sample10, AsunaTuple2[AsunaTuple8[String, Int, Int, Long, String, List[String], Long, Option[Long]], AsunaTuple2[List[Long], String]]] = { i =>
    Sample10(i.i1.i1, i.i1.i2, i.i1.i3, i.i1.i4, i.i1.i5, i.i1.i6, i.i1.i7, i.i1.i8, i.i2.i1, i.i2.i2)
  }

  sameType(
    implicitly[AsunaSetterGeneric[Sample10, AsunaTuple2[AsunaTuple8[String, Int, Int, Long, String, List[String], Long, Option[Long]], AsunaTuple2[List[Long], String]]]],
    genResult
  )

}
