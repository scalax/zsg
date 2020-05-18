package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgLabelledGeneric

object ZsgLabelledGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: ZsgLabelledGeneric[Sample10, NodeTuple2[
    NodeTuple2[NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]], NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]]],
    NodeTuple1[NodeTuple1[ZsgTuple2[String, String]]]
  ]] =
    ZsgLabelledGeneric.value(
      BuildContent.nodeTuple2(
        BuildContent.nodeTuple2(
          BuildContent.nodeTuple2(BuildContent.tuple2("i1", "i2"), BuildContent.tuple2("i3", "i4")),
          BuildContent.nodeTuple2(BuildContent.tuple2("i5", "i6"), BuildContent.tuple2("i7", "i8"))
        ),
        BuildContent.nodeTuple1(BuildContent.nodeTuple1(BuildContent.tuple2("i9", "i10")))
      )
    )

  sameType(
    implicitly[ZsgLabelledGeneric[Sample10, NodeTuple2[
      NodeTuple2[NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]], NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]]],
      NodeTuple1[NodeTuple1[ZsgTuple2[String, String]]]
    ]]],
    genResult
  )
}
