package asuna.sample03_macros

import asuna._
import asuna.macros.{AsunaSealedGeneric, SealedTag}

object AsunaSealedGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = AsunaSealedGeneric.init[Foo].init1(BuildContent.tag(SealedTag[Bar1], SealedTag[Bar2], SealedTag[Bar3], SealedTag[Bar4]))

  sameType(
    implicitly[
      AsunaSealedGeneric.Aux[Foo, ItemTag4[SealedTag[Bar1], `Number： 1`, SealedTag[Bar2], `Number： 2`, SealedTag[Bar3], `Number： 3`, SealedTag[Bar4], `Number： 4`]]
    ],
    genResult
  )

}
