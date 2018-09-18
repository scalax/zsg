package net.scalax.asuna.circe

import io.circe.{Decoder, Encoder, Json}
import net.scalax.asuna.circe.aaaa.{CirceAsunaDecoder, CirceAsunaDecoderImpl, CirceAsunaEncoderImpl}
import net.scalax.asuna.core.common.Placeholder
import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.helper.decoder.{DecoderContent, DecoderHelper, DecoderWrapperHelper, HListDecoderShapeImplicit}
import net.scalax.asuna.helper.encoder._

trait ACirceDecoderWrapper[RepOut, DataType] extends DecoderContent[RepOut, DataType] {
  def read(data: Json): Either[Exception, DataType]
}

object asunaCirceDecoderImpl extends DecoderWrapperHelper[List[CirceAsunaDecoder], Map[String, Any], ACirceDecoderWrapper] {

  override def effect[Rep, D, Out](
    rep: Rep
  )(implicit shape: DecoderShape.Aux[Rep, D, Out, List[CirceAsunaDecoder], Map[String, Any]]): ACirceDecoderWrapper[Out, D] = {
    val shape1  = shape
    val rep1    = rep
    val wrapRep = shape1.wrapRep(rep1)
    val lawRep  = shape1.toLawRep(wrapRep, List.empty).map(s => (s.key, s)).toMap
    new ACirceDecoderWrapper[Out, D] {
      override def read(data: Json): Either[Exception, D] = {
        val jsonObject = data.as[Map[String, Json]].right.get
        val dataMap    = lawRep.map { case (key, value) => (key, value.write(jsonObject.get(key).get)) }
        val value = dataMap.foldLeft(Right(Map.empty[String, Any]): Either[Exception, Map[String, Any]]) {
          case (map, (key, Right(value))) => map.right.map(m => m + ((key, value)))
          case (_, (_, Left(e)))          => Left(e)
        }
        value.right.map(v => shape1.takeData(wrapRep, v).current)
      }
    }
  }

}

trait CirceAsunaDecoderHelper extends HListDecoderShapeImplicit with DecoderHelper[List[CirceAsunaDecoder], Map[String, Any]] {

  implicit def sdohgfoisdhgiosedhtuioserhtuiegtweui[B, RepCol, DataCol](
      implicit someshape: Decoder[B]
  ): DecoderShape.Aux[HListEncoderShapeWrap[Placeholder[B], B], B, CirceAsunaDecoderImpl[B], List[CirceAsunaDecoder], Map[String, Any]] = {
    new DecoderShape[HListEncoderShapeWrap[Placeholder[B], B], List[CirceAsunaDecoder], Map[String, Any]] {
      override type Target = CirceAsunaDecoderImpl[B]
      override type Data   = B
      override def wrapRep(base: HListEncoderShapeWrap[Placeholder[B], B]): CirceAsunaDecoderImpl[B] = new CirceAsunaDecoderImpl[B] {
        override val key = base.columnInfo.modelColumnName
        override def write(data: Json): Either[Exception, B] = {
          if (data == Json.Null) {
            Right(null.asInstanceOf[B])
          } else {
            someshape.decodeJson(data)
          }
        }
      }
      override def toLawRep(base: CirceAsunaDecoderImpl[B], oldRep: List[CirceAsunaDecoder]): List[CirceAsunaDecoder] = base :: oldRep
      override def takeData(rep: CirceAsunaDecoderImpl[B], oldData: Map[String, Any]): SplitData[B, Map[String, Any]] =
        SplitData(oldData.get(rep.key).get.asInstanceOf[B], oldData)
    }
  }

  trait DecoderApply1111[T] {
    def func[R](key: String, f: T => R)(implicit encoder: Encoder[R]): CirceAsunaEncoderImpl[T] = {
      val key1 = key
      new CirceAsunaEncoderImpl[T] {
        override val key                  = key1
        override def write(data: T): Json = encoder(f(data))
      }
    }
  }

  def cusEncoder1111[T]: DecoderApply1111[T] = new DecoderApply1111[T] {}

  val asunaCirceDecoder = asunaCirceDecoderImpl

}
