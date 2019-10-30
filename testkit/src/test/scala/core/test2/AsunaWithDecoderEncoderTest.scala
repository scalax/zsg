package asuna.test.circe.test2

import asuna.test.model._
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class AsunaWithDecoderEncoderTest extends AnyFunSpec with Matchers {

  describe("asuna encoder") {
    it("generic the same json object as circe") {
      Asuna.i1_1FromJson shouldBe Circe.i1_1FromJson
      Asuna.i1_2FromJson shouldBe Circe.i1_2FromJson

      Asuna.i1_1FromJson.isRight shouldBe false
      Asuna.i1_2FromJson.isRight shouldBe true
      Circe.i1_1FromJson.isRight shouldBe false
      Circe.i1_2FromJson.isRight shouldBe true

      Asuna.i2FromJson shouldBe Circe.i2FromJson
      Asuna.i3FromJson shouldBe Circe.i3FromJson
    }

    it("generic the same sealed trait json object as circe") {
      Asuna.i6FromJson.isRight shouldBe true
      Asuna.i7FromJson.isRight shouldBe true
      Asuna.i8FromJson.isRight shouldBe true
      Asuna.i9FromJson.isRight shouldBe true

      Circe.i6FromJson.isRight shouldBe true
      Circe.i7FromJson.isRight shouldBe true
      Circe.i8FromJson.isRight shouldBe true
      Circe.i9FromJson.isRight shouldBe true

      Asuna.i6FromJson shouldBe Circe.i6FromJson
      Asuna.i7FromJson shouldBe Circe.i7FromJson
      Asuna.i8FromJson shouldBe Circe.i8FromJson
      Asuna.i9FromJson shouldBe Circe.i9FromJson

      Asuna.i6FromJson.right.get.isInstanceOf[Test06[_]] shouldBe true
      Asuna.i7FromJson.right.get.isInstanceOf[Test07[_]] shouldBe true
      Asuna.i8FromJson.right.get.isInstanceOf[Test08] shouldBe true
      Asuna.i9FromJson.right.get.isInstanceOf[Test09.type] shouldBe true

      Asuna.i6FromJson.right.get.isInstanceOf[Test05[_]] shouldBe true
      Asuna.i7FromJson.right.get.isInstanceOf[Test05[_]] shouldBe true
      Asuna.i8FromJson.right.get.isInstanceOf[Test05[_]] shouldBe true
      Asuna.i9FromJson.right.get.isInstanceOf[Test05[_]] shouldBe true
    }
  }

}
