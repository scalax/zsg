package org.scalax.asuna.mapper.test

trait Poly1 extends CircePoly {

  type CirceEncoder[I] = EncoderContent[I, Poly1]

  implicit def implicit2: CirceEncoder[Test02]  = EncoderTest.implicitEncoder
  implicit def implicit4: CirceEncoder[Test04]  = EncoderTest.implicitEncoder
  implicit def implicit6: CirceEncoder[Test06]  = EncoderTest.implicitEncoder
  implicit def implicit8: CirceEncoder[Test08]  = EncoderTest.implicitEncoder
  implicit def implicit10: CirceEncoder[Test10] = EncoderTest.implicitEncoder

}

object Poly1 extends Poly1

trait Poly2 extends CircePoly {

  type CirceDecoder[T] = DecoderContent[T, Poly1]

  implicit def implicit2: CirceDecoder[Test02]  = DecoderTest.implicitDecoder
  implicit def implicit3: CirceDecoder[Test03]  = DecoderTest.implicitDecoder
  implicit def implicit5: CirceDecoder[Test05]  = DecoderTest.implicitDecoder
  implicit def implicit7: CirceDecoder[Test07]  = DecoderTest.implicitDecoder
  implicit def implicit9: CirceDecoder[Test09]  = DecoderTest.implicitDecoder
  implicit def implicit11: CirceDecoder[Test11] = DecoderTest.implicitDecoder

}

object Poly2 extends Poly2
