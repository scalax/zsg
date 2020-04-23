package asuna.sample03_macros_code_generation

import asuna._
import asuna.macros.single.AsunaSealedToAbsGeneric

object AsunaSealedToAbsGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaSealedToAbsGeneric[Foo, AsunaTuple2[AsunaTuple2[Bar1 => Foo, Bar2 => Foo], AsunaTuple2[Bar3 => Foo, Bar4 => Foo]]] = AsunaSealedToAbsGeneric.value {
    BuildContent.tuple2(BuildContent.tuple2({ i: Bar1 => i }: (Bar1 => Foo), { i: Bar2 => i }: (Bar2 => Foo)), BuildContent.tuple2({ i: Bar3 => i }: (Bar3 => Foo), {
      i: Bar4 => i
    }: (Bar4 => Foo)))
  }

  sameType(implicitly[AsunaSealedToAbsGeneric[Foo, AsunaTuple2[AsunaTuple2[Bar1 => Foo, Bar2 => Foo], AsunaTuple2[Bar3 => Foo, Bar4 => Foo]]]], genResult)

}
