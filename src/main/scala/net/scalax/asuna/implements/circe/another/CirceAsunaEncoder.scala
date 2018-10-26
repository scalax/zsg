package net.scalax.asuna.circe.aaaa

import io.circe.{Encoder, Json, JsonObject}
import net.scalax.asuna.circe.EmptyCirceTable
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.mapper.common.RepColumnContent
import net.scalax.asuna.mapper.decoder.EmptyLazyModel
import net.scalax.asuna.mapper.encoder.{EncoderInputTable, FirstEncoderInputTableImplicit, UnusedData}
import shapeless.Lazy

trait CirceAsunaEncoder[PolyTrait] {
  type DataType
  def write(data: DataType): Json
}

trait CirceAsunaEncoderImpl[E, PolyTrait] extends CirceAsunaEncoder[PolyTrait] {
  self =>
  override type DataType = E
  override def write(data: E): Json

}

trait EncoderPoly extends EncoderPoly1 {
  implicit def encoderImplicit3[T](implicit encoder: Encoder[T]): CirceAsunaEncoderImpl[T, EncoderPoly] = {
    new CirceAsunaEncoderImpl[T, EncoderPoly] {
      override def write(data: T): Json = encoder(data)
    }
  }
}

object EncoderPoly extends EncoderPoly

trait EncoderPoly1 extends EncoderPoly2 {
  implicit def encoderImplicit4[T](implicit asunaEncoder: Lazy[CirceAsunaEncoderImpl[T, EncoderPoly]]): CirceAsunaEncoderImpl[List[T], EncoderPoly] = {
    implicit val encoder = Encoder.instance { a: T =>
      asunaEncoder.value.write(a)
    }
    val listEncoder = implicitly[Encoder[List[T]]]
    new CirceAsunaEncoderImpl[List[T], EncoderPoly] {
      override def write(data: List[T]): Json = listEncoder(data)
    }
  }

  implicit def encoderImplicit5[T](implicit asunaEncoder: Lazy[CirceAsunaEncoderImpl[T, EncoderPoly]]): CirceAsunaEncoderImpl[Option[T], EncoderPoly] = {
    implicit val encoder = Encoder.instance { a: T =>
      asunaEncoder.value.write(a)
    }
    val listEncoder = implicitly[Encoder[Option[T]]]
    new CirceAsunaEncoderImpl[Option[T], EncoderPoly] {
      override def write(data: Option[T]): Json = listEncoder(data)
    }
  }
}

trait EncoderPoly2 extends EncoderPoly3 {
  implicit def encoderImplicit1[T](
      implicit encoder: Lazy[CirceAsunaEncoderImpl[T, EncoderPoly]]
  ): EncoderShape.Aux[RepColumnContent[Placeholder[T], T], T, (String, CirceAsunaEncoderImpl[T, EncoderPoly]), List[(String, CirceAsunaEncoder[EncoderPoly])], List[
      (String, Json)
  ]] = {
    new EncoderShape[RepColumnContent[Placeholder[T], T], List[(String, CirceAsunaEncoder[EncoderPoly])], List[(String, Json)]] {
      override type Data   = T
      override type Target = (String, CirceAsunaEncoderImpl[T, EncoderPoly])

      override def wrapRep(base: RepColumnContent[Placeholder[T], T]): (String, CirceAsunaEncoderImpl[T, EncoderPoly]) = {
        (base.columnInfo.modelColumnName, new CirceAsunaEncoderImpl[T, EncoderPoly] {
          override def write(data: T): Json = encoder.value.write(data)
        })
      }

      override def toLawRep(
          base: (String, CirceAsunaEncoderImpl[T, EncoderPoly])
        , oldRep: List[(String, CirceAsunaEncoder[EncoderPoly])]
      ): List[(String, CirceAsunaEncoder[EncoderPoly])] = base :: oldRep

      override def buildData(data: T, rep: (String, CirceAsunaEncoderImpl[T, EncoderPoly]), oldData: List[(String, Json)]): List[(String, Json)] =
        (rep._1, rep._2.write(data)) :: oldData
    }
  }
}

trait EncoderPoly3 {
  implicit def encoderImplicit2[Case, Rep, TempData, Target](
      implicit repWrap: EncoderInputTable.Aux[FirstEncoderInputTableImplicit, EmptyCirceTable, EmptyLazyModel, Case, EmptyLazyModel, Rep, TempData]
    , encoderShape: EncoderShape.Aux[Rep, TempData, Target, List[(String, CirceAsunaEncoder[EncoderPoly])], List[(String, Json)]]
  ): CirceAsunaEncoderImpl[Case, EncoderPoly] = {
    val dataGen = repWrap.inputTable(EmptyCirceTable.value)
    val wrapRep = encoderShape.wrapRep(dataGen.rep)
    new CirceAsunaEncoderImpl[Case, EncoderPoly] {
      override def write(data: Case): Json = {
        val dataList = encoderShape.buildData(dataGen.to(UnusedData.simple(data)), wrapRep, List.empty)
        Json.fromJsonObject(JsonObject.fromIterable(dataList))
      }
    }
  }

}
