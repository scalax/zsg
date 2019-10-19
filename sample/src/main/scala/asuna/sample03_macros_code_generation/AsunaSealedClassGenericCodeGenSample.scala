package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.AsunaSealedClassGeneric

object AsunaSealedClassGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = AsunaSealedClassGeneric.init[Foo].name(BuildContent.item4(classOf[Bar1], classOf[Bar2], classOf[Bar3], classOf[Bar4]))

  sameType(implicitly[AsunaSealedClassGeneric[Foo, AsunaTuple4[Class[Bar1], Class[Bar2], Class[Bar3], Class[Bar4]]]], genResult)

}
