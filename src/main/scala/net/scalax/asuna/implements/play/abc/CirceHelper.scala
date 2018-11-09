package net.scalax.asuna.implements.play.abc

import net.scalax.asuna.LazyImplicit
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.mapper.common.SingleRepContent
import net.scalax.asuna.mapper.encoder._
import play.api.libs.json._

trait PlayAsunaEncoder[Poly] {
  type DataType
  def write: Writes[DataType]
  def key: String
}

trait PlayAsunaEncoderImpl[T, Poly] extends PlayAsunaEncoder[Poly] {
  override type DataType = T
}

trait PlayPoly {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Writes[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder[T], T], T, String, List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Placeholder[T], T], List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: SingleRepContent[Placeholder[T], T]): String = base.columnInfo.singleModelName
      override def buildRep(base: String, oldRep: List[PlayAsunaEncoder[PlayPoly]]): List[PlayAsunaEncoder[PlayPoly]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: String, oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep, encoder.value.writes(data))) :: oldData
    }
  }

  implicit def implicit2[T]
    : EncoderShape.Aux[SingleRepContent[Writes[T], T], T, PlayAsunaEncoderImpl[T, PlayPoly], List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Writes[T], T], List[PlayAsunaEncoder[PlayPoly]], List[(String, JsValue)]] {
      override type Target = PlayAsunaEncoderImpl[T, PlayPoly]
      override type Data   = T

      override def wrapRep(base: SingleRepContent[Writes[T], T]): PlayAsunaEncoderImpl[T, PlayPoly] = {
        val base1 = base
        new PlayAsunaEncoderImpl[T, PlayPoly] {
          override val write = base1.rep
          override val key   = base1.columnInfo.singleModelName
        }
      }

      override def buildRep(base: PlayAsunaEncoderImpl[T, PlayPoly], oldRep: List[PlayAsunaEncoder[PlayPoly]]): List[PlayAsunaEncoder[PlayPoly]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: PlayAsunaEncoderImpl[T, PlayPoly], oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep.key, rep.write.writes(data))) :: oldData
    }
  }
}

object PlayPoly extends PlayPoly

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

  /*implicit def implicit1[T](
      implicit encoder: LazyImplicit[Writes[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder[T], T], T, String, List[PlayAsunaEncoder], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Placeholder[T], T], List[PlayAsunaEncoder], List[(String, JsValue)]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: SingleRepContent[Placeholder[T], T]): String                     = base.columnInfo.singleModelName
      override def buildRep(base: String, oldRep: List[PlayAsunaEncoder]): List[PlayAsunaEncoder] = oldRep
      override def buildData(data: T, rep: String, oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep, encoder.value.writes(data))) :: oldData
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Writes[T], T], T, PlayAsunaEncoderImpl[T], List[PlayAsunaEncoder], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Writes[T], T], List[PlayAsunaEncoder], List[(String, JsValue)]] {
      override type Target = PlayAsunaEncoderImpl[T]
      override type Data   = T

      override def wrapRep(base: SingleRepContent[Writes[T], T]): PlayAsunaEncoderImpl[T] = {
        val base1 = base
        new PlayAsunaEncoderImpl[T] {
          override val write = base1.rep
          override val key   = base1.columnInfo.singleModelName
        }
      }

      override def buildRep(base: PlayAsunaEncoderImpl[T], oldRep: List[PlayAsunaEncoder]): List[PlayAsunaEncoder] = base :: oldRep

      override def buildData(data: T, rep: PlayAsunaEncoderImpl[T], oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep.key, rep.write.writes(data))) :: oldData
    }
  }*/

  /*def optionEncoder[T](sv: EncoderShapeValue[T, List[PlayAsunaEncoder], List[(String, JsValue)]]): Writes[Option[T]] = {
    val w = play.effect(sv).write
    implicit val e1 = Writes { data: T =>
      w.writes(data)
    }
    implicitly[Writes[Option[T]]]
  }

  def listEncoder[T](sv: EncoderShapeValue[T, List[PlayAsunaEncoder], List[(String, JsValue)]]): Writes[List[T]] = {
    val w = play.effect(sv).write
    implicit val e1 = Writes { data: T =>
      w.writes(data)
    }
    implicitly[Writes[List[T]]]
  }

  def commonEncoder[T](sv: EncoderShapeValue[T, List[PlayAsunaEncoder], List[(String, JsValue)]]): Writes[T] = {
    val w = play.effect(sv).write
    Writes { data: T =>
      w.writes(data)
    }
  }*/

}
