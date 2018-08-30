package net.scalax.asuna.slick.umr

import io.circe.{ Encoder, Json }
import io.circe.syntax._
import net.scalax.asuna.core.decoder.{ DecoderShape, DecoderShapeValue, SplitData }
import net.scalax.asuna.helper.decoder.{ DecoderContent, DecoderHelper, DecoderWrapperHelper, HListDecoderShapeImplicit }
import net.scalax.asuna.helper.encoder.HListEncoderShapeWrap
import slick.lifted.{ FlatShapeLevel, MappedProjection, Shape, ShapedValue }

import scala.reflect.ClassTag

trait UmrWrapper[RepOut, DataType] extends DecoderContent[RepOut, DataType] {
  def toSv(implicit classTag: ClassTag[DataType]): MappedProjection[DataType, Any]
}

object umrImpl extends DecoderHelper[ShapeFunc[(Any, Any)], (Any, Any)] with DecoderWrapperHelper[ShapeFunc[(Any, Any)], (Any, Any), UmrWrapper] {
  override def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape.Aux[Rep, D, Out, ShapeFunc[(Any, Any)], (Any, Any)]): UmrWrapper[Out, D] = {
    new UmrWrapper[Out, D] {
      override def toSv(implicit classTag: ClassTag[D]): MappedProjection[D, Any] = {
        val wrapCol = shape.wrapRep(rep)
        val reps = shape.toLawRep(wrapCol, new ShapeFunc[(Any, Any)] {
          override type RepType = (Unit, Unit)
          override type DataType = (Unit, Unit)
          override protected def baseSV = ShapedValue(((), ()), Shape.tuple2Shape(Shape.unitShape, Shape.unitShape))
          override val output: DataType => (Any, Any) = { case (s, t) => (s: Any, t: Any) }
        })
        val s = reps.map { (t: (Any, Any)) => shape.takeData(wrapCol, t).current }
        s.shapedValue.<>(f = { (u: s.DataType) => s.output(u) }, g = { (t: D) => Option.empty[s.DataType] }).asInstanceOf[MappedProjection[D, Any]]
      }
    }
  }
}

trait UmrHelper extends HListDecoderShapeImplicit {

  val umr = umrImpl

  def jsonKey[A, B, C, L <: FlatShapeLevel](baseRep: A, key: String)(implicit shape: Shape[L, A, B, C], encoder: Encoder[B]): ShapeFunc[(String, Json)] = {
    val shape1 = shape
    (new SlickShapeValueWrap[B] {
      override type TargetRep = C
      override type Data = B
      override type Rep = A
      override type Level = L
      override val shape = shape1
      override val dataToList = identity[B]
      override val rep = baseRep
    }).shapeValue.map { (s: B) => (key, s.asJson(encoder)) }
  }

  implicit def repImplicit[R, D, T, L <: FlatShapeLevel](implicit shape: Shape[L, R, D, T]): DecoderShape.Aux[HListEncoderShapeWrap[R, D], D, ShapeFunc[D], ShapeFunc[(Any, Any)], (Any, Any)] = {
    val ds = implicitly[DecoderShape.Aux[HListEncoderShapeWrap[ShapeFunc[D], D], D, ShapeFunc[D], ShapeFunc[(Any, Any)], (Any, Any)]]
    new DecoderShape[HListEncoderShapeWrap[R, D], D, ShapeFunc[(Any, Any)], (Any, Any)] {
      override type Target = ShapeFunc[D]
      override def wrapRep(base: HListEncoderShapeWrap[R, D]): ShapeFunc[D] = {
        val shape1 = shape
        (new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override type Level = L
          override val shape = shape1
          override val dataToList = identity[D]
          override val rep = base.rep
        }).shapeValue
      }
      override def toLawRep(base: ShapeFunc[D], oldRep: ShapeFunc[(Any, Any)]): ShapeFunc[(Any, Any)] = ds.toLawRep(base, oldRep)
      override def takeData(oldData: ShapeFunc[D], rep: (Any, Any)): SplitData[D, (Any, Any)] = ds.takeData(oldData, rep)
    }
  }

  implicit def shapeFuncImplicit[D, L <: FlatShapeLevel]: DecoderShape.Aux[HListEncoderShapeWrap[ShapeFunc[D], D], D, ShapeFunc[D], ShapeFunc[(Any, Any)], (Any, Any)] = {
    new DecoderShape[HListEncoderShapeWrap[ShapeFunc[D], D], D, ShapeFunc[(Any, Any)], (Any, Any)] {
      override type Target = ShapeFunc[D]
      override def wrapRep(base: HListEncoderShapeWrap[ShapeFunc[D], D]): ShapeFunc[D] = base.rep
      override def toLawRep(base: ShapeFunc[D], oldRep: ShapeFunc[(Any, Any)]): ShapeFunc[(Any, Any)] = new ShapeFunc[(D, (Any, Any))] {
        override type RepType = (ShapedValue[Any, base.DataType], ShapedValue[Any, oldRep.DataType])
        override type DataType = (base.DataType, oldRep.DataType)
        override protected def baseSV = ShapedValue((base.shapedValue, oldRep.shapedValue), Shape.tuple2Shape(Shape.shapedValueShape[Any, base.DataType, FlatShapeLevel], Shape.shapedValueShape[Any, oldRep.DataType, FlatShapeLevel]))
        override val output: ((base.DataType, oldRep.DataType)) => (D, (Any, Any)) = { (s: (base.DataType, oldRep.DataType)) => (base.output(s._1), oldRep.output(s._2)) }
      }.map(s => (s._1: Any, s._2: Any))
      override def takeData(oldData: ShapeFunc[D], rep: (Any, Any)): SplitData[D, (Any, Any)] = {
        SplitData(current = rep._1.asInstanceOf[D], left = rep._2.asInstanceOf[(Any, Any)])
      }
    }
  }

  implicit def shapeFuncImplicit1111[D, L <: FlatShapeLevel]: DecoderShape.Aux[HListEncoderShapeWrap[DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], D], D, DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], ShapeFunc[(Any, Any)], (Any, Any)] = {
    implicit val shape1 = implicitly[DecoderShape.Aux[DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], D, DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], ShapeFunc[(Any, Any)], (Any, Any)]]
    new DecoderShape[HListEncoderShapeWrap[DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], D], D, ShapeFunc[(Any, Any)], (Any, Any)] {
      override type Target = DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)]
      override def wrapRep(base: HListEncoderShapeWrap[DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], D]): DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)] = base.rep
      override def toLawRep(base: DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], oldRep: ShapeFunc[(Any, Any)]): ShapeFunc[(Any, Any)] = shape1.toLawRep(base, oldRep)
      override def takeData(oldData: DecoderShapeValue[D, ShapeFunc[(Any, Any)], (Any, Any)], rep: (Any, Any)): SplitData[D, (Any, Any)] = shape1.takeData(oldData, rep)
    }
  }

  def rep[R, D, T, L <: FlatShapeLevel](baseRep: R)(implicit shape: Shape[L, R, D, T]): ShapeFunc[D] = {
    val shape1 = shape
    (new SlickShapeValueWrap[D] {
      override type TargetRep = T
      override type Data = D
      override type Rep = R
      override type Level = L
      override val shape = shape1
      override val dataToList = identity[D]
      override val rep = baseRep
    }).shapeValue
  }

}