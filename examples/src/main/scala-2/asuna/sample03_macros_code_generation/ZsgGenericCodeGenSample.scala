package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgGeneric

object ZsgGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    ZsgGeneric.GenericApply[Sample10].value { pro =>
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
    implicitly[ZsgGeneric.Aux[Sample10, ZTuple10[PropertyTag[String], PropertyTag[Int], PropertyTag[Int], PropertyTag[Long], PropertyTag[String], PropertyTag[
      List[String]
    ], PropertyTag[Long], PropertyTag[Option[Long]], PropertyTag[List[Long]], PropertyTag[String]]]],
    genResult
  )

}
