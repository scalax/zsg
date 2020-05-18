package zsg.sample03_macros_code_generation

import zsg._
import zsg.macros.single.AsunaSealedToAbsGeneric

object AsunaSealedToAbsGenericCodeGenSample {

  def sameType[T](t1: T, t2: T): T = t1

  val genResult: AsunaSealedToAbsGeneric[Foo, NodeTuple2[ZsgTuple2[Bar1 => Foo, Bar2 => Foo], ZsgTuple2[Bar3 => Foo, Bar4 => Foo]]] = AsunaSealedToAbsGeneric.value {
    BuildContent.nodeTuple2(BuildContent.tuple2({ i: Bar1 => i }: (Bar1 => Foo), { i: Bar2 => i }: (Bar2 => Foo)), BuildContent.tuple2({ i: Bar3 => i }: (Bar3 => Foo), {
      i: Bar4 => i
    }: (Bar4 => Foo)))
  }

  sameType(implicitly[AsunaSealedToAbsGeneric[Foo, NodeTuple2[ZsgTuple2[Bar1 => Foo, Bar2 => Foo], ZsgTuple2[Bar3 => Foo, Bar4 => Foo]]]], genResult)

}
