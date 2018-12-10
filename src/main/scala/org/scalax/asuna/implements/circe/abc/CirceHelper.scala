package org.scalax.asuna.implements.circe.encoder

import java.util.LinkedHashMap

import io.circe.{Encoder, Json, JsonObjectHelper, ObjectEncoder}
import org.scalax.asuna.implements.LazyImplicit
import org.scalax.asuna.core.encoder.EncoderShape
import org.scalax.asuna.mapper.Placeholder
import org.scalax.asuna.mapper.common.SingleRepContent
import org.scalax.asuna.mapper.encoder._

trait CirceEncoderTagger[Poly]

trait CirceDefEncoderPoly {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T], T, String, List[CirceEncoderTagger[CirceDefEncoderPoly]], LinkedHashMap[String, Json]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[CirceEncoderTagger[CirceDefEncoderPoly]], LinkedHashMap[String, Json]] {
      override type Target = String
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): String = base.singleModelName
      override def buildRep(base: String, oldRep: List[CirceEncoderTagger[CirceDefEncoderPoly]]): List[CirceEncoderTagger[CirceDefEncoderPoly]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: String, oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep, encoder.value(data))
        oldData
      }
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Encoder[T], T], T, SingleRepContent[Encoder[T], T], List[
    CirceEncoderTagger[CirceDefEncoderPoly]
  ], LinkedHashMap[String, Json]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceEncoderTagger[CirceDefEncoderPoly]], LinkedHashMap[String, Json]] {
      override type Target = SingleRepContent[Encoder[T], T]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): SingleRepContent[Encoder[T], T] = base

      override def buildRep(
        base: SingleRepContent[Encoder[T], T],
        oldRep: List[CirceEncoderTagger[CirceDefEncoderPoly]]
      ): List[CirceEncoderTagger[CirceDefEncoderPoly]] =
        throw new Exception("No use to support.")

      override def buildData(data: T, rep: SingleRepContent[Encoder[T], T], oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep.singleModelName, rep.rep(data))
        oldData
      }
    }
  }
}

object CirceDefEncoderPoly extends CirceDefEncoderPoly

trait CirceValEncoderPoly {
  implicit def implicit1[T](
      implicit encoder: LazyImplicit[Encoder[T]]
  ): EncoderShape.Aux[SingleRepContent[Placeholder, T], T, SingleRepContent[Encoder[T], T], List[CirceEncoderTagger[CirceValEncoderPoly]], LinkedHashMap[
    String,
    Json
  ]] = {
    new EncoderShape[SingleRepContent[Placeholder, T], List[CirceEncoderTagger[CirceValEncoderPoly]], LinkedHashMap[String, Json]] {
      override type Target = SingleRepContent[Encoder[T], T]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Placeholder, T]): SingleRepContent[Encoder[T], T] = new SingleRepContent[Encoder[T], T] {
        override lazy val rep        = encoder.value
        override val singleModelName = base.singleModelName
      }
      override def buildRep(
        base: SingleRepContent[Encoder[T], T],
        oldRep: List[CirceEncoderTagger[CirceValEncoderPoly]]
      ): List[CirceEncoderTagger[CirceValEncoderPoly]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: SingleRepContent[Encoder[T], T], oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep.singleModelName, rep.rep(data))
        oldData
      }
    }
  }

  implicit def implicit2[T]: EncoderShape.Aux[SingleRepContent[Encoder[T], T], T, SingleRepContent[Encoder[T], T], List[
    CirceEncoderTagger[CirceValEncoderPoly]
  ], LinkedHashMap[String, Json]] = {
    new EncoderShape[SingleRepContent[Encoder[T], T], List[CirceEncoderTagger[CirceValEncoderPoly]], LinkedHashMap[String, Json]] {
      override type Target = SingleRepContent[Encoder[T], T]
      override type Data   = T
      override def wrapRep(base: => SingleRepContent[Encoder[T], T]): SingleRepContent[Encoder[T], T] = {
        val base1 = base
        new SingleRepContent[Encoder[T], T] {
          override lazy val rep        = base1.rep
          override val singleModelName = base1.singleModelName
        }
      }
      override def buildRep(
        base: SingleRepContent[Encoder[T], T],
        oldRep: List[CirceEncoderTagger[CirceValEncoderPoly]]
      ): List[CirceEncoderTagger[CirceValEncoderPoly]] =
        throw new Exception("No use to support.")
      override def buildData(data: T, rep: SingleRepContent[Encoder[T], T], oldData: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
        oldData.put(rep.singleModelName, rep.rep(data))
        oldData
      }
    }
  }
}

object CirceValEncoderPoly extends CirceValEncoderPoly

trait CirceContent[Out, Data] extends EncoderContent[Out, Data] {
  self =>
  def zip[O1, D1](other: CirceContent[O1, D1]): CirceContent[(Out, O1), (Data, D1)] = new CirceContent[(Out, O1), (Data, D1)] {
    override def append(data: (Data, D1), json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = self.append(data._1, other.append(data._2, json))
  }
  def encoder: ObjectEncoder[Data] = {
    ObjectEncoder.instance { data: Data =>
      JsonObjectHelper.fromLinkedHashMap(append(data, new LinkedHashMap[String, Json]))
    }
  }
  def append(data: Data, json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json]
}

trait CirceHelper {

  val defEncoder: EncoderWrapperHelper[List[CirceEncoderTagger[CirceDefEncoderPoly]], LinkedHashMap[String, Json], CirceContent] =
    new EncoderWrapperHelper[List[CirceEncoderTagger[CirceDefEncoderPoly]], LinkedHashMap[String, Json], CirceContent] {
      override def effect[Rep, D, Out](
          rep: Rep
      )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceEncoderTagger[CirceDefEncoderPoly]], LinkedHashMap[String, Json]]): CirceContent[Out, D] = {
        val wrapRep = shape.wrapRep(rep)
        new CirceContent[Out, D] {
          override def append(data: D, json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
            shape.buildData(data, wrapRep, json)
          }
        }
      }
    }

  val valEncoder: EncoderWrapperHelper[List[CirceEncoderTagger[CirceValEncoderPoly]], LinkedHashMap[String, Json], CirceContent] =
    new EncoderWrapperHelper[List[CirceEncoderTagger[CirceValEncoderPoly]], LinkedHashMap[String, Json], CirceContent] {
      override def effect[Rep, D, Out](
          rep: Rep
      )(implicit shape: EncoderShape.Aux[Rep, D, Out, List[CirceEncoderTagger[CirceValEncoderPoly]], LinkedHashMap[String, Json]]): CirceContent[Out, D] = {
        val wrapRep = shape.wrapRep(rep)
        new CirceContent[Out, D] {
          override def append(data: D, json: LinkedHashMap[String, Json]): LinkedHashMap[String, Json] = {
            shape.buildData(data, wrapRep, json)
          }
        }
      }
    }

}
