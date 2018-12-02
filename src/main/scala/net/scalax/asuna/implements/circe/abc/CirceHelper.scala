package org.scalax.asuna.implements.circe.abc

import io.circe.{Encoder, Json, JsonObject}
import org.scalax.asuna.LazyImplicit
import org.scalax.asuna.core.encoder.EncoderShape
import org.scalax.asuna.mapper.Placeholder
import org.scalax.asuna.mapper.common.SingleRepContent
import org.scalax.asuna.mapper.encoder._

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
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T], T, String, List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[CirceAsunaEncoder[CircePoly]], List[(String, Json)]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): String = base.singleModelName
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
          override val key        = base1.singleModelName
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

trait CircePoly1 {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T], T, CirceAsunaEncoderImpl[T, CircePoly1], List[CirceAsunaEncoder[CircePoly1]], List[
      (String, Json)
  ]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[CirceAsunaEncoder[CircePoly1]], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[T, CircePoly1]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): CirceAsunaEncoderImpl[T, CircePoly1] = new CirceAsunaEncoderImpl[T, CircePoly1] {
        override lazy val write = encoder.value
        override val key        = base.singleModelName
      }
      override def buildRep(base: CirceAsunaEncoderImpl[T, CircePoly1], oldRep: List[CirceAsunaEncoder[CircePoly1]]): List[CirceAsunaEncoder[CircePoly1]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T, CircePoly1], oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep.key, rep.write(data))) :: oldData
    }
  }

  implicit def implicit2[T]
    : EncoderShape.Aux[SingleRepContent[Encoder[T], T], T, CirceAsunaEncoderImpl[T, CircePoly1], List[CirceAsunaEncoder[CircePoly1]], List[(String, Json)]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceAsunaEncoder[CircePoly1]], List[(String, Json)]] {
      override type Target = CirceAsunaEncoderImpl[T, CircePoly1]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): CirceAsunaEncoderImpl[T, CircePoly1] = {
        val base1 = base
        new CirceAsunaEncoderImpl[T, CircePoly1] {
          override lazy val write = base1.rep
          override val key        = base1.singleModelName
        }
      }

      override def buildRep(base: CirceAsunaEncoderImpl[T, CircePoly1], oldRep: List[CirceAsunaEncoder[CircePoly1]]): List[CirceAsunaEncoder[CircePoly1]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T, CircePoly1], oldData: List[(String, Json)]): List[(String, Json)] =
        ((rep.key, rep.write(data))) :: oldData
    }
  }
}

object CircePoly1 extends CircePoly1

trait CirceHelper {

  trait CirceContent[Out, Data] extends EncoderContent[Out, Data] {

    def write: Encoder[Data]

  }

  object circe extends EncoderWrapperHelper[List[CirceAsunaEncoder[CircePoly1]], List[(String, Json)], CirceContent] {
    override def effect[Rep, D, Out](
        rep: Rep
    )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder[CircePoly1]], List[(String, Json)]]): CirceContent[Out, D] = {
      val wrapRep = shape.wrapRep(rep)
      new CirceContent[Out, D] {
        override def write: Encoder[D] = Encoder.instance { data: D =>
          Json.fromJsonObject(JsonObject.fromIterable(shape.buildData(data, wrapRep, List.empty)))
        }
      }
    }
  }

}
