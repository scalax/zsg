package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.{AsunaSealedGeneric, SealedTag}

object AsunaSealedGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = implicitly[AsunaSealedGeneric.SealedGenericApply[Foo]].value(BuildContent.tuple2(BuildContent.tuple2(SealedTag[Bar1], SealedTag[Bar2]), BuildContent.tuple2(SealedTag[Bar3], SealedTag[Bar4])))

  sameType(
    implicitly[
      AsunaSealedGeneric.Aux[Foo, AsunaTuple2[AsunaTuple2[SealedTag[Bar1], SealedTag[Bar2]], AsunaTuple2[SealedTag[Bar3], SealedTag[Bar4]]]]
    ],
    genResult
  )

}
