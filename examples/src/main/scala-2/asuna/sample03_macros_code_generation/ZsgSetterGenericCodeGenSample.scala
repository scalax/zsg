package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgSetterGeneric

object ZsgSetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: ZsgSetterGeneric[Sample10, NodeTuple2[
    NodeTuple2[NodeTuple2[ZsgTuple2[String, Int], ZsgTuple2[Int, Long]], NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple2[Long, Option[Long]]]],
    NodeTuple1[NodeTuple1[ZsgTuple2[List[Long], String]]]
  ]] = ZsgSetterGeneric.value { i =>
    Sample10(i.i1.i1.i1.i1, i.i1.i1.i1.i2, i.i1.i1.i2.i1, i.i1.i1.i2.i2, i.i1.i2.i1.i1, i.i1.i2.i1.i2, i.i1.i2.i2.i1, i.i1.i2.i2.i2, i.i2.i1.i1.i1, i.i2.i1.i1.i2)
  }

  sameType(
    implicitly[ZsgSetterGeneric[Sample10, NodeTuple2[
      NodeTuple2[NodeTuple2[ZsgTuple2[String, Int], ZsgTuple2[Int, Long]], NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple2[Long, Option[Long]]]],
      NodeTuple1[NodeTuple1[ZsgTuple2[List[Long], String]]]
    ]]],
    genResult
  )

}
