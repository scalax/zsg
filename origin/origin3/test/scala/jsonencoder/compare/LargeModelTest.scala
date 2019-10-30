package org.scalax.asuna.mapper.test

import io.circe.{Decoder, Encoder}
import io.circe.syntax._

object LargeModelTest extends App {

  trait LargeModelPoly   {

    import CircePoly._

    implicit lazy val largeModel_1_en: Encoder[CirceLargeModel.LargeModel_1] = EncoderTest.implicitEncoder
    implicit lazy val largeModel_2_en: Encoder[CirceLargeModel.LargeModel_2] = EncoderTest.implicitEncoder
    implicit lazy val largeModel_1_de: Decoder[CirceLargeModel.LargeModel_1] = DecoderTest.implicitDecoder
    implicit lazy val largeModel_2_de: Decoder[CirceLargeModel.LargeModel_2] = DecoderTest.implicitDecoder

  }

  object LargeModelPoly extends LargeModelPoly

  import LargeModelPoly._

  val i1 = CirceLargeModel.largeModel_2.asJson
  val i2 = i1.as[CirceLargeModel.LargeModel_2]

  println(i1.noSpaces)
  println("==================== line ====================")
  println(i2)

}
