package net.scalax.asuna.implements.circe.abc

import io.circe.{Encoder, Json, JsonObject}
import net.scalax.asuna.LazyImplicit
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.mapper.common.SingleRepContent
import net.scalax.asuna.mapper.encoder._

trait CirceAsunaEncoder[Poly] {
  type DataType
  def write: Encoder[DataType]
  def key: String
}

trait CirceAsunaEncoderImpl[T, Poly] extends CirceAsunaEncoder[Poly] {
  override type DataType = T
}

trait CircePoly {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder[T], T], T, String, List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Placeholder[T], T], List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder[T], T]): String = base.columnInfo.singleModelName
      override def buildRep(base: String, oldRep: List[CirceAsunaEncoder[CircePoly]]): List[CirceAsunaEncoder[CircePoly]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: String, oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep, encoder.value(data))) :: oldData
    }
  }

  implicit def implicit2[T]
    : EncoderShape.Aux[SingleRepContent[Encoder[T], T], T, CirceAsunaEncoderImpl[T, CircePoly], List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[T, CircePoly]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): CirceAsunaEncoderImpl[T, CircePoly] = {
        val base1 = base
        new CirceAsunaEncoderImpl[T, CircePoly] {
          override lazy val write = base1.rep
          override val key        = base1.columnInfo.singleModelName
        }
      }

      override def buildRep(base: CirceAsunaEncoderImpl[T, CircePoly], oldRep: List[CirceAsunaEncoder[CircePoly]]): List[CirceAsunaEncoder[CircePoly]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T, CircePoly], oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep.key, rep.write(data))) :: oldData
    }
  }
}

object CircePoly extends CircePoly

trait CirceHelper {

  trait CirceContent[Out, Data] extends EncoderContent[Out, Data] {

    def write: Encoder[Data]

  }

  object circe extends EncoderWrapperHelper[List[CirceAsunaEncoder[CircePoly]], List[(String, Json)], CirceContent] {
    override def effect[Rep, D, Out](
        rep: Rep
    )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]]): CirceContent[Out, D] = {
      val wrapRep = shape.wrapRep(rep)
      new CirceContent[Out, D] {
        override def write: Encoder[D] = Encoder.instance { data: D =>
          Json.fromJsonObject(JsonObject.fromIterable(shape.buildData(data, wrapRep, List.empty)))
        }
      }
    }
  }

  /*implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder[T], T], T, String, List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Placeholder[T], T], List[CirceAsunaEncoder], List[(String, Json)]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder[T], T]): /*CirceAsunaEncoderImpl[T]*/ String = {
        /*val base1 = base
        new CirceAsunaEncoderImpl[T] {
          override lazy val write = encoder.value
          override val key        = base1.columnInfo.singleModelName
        }*/
        base.columnInfo.singleModelName
      }
      override def buildRep(base: String, oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = oldRep
      override def buildData(data: T, rep: String, oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep, encoder.value(data))) :: oldData
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Encoder[T], T], T, CirceAsunaEncoderImpl[T], List[CirceAsunaEncoder], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceAsunaEncoder], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[T]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): CirceAsunaEncoderImpl[T] = {
        val base1 = base
        new CirceAsunaEncoderImpl[T] {
          override val write = base1.rep
          override val key   = base1.columnInfo.singleModelName
        }
      }

      override def buildRep(base: CirceAsunaEncoderImpl[T], oldRep: List[CirceAsunaEncoder]): List[CirceAsunaEncoder] = base :: oldRep

      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T], oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep.key, rep.write(data))) :: oldData
    }
  }*/

  /*def optionEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]]): Encoder[Option[T]] = {
    implicit val e1 = circe.effect(sv).write
    implicitly[Encoder[Option[T]]]
  }

  def listEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]]): Encoder[List[T]] = {
    implicit val e1 = circe.effect(sv).write
    implicitly[Encoder[List[T]]]
  }

  def commonEncoder[T](sv: EncoderShapeValue[T, List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]]): Encoder[T] = {
    circe.effect(sv).write
  }*/

}
