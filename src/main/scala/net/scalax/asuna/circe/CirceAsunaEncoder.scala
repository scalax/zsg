package net.scalax.asuna.circe

import io.circe.{ Encoder, Json, JsonObject }
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup, Placeholder }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper, ForTableInput }

import scala.language.experimental.macros

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

  trait EncoderWrap[D] {
    type TargetType
  }

  object EncoderWrap {
    type Aux[D, T] = EncoderWrap[D] { type TargetType = T }

    def asunaTarget[D]: Aux[D, UseAsunaImplicit] = {
      object impl extends EncoderWrap[D] {
        //override type TargetType = UseAsunaImplicit
        override type TargetType = UseAsunaImplicit
      }
      impl
    }

    implicit def circeEncoderImplicit1111[D](implicit encoder: Encoder[D]): Aux[D, HaveCirceImplicit] = {
      object impl extends EncoderWrap[D] {
        override type TargetType = HaveCirceImplicit
      }
      impl
    }
  }

  trait HaveCirceImplicit

  //object HaveCirceImplicit {
  implicit def circeEncoderImplicit2222[D](implicit encoder: Encoder[D]): ImplicitInstance[D, HaveCirceImplicit] = {
    //val encoder1 = encoder
    new CirceImplicitInstance[D] {
      override val circeEncoder = ???
    }
  }
  //}

  trait UseAsunaImplicit

  //object UseAsunaImplicit {
  implicit def asunaEncoderImplicit3333[D](implicit encoder: ForTableInput[CirceTableEmptyObject, D, CirceAsunaEncoder]): ImplicitInstance[D, UseAsunaImplicit] = {
    val encoder1 = encoder
    new AsunaImplicitInstance[D] {
      override val asunaEncoder = encoder1
    }
  }
  //}

  sealed abstract trait ImplicitInstance[E, Status]

  trait CirceImplicitInstance[E] extends ImplicitInstance[E, HaveCirceImplicit] {
    //override type Status = HaveCirceImplicit
    val circeEncoder: Encoder[E]
  }

  trait AsunaImplicitInstance[E] extends ImplicitInstance[E, UseAsunaImplicit] {
    //override type Status = UseAsunaImplicit
    val asunaEncoder: ForTableInput[CirceTableEmptyObject, E, CirceAsunaEncoder]
  }

  /*object ImplicitInstance {
    type Aux[Data,S ] = ImplicitInstance[Data,S]

    /*implicit def circeEncoderImplicit2222[D]: Aux[HaveCirceImplicit, D] = {
      //val encoder1 = encoder
      new CirceImplicitInstance[D] {
        override val circeEncoder = ??? //encoder1
      }
    }

    implicit def asunaEncoderImplicit[D](implicit encoder: ForTableInput[CirceTableEmptyObject, D, CirceAsunaEncoder]): Aux[UseAsunaImplicit, D] = {
      val encoder1 = encoder
      new AsunaImplicitInstance[D] {
        override val asunaEncoder = encoder1
      }
    }*/
  }*/

  implicit def caseOnlyEncoderImplicit[Case]: ForTableInput[CirceTableEmptyObject, Case, CirceAsunaEncoder] = macro EncoderMapper.EncoderMapperImpl.impl[CirceTableEmptyObject, Case, CirceAsunaEncoder]

  implicit def columnEncoderWithPropertyName[D, T](implicit mColumnInfo: MacroColumnInfo, wrapImplicit: EncoderWrap.Aux[D, T] = EncoderWrap.asunaTarget[D], encoder: ImplicitInstance[D, T]): EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] = {
    encoder match {

      case circeEncoder: CirceImplicitInstance[D @unchecked] =>
        new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
          override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
            override def write(data: D): (String, Json) = (mColumnInfo.modelColumnName + "2222", circeEncoder.circeEncoder(data))
          }
          override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
          override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
        }

      case asunaEncoder: AsunaImplicitInstance[D @unchecked] =>
        new EncoderShape[Placeholder[D], D, CirceAsunaEncoderImpl[D], CirceAsunaEncoder] {
          override def wrapRep(base: Placeholder[D]): CirceAsunaEncoderImpl[D] = new CirceAsunaEncoderImpl[D] {
            override def write(data: D): (String, Json) = {
              import io.circe.syntax._
              (mColumnInfo.modelColumnName + "3333", asunaCirce.effect(asunaEncoder.asunaEncoder.input(CirceTableEmptyObject.value)).write(data).asJson)
            }
          }
          override def toLawRep(base: CirceAsunaEncoderImpl[D]): DataRepGroup[CirceAsunaEncoder] = DataRepGroup(List(base))
          override def buildData(data: D, rep: CirceAsunaEncoderImpl[D]): DataGroup = DataGroup(List(data))
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