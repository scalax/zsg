package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.MacoColumnInfo
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }

import scala.language.experimental.macros

import shapeless._

trait CirceAsunaEncoder {

  type DataType

  def write(data: DataType): (String, Json)

}

trait CirceAsunaEncoderImpl[E] extends AtomicColumn[E, CirceAsunaEncoder] with CirceAsunaEncoder {
  self =>

  override type DataType = E
  override def common: CirceAsunaEncoder = self

}

trait CirceTableEmptyObject

object CirceTableEmptyObject {
  val value: CirceTableEmptyObject = new CirceTableEmptyObject {}
}

trait CirceAsunaEncoderHelper {

  trait AlreadHaveEncoder

  object AlreadHaveEncoder {
    implicit val alreadHaveEncoder: AlreadHaveEncoder = new AlreadHaveEncoder {}
  }

  trait CirceEncoderWrap[A] extends EncoderWrap[A] {
    val encoder: Encoder[A]
    type TargetType = AlreadHaveEncoder
  }

  trait EncoderWrap[D] {
    type TargetType
  }

  object EncoderWrap {
    type Aux[D, T] = EncoderWrap[D] { type TargetType = T }

    def asunaTarget[D] /*: Aux[D, ForTableInput[CirceTableEmptyObject, D, CirceAsunaEncoder]]*/ = {
      new EncoderWrap[D] {
        override type TargetType = ForTableInput[CirceTableEmptyObject, D, CirceAsunaEncoder]
      }
    }

    implicit def circeEncoderImplicit[D](implicit encoder: Encoder[D]): Aux[D, AlreadHaveEncoder] = {
      val encoder1 = encoder
      new CirceEncoderWrap[D] {
        override val encoder = encoder1
      }
    }
  }

  /*trait AlreadHaveEncoder

  object AlreadHaveEncoder {
    implicit val alreadHaveEncoder: AlreadHaveEncoder = new AlreadHaveEncoder {}
  }

  trait CirceEncoderWrap extends EncoderWrap {
    val encoder: Encoder[DataType]
    override type DataType
    override type TargetType = AlreadHaveEncoder
  }

  trait EncoderWrap {
    type DataType
    type TargetType
  }

  object EncoderWrap {
    type Aux[D, T] = EncoderWrap { type DataType = D; type TargetType = T }

    def asunaTarget[D]: Aux[D, ForTableInput[EmptyObject.type, D, CirceAsunaEncoder]] = {
      new EncoderWrap {
        override type DataType = D
        override type TargetType = ForTableInput[EmptyObject.type, D, CirceAsunaEncoder]
      }
    }

    implicit def circeEncoderImplicit[D](implicit encoder: Encoder[D]) = {
      val encoder1 = encoder
      object impl extends CirceEncoderWrap {
        override type DataType = D
        override val encoder = encoder1
      }
      impl
    }
  }*/

  implicit def caseOnly11111111111111111111111111111[Case]: ForTableInput[CirceTableEmptyObject, Case, CirceAsunaEncoder] = macro EncoderMapper.EncoderMapperImpl.impl[CirceTableEmptyObject, Case, CirceAsunaEncoder]

  implicit def columnEncoderWithPropertyName[H, E](implicit mColumnInfo: MacoColumnInfo, wrapImplicit: EncoderWrap.Aux[H, E] = EncoderWrap.asunaTarget[H], encoder: E): EncoderShape[Placeholder[H], H, CirceAsunaEncoderImpl[H], CirceAsunaEncoder] = {
    /*new EncoderShape[Placeholder[A], A, CirceAsunaEncoderImpl[A], CirceAsunaEncoder] {
      override def wrapRep(base: Placeholder[A]): CirceAsunaEncoderImpl[A] = new CirceAsunaEncoderImpl[A] {
        override def write(data: A): (String, Json) = (mColumnInfo.modelColumnName, encoder(data))
      }
      override def toLawRep(base: CirceAsunaEncoderImpl[A]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
      override def buildData(data: A, rep: CirceAsunaEncoderImpl[A]): DataGroup = DataGroup(List(data))
    }*/
    wrapImplicit match {
      case encoder1: CirceEncoderWrap[H] =>
        new EncoderShape[Placeholder[H], H, CirceAsunaEncoderImpl[H], CirceAsunaEncoder] {
          override def wrapRep(base: Placeholder[H]): CirceAsunaEncoderImpl[H] = new CirceAsunaEncoderImpl[H] {
            override def write(data: H): (String, Json) = (mColumnInfo.modelColumnName + "1111", encoder1.encoder(data))
          }
          override def toLawRep(base: CirceAsunaEncoderImpl[H]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
          override def buildData(data: H, rep: CirceAsunaEncoderImpl[H]): DataGroup = DataGroup(List(data))
        }
      case _ =>
        encoder match {
          case encoder2 @ (_: ForTableInput[CirceTableEmptyObject, H, CirceAsunaEncoder]) =>
            new EncoderShape[Placeholder[H], H, CirceAsunaEncoderImpl[H], CirceAsunaEncoder] {
              override def wrapRep(base: Placeholder[H]): CirceAsunaEncoderImpl[H] = new CirceAsunaEncoderImpl[H] {
                override def write(data: H): (String, Json) = {
                  import io.circe.syntax._
                  (mColumnInfo.modelColumnName + "1111", asunaCirce.effect(encoder2.input(CirceTableEmptyObject.value)).write(data).asJson)
                }
              }
              override def toLawRep(base: CirceAsunaEncoderImpl[H]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
              override def buildData(data: H, rep: CirceAsunaEncoderImpl[H]): DataGroup = DataGroup(List(data))
            }
        }
    }
    /*encoder match {
      case encoder1: Encoder[A] =>
        new EncoderShape[Placeholder[A], A, CirceAsunaEncoderImpl[A], CirceAsunaEncoder] {
          override def wrapRep(base: Placeholder[A]): CirceAsunaEncoderImpl[A] = new CirceAsunaEncoderImpl[A] {
            override def write(data: A): (String, Json) = (mColumnInfo.modelColumnName, encoder1(data))
          }
          override def toLawRep(base: CirceAsunaEncoderImpl[A]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
          override def buildData(data: A, rep: CirceAsunaEncoderImpl[A]): DataGroup = DataGroup(List(data))
        }
      case encoder2 @ (_: ForTableInput[EmptyObject.type, A, CirceAsunaEncoder]) =>
        new EncoderShape[Placeholder[A], A, CirceAsunaEncoderImpl[A], CirceAsunaEncoder] {
          override def wrapRep(base: Placeholder[A]): CirceAsunaEncoderImpl[A] = new CirceAsunaEncoderImpl[A] {
            override def write(data: A): (String, Json) = {
              import io.circe.syntax._
              (mColumnInfo.modelColumnName, asunaCirce.effect(encoder2.input(EmptyObject)).write(data).asJson)
            }
          }
          override def toLawRep(base: CirceAsunaEncoderImpl[A]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
          override def buildData(data: A, rep: CirceAsunaEncoderImpl[A]): DataGroup = DataGroup(List(data))
        }
    }*/
  }

  trait ACirceEncoderWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
    def write(data: DataType): JsonObject
  }

  object asunaCirce extends EncoderHelper[CirceAsunaEncoder] with EncoderWrapperHelper[CirceAsunaEncoder, ACirceEncoderWrapper] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, CirceAsunaEncoder]): ACirceEncoderWrapper[Out, D] = {
      val shape1 = shape
      val rep1 = rep
      new ACirceEncoderWrapper[Out, D] {
        override def write(data: D): JsonObject = {
          val reps = shape1.toLawRep(shape1.wrapRep(rep1)).reps
          val dataList = shape1.buildData(data, shape1.wrapRep(rep1))
          val map = reps.zip(dataList.items).map {
            case (r, d) =>
              val dItem = d.asInstanceOf[r.DataType]
              r.write(dItem)
          }.toMap
          JsonObject.fromMap(map)
        }
      }
    }
  }

}