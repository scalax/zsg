package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.ZsgSealedClassGeneric

object ZsgSealedClassGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: ZsgSealedClassGeneric[Foo, ZTuple4[Class[Bar1], Class[Bar2], Class[Bar3], Class[Bar4]]] =
    ZsgSealedClassGeneric.value(BuildContent.tuple4(classOf[Bar1], classOf[Bar2], classOf[Bar3], classOf[Bar4]))

  sameType(implicitly[ZsgSealedClassGeneric[Foo, ZTuple4[Class[Bar1], Class[Bar2], Class[Bar3], Class[Bar4]]]], genResult)

}
