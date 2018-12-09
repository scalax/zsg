package org.scalax.asuna.implements.play.abc

import org.scalax.asuna.LazyImplicit
import org.scalax.asuna.core.encoder.EncoderShape
import org.scalax.asuna.mapper.Placeholder
import org.scalax.asuna.mapper.common.SingleRepContent
import org.scalax.asuna.mapper.encoder._
import play.api.libs.json._

trait PlayAsunaEncoder[Poly] {
  type DataType
  def write: Writes[DataType]
  def key: String
}

class PlayAsunaEncoderImpl[Poly, T](writeable: => Writes[T], override val key: String) extends PlayAsunaEncoder[Poly] {
  override type DataType = T
  override lazy val write: Writes[T] = writeable
}

trait PlayPoly {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Writes[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T], T, String, List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): String = base.singleModelName
      override def buildRep(base: String, oldRep: List[PlayAsunaEncoder[PlayPoly]]): List[PlayAsunaEncoder[PlayPoly]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: String, oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep, encoder.value.writes(data))) :: oldData
    }
  }

  implicit def implicit2[T]
    : EncoderShape.Aux[SingleRepContent[Writes[T], T], T, PlayAsunaEncoderImpl[PlayPoly, T], List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Writes[T], T], List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] {
      override type Target = PlayAsunaEncoderImpl[PlayPoly, T]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Writes[T], T]): PlayAsunaEncoderImpl[PlayPoly, T] = {
        val base1 = base
        new PlayAsunaEncoderImpl[PlayPoly, T](writeable = base1.rep, key = base1.singleModelName)
      }

      override def buildRep(base: PlayAsunaEncoderImpl[PlayPoly, T], oldRep: List[PlayAsunaEncoder[PlayPoly]]): List[PlayAsunaEncoder[PlayPoly]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: PlayAsunaEncoderImpl[PlayPoly, T], oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep.key, rep.write.writes(data))) :: oldData
    }
  }
}

object PlayPoly extends PlayPoly

trait PlayPoly1 {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Writes[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T], T, PlayAsunaEncoderImpl[PlayPoly1, T], List[PlayAsunaEncoder[PlayPoly1]], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[PlayAsunaEncoder[PlayPoly1]], List[(String, JsValue)]] {
      override type Target = PlayAsunaEncoderImpl[PlayPoly1, T]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): PlayAsunaEncoderImpl[PlayPoly1, T] =
        new PlayAsunaEncoderImpl[PlayPoly1, T](writeable = encoder.value, key = base.singleModelName)
      override def buildRep(base: PlayAsunaEncoderImpl[PlayPoly1, T], oldRep: List[PlayAsunaEncoder[PlayPoly1]]): List[PlayAsunaEncoder[PlayPoly1]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: PlayAsunaEncoderImpl[PlayPoly1, T], oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep.key, rep.write.writes(data))) :: oldData
    }
  }

  implicit def implicit2[T]
    : EncoderShape.Aux[SingleRepContent[Writes[T], T], T, PlayAsunaEncoderImpl[PlayPoly1, T], List[PlayAsunaEncoder[PlayPoly1]], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Writes[T], T], List[PlayAsunaEncoder[PlayPoly1]], List[(String, JsValue)]] {
      override type Target = PlayAsunaEncoderImpl[PlayPoly1, T]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Writes[T], T]): PlayAsunaEncoderImpl[PlayPoly1, T] = {
        val base1 = base
        new PlayAsunaEncoderImpl[PlayPoly1, T](writeable = base1.rep, key = base1.singleModelName)
      }

      override def buildRep(base: PlayAsunaEncoderImpl[PlayPoly1, T], oldRep: List[PlayAsunaEncoder[PlayPoly1]]): List[PlayAsunaEncoder[PlayPoly1]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: PlayAsunaEncoderImpl[PlayPoly1, T], oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep.key, rep.write.writes(data))) :: oldData
    }
  }
}

object PlayPoly1 extends PlayPoly1

trait PlayHelper {

  trait PlayContent[Out, Data] extends EncoderContent[Out, Data] {
    def write: Writes[Data]
  }

  object play extends EncoderWrapperHelper[List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)], PlayContent] {
    override def effect[Rep, D, Out](
        rep: Rep
    )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]]): PlayContent[Out, D] = {
      val wrapRep = shape.wrapRep(rep)
      new PlayContent[Out, D] {
        override def write: Writes[D] = Writes { data: D =>
          JsObject(shape.buildData(data, wrapRep, List.empty))
        }
      }
    }
  }

}
