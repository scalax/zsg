package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.AsunaGetterGeneric

object AsunaGetterGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaGetterGeneric[Sample10, NodeTuple2[
    NodeTuple2[NodeTuple2[ZsgTuple2[String, Int], ZsgTuple2[Int, Long]], NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple2[Long, Option[Long]]]],
    NodeTuple1[NodeTuple1[ZsgTuple2[List[Long], String]]]
  ]] = new AsunaGetterGeneric[Sample10, NodeTuple2[
    NodeTuple2[NodeTuple2[ZsgTuple2[String, Int], ZsgTuple2[Int, Long]], NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple2[Long, Option[Long]]]],
    NodeTuple1[NodeTuple1[ZsgTuple2[List[Long], String]]]
  ]] {
    override def getter(i: Sample10): NodeTuple2[
      NodeTuple2[NodeTuple2[ZsgTuple2[String, Int], ZsgTuple2[Int, Long]], NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple2[Long, Option[Long]]]],
      NodeTuple1[NodeTuple1[ZsgTuple2[List[Long], String]]]
    ] = {
      BuildContent.nodeTuple2(
        BuildContent.nodeTuple2(
          BuildContent.nodeTuple2(BuildContent.tuple2(i.i1, i.i2), BuildContent.tuple2(i.i3, i.i4)),
          BuildContent.nodeTuple2(BuildContent.tuple2(i.i5, i.i6), BuildContent.tuple2(i.i7, i.i8))
        ),
        BuildContent.nodeTuple1(BuildContent.nodeTuple1(BuildContent.tuple2(i.i9, i.i10)))
      )
    }
  }

  sameType(
    implicitly[AsunaGetterGeneric[Sample10, NodeTuple2[
      NodeTuple2[NodeTuple2[ZsgTuple2[String, Int], ZsgTuple2[Int, Long]], NodeTuple2[ZsgTuple2[String, List[String]], ZsgTuple2[Long, Option[Long]]]],
      NodeTuple1[NodeTuple1[ZsgTuple2[List[Long], String]]]
    ]]],
    genResult
  )
}
