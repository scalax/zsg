package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgSealedLabelledGeneric

object ZsgSealedLabelledGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: ZsgSealedLabelledGeneric[Foo, ZTuple4[String, String, String, String]] =
    ZsgSealedLabelledGeneric.value(BuildContent.tuple4("Bar1", "Bar2", "Bar3", "Bar4"))

  sameType(implicitly[ZsgSealedLabelledGeneric[Foo, ZTuple4[String, String, String, String]]], genResult)

}
