package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaSetterGeneric

object AsunaSetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaSetterGeneric[Sample10, AsunaTuple2[
    AsunaTuple2[AsunaTuple2[AsunaTuple2[String, Int], AsunaTuple2[Int, Long]], AsunaTuple2[AsunaTuple2[String, List[String]], AsunaTuple2[Long, Option[Long]]]],
    AsunaTuple1[AsunaTuple1[AsunaTuple2[List[Long], String]]]
  ]] = { i =>
    Sample10(i.i1.i1.i1.i1, i.i1.i1.i1.i2, i.i1.i1.i2.i1, i.i1.i1.i2.i2, i.i1.i2.i1.i1, i.i1.i2.i1.i2, i.i1.i2.i2.i1, i.i1.i2.i2.i2, i.i2.i1.i1.i1, i.i2.i1.i1.i2)
  }

  sameType(
    implicitly[AsunaSetterGeneric[Sample10, AsunaTuple2[
      AsunaTuple2[AsunaTuple2[AsunaTuple2[String, Int], AsunaTuple2[Int, Long]], AsunaTuple2[AsunaTuple2[String, List[String]], AsunaTuple2[Long, Option[Long]]]],
      AsunaTuple1[AsunaTuple1[AsunaTuple2[List[Long], String]]]
    ]]],
    genResult
  )

}
