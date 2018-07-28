package net.scalax.asuna.circe

import io.circe.Encoder

trait CirceEncoderContent[D] {
  type TargetType
  val encoderOpt: Option[Encoder[D]]
}

object CirceEncoderContent extends AsunaCirceEncoderContentImplicit {

  type Aux[D, T] = CirceEncoderContent[D] { type TargetType = T }

  implicit def circeEncoder[D](implicit encoder: Encoder[D]): Aux[D, HaveCirceImplicit] = {
    val encoder1 = encoder
    object impl extends CirceEncoderContent[D] {
      override type TargetType = HaveCirceImplicit
      override val encoderOpt = Option(encoder1)
    }
    impl
  }

}

trait AsunaCirceEncoderContentImplicit {

  implicit def asunaEncoder[D]: CirceEncoderContent.Aux[D, UseAsunaImplicit] = {
    object impl extends CirceEncoderContent[D] {
      override type TargetType = UseAsunaImplicit
      override val encoderOpt = Option.empty
    }
    impl
  }

}