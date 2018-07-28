package net.scalax.asuna.core

import net.scalax.asuna.circe.{ CirceAsunaEncoder, EmptyCirceTable }
import net.scalax.asuna.helper.encoder.ForTableInput

trait AsunaEncoderContent[D, TargetType] {
  type DataType = D
  val asunaEncoderOpt: Option[ForTableInput[EmptyCirceTable, DataType, CirceAsunaEncoder]]
}