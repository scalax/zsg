package net.scalax.asuna.implements.circe.abc

import io.circe.{Encoder, Json, JsonObject}
import net.scalax.asuna.LazyImplicit
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import net.scalax.asuna.mapper.common.SingleRepContent
import net.scalax.asuna.mapper.encoder._

trait CirceAsunaEncoder {
  type DataType
  def write: Encoder[DataType]
  val key: String
}

trait CirceAsunaEncoderImpl[T] extends CirceAsunaEncoder {
  override type DataType = T
}

trait CirceHelper {

  trait CirceContent[Out, Data] extends EncoderContent[Out, Data] {

    def write: Encoder[Data]

  }

  object circe extends EncoderWrapperHelper[List[CirceAsunaEncoder], List[(String, Json)], CirceContent] {
    override def effect[Rep, D, Out](
        rep: Rep
    )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder], List[(String, Json)]]): CirceContent[Out, D] = {
      lazy val wrapRep = shape.wrapRep(rep)
      new CirceContent[Out, D] {
        override def write: Encoder[D] = Encoder.instance { data: D =>
          Json.fromJsonObject(JsonObject.fromIterable(shape.buildData(data, wrapRep, List.empty)))
        }
      }
    }
  }

  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder[T], T], T, CirceAsunaEncoderImpl[T], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Placeholder[T], T], List[CirceAsunaEncoder], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[T]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder[T], T]): CirceAsunaEncoderImpl[T] = {
        val base1 = base
        new CirceAsunaEncoderImpl[T] {
          override lazy val write = encoder.value
          override val key        = base1.columnInfo.singleModelName
        }
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
          override lazy val write = base1.rep
          override val key        = base1.columnInfo.singleModelName
        }
      }

      override def buildRep(base: CirceAsunaEncoderImpl[T], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep

      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T], oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep.key, rep.write(data))) :: oldData
    }
  }

  def optionEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder], List[(String, Json)]]): Encoder[Option[T]] = {
    implicit val e1 = circe.effect(sv).write
    implicitly[Encoder[Option[T]]]
  }

  def listEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder], List[(String, Json)]]): Encoder[List[T]] = {
    implicit val e1 = circe.effect(sv).write
    implicitly[Encoder[List[T]]]
  }

  def commonEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder], List[(String, Json)]]): Encoder[T] = {
    circe.effect(sv).write
  }

}
