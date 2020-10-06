package zsg.testkit.circe.test1

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object ZsgWithCirceEncoderTest extends DefaultRunnableSpec {

  def spec = suite("zsg encoder")(
    test("generic the same case class json object as circe") {
      val assert1 = assert(ZsgCirceModel.i1Json)(equalTo(CirceModel.i1Json))
      val assert2 = assert(ZsgCirceModel.i2Json)(equalTo(CirceModel.i2Json))
      val assert3 = assert(ZsgCirceModel.i3Json)(equalTo(CirceModel.i3Json))

      val assert4 = assert(ZsgCirceModel.i1Json.noSpaces)(equalTo(CirceModel.i1Json.noSpaces))
      val assert5 = assert(ZsgCirceModel.i2Json.noSpaces)(equalTo(CirceModel.i2Json.noSpaces))
      val assert6 = assert(ZsgCirceModel.i3Json.noSpaces)(equalTo(CirceModel.i3Json.noSpaces))
      assert1 && assert2 && assert3 && assert4 && assert5 && assert6
    },
    test("generic the same sealed trait json object as circe") {
      val assert1 = assert(ZsgCirceModel.i6Json)(equalTo(CirceModel.i6Json))
      val assert2 = assert(ZsgCirceModel.i7Json)(equalTo(CirceModel.i7Json))
      val assert3 = assert(ZsgCirceModel.i8Json)(equalTo(CirceModel.i8Json))
      val assert4 = assert(ZsgCirceModel.i9Json)(equalTo(CirceModel.i9Json))

      val assert5 = assert(ZsgCirceModel.i6Json.noSpaces)(equalTo(CirceModel.i6Json.noSpaces))
      val assert6 = assert(ZsgCirceModel.i7Json.noSpaces)(equalTo(CirceModel.i7Json.noSpaces))
      val assert7 = assert(ZsgCirceModel.i8Json.noSpaces)(equalTo(CirceModel.i8Json.noSpaces))
      val assert8 = assert(ZsgCirceModel.i9Json.noSpaces)(equalTo(CirceModel.i9Json.noSpaces))
      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7 && assert8
    }
  )

}
