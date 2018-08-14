package net.scalax.asuna.slick.umr

import io.circe.{ Encoder, Json }
import io.circe.syntax._
import net.scalax.asuna.core.common.{ DataGroup, DataRepGroup }
import net.scalax.asuna.core.decoder.{ DecoderShape, SplitData }
import net.scalax.asuna.helper.decoder.{ DecoderContent, DecoderHelper, DecoderWrapperHelper }
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

import scala.reflect.ClassTag

trait UmrHelper {

  trait UmrWrapper[RepOut, DataType] extends DecoderContent[RepOut, DataType] {
    def toSv(implicit classTag: ClassTag[DataType]): ShapedValue[Any, DataType]
  }

  object umr extends DecoderHelper[SlickShapeValueWrapAbs] with DecoderWrapperHelper[SlickShapeValueWrapAbs, UmrWrapper] {
    override def effect[Rep, D, Out](rep: Rep)(implicit shape: DecoderShape[Rep, D, Out, SlickShapeValueWrapAbs]): UmrWrapper[Out, D] = {
      new UmrWrapper[Out, D] {
        override def toSv(implicit classTag: ClassTag[D]): ShapedValue[Any, D] = {
          val wrapCol = shape.wrapRep(rep)
          val reps = shape.toLawRep(wrapCol).reps
          val convertedWrap = reps.map(each =>
            new SlickShapeValueWrap[Any] {
              override type Data = each.Data
              override type Rep = each.Rep
              override type TargetRep = each.TargetRep
              override type Level = each.Level
              override val rep = each.rep
              override val shape = each.shape
              override val dataToList = (d: each.Data) => each.dataToList(d): Any
            })
          SlickShapeValueListWrap(convertedWrap)(s => shape.takeData(DataGroup(items = s), wrapCol).current).shapedValue
        }
      }
    }
  }

  def jsonKey[A, B, C](baseRep: A, key: String)(implicit shape: Shape[_ <: FlatShapeLevel, A, B, C], encoder: Encoder[B]): SlickShapeValueWrap[(String, Json)] = {
    rep(baseRep).map[(String, Json)] { (s: B) => (key, s.asJson(encoder)) }
  }

  implicit def repImplicit[R, D, T, L <: FlatShapeLevel](implicit shape: Shape[L, R, D, T]): DecoderShape[R, D, SlickShapeValueWrap[D], SlickShapeValueWrapAbs] = {
    new DecoderShape[R, D, SlickShapeValueWrap[D], SlickShapeValueWrapAbs] {
      override def wrapRep(base: R): SlickShapeValueWrap[D] = {
        val shape1 = shape
        new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = R
          override type Level = L
          override val shape = shape1
          override val dataToList = identity[D]
          override val rep = base
        }
      }
      override def toLawRep(base: SlickShapeValueWrap[D]): DataRepGroup[SlickShapeValueWrapAbs] = DataRepGroup(List(base: SlickShapeValueWrapAbs))
      override def takeData(oldData: DataGroup, rep: SlickShapeValueWrap[D]): SplitData[D] = {
        val head :: tail = oldData.items
        SplitData(current = head.asInstanceOf[D], left = DataGroup(tail))
      }
    }
  }

  def rep[R, D, T, L <: FlatShapeLevel](baseRep: R)(implicit shape: Shape[L, R, D, T]): SlickShapeValueWrap[D] = {
    val shape1 = shape
    new SlickShapeValueWrap[D] {
      override type TargetRep = T
      override type Data = D
      override type Rep = R
      override type Level = L
      override val shape = shape1
      override val dataToList = identity[D]
      override val rep = baseRep
    }
  }

}