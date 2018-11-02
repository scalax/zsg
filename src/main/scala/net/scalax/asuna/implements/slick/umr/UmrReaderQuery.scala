package net.scalax.asuna.slick.umr

import io.circe.{Encoder, Json}
import io.circe.syntax._
import net.scalax.asuna.core.decoder.{DecoderShape, SplitData}
import net.scalax.asuna.mapper.decoder.{DecoderContent, DecoderHelper, DecoderWrapperHelper}
import slick.lifted.{FlatShapeLevel, MappedProjection, Shape, ShapedValue}

import scala.reflect.ClassTag

trait UmrWrapper[RepOut, DataType] extends DecoderContent[RepOut, DataType] {
  def toSv(implicit classTag: ClassTag[DataType]): MappedProjection[DataType, Any]
}

object umrImpl extends DecoderHelper[ShapeFunc[(Any, Any)], (Any, Any)] with DecoderWrapperHelper[ShapeFunc[(Any, Any)], (Any, Any), UmrWrapper] {
  override def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, ShapeFunc[(Any, Any)], (Any, Any)]): UmrWrapper[Out, D] = {
    new UmrWrapper[Out, D] {
      override def toSv(implicit classTag: ClassTag[D]): MappedProjection[D, Any] = {
        val wrapCol = shape.wrapRep(rep)
        val reps = shape.buildRep(
            wrapCol
          , new ShapeFunc[(Any, Any)] {
            override type RepType  = (Unit, Unit)
            override type DataType = (Unit, Unit)
            override protected def baseSV               = ShapedValue(((), ()), Shape.tuple2Shape(Shape.unitShape, Shape.unitShape))
            override val output: DataType => (Any, Any) = { case (s, t) => (s: Any, t: Any) }
          }
        )
        val s = reps.map { (t: (Any, Any)) =>
          shape.takeData(wrapCol, t).current
        }
        s.shapedValue
          .<>(f = { (u: s.DataType) =>
            s.output(u)
          }, g = { (t: D) =>
            Option.empty[s.DataType]
          })
          .asInstanceOf[MappedProjection[D, Any]]
      }
    }
  }
}

trait UmrHelper {

  val umr = umrImpl

  def jsonKey[A, B, C, L <: FlatShapeLevel](baseRep: A, key: String)(implicit shape: Shape[L, A, B, C], encoder: Encoder[B]): ShapeFunc[(String, Json)] = {
    val shape1 = shape
    (new SlickShapeValueWrap[B] {
      override type TargetRep = C
      override type Data      = B
      override type Rep       = A
      override type Level     = L
      override val shape      = shape1
      override val dataToList = identity[B] _
      override val rep        = baseRep
    }).shapeValue.map { (s: B) =>
      (key, s.asJson(encoder))
    }
  }

  implicit def repImplicit[R, D, T, L <: FlatShapeLevel](
      implicit shape: Shape[L, R, D, T]
  ): DecoderShape.Aux[R, D, ShapeFunc[D], ShapeFunc[(Any, Any)], (Any, Any)] = {
    val ds = implicitly[DecoderShape.Aux[ShapeFunc[D], D, ShapeFunc[D], ShapeFunc[(Any, Any)], (Any, Any)]]
    new DecoderShape[R, ShapeFunc[(Any, Any)], (Any, Any)] {
      override type Target = ShapeFunc[D]
      override type Data   = D
      override def wrapRep(base: => R): ShapeFunc[D] = {
        val shape1 = shape
        (new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data      = D
          override type Rep       = R
          override type Level     = L
          override val shape      = shape1
          override val dataToList = identity[D] _
          override val rep        = base
        }).shapeValue
      }
      override def buildRep(base: ShapeFunc[D], oldRep: ShapeFunc[(Any, Any)]): ShapeFunc[(Any, Any)] = ds.buildRep(base, oldRep)
      override def takeData(oldData: ShapeFunc[D], rep: (Any, Any)): SplitData[D, (Any, Any)]         = ds.takeData(oldData, rep)
    }
  }

  implicit def shapeFuncImplicit[D]: DecoderShape.Aux[ShapeFunc[D], D, ShapeFunc[D], ShapeFunc[(Any, Any)], (Any, Any)] = {
    new DecoderShape[ShapeFunc[D], ShapeFunc[(Any, Any)], (Any, Any)] {
      override type Target = ShapeFunc[D]
      override type Data   = D
      override def wrapRep(base: => ShapeFunc[D]): ShapeFunc[D] = base
      override def buildRep(base: ShapeFunc[D], oldRep: ShapeFunc[(Any, Any)]): ShapeFunc[(Any, Any)] =
        new ShapeFunc[(D, (Any, Any))] {
          override type RepType  = (ShapedValue[Any, base.DataType], ShapedValue[Any, oldRep.DataType])
          override type DataType = (base.DataType, oldRep.DataType)
          override protected def baseSV =
            ShapedValue(
                (base.shapedValue, oldRep.shapedValue)
              , Shape.tuple2Shape(Shape.shapedValueShape[Any, base.DataType, FlatShapeLevel], Shape.shapedValueShape[Any, oldRep.DataType, FlatShapeLevel])
            )
          override val output: ((base.DataType, oldRep.DataType)) => (D, (Any, Any)) = { (s: (base.DataType, oldRep.DataType)) =>
            (base.output(s._1), oldRep.output(s._2))
          }
        }.map(s => (s._1: Any, s._2: Any))
      override def takeData(oldData: ShapeFunc[D], rep: (Any, Any)): SplitData[D, (Any, Any)] = {
        SplitData(current = rep._1.asInstanceOf[D], left = rep._2.asInstanceOf[(Any, Any)])
      }
    }
  }

  def rep[R, D, T, L <: FlatShapeLevel](baseRep: R)(implicit shape: Shape[L, R, D, T]): ShapeFunc[D] = {
    val shape1 = shape
    (new SlickShapeValueWrap[D] {
      override type TargetRep = T
      override type Data      = D
      override type Rep       = R
      override type Level     = L
      override val shape      = shape1
      override val dataToList = identity[D] _
      override val rep        = baseRep
    }).shapeValue
  }

}
