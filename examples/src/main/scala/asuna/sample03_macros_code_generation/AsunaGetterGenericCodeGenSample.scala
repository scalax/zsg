package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaGetterGeneric

object AsunaGetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaGetterGeneric[Sample10, AsunaTuple2[
    AsunaTuple2[AsunaTuple2[AsunaTuple2[String, Int], AsunaTuple2[Int, Long]], AsunaTuple2[AsunaTuple2[String, List[String]], AsunaTuple2[Long, Option[Long]]]],
    AsunaTuple1[AsunaTuple1[AsunaTuple2[List[Long], String]]]
  ]] = new AsunaGetterGeneric[Sample10, AsunaTuple2[
    AsunaTuple2[AsunaTuple2[AsunaTuple2[String, Int], AsunaTuple2[Int, Long]], AsunaTuple2[AsunaTuple2[String, List[String]], AsunaTuple2[Long, Option[Long]]]],
    AsunaTuple1[AsunaTuple1[AsunaTuple2[List[Long], String]]]
  ]] {
    override def getter(i: Sample10): AsunaTuple2[
      AsunaTuple2[AsunaTuple2[AsunaTuple2[String, Int], AsunaTuple2[Int, Long]], AsunaTuple2[AsunaTuple2[String, List[String]], AsunaTuple2[Long, Option[Long]]]],
      AsunaTuple1[AsunaTuple1[AsunaTuple2[List[Long], String]]]
    ] = {
      BuildContent.tuple2(
        BuildContent.tuple2(
          BuildContent.tuple2(BuildContent.tuple2(i.i1, i.i2), BuildContent.tuple2(i.i3, i.i4)),
          BuildContent.tuple2(BuildContent.tuple2(i.i5, i.i6), BuildContent.tuple2(i.i7, i.i8))
        ),
        BuildContent.tuple1(BuildContent.tuple1(BuildContent.tuple2(i.i9, i.i10)))
      )
    }
  }

  sameType(
    implicitly[AsunaGetterGeneric[Sample10, AsunaTuple2[
      AsunaTuple2[AsunaTuple2[AsunaTuple2[String, Int], AsunaTuple2[Int, Long]], AsunaTuple2[AsunaTuple2[String, List[String]], AsunaTuple2[Long, Option[Long]]]],
      AsunaTuple1[AsunaTuple1[AsunaTuple2[List[Long], String]]]
    ]]],
    genResult
  )
}
