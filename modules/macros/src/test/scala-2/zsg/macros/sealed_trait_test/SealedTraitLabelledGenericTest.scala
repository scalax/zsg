package zsg.macros.sealed_trait_test

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object SealedTraitLabelledGenericTest extends DefaultRunnableSpec {

  override def spec = suite("A sealed trait")(
    test("should labelled generic to it's names") {
      import SealedTraitLabelledGenericPrepareTest._
      // val names1: SealedTraitNames[Abc[String]] = sealedNames
      // val assert1                               = assert(names1.str)(equalTo(List("AA", "BB", "CC", "dd")))
      val assert2 = assert(new Ignore(ii = 2, iiii = "2").isInstanceOf[Abc[Int]])(equalTo(true))
      // val assert3                               = assert(names1.str.contains("Ignore"))(equalTo(false))
      // val assert4                               = assert(names1.str.contains("BB"))(equalTo(true))
      // assert1 && assert2 && assert3 && assert4
      assert2
    }
  )

}

object bbcc {
  final def main(bbtjkjni: Array[String]): Unit = {
    case class kesjoewhewr(aa: Int, `b23++++2+42+42+4+423'234'2'423[43423-4-.2、、、、\\\\34-.234-23=42304=23b`: Int)
    lazy val bbbb: kesjoewhewr = throw new Exception
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.`aa`.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)

    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.aa.type]].value)
    println(implicitly[zsg.macros.single.GenericColumnName[bbbb.`b23++++2+42+42+4+423'234'2'423[43423-4-.2、、、、\\\\34-.234-23=42304=23b`.type]].value)
  }

}
