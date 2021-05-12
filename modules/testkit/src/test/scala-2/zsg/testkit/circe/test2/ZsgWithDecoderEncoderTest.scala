package zsg.testkit.circe.test2

import zsg.testkit.model._

import zio.console._
import zio.test._
import zio.test.Assertion._
import zio.test.environment._

object ZsgWithDecoderEncoderTest extends DefaultRunnableSpec {

  override def spec = suite("zsg encoder")(
    test("generic the same json object as circe") {
      val assert1 = assert(ZsgCirceModel.i1_1FromJson)(equalTo(CirceModel.i1_1FromJson))
      val assert2 = assert(ZsgCirceModel.i1_2FromJson)(equalTo(CirceModel.i1_2FromJson))

      val assert3 = assert(ZsgCirceModel.i1_1FromJson.isRight)(equalTo(false))
      val assert4 = assert(ZsgCirceModel.i1_2FromJson.isRight)(equalTo(true))
      val assert5 = assert(CirceModel.i1_1FromJson.isRight)(equalTo(false))
      val assert6 = assert(CirceModel.i1_2FromJson.isRight)(equalTo(true))

      val assert7 = assert(ZsgCirceModel.i2FromJson)(equalTo(CirceModel.i2FromJson))
      val assert8 = assert(ZsgCirceModel.i3FromJson)(equalTo(CirceModel.i3FromJson))

      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7 && assert8
    },
    test("generic the same sealed trait json object as circe") {
      val assert1 = assert(ZsgCirceModel.i6FromJson.isRight)(equalTo(true))
      val assert2 = assert(ZsgCirceModel.i7FromJson.isRight)(equalTo(true))
      val assert3 = assert(ZsgCirceModel.i8FromJson.isRight)(equalTo(true))
      val assert4 = assert(ZsgCirceModel.i9FromJson.isRight)(equalTo(true))

      val assert5 = assert(CirceModel.i6FromJson.isRight)(equalTo(true))
      val assert6 = assert(CirceModel.i7FromJson.isRight)(equalTo(true))
      val assert7 = assert(CirceModel.i8FromJson.isRight)(equalTo(true))
      val assert8 = assert(CirceModel.i9FromJson.isRight)(equalTo(true))

      val assert9  = assert(ZsgCirceModel.i6FromJson)(equalTo(CirceModel.i6FromJson))
      val assert10 = assert(ZsgCirceModel.i7FromJson)(equalTo(CirceModel.i7FromJson))
      val assert11 = assert(ZsgCirceModel.i8FromJson)(equalTo(CirceModel.i8FromJson))
      val assert12 = assert(ZsgCirceModel.i9FromJson)(equalTo(CirceModel.i9FromJson))

      val assert13 =
        assert(ZsgCirceModel.i6FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test06[_]])(equalTo(true))
      val assert14 =
        assert(ZsgCirceModel.i7FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test07[_]])(equalTo(true))
      val assert15 =
        assert(ZsgCirceModel.i8FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test08])(equalTo(true))
      val assert16 =
        assert(ZsgCirceModel.i9FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test09.type])(equalTo(true))

      val assert17 =
        assert(ZsgCirceModel.i6FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]])(equalTo(true))
      val assert18 =
        assert(ZsgCirceModel.i7FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]])(equalTo(true))
      val assert19 =
        assert(ZsgCirceModel.i8FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]])(equalTo(true))
      val assert20 =
        assert(ZsgCirceModel.i9FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]])(equalTo(true))

      assert1 && assert2 && assert3 && assert4 && assert5 && assert6 && assert7 && assert8 && assert9 && assert10 && assert11 && assert12 && assert13 && assert14 && assert15 && assert16 && assert17 && assert18 && assert19 && assert20
    }
  )

}
