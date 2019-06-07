package org.scalax.asuna.mapper.append.debug

import io.circe._
import org.scalax.asuna.mapper.append.{MacroTest3, MacroTest4}

object MacroTest1 extends App {

  /*object mm {
    implicit lazy val kk111Encoder: ObjectEncoder[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1.encoder
    implicit lazy val kk112Encoder: ObjectEncoder[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1.encoder

    implicit lazy val kk113Encoder: Decoder[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1.decoder
    implicit lazy val kk114Encoder: Decoder[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1.decoder
  }*/

  object ll {
    implicit lazy val kk211Encoder: ObjectEncoder[MacroTest4.LargeModel]   = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel]].mm
    implicit lazy val kk212Encoder: ObjectEncoder[MacroTest4.LargeModel11] = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel11]].mm
  }

}
