package zsg.test.macros.case_class_test

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object CaseClassLabelledGenericMacroGenTest extends DefaultRunnableSpec {

  override def spec = suite("A case class")(
    test("should labelled generic to a encoder") {
      import CaseClassLabelledGenericMacroGenPrepareTest._
      val str1 = fooEncoder.mToString(fooValue)
      val str2 = fooEncoder2.mToString(fooValue)

      val assert1 = assert(str1)(equalTo(prepareResult(fooValue)))
      val assert2 = assert(str2)(equalTo(prepareResult(fooValue)))
      val assert3 = assert(str1)(equalTo(str2))
      assert1 && assert2 && assert3
    }
  )

}
