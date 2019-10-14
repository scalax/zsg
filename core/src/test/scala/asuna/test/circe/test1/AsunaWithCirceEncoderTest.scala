package asuna.test.circe.test1

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class AsunaWithCirceEncoderTest extends AnyFunSpec with Matchers {

  describe("asuna encoder") {

    it("generic the same case class json object as circe") {
      Asuna.i1Json shouldBe Circe.i1Json
      Asuna.i2Json shouldBe Circe.i2Json
      Asuna.i3Json shouldBe Circe.i3Json

      Asuna.i1Json.noSpaces shouldBe Circe.i1Json.noSpaces
      Asuna.i2Json.noSpaces shouldBe Circe.i2Json.noSpaces
      Asuna.i3Json.noSpaces shouldBe Circe.i3Json.noSpaces
    }

    it("generic the same sealed trait json object as circe") {
      Asuna.i6Json shouldBe Circe.i6Json
      Asuna.i7Json shouldBe Circe.i7Json
      Asuna.i8Json shouldBe Circe.i8Json
      Asuna.i9Json shouldBe Circe.i9Json

      Asuna.i6Json.noSpaces shouldBe Circe.i6Json.noSpaces
      Asuna.i7Json.noSpaces shouldBe Circe.i7Json.noSpaces
      Asuna.i8Json.noSpaces shouldBe Circe.i8Json.noSpaces
      Asuna.i9Json.noSpaces shouldBe Circe.i9Json.noSpaces
    }

  }

}
