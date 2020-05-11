package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaGeneric

object AsunaGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    AsunaGeneric.GenericApply[Sample10].value { pro =>
      BuildContent.tuple2(
        BuildContent.tuple2(
          BuildContent.tuple2(BuildContent.tuple2(pro.to(_.i1), pro.to(_.i2)), BuildContent.tuple2(pro.to(_.i3), pro.to(_.i4))),
          BuildContent.tuple2(BuildContent.tuple2(pro.to(_.i5), pro.to(_.i6)), BuildContent.tuple2(pro.to(_.i7), pro.to(_.i8)))
        ),
        BuildContent.tuple1(BuildContent.tuple1(BuildContent.tuple2(pro.to(_.i9), pro.to(_.i10))))
      )
    }
  }

  sameType(
    implicitly[AsunaGeneric.Aux[Sample10, AsunaTuple2[AsunaTuple2[
      AsunaTuple2[AsunaTuple2[PropertyTag[String], PropertyTag[Int]], AsunaTuple2[PropertyTag[Int], PropertyTag[Long]]],
      AsunaTuple2[AsunaTuple2[PropertyTag[String], PropertyTag[List[String]]], AsunaTuple2[PropertyTag[Long], PropertyTag[Option[Long]]]]
    ], AsunaTuple1[AsunaTuple1[AsunaTuple2[PropertyTag[List[Long]], PropertyTag[String]]]]]]],
    genResult
  )

}
