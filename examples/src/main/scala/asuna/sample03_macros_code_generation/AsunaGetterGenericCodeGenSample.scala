package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.AsunaGetterGeneric

object AsunaGetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult
    : AsunaGetterGeneric[Sample10, AsunaTuple2[AsunaTuple8[String, Int, Int, Long, String, List[String], Long, Option[Long]], AsunaTuple2[List[Long], String]]] = {
    i: Sample10 =>
      BuildContent.tuple2(BuildContent.tuple8(i.i1, i.i2, i.i3, i.i4, i.i5, i.i6, i.i7, i.i8), BuildContent.tuple2(i.i9, i.i10))
  }

  sameType(
    implicitly[AsunaGetterGeneric[Sample10, AsunaTuple2[AsunaTuple8[String, Int, Int, Long, String, List[String], Long, Option[Long]], AsunaTuple2[List[Long], String]]]],
    genResult
  )
}
