package asuna.test.circe.test2

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class AsunaWithDecoderEncoderTest extends AnyFunSpec with Matchers {

  describe("asuna encoder") {
    it ("generic the same json object as circe") {
      Asuna.i1_1Json shouldBe Circe.i1_1Json
      Asuna.i1_2Json shouldBe Circe.i1_2Json

      Asuna.i1_1Json.isRight shouldBe false
      Asuna.i1_2Json.isRight shouldBe true
      Circe.i1_1Json.isRight shouldBe false
      Circe.i1_2Json.isRight shouldBe true

      Asuna.i2Json shouldBe Circe.i2Json
      Asuna.i3Json shouldBe Circe.i3Json
    }
  }

}
