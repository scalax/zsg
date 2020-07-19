package zsg.testkit.circe.test1

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class AsunaWithCirceEncoderTest extends AnyFunSpec with Matchers {

  describe("zsg encoder") {

    it("generic the same case class json object as circe") {
      ZsgCirceModel.i1Json shouldBe CirceModel.i1Json
      ZsgCirceModel.i2Json shouldBe CirceModel.i2Json
      ZsgCirceModel.i3Json shouldBe CirceModel.i3Json

      ZsgCirceModel.i1Json.noSpaces shouldBe CirceModel.i1Json.noSpaces
      ZsgCirceModel.i2Json.noSpaces shouldBe CirceModel.i2Json.noSpaces
      ZsgCirceModel.i3Json.noSpaces shouldBe CirceModel.i3Json.noSpaces
    }

    it("generic the same sealed trait json object as circe") {
      ZsgCirceModel.i6Json shouldBe CirceModel.i6Json
      ZsgCirceModel.i7Json shouldBe CirceModel.i7Json
      ZsgCirceModel.i8Json shouldBe CirceModel.i8Json
      ZsgCirceModel.i9Json shouldBe CirceModel.i9Json

      ZsgCirceModel.i6Json.noSpaces shouldBe CirceModel.i6Json.noSpaces
      ZsgCirceModel.i7Json.noSpaces shouldBe CirceModel.i7Json.noSpaces
      ZsgCirceModel.i8Json.noSpaces shouldBe CirceModel.i8Json.noSpaces
      ZsgCirceModel.i9Json.noSpaces shouldBe CirceModel.i9Json.noSpaces
    }

  }

}
