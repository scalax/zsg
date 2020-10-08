package zsg.testkit.rep1

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object Rep1Test extends DefaultRunnableSpec {
  import Rep1._

  override def spec = suite("Rep")(
    test("should auto lift in 1 meta model.") {
      val meta1 = routeMeta.rep(reverseBoolean, description("iiiinnnn"))
      val meta2 = meta1.rep(description("bbbb"))
      val meta3 = meta2.rep(reverseBoolean)

      val assert1 = assert(routeMeta.rep1)(equalTo(StartRoute.value))
      val assert2 = assert(meta1.rep1.description)(equalTo("iiiinnnn"))
      val assert3 = assert(meta2.rep1.description)(equalTo("bbbb"))
      val assert4 = assert(meta3.rep1.description)(equalTo("bbbb"))

      val assert5 = assert(take[RouteModel](meta3).description)(equalTo("bbbb"))
      val assert6 = !assert(takeOption[BooleanModel](meta3))(equalTo(Option(new BooleanModel(true))))
      val assert7 = assert(takeOption[BooleanModel](meta3))(equalTo(Option.empty))

      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7
    },
    test("should auto lift in 2 meta model.") {
      val meta1 = meta.rep(reverseBoolean, description("iiiinnnn"))
      val meta2 = meta1.rep(description("bbbb"))
      val meta3 = meta2.rep(reverseBoolean)

      val assert1 = assert(meta1.rep1.description)(equalTo("iiiinnnn"))
      val assert2 = assert(meta1.rep2.isPrepared)(equalTo(!meta.rep2.isPrepared))

      val assert3 = assert(meta2.rep1.description)(equalTo("bbbb"))
      val assert4 = assert(meta2.rep2.isPrepared)(equalTo(!meta.rep2.isPrepared))

      val assert5 = assert(meta3.rep1.description)(equalTo("bbbb"))
      val assert6 = assert(meta3.rep2.isPrepared)(equalTo(meta.rep2.isPrepared))

      val assert7 = assert(take[RouteModel](meta3).description)(equalTo("bbbb"))

      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7
    }
  )
}
