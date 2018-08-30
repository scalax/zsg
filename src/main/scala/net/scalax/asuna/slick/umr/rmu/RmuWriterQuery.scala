package net.scalax.asuna.slick.umr.rmu

import io.circe.{ Encoder, JsonObject }
import io.circe.syntax._
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue, SplitData }
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderWrapperHelper, HListEncoderShapeImplicit, HListEncoderShapeWrap }
import net.scalax.asuna.slick.umr.{ ShapeFunc, SlickShapeValueWrap, umrImpl }
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

trait SlickRmuWrapper {

  type DataType
  val circeEncoder: Encoder[DataType]
  val slickWrapper: SlickShapeValueWrap[DataType]
  val key: String

}

trait SlickRmuWrapperImpl extends SlickRmuWrapper

trait RmuWriterQuery extends HListEncoderShapeImplicit {

  trait WithCols[RepOut, DataType] extends EncoderContent[RepOut, DataType] {
    def withCols(param: List[String]): DecoderShapeValue[JsonObject, ShapeFunc[(Any, Any)], (Any, Any)]
  }

  object rmu extends EncoderWrapperHelper[List[SlickRmuWrapper], List[String], WithCols] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape.Aux[Rep, D, Out, List[SlickRmuWrapper], List[String]]): WithCols[Out, D] = {
      implicit def abc[H]: DecoderShape.Aux[ShapeFunc[H], H, ShapeFunc[H], ShapeFunc[(Any, Any)], (Any, Any)] = {
        new DecoderShape[ShapeFunc[H], H, ShapeFunc[(Any, Any)], (Any, Any)] {
          override type Target = ShapeFunc[H]
          override def wrapRep(base: ShapeFunc[H]): ShapeFunc[H] = base
          override def toLawRep(base: ShapeFunc[H], oldRep: ShapeFunc[(Any, Any)]): ShapeFunc[(Any, Any)] = new ShapeFunc[(H, (Any, Any))] {
            override type RepType = (ShapedValue[Any, base.DataType], ShapedValue[Any, oldRep.DataType])
            override type DataType = (base.DataType, oldRep.DataType)
            override protected def baseSV = ShapedValue((base.shapedValue, oldRep.shapedValue), Shape.tuple2Shape(Shape.shapedValueShape[Any, base.DataType, FlatShapeLevel], Shape.shapedValueShape[Any, oldRep.DataType, FlatShapeLevel]))
            override val output: ((base.DataType, oldRep.DataType)) => (H, (Any, Any)) = { (s: (base.DataType, oldRep.DataType)) => (base.output(s._1), oldRep.output(s._2)) }
          }.map(s => (s._1: Any, s._2: Any))
          override def takeData(oldData: ShapeFunc[H], rep: (Any, Any)): SplitData[H, (Any, Any)] = SplitData(current = rep._1.asInstanceOf[H], left = rep._2.asInstanceOf[(Any, Any)])
        }
      }

      new WithCols[Out, D] {
        override def withCols(param: List[String]): DecoderShapeValue[JsonObject, ShapeFunc[(Any, Any)], (Any, Any)] = {
          val wrapCol = shape.wrapRep(rep)
          val reps = shape.toLawRep(wrapCol, List.empty)
          val jsonColumns = reps.filter(s => param.contains(s.key)).map { wrap =>
            umrImpl.shaped(wrap.slickWrapper.map(r => (wrap.key, r.asJson(wrap.circeEncoder))).shapeValue)
          }
          umrImpl.shaped(jsonColumns).dmap(s => JsonObject.fromMap(s.toMap))
        }
      }
    }
  }

  implicit def rmuImplicit[R, M, U, Level <: FlatShapeLevel](implicit shape: Shape[Level, R, M, U], encoder: Encoder[M]): EncoderShape.Aux[HListEncoderShapeWrap[R, M], M, SlickRmuWrapper, List[SlickRmuWrapper], List[String]] = {
    val shape1 = shape
    new EncoderShape[HListEncoderShapeWrap[R, M], M, List[SlickRmuWrapper], List[String]] {
      type Level1 = Level
      override type Target = SlickRmuWrapper
      override def wrapRep(base: HListEncoderShapeWrap[R, M]): SlickRmuWrapper = new SlickRmuWrapper {
        override type DataType = M
        override val circeEncoder = encoder
        override val slickWrapper = new SlickShapeValueWrap[M] {
          override type Data = M
          override type Rep = R
          override type TargetRep = U
          override type Level = Level1
          override val rep: R = base.rep
          override val shape = shape1
          override val dataToList: Data => OutPut = identity[Data]
        }
        override val key = base.columnInfo.modelColumnName
      }
      override def toLawRep(base: SlickRmuWrapper, oldRep: List[SlickRmuWrapper]): List[SlickRmuWrapper] = base :: oldRep
      override def buildData(data: M, rep: SlickRmuWrapper, oldData: List[String]): List[String] = rep.key :: oldData
    }
  }

}