package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaSealedLabelledGeneric

object AsunaSealedLabelledGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaSealedLabelledGeneric[Foo, AsunaTuple2[AsunaTuple2[String, String], AsunaTuple2[String, String]]] = () =>
    BuildContent.tuple2(BuildContent.tuple2("Bar1", "Bar2"), BuildContent.tuple2("Bar3", "Bar4"))

  sameType(implicitly[AsunaSealedLabelledGeneric[Foo, AsunaTuple2[AsunaTuple2[String, String], AsunaTuple2[String, String]]]], genResult)

}
