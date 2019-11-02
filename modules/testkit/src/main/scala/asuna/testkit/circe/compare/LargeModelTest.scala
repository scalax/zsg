package asuna.testkit.circe

import asuna.testkit.model.LargeModel
import io.circe.{Decoder, Encoder}
import io.circe.syntax._

object LargeModelTest extends App {

  val a1 = {

    import asuna.testkit.circe.encoder.EncoderCircePoly._

    implicit lazy val largeModel_1_en: Encoder.AsObject[LargeModel.LargeModel_1] = ACirce.encodeCaseClass
    implicit lazy val largeModel_2_en: Encoder.AsObject[LargeModel.LargeModel_2] = ACirce.encodeCaseClass
    val i1                                                                       = LargeModel.largeModel_2.asJson
    println(i1.noSpaces)

    println("==================== line ====================")

    /*implicit lazy val largeModel_1_de: Decoder[LargeModel.LargeModel_1] = AsunaCirceDecoder.decoder
    implicit lazy val largeModel_2_de: Decoder[LargeModel.LargeModel_2] = AsunaCirceDecoder.decoder
    val i2                                                                   = i1.as[LargeModel.LargeModel_2]
    println(i2)*/

  }

  /*val a2 = {

    import upickle.default._
    import upickle.default.{ReadWriter => RW, macroRW}

    implicit lazy val largeModel_1_en: RW[LargeModel.LargeModel_1] = macroRW
    implicit lazy val largeModel_2_en: RW[LargeModel.LargeModel_2] = macroRW
    println("==================== upickle line ====================")
    val i1 = write(LargeModel.largeModel_1)
    println(i1)
    val i2 = read[LargeModel.LargeModel_1](ujson.Readable.fromString(i1))
    println(i2)

  }*/

  /*val a3 = {

    import ShapelessEncoderTest._
    implicit def largeModel_1_en: Encoder.AsObject[LargeModel.LargeModel_1] = ShapelessEncoderTest.encodeGeneric
    implicit def largeModel_2_en: Encoder.AsObject[LargeModel.LargeModel_2] = ShapelessEncoderTest.encodeGeneric

    println("==================== line ====================")

    val i1 = LargeModel.largeModel_2.asJson
    println(i1.noSpaces)

  }*/

  /*val a4 = {

    import io.circe.generic.semiauto._
    implicit def largeModel_1_en: Encoder.AsObject[LargeModel.LargeModel_1] = deriveEncoder
    implicit def largeModel_2_en: Encoder.AsObject[LargeModel.LargeModel_2] = deriveEncoder

    println("==================== line ====================")

    val i1 = LargeModel.largeModel_2.asJson
    println(i1.noSpaces)

  }*/

  /*val a5 = {

    import io.circe.derivation._
    implicit def largeModel_1_en: Encoder.AsObject[LargeModel.LargeModel_1] = deriveEncoder
    implicit def largeModel_2_en: Encoder.AsObject[LargeModel.LargeModel_2] = deriveEncoder

    println("==================== line ====================")

    val i1 = LargeModel.largeModel_2.asJson

    println(i1.noSpaces)

  }*/

}
