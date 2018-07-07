package net.scalax.asuna.slick.umr

import io.circe.{ Encoder, Json }
import io.circe.syntax._
import net.scalax.asuna.core._
import slick.lifted.{ FlatShapeLevel, Shape, ShapedValue }

import scala.reflect.ClassTag

object UmrReaderQuery {

  def unWrap[R](sv: DataShapeValue[R, SlickShapeValueWrapAbs])(implicit profile: slick.jdbc.JdbcProfile, classTag: ClassTag[R]): ShapedValue[Any, R] = {
    val impl = implicitly[DataShape[DataShapeValue[R, SlickShapeValueWrapAbs], R, DataShapeValue[R, SlickShapeValueWrapAbs], SlickShapeValueWrapAbs]]
    val reps = impl.toLawRep(impl.wrapRep(sv)).reps
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
    SlickShapeValueListWrap(convertedWrap)(s => impl.takeData(DataGroup(items = s), sv).current).shapedValue
  }

}

trait UmrHelper {

  val umr: AllHelper[SlickShapeValueWrapAbs] = new AllHelper[SlickShapeValueWrapAbs] {}

  def jsonKey[A, B, C](baseRep: A, key: String)(implicit shape: Shape[_ <: FlatShapeLevel, A, B, C], encoder: Encoder[B]): SlickShapeValueWrap[(String, Json)] = {
    rep(baseRep).map[(String, Json)] { (s: B) =>
      (key, s.asJson(encoder))
    }
  }

  implicit def repImplicit[R, D, T, L <: FlatShapeLevel](implicit shape: Shape[L, R, D, T]): DataShape[R, D, SlickShapeValueWrap[D], SlickShapeValueWrapAbs] = {
    new DataShape[R, D, SlickShapeValueWrap[D], SlickShapeValueWrapAbs] {
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

  def toUmrReader[T, R, U](col: T)(implicit shape: DataShape[T, R, U, SlickShapeValueWrapAbs], profile: slick.jdbc.JdbcProfile, classTag: ClassTag[R]): ShapedValue[Any, R] = {
    val shape1 = shape
    val q = new DataShapeValue[R, SlickShapeValueWrapAbs] {
      override type RepType = U
      override val rep = shape1.wrapRep(col)
      override val shape: DataShape[U, R, U, SlickShapeValueWrapAbs] = shape1.packed
    }
    UmrReaderQuery.unWrap(q)
  }

}