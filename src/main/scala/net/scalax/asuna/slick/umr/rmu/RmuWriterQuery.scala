package net.scalax.asuna.slick.umr.rmu

import io.circe.{ Encoder, JsonObject }
import io.circe.syntax._
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup }
import net.scalax.asuna.core.decoder.DecoderShapeValue
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.MacroColumnInfo
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper }
import net.scalax.asuna.slick.umr.{ SlickShapeValueWrap, SlickShapeValueWrapAbs, UmrHelper }
import slick.lifted.{ FlatShapeLevel, Shape }

trait SlickRmuWrapper {

  type DataType
  val circeEncoder: Encoder[DataType]
  val slickWrapper: SlickShapeValueWrap[DataType]
  val key: String

}

trait SlickRmuWrapperImpl extends SlickRmuWrapper with AtomicColumn[String, SlickRmuWrapper] {
  self =>

  override def common: SlickRmuWrapper = self

}

trait RmuWriterQuery extends UmrHelper {

  trait WithCols[RepOut, DataType] extends Function1[List[String], DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs]] with EncoderContent[RepOut, DataType] {
    def withCols(param: List[String]): DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs]
    override def apply(param: List[String]): DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs] = withCols(param)
  }

  object rmu extends EncoderHelper[SlickRmuWrapper, Any] with EncoderWrapperHelper[SlickRmuWrapper, Any, WithCols] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, SlickRmuWrapper, Any]): WithCols[Out, D] = {
      new WithCols[Out, D] {
        override def withCols(param: List[String]): DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs] = {
          val wrapCol = shape.wrapRep(rep)
          val reps = shape.toLawRep(wrapCol, List.empty)
          val jsonColumns = reps.filter(s => param.contains(s.key)).map { wrap =>
            umr.shaped(wrap.slickWrapper.map(r => (wrap.key, r.asJson(wrap.circeEncoder))))
          }
          umr.shaped(jsonColumns).dmap(s => JsonObject.fromMap(s.toMap))
        }
      }
    }
  }

  implicit def rmuImplicit[R, M, U, Level <: FlatShapeLevel](implicit shape: Shape[Level, R, M, U], encoder: Encoder[M], columnInfo: MacroColumnInfo): EncoderShape[R, M, R, SlickRmuWrapper, Any] = {
    new EncoderShape[R, M, R, SlickRmuWrapper, Any] {
      override def wrapRep(base: R): R = base
      override def toLawRep(base: R, oldRep: List[SlickRmuWrapper]): List[SlickRmuWrapper] = {
        type Level1 = Level
        val shape1 = shape
        val impl = new SlickRmuWrapperImpl {
          override type DataType = M
          override val circeEncoder = encoder
          override val key = columnInfo.modelColumnName
          override val slickWrapper: SlickShapeValueWrap[M] = new SlickShapeValueWrap[M] {
            override type Data = M
            override type Rep = R
            override type TargetRep = U
            override type Level = Level1
            override val rep = base
            override val shape = shape1
            override val dataToList = identity[M]
          }
        }
        impl :: oldRep
      }
      override def buildData(data: M, rep: R, oldData: List[Any]): List[Any] = data :: oldData
    }
  }

}