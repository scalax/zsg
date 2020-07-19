package zsg.testkit.circe.test2

import zsg.testkit.model._
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class AsunaWithDecoderEncoderTest extends AnyFunSpec with Matchers {

  describe("zsg encoder") {
    it("generic the same json object as circe") {
      ZsgModel.i1_1FromJson shouldBe CirceModel.i1_1FromJson
      ZsgModel.i1_2FromJson shouldBe CirceModel.i1_2FromJson

      ZsgModel.i1_1FromJson.isRight shouldBe false
      ZsgModel.i1_2FromJson.isRight shouldBe true
      CirceModel.i1_1FromJson.isRight shouldBe false
      CirceModel.i1_2FromJson.isRight shouldBe true

      ZsgModel.i2FromJson shouldBe CirceModel.i2FromJson
      ZsgModel.i3FromJson shouldBe CirceModel.i3FromJson
    }

    it("generic the same sealed trait json object as circe") {
      ZsgModel.i6FromJson.isRight shouldBe true
      ZsgModel.i7FromJson.isRight shouldBe true
      ZsgModel.i8FromJson.isRight shouldBe true
      ZsgModel.i9FromJson.isRight shouldBe true

      CirceModel.i6FromJson.isRight shouldBe true
      CirceModel.i7FromJson.isRight shouldBe true
      CirceModel.i8FromJson.isRight shouldBe true
      CirceModel.i9FromJson.isRight shouldBe true

      ZsgModel.i6FromJson shouldBe CirceModel.i6FromJson
      ZsgModel.i7FromJson shouldBe CirceModel.i7FromJson
      ZsgModel.i8FromJson shouldBe CirceModel.i8FromJson
      ZsgModel.i9FromJson shouldBe CirceModel.i9FromJson

      ZsgModel.i6FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test06[_]] shouldBe true
      ZsgModel.i7FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test07[_]] shouldBe true
      ZsgModel.i8FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test08] shouldBe true
      ZsgModel.i9FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test09.type] shouldBe true

      ZsgModel.i6FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
      ZsgModel.i7FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
      ZsgModel.i8FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
      ZsgModel.i9FromJson.right.getOrElse((throw new Exception()): Test05[String]).isInstanceOf[Test05[_]] shouldBe true
    }
  }

}
