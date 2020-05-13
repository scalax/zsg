package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaLabelledGeneric

object AsunaLabelledGenericCodeGenSample {
  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaLabelledGeneric[Sample10, NodeTuple2[
    NodeTuple2[NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]], NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]]],
    NodeTuple1[NodeTuple1[ZsgTuple2[String, String]]]
  ]] =
    AsunaLabelledGeneric.value(
      BuildContent.nodeTuple2(
        BuildContent.nodeTuple2(
          BuildContent.nodeTuple2(BuildContent.tuple2("i1", "i2"), BuildContent.tuple2("i3", "i4")),
          BuildContent.nodeTuple2(BuildContent.tuple2("i5", "i6"), BuildContent.tuple2("i7", "i8"))
        ),
        BuildContent.nodeTuple1(BuildContent.nodeTuple1(BuildContent.tuple2("i9", "i10")))
      )
    )

  sameType(
    implicitly[AsunaLabelledGeneric[Sample10, NodeTuple2[
      NodeTuple2[NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]], NodeTuple2[ZsgTuple2[String, String], ZsgTuple2[String, String]]],
      NodeTuple1[NodeTuple1[ZsgTuple2[String, String]]]
    ]]],
    genResult
  )
}
