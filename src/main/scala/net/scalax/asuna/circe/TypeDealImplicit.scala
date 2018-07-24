package net.scalax.asuna.circe

import net.scalax.asuna.core.AsunaEncoderContent
import net.scalax.asuna.helper.encoder.ForTableInput

trait HaveCirceImplicit

object HaveCirceImplicit {
  implicit def haveCirceImplicitImplicit[D]: AsunaEncoderContent[D, HaveCirceImplicit] = {
    new AsunaEncoderContent[D, HaveCirceImplicit] {
      override val asunaEncoderOpt = Option.empty
    }
  }
}

trait UseAsunaImplicit

object UseAsunaImplicit {
  implicit def useAsunaImplicitImplicit[D](implicit target: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder]): AsunaEncoderContent[D, UseAsunaImplicit] = {
    new AsunaEncoderContent[D, UseAsunaImplicit] {
      override val asunaEncoderOpt = target match {
        case _: HaveCirceImplicit => Option.empty
        case t: ForTableInput[EmptyCirceTable, DataType, CirceAsunaEncoder] => Option(t)
      }
    }
  }
}