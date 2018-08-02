package net.scalax.asuna.circe.another

import io.circe.{ Encoder, Json }
import net.scalax.asuna.circe.aaaa.{ CirceAsunaEncoder, CirceAsunaEncoderImpl }
import net.scalax.asuna.circe.{ EmptyCirceTable, asunaCirceImpl }
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.ForTableInput

trait Abcdef[Data] {
  type Out
  val out: Out
}

object Abcdef {

  type Aux[D, T] = Abcdef[D] { type Out = T }

  /*implicit def eriosjgiserhtieshtehrt[D, Out](implicit mColumnInfo: MacroColumnInfo, asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder]): Aux[Placeholder[D], EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder]] = {
    def asunaInputTableToShape(proName: String, asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName + "2222"
          override def write(data: D): Json = {
            import io.circe.syntax._
            asunaCirceImpl.effect(asunaEncoder.input(EmptyCirceTable.value)).write(data).asJson
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
      }
    }
    new Abcdef[Placeholder[D]] {
      override type Out = EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder]
      override val out = asunaInputTableToShape(mColumnInfo.modelColumnName, asunaEncoder)
    }
  }*/

}

trait sdffhnesrhnrferjkhfuidheuirhuierhtuierghbtuirt {

  /*implicit def columnEncoderWithPropertyNamedfdsrgrhgdrthdrthtdfhfdtyht[D, Out](implicit mColumnInfo: MacroColumnInfo, enckeif: CirceEncoderConfirmOrder[D]): Abcdef.Aux[Placeholder[D], EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder]] = {
    def exsistingCirceEncoderToShape(proName: String, circeEncoder: Encoder[D]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName + "1111"
          override def write(data: D): Json = circeEncoder(data)
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))

        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
      }
    }

    def asunaInputTableToShape(proName: String, asunaEncoder: ForTableInput[EmptyCirceTable, D, CirceAsunaEncoder]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
      new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
        override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
          override val key = proName + "2222"
          override def write(data: D): Json = {
            import io.circe.syntax._
            asunaCirceImpl.effect(asunaEncoder.input(EmptyCirceTable.value)).write(data).asJson
          }
        }
        override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
        override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
      }
    }
    val value = (enckeif.encoderOpt, enckeif.inputTableOpt) match {
      case (Some(encoder), None) => exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, encoder)
      case (None, Some(inputTable)) => asunaInputTableToShape(mColumnInfo.modelColumnName, inputTable)
      //case n1: CirceEncoderContent[D] => exsistingCirceEncoderToShape(mColumnInfo.modelColumnName, n1.circeEncoder)
      //case n2: AsunaEncoderContent[D] => asunaInputTableToShape(mColumnInfo.modelColumnName, n2.asunaEncoder)
    }
    new Abcdef[Placeholder[D]] {
      override type Out = EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder]
      override val out = value
    }
  }*/

}