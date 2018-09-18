package net.scalax.asuna.circe.another

import io.circe.Encoder
import net.scalax.asuna.circe.aaaa.CirceAsunaEncoderImpl
import net.scalax.asuna.core.common.Placeholder
import shapeless.Lazy

sealed trait EncoderContentAbs[Rep, D] {
  type RepOut
}

trait CirceEncoderContent[D] extends EncoderContentAbs[Placeholder[D], D] {
  val circeEncoder: Encoder[D]
}

trait AsunaEncoderContent[D] extends EncoderContentAbs[Placeholder[D], D] {
  //val asunaEncoder: ForTableInput[EmptyCirceTable, D, List[CirceAsunaEncoder], List[(String, Json)]]
}

object EncoderContentAbs extends AsunaCirceEncoderContentImplicit {

  type Aux[Rep, D, RO] = EncoderContentAbs[Rep, D] { type RepOut = RO }

  implicit def circeEncoder[D](implicit encoder: Lazy[Encoder[D]]): EncoderContentAbs.Aux[Placeholder[D], D, CirceAsunaEncoderImpl[D]] = {
    val encoder1 = encoder.value
    object impl extends CirceEncoderContent[D] {
      override type RepOut = CirceAsunaEncoderImpl[D]
      override val circeEncoder = encoder1
    }
    impl
  }

}

trait AsunaCirceEncoderContentImplicit {

  /*implicit def asunaEncoder[D](implicit aeo: ForTableInput[EmptyCirceTable, D, List[CirceAsunaEncoder], List[(String, Json)]]): EncoderContentAbs.Aux[Placeholder[D], D, CirceAsunaEncoderImpl[D]] = {
    object impl extends AsunaEncoderContent[D] {
      override type RepOut = CirceAsunaEncoderImpl[D]
      override val asunaEncoder = aeo
    }
    impl
  }*/

}
