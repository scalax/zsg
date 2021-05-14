package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgGetterGeneric

object ZsgGetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: ZsgGetterGeneric[Sample10, ZTuple10[String, Int, Int, Long, String, List[String], Long, Option[Long], List[Long], String]] =
    new ZsgGetterGeneric[Sample10, ZTuple10[String, Int, Int, Long, String, List[String], Long, Option[Long], List[Long], String]] {
      override def getter(i: Sample10): ZTuple10[String, Int, Int, Long, String, List[String], Long, Option[Long], List[Long], String] =
        BuildContent.tuple10(i.i1, i.i2, i.i3, i.i4, i.i5, i.i6, i.i7, i.i8, i.i9, i.i10)
    }

  sameType(
    implicitly[ZsgGetterGeneric[Sample10, ZTuple10[String, Int, Int, Long, String, List[String], Long, Option[Long], List[Long], String]]],
    genResult
  )
}
