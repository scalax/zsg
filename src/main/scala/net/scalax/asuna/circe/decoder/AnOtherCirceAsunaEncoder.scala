package net.scalax.asuna.circe.another

import io.circe.{Decoder, Encoder}
import net.scalax.asuna.circe.aaaa.CirceAsunaEncoderImpl
import net.scalax.asuna.core.common.Placeholder
import shapeless.Lazy

sealed trait DecoderContentAbs[Rep, D] {
  type RepOut
}

trait CirceDecoderContent[D] extends DecoderContentAbs[Placeholder[D], D] {
  val circeDecoder: Decoder[D]
}

trait AsunaDecoderContent[D] extends DecoderContentAbs[Placeholder[D], D] {
  //val asunaEncoder: ForTableInput[EmptyCirceTable, D, List[CirceAsunaEncoder], List[(String, Json)]]
}

object DecoderContentAbs extends AsunaCirceEncoderContentImplicit {

  type Aux[Rep, D, RO] = DecoderContentAbs[Rep, D] { type RepOut = RO }

  implicit def circeEncoder[D](implicit encoder: Lazy[Encoder[D]]): EncoderContentAbs.Aux[Placeholder[D], D, CirceAsunaEncoderImpl[D]] = {
    val encoder1 = encoder.value
    object impl extends CirceEncoderContent[D] {
      override type RepOut = CirceAsunaEncoderImpl[D]
      override val circeEncoder = encoder1
    }
    impl
  }

}

trait AsunaCirceDecoderContentImplicit {

  /*implicit def asunaEncoder[D](implicit aeo: ForTableInput[EmptyCirceTable, D, List[CirceAsunaEncoder], List[(String, Json)]]): EncoderContentAbs.Aux[Placeholder[D], D, CirceAsunaEncoderImpl[D]] = {
    object impl extends AsunaEncoderContent[D] {
      override type RepOut = CirceAsunaEncoderImpl[D]
      override val asunaEncoder = aeo
    }
    impl
  }*/

}
