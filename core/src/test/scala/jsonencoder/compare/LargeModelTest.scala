package org.scalax.asuna.mapper.test

import io.circe.{Decoder, Encoder}
import io.circe.syntax._
import org.scalax.asuna.mapper.append.ShapelessTest

object LargeModelTest extends App {

  val a1 = {

    import CircePoly._

    implicit lazy val largeModel_1_en: Encoder.AsObject[CirceLargeModel.LargeModel_1] = EncoderTest.implicitEncoder
    implicit lazy val largeModel_2_en: Encoder.AsObject[CirceLargeModel.LargeModel_2] = EncoderTest.implicitEncoder

    implicit lazy val largeModel_1_de: Decoder[CirceLargeModel.LargeModel_1]          = DecoderTest.implicitDecoder
    implicit lazy val largeModel_2_de: Decoder[CirceLargeModel.LargeModel_2]          = DecoderTest.implicitDecoder

    val i1 = CirceLargeModel.largeModel_2.asJson
    val i2 = i1.as[CirceLargeModel.LargeModel_2]

    println(i1.noSpaces)
    println("==================== line ====================")
    println(i2)

  }

  /*val a2 = {

    import ShapelessTest.EncodeImplicit._
    implicit lazy val largeModel_1_en: Encoder.AsObject[CirceLargeModel.LargeModel_1] = ShapelessTest.EncodeImplicit.encodeGeneric
    implicit lazy val largeModel_2_en: Encoder.AsObject[CirceLargeModel.LargeModel_2] = ShapelessTest.EncodeImplicit.encodeGeneric

    val i1 = CirceLargeModel.largeModel_2.asJson
    println("==================== line ====================")

    println(i1.noSpaces)

  }*/

}
