package zsg.test.macros.sealed_trait_test

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object SealedTraitLabelledGenericTest extends DefaultRunnableSpec {

  override def spec = suite("A sealed trait")(
    test("should labelled generic to it's names") {
      import SealedTraitLabelledGenericPrepareTest._

      val names1: SealedTraitNames[Abc[String]] = sealedNames
      val assert1                               = assert(names1.str)(equalTo(List("AA", "BB", "CC", "dd")))
      val assert2                               = assert(new Ignore(ii = "12135dsfsf", iiii = "2").isInstanceOf[Abc[String]])(equalTo(true))
      val assert3                               = assert(names1.str.contains("Ignore"))(equalTo(false))
      val assert4                               = assert(names1.str.contains("BB"))(equalTo(true))
      assert1 && assert2 && assert3 && assert4
    }
  )

}
