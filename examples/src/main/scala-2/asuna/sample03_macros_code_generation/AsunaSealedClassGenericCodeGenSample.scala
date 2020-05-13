package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaSealedClassGeneric

object AsunaSealedClassGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaSealedClassGeneric[Foo, NodeTuple2[ZsgTuple2[Class[Bar1], Class[Bar2]], ZsgTuple2[Class[Bar3], Class[Bar4]]]] =
    AsunaSealedClassGeneric.value(BuildContent.nodeTuple2(BuildContent.tuple2(classOf[Bar1], classOf[Bar2]), BuildContent.tuple2(classOf[Bar3], classOf[Bar4])))

  sameType(implicitly[AsunaSealedClassGeneric[Foo, NodeTuple2[ZsgTuple2[Class[Bar1], Class[Bar2]], ZsgTuple2[Class[Bar3], Class[Bar4]]]]], genResult)

}
