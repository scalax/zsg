package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.AsunaSealedLabelledGeneric

object AsunaSealedLabelledGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = AsunaSealedLabelledGeneric.init[Foo].name(BuildContent.tuple4("Bar1", "Bar2", "Bar3", "Bar4"))

  sameType(implicitly[AsunaSealedLabelledGeneric[Foo, AsunaTuple4[String, String, String, String]]], genResult)

}
