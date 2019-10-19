package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.AsunaSealedToAbsGeneric

object AsunaSealedToAbsGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult = AsunaSealedToAbsGeneric
    .init[Foo]
    .name(BuildContent.tuple4({ i: Bar1 =>
      i
    }: (Bar1 => Foo), { i: Bar2 =>
      i
    }: (Bar2 => Foo), { i: Bar3 =>
      i
    }: (Bar3 => Foo), { i: Bar4 =>
      i
    }: (Bar4 => Foo)))

  sameType(implicitly[AsunaSealedToAbsGeneric[Foo, AsunaTuple4[Bar1 => Foo, Bar2 => Foo, Bar3 => Foo, Bar4 => Foo]]], genResult)

}
