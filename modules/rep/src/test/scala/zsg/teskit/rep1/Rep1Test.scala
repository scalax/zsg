package zsg.testkit.rep1

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._
import zsg.RepMerge._

object Rep1Test extends DefaultRunnableSpec {
  import Rep1._

  override def spec = suite("Rep")(
    test("should auto lift in 1 meta model.") {
      val meta1 = routeMeta.merge(reverseBoolean).merge(description("iiiinnnn"))
      val meta2 = meta1.merge(description("bbbb"))
      val meta3 = meta2.merge(reverseBoolean)

      val assert5 = assert(takeOption[Description](meta3).get.description)(equalTo("iiiinnnn"))
      val assert6 = !assert(takeOption[BooleanModel](meta3))(equalTo(Option(new BooleanModel(true))))
      val assert7 = assert(takeOption[BooleanModel](meta3))(equalTo(Option.empty))

      assert5 && assert6 && assert7
    },
    test("should auto lift in 2 meta model.") {
      val meta1 = meta.merge(description("iiiinnnn"))
      val meta2 = meta1.merge(description("bbbb"))
      val meta3 = meta2.merge(reverseBoolean)

      val assert1 = assert(takeOption[Description](meta3).get.description)(equalTo("iiiinnnn"))

      assert1
    }
  )
}
