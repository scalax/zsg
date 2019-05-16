package org.scalax.asuna.mapper.append.debug

import io.circe._
import io.circe.syntax._
import org.scalax.asuna.mapper.append.MacroTest4
import org.scalax.asuna.mapper.append.debug.MacroTest.IIII

object MacroTest2 extends App {

  /*object mm {
    implicit lazy val kk111Encoder: ObjectEncoder[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1.encoder
    implicit lazy val kk112Encoder: ObjectEncoder[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1.encoder

    implicit lazy val kk113Encoder: Decoder[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1.decoder
    implicit lazy val kk114Encoder: Decoder[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1.decoder
  }*/

  /*object miaomiaomiao {
    implicit def iiii[T](implicit ii: IIII[T]): ObjectEncoder[T] = ii.encoder
    implicit def iiiiii[T](implicit ii: IIII[T]): Decoder[T]     = ii.decoder

    implicit lazy val kk111Encoder: IIII[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1
    implicit lazy val kk112Encoder: IIII[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1

    def iiiiiiii: String                                 = MacroTest4.dd.asJson.noSpaces
    def iiiiiiiiii: Either[Error, MacroTest4.LargeModel] = io.circe.parser.parse(miaomiaomiao.iiiiiiii).right.flatMap(_.as[MacroTest4.LargeModel])
  }

  println(miaomiaomiao.iiiiiiii)
  println(miaomiaomiao.iiiiiiiiii)*/

  /*object ll {
    implicit lazy val kk211Encoder: ObjectEncoder[MacroTest4.LargeModel]   = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel]].mm
    implicit lazy val kk212Encoder: ObjectEncoder[MacroTest4.LargeModel11] = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel11]].mm
  }*/

  case class Abcccccc(ii: String, iibb: Int)

  MacroTest.kou[MacroTest4.LargeModel11].kou11.setter

}
