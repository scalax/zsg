package org.scalax.asuna.mapper.append

import io.circe._

object MacroTest2 {

  object mm {
    implicit lazy val kk111Encoder: ObjectEncoder[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1.toEncoder
    implicit lazy val kk112Encoder: ObjectEncoder[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1.toEncoder
  }

  /*object ll {
    implicit lazy val kk211Encoder: ObjectEncoder[MacroTest4.LargeModel]   = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel]].mm
    implicit lazy val kk212Encoder: ObjectEncoder[MacroTest4.LargeModel11] = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel11]].mm
  }*/

}
