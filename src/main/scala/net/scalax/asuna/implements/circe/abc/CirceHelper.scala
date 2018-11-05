package net.scalax.asuna.implements.circe.abc

import io.circe.{Encoder, Json, JsonObject}
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import net.scalax.asuna.mapper.common.SingleRepContent
import net.scalax.asuna.mapper.encoder._

trait CirceAsunaEncoder {
  type DataType
  def write(data: DataType): Json
  val key: String
}

trait CirceAsunaEncoderImpl[T] extends CirceAsunaEncoder {
  override type DataType = T
}

trait CirceHelper {

  trait CirceContent[Out, Data] extends EncoderContent[Out, Data] {

    def write(data: Data): JsonObject

  }

  object circe extends EncoderWrapperHelper[List[CirceAsunaEncoder], List[(String, Json)], CirceContent] {
    override def effect[Rep, D, Out](rep: Rep)(
      implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder], List[(String, Json)]]): CirceContent[Out, D] = {
      val wrapRep = shape.wrapRep(rep)
      new CirceContent[Out, D] {
        override def write(data: D): JsonObject = JsonObject.fromIterable(shape.buildData(data, wrapRep, List.empty))
      }
    }
  }

  implicit def implicit1[T](implicit encoder: Encoder[T])
    : EncoderShape.Aux[SingleRepContent[Placeholder[T], T], T, CirceAsunaEncoderImpl[T], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Placeholder[T], T], List[CirceAsunaEncoder], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[T]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder[T], T]): CirceAsunaEncoderImpl[T] = new CirceAsunaEncoderImpl[T] {
        override def write(data: T): Json = encoder(data)
        override val key                  = base.columnInfo.singleModelSymbol.name
      }
      override def buildRep(base: CirceAsunaEncoderImpl[T], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep
      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T], oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep.key, rep.write(data))) :: oldData
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Encoder[T], T], T, CirceAsunaEncoderImpl[T], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceAsunaEncoder], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[T]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): CirceAsunaEncoderImpl[T] = {
        val base1 = base
        new CirceAsunaEncoderImpl[T] {
          override def write(data: T): Json = base1.rep(data)
          override val key                  = base1.columnInfo.singleModelSymbol.name
        }
      }

      override def buildRep(base: CirceAsunaEncoderImpl[T], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep

      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T], oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep.key, rep.write(data))) :: oldData
    }
  }

  def optionEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder], List[(String, Json)]]): Encoder[Option[T]] = {
    implicit val e1 = Encoder.instance { data: T =>
      Json.fromJsonObject(circe.effect(sv).write(data))
    }
    implicitly[Encoder[Option[T]]]
  }

  def listEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder], List[(String, Json)]]): Encoder[List[T]] = {
    implicit val e1 = Encoder.instance { data: T =>
      Json.fromJsonObject(circe.effect(sv).write(data))
    }
    implicitly[Encoder[List[T]]]
  }

  def commonEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder], List[(String, Json)]]): Encoder[T] = {
    Encoder.instance { data: T =>
      Json.fromJsonObject(circe.effect(sv).write(data))
    }
  }

}
