package net.scalax.asuna.implements.play.abc

import net.scalax.asuna.LazyImplicit
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.{EncoderShape, EncoderShapeValue}
import net.scalax.asuna.mapper.common.SingleRepContent
import net.scalax.asuna.mapper.encoder._
import play.api.libs.json._

trait PlayAsunaEncoder {
  type DataType
  def write: Writes[DataType]
  val key: String
}

trait PlayAsunaEncoderImpl[T] extends PlayAsunaEncoder {
  override type DataType = T
}

trait PlayHelper {

  trait PlayContent[Out, Data] extends EncoderContent[Out, Data] {

    def write: Writes[Data]

  }

  object play extends EncoderWrapperHelper[List[PlayAsunaEncoder], List[(String, JsValue)], PlayContent] {
    override def effect[Rep, D, Out](
      rep: Rep
    )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[PlayAsunaEncoder], List[(String, JsValue)]]): PlayContent[Out, D] = {
      val wrapRep = shape.wrapRep(rep)
      new PlayContent[Out, D] {
        override def write: Writes[D] = Writes { data: D =>
          JsObject(shape.buildData(data, wrapRep, List.empty))
        }
      }
    }
  }

  implicit def implicit1[T](
    implicit encoder: LazyImplicit[Writes[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder[T], T], T, PlayAsunaEncoderImpl[T], List[PlayAsunaEncoder], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Placeholder[T], T], List[PlayAsunaEncoder], List[(String, JsValue)]] {
      override type Target = PlayAsunaEncoderImpl[T]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder[T], T]): PlayAsunaEncoderImpl[T] = new PlayAsunaEncoderImpl[T] {
        override lazy val write = encoder.value
        override val key        = base.columnInfo.singleModelSymbol.name
      }
      override def buildRep(base: PlayAsunaEncoderImpl[T], oldRep: List[PlayAsunaEncoder]): List[PlayAsunaEncoder] = base :: oldRep
      override def buildData(data: T, rep: PlayAsunaEncoderImpl[T], oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep.key, rep.write.writes(data))) :: oldData
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Writes[T], T], T, PlayAsunaEncoderImpl[T], List[PlayAsunaEncoder], List[(String, JsValue)]] = {
    new EncoderShape[SingleRepContent[Writes[T], T], List[PlayAsunaEncoder], List[(String, JsValue)]] {
      override type Target = PlayAsunaEncoderImpl[T]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Writes[T], T]): PlayAsunaEncoderImpl[T] = {
        val base1 = base
        new PlayAsunaEncoderImpl[T] {
          override val write = base1.rep.writes
          override val key   = base1.columnInfo.singleModelSymbol.name
        }
      }

      override def buildRep(base: PlayAsunaEncoderImpl[T], oldRep: List[PlayAsunaEncoder]): List[PlayAsunaEncoder] = base :: oldRep

      override def buildData(data: T, rep: PlayAsunaEncoderImpl[T], oldData: List[(String, JsValue)]): List[(String, JsValue)] =
        ((rep.key, rep.write.writes(data))) :: oldData
    }
  }

  def optionEncoder[T](sv: EncoderShapeValue[T, List[PlayAsunaEncoder], List[(String, JsValue)]]): Writes[Option[T]] = {
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
  }

}
