package zsg.macros.rep_encoder_test

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object MutiplyClassGenericTest extends DefaultRunnableSpec {

  override def spec = suite("Rep Mapper")(
    test("should map mutiply class") {
      import MutiplyClassGenericPrepareTest._

      val linkModel = link[InstanceModel].encoder(model)

      linkModel.i2: Long
      linkModel.i1.i1: String
      linkModel.i1.i2: List[String]

      val assert1 = assert(linkModel.i2)(equalTo(mmm.ef))
      val assert2 = assert(linkModel.i2)(equalTo(model.obj.mmmab.ef))
      val assert3 = assert(linkModel.i1.i1)(equalTo(model.ab))
      val assert4 = assert(linkModel.i1.i2)(equalTo(model.obj.cd))
      val assert5 = !assert(linkModel.i1.i1: Any)(equalTo(model.obj.ab: Any))
      assert1 && assert2 && assert3 && assert4 && assert5
    }
  )

}
