package net.scalax.asuna.slick.umr.rmu

import io.circe.{ Encoder, JsonObject }
import io.circe.syntax._
import net.scalax.asuna.core.common.{ AtomicColumn, DataGroup, DataRepGroup }
import net.scalax.asuna.core.decoder.DecoderShapeValue
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper }
import net.scalax.asuna.slick.umr.{ SlickShapeValueWrap, SlickShapeValueWrapAbs, UmrHelper }
import slick.lifted.{ FlatShapeLevel, Shape }

trait SlickRmuWrapper {

  type DataType
  val circeEncoder: Encoder[DataType]
  val slickWrapper: SlickShapeValueWrap[DataType]

}

trait SlickRmuWrapperImpl extends SlickRmuWrapper with AtomicColumn[String, SlickRmuWrapper] {
  self =>

  override def common: SlickRmuWrapper = self

}

trait RmuWriterQuery extends UmrHelper {

  trait WithCols extends Function1[List[String], DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs]] {
    def withCols(param: List[String]): DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs]
    override def apply(param: List[String]): DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs] = withCols(param)
  }

  trait RmuWrapper[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
    def decoder(data: DataType): WithCols
  }

  object rmu extends EncoderHelper[SlickRmuWrapper] with EncoderWrapperHelper[SlickRmuWrapper, RmuWrapper] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, SlickRmuWrapper]): RmuWrapper[Out, D] = {
      new RmuWrapper[Out, D] {
        override def decoder(cols: D): WithCols = {
          new WithCols {
            override def withCols(param: List[String]): DecoderShapeValue[JsonObject, SlickShapeValueWrapAbs] = {
              val wrapCol = shape.wrapRep(rep)
              val reps = shape.toLawRep(wrapCol).reps
              val allColNames = shape.buildData(cols, wrapCol).items.map(_.asInstanceOf[String])
              val jsonColumns = reps.zip(allColNames).filter(s => param.contains(s._2)).map {
                case (wrap, name) =>
                  umr.shaped(wrap.slickWrapper.map(r => (name, r.asJson(wrap.circeEncoder))))
              }
              umr.shaped(jsonColumns).dmap(s => JsonObject.fromMap(s.toMap))
            }
          }
        }
      }
    }
  }

  implicit def rmuImplicit[R, M, U, Level <: FlatShapeLevel](implicit shape: Shape[Level, R, M, U], encoder: Encoder[M]): EncoderShape[R, String, R, SlickRmuWrapper] = {
    new EncoderShape[R, String, R, SlickRmuWrapper] {
      override def wrapRep(base: R): R = base
      override def toLawRep(base: R): DataRepGroup[SlickRmuWrapper] = {
        type Level1 = Level
        val shape1 = shape
        val impl = new SlickRmuWrapperImpl {
          override type DataType = M
          override val circeEncoder = encoder
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
        DataRepGroup(List(impl))
      }
      override def buildData(data: String, rep: R): DataGroup = DataGroup(List(data.asInstanceOf[String]))
    }
  }

}