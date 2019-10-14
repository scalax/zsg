package asuna.test.circe.test1

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class AsunaWithCirceEncoderTest extends AnyFunSpec with Matchers {

  describe("asuna encoder") {
    it ("generic the same json object as circe") {
      Asuna.i1Json shouldBe Circe.i1Json
      Asuna.i2Json shouldBe Circe.i2Json
      Asuna.i3Json shouldBe Circe.i3Json

      Asuna.i1Json.noSpaces shouldBe Circe.i1Json.noSpaces
      Asuna.i2Json.noSpaces shouldBe Circe.i2Json.noSpaces
      Asuna.i3Json.noSpaces shouldBe Circe.i3Json.noSpaces
    }
  }

}
