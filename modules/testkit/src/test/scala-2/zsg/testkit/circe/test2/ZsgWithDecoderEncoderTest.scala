package zsg.testkit.circe.test2

import zsg.testkit.model._
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class ZsgWithDecoderEncoderTest extends AnyFunSpec with Matchers {

  describe("zsg encoder") {
    it("generic the same json object as circe") {
      ZsgCirceModel.i1_1FromJson shouldBe CirceModel.i1_1FromJson
      ZsgCirceModel.i1_2FromJson shouldBe CirceModel.i1_2FromJson

      ZsgCirceModel.i1_1FromJson.isRight shouldBe false
      ZsgCirceModel.i1_2FromJson.isRight shouldBe true
      CirceModel.i1_1FromJson.isRight shouldBe false
      CirceModel.i1_2FromJson.isRight shouldBe true

      ZsgCirceModel.i2FromJson shouldBe CirceModel.i2FromJson
      ZsgCirceModel.i3FromJson shouldBe CirceModel.i3FromJson
    }

    it("generic the same sealed trait json object as circe") {
      ZsgCirceModel.i6FromJson.isRight shouldBe true
      ZsgCirceModel.i7FromJson.isRight shouldBe true
      ZsgCirceModel.i8FromJson.isRight shouldBe true
      ZsgCirceModel.i9FromJson.isRight shouldBe true

      CirceModel.i6FromJson.isRight shouldBe true
      CirceModel.i7FromJson.isRight shouldBe true
      CirceModel.i8FromJson.isRight shouldBe true
      CirceModel.i9FromJson.isRight shouldBe true

      ZsgCirceModel.i6FromJson shouldBe CirceModel.i6FromJson
      ZsgCirceModel.i7FromJson shouldBe CirceModel.i7FromJson
      ZsgCirceModel.i8FromJson shouldBe CirceModel.i8FromJson
      ZsgCirceModel.i9FromJson shouldBe CirceModel.i9FromJson

      ZsgCirceModel.i6FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test06[_]] shouldBe true
      ZsgCirceModel.i7FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test07[_]] shouldBe true
      ZsgCirceModel.i8FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test08] shouldBe true
      ZsgCirceModel.i9FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test09.type] shouldBe true

      ZsgCirceModel.i6FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
      ZsgCirceModel.i7FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
      ZsgCirceModel.i8FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
      ZsgCirceModel.i9FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
    }
  }

}
