package org.scalax.asuna.mapper.test

import io.circe.syntax._

object MacroTest2 extends App {

  trait miaomiaomiao extends CircePoly {

    type MEncoder[T] = EncoderContent[T, miaomiaomiao]

    implicit lazy val kk111Encoder: MEncoder[CirceLargeModel.LargeModel_1] = EncoderTest.implicitEncoder
    implicit lazy val kk112Encoder: MEncoder[CirceLargeModel.LargeModel_2] = EncoderTest.implicitEncoder

    def jsonString: String = CirceLargeModel.largeModel_2.asJson.noSpaces
    /*def iiiiiiiiii: Either[Error, MacroTest4.LargeModel] = io.circe.parser.parse(miaomiaomiao.iiiiiiii).right.flatMap(_.as[MacroTest4.LargeModel])*/

  }

  object miaomiaomiao extends miaomiaomiao

  println(miaomiaomiao.jsonString)

  /*println(miaomiaomiao.iiiiiiii)
  println(miaomiaomiao.iiiiiiiiii)*/

}
