package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgGeneric

object ZsgGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = {
    ZsgGeneric.GenericApply[Sample10].value { pro =>
      ItemTag2(
        ItemTag2(
          ItemTag2(ItemTag2(pro.to(_.i1), pro.to(_.i2)), ItemTag2(pro.to(_.i3), pro.to(_.i4))),
          ItemTag2(ItemTag2(pro.to(_.i5), pro.to(_.i6)), ItemTag2(pro.to(_.i7), pro.to(_.i8)))
        ),
        ItemTag2(pro.to(_.i9), pro.to(_.i10))
      )
    }
  }

  sameType(
    implicitly[ZsgGeneric.Aux[Sample10, ItemTag2[ItemTag2[
      ItemTag2[ItemTag2[PropertyTag[String], PropertyTag[Int]], ItemTag2[PropertyTag[Int], PropertyTag[Long]]],
      ItemTag2[ItemTag2[PropertyTag[String], PropertyTag[List[String]]], ItemTag2[PropertyTag[Long], PropertyTag[Option[Long]]]]
    ], ItemTag2[PropertyTag[List[Long]], PropertyTag[String]]]]],
    genResult
  )

}
