package net.scalax.asuna.circe.another

import io.circe.{ Encoder, Json }
import net.scalax.asuna.circe.EmptyCirceTable
import net.scalax.asuna.circe.aaaa.CirceAsunaEncoder
import net.scalax.asuna.helper.encoder.ForTableInput
import shapeless.Lazy

sealed trait EncoderContentAbs[D]

trait CirceEncoderContent[D] extends EncoderContentAbs[D] {
  val circeEncoder: Encoder[D]

}

trait AsunaEncoderContent[D] extends EncoderContentAbs[D] {
  val asunaEncoder: ForTableInput[EmptyCirceTable, D, List[CirceAsunaEncoder], List[(String, Json)]]

}

object EncoderContentAbs extends AsunaCirceEncoderContentImplicit {

  implicit def circeEncoder[D](implicit encoder: Lazy[Encoder[D]]): EncoderContentAbs[D] = {
    val encoder1 = encoder.value
    object impl extends CirceEncoderContent[D] {
      override val circeEncoder = encoder1
    }
    impl
  }

}

trait AsunaCirceEncoderContentImplicit {

  implicit def asunaEncoder[D](implicit aeo: Lazy[ForTableInput[EmptyCirceTable, D, List[CirceAsunaEncoder], List[(String, Json)]]]): EncoderContentAbs[D] = {
    object impl extends AsunaEncoderContent[D] {
      override val asunaEncoder = aeo.value
    }
    impl
  }

}