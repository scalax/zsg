package org.scalax.asuna.mapper.test

trait Poly1 extends CircePoly[(Poly1, Poly2)] {

  implicit def implicit2: CirceEncoder[Test02]  = EncoderTest.implicitEncoder
  implicit def implicit4: CirceEncoder[Test04]  = EncoderTest.implicitEncoder
  implicit def implicit8: CirceEncoder[Test08]  = EncoderTest.implicitEncoder
  implicit def implicit10: CirceEncoder[Test10] = EncoderTest.implicitEncoder

  implicit def implicit6: CirceEncoder[Test06]    = EncoderTest.implicitEncoder
  implicit def implicit_d_6: CirceDecoder[Test06] = DecoderTest.implicitDecoder

}

object Poly1 extends Poly1

trait Poly2 extends CircePoly[(Poly1, Poly2)] {

  implicit def implicit2: CirceDecoder[Test02]  = DecoderTest.implicitDecoder
  implicit def implicit3: CirceDecoder[Test03]  = DecoderTest.implicitDecoder
  implicit def implicit5: CirceDecoder[Test05]  = DecoderTest.implicitDecoder
  implicit def implicit9: CirceDecoder[Test09]  = DecoderTest.implicitDecoder
  implicit def implicit11: CirceDecoder[Test11] = DecoderTest.implicitDecoder

  implicit def implicit7: CirceDecoder[Test07] = DecoderTest.implicitDecoder

  implicit def implicit_e_7: CirceEncoder[Test07] = EncoderTest.implicitEncoder

}

object Poly2 extends Poly2

object Json1 extends CircePolyGetter[(Poly1, Poly2)]

object Runner extends App {

  val i1 = Json1.toJson(Test02("test02", 123))
  println("message1:" + i1.noSpaces)
  val i2 = Json1.fromJson[Test02](i1)
  println("message2:" + i2)

  val i3 = Json1.toJson(Test06("test06", 123, Option(Test07("test07", 789, List(Test06("test06", 456, Option.empty))))))
  println("message3:" + i3.noSpaces)
  val i4 = Json1.fromJson[Test07](io.circe.parser.parse("""{"i3":"test07","i4":123,"gf":[]}""").right.get)
  println("message4:" + i4)

  //Json1.toJson(Test03("Test03", 1234)) //not compiled

}
