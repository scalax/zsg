package org.scalax.asuna.mapper.test

import io.circe.{Decoder, Encoder}

trait Poly1 {

  import Poly2._
  import CircePoly._

  implicit def poly1Implicit2: Encoder.AsObject[Test02]  = EncoderTest.implicitEncoder
  implicit def poly1Implicit4: Encoder.AsObject[Test04]  = EncoderTest.implicitEncoder
  implicit def poly1Implicit8: Encoder.AsObject[Test08]  = EncoderTest.implicitEncoder
  implicit def poly1Implicit10: Encoder.AsObject[Test10] = EncoderTest.implicitEncoder

  implicit def poly1Implicit6: Encoder.AsObject[Test06] = EncoderTest.implicitEncoder
  implicit def poly1Implicit_d_6: Decoder[Test06]       = DecoderTest.implicitDecoder

}

object Poly1 extends Poly1

trait Poly2 {

  import Poly1._
  import CircePoly._

  implicit def poly2Implicit2: Decoder[Test02]  = DecoderTest.implicitDecoder
  implicit def poly2Implicit3: Decoder[Test03]  = DecoderTest.implicitDecoder
  implicit def poly2Implicit5: Decoder[Test05]  = DecoderTest.implicitDecoder
  implicit def poly2Implicit9: Decoder[Test09]  = DecoderTest.implicitDecoder
  implicit def poly2Implicit11: Decoder[Test11] = DecoderTest.implicitDecoder

  implicit def poly2Implicit7: Decoder[Test07] = DecoderTest.implicitDecoder

  implicit def poly2Implicit_e_7: Encoder.AsObject[Test07] = EncoderTest.implicitEncoder

}

object Poly2 extends Poly2

import io.circe.syntax._
object Runner extends App {

  import Poly1._
  import Poly2._

  val i1 = Test02("test02", 123).asJson
  println("message1:" + i1.noSpaces)
  val i2 = i1.as[Test02]
  println("message2:" + i2)

  val i3 = Test06("test06", 123, Option(Test07("test07", 789, List(Test06("test06", 456, Option.empty))))).asJson
  println("message3:" + i3.noSpaces)
  val i4 = io.circe.parser.parse("""{"i3":"test07","i4":123,"gf":[]}""").right.get.as[Test07]
  println("message4:" + i4)

  //Json1.toJson(Test03("Test03", 1234)) //not compiled

}
