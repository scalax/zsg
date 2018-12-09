package org.scalax.asuna.implements.circe.abc

import java.util.LinkedHashMap

import io.circe.{Encoder, Json, JsonObjectHelper, ObjectEncoder}
import org.scalax.asuna.LazyImplicit
import org.scalax.asuna.core.encoder.EncoderShape
import org.scalax.asuna.mapper.Placeholder
import org.scalax.asuna.mapper.common.SingleRepContent
import org.scalax.asuna.mapper.encoder._

trait CirceAsunaEncoder[Poly] {
  type DataType
  def rep: Encoder[DataType]
  def singleModelName: String
}

trait CirceAsunaEncoderImpl[T, Poly] extends CirceAsunaEncoder[Poly] with SingleRepContent[Encoder[T], T] {
  override type DataType = T
  override def rep: Encoder[DataType]
  override def singleModelName: String
}

trait CircePoly {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T], T, String, List[CirceAsunaEncoder[CircePoly]], LinkedHashMap[String, Json]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[CirceAsunaEncoder[CircePoly]], LinkedHashMap[String, Json]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): String = base.singleModelName
      override def buildRep(base: String, oldRep: List[CirceAsunaEncoder[CircePoly]]): List[CirceAsunaEncoder[CircePoly]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: String, oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep, encoder.value(data))
        oldData
      }
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Encoder[T], T],
                                              T,
                                              CirceAsunaEncoderImpl[T, CircePoly],
                                              List[CirceAsunaEncoder[CircePoly]],
                                              LinkedHashMap[String, Json]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceAsunaEncoder[CircePoly]], LinkedHashMap[String, Json]] {
      override type Target = CirceAsunaEncoderImpl[T, CircePoly]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): CirceAsunaEncoderImpl[T, CircePoly] = {
        val base1 = base
        new CirceAsunaEncoderImpl[T, CircePoly] {
          override def rep             = base1.rep
          override val singleModelName = base1.singleModelName
        }
      }

      override def buildRep(base: CirceAsunaEncoderImpl[T, CircePoly], oldRep: List[CirceAsunaEncoder[CircePoly]]): List[CirceAsunaEncoder[CircePoly]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T, CircePoly], oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep.singleModelName, rep.rep(data))
        oldData
      }
    }
  }
}

object CircePoly extends CircePoly

trait CircePoly1 {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T],
                      T,
                      CirceAsunaEncoderImpl[T, CircePoly1],
                      List[CirceAsunaEncoder[CircePoly1]],
                      LinkedHashMap[
                          String
                        , Json
                      ]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[CirceAsunaEncoder[CircePoly1]], LinkedHashMap[String, Json]] {
      override type Target = CirceAsunaEncoderImpl[T, CircePoly1]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): CirceAsunaEncoderImpl[T, CircePoly1] = new CirceAsunaEncoderImpl[T, CircePoly1] {
        override lazy val rep        = encoder.value
        override val singleModelName = base.singleModelName
      }
      override def buildRep(base: CirceAsunaEncoderImpl[T, CircePoly1], oldRep: List[CirceAsunaEncoder[CircePoly1]]): List[CirceAsunaEncoder[CircePoly1]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T, CircePoly1], oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep.singleModelName, rep.rep(data))
        oldData
      }
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Encoder[T], T],
                                              T,
                                              CirceAsunaEncoderImpl[T, CircePoly1],
                                              List[CirceAsunaEncoder[CircePoly1]],
                                              LinkedHashMap[String, Json]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceAsunaEncoder[CircePoly1]], LinkedHashMap[String, Json]] {
      override type Target = CirceAsunaEncoderImpl[T, CircePoly1]
      override type Data   = T

      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): CirceAsunaEncoderImpl[T, CircePoly1] = {
        val base1 = base
        new CirceAsunaEncoderImpl[T, CircePoly1] {
          override lazy val rep        = base1.rep
          override val singleModelName = base1.singleModelName
        }
      }

      override def buildRep(base: CirceAsunaEncoderImpl[T, CircePoly1], oldRep: List[CirceAsunaEncoder[CircePoly1]]): List[CirceAsunaEncoder[CircePoly1]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: CirceAsunaEncoderImpl[T, CircePoly1], oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep.singleModelName, rep.rep(data))
        oldData
      }
    }
  }
}

object CircePoly1 extends CircePoly1

trait CirceHelper {

  trait CirceContent[Out, Data] extends EncoderContent[Out, Data] {
    self =>
    def zip[O1, D1](other: CirceContent[O1, D1]): CirceContent[(Out, O1), (Data, D1)] = new CirceContent[(Out, O1), (Data, D1)] {
      override def append(data: (Data, D1), json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = self.append(data._1, other.append(data._2, json))
    }
    def write: ObjectEncoder[Data] = {
      ObjectEncoder.instance { data: Data =>
        JsonObjectHelper.fromLinkedHashMap(append(data, new LinkedHashMap[String, Json]))
      }
    }
    def append(data: Data, json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json]
  }

  object circeVal extends EncoderWrapperHelper[List[CirceAsunaEncoder[CircePoly1]], LinkedHashMap[String, Json], CirceContent] {
    override def effect[Rep, D, Out](
        rep: Rep
    )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder[CircePoly1]], LinkedHashMap[String, Json]]): CirceContent[Out, D] = {
      val wrapRep = shape.wrapRep(rep)
      new CirceContent[Out, D] {
        override def append(data: D, json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
          shape.buildData(data, wrapRep, json)
        }
      }
    }
  }

  object circeDef extends EncoderWrapperHelper[List[CirceAsunaEncoder[CircePoly]], LinkedHashMap[String, Json], CirceContent] {
    override def effect[Rep, D, Out](
        rep: Rep
    )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceAsunaEncoder[CircePoly]], LinkedHashMap[String, Json]]): CirceContent[Out, D] = {
      val wrapRep = shape.wrapRep(rep)
      new CirceContent[Out, D] {
        override def append(data: D, json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
          shape.buildData(data, wrapRep, json)
        }
      }
    }
  }

}
