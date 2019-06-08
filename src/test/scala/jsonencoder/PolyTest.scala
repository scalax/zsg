package org.scalax.asuna.mapper.test

trait Poly1 extends CircePoly {

  type CirceEncoder[I] = EncoderContent[I, Poly1]

  implicit def implicit1: CirceEncoder[Test02] = EncoderTest.implicitEncoder

}

object Poly1 extends Poly1

trait Poly2 extends CircePoly {

  type CirceDecoder[T] = DecoderContent[T, Poly1]

  implicit def implicit1: CirceDecoder[Test02] = DecoderTest.implicitDecoder

}

object Poly2 extends Poly2
