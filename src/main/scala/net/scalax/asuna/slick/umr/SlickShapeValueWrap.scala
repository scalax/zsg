package net.scalax.asuna.slick.umr

import slick.lifted.{ FlatShapeLevel, Shape }
import io.circe.{ Encoder, Json }
import io.circe.syntax._
import net.scalax.asuna.core._

import scala.language.existentials
import scala.language.implicitConversions

trait SlickShapeValueWrap[F] {
  self =>

  type Data
  type Rep
  type TargetRep
  val rep: Rep
  val shape: Shape[FlatShapeLevel, Rep, Data, TargetRep]
  val dataToList: Data => F
  val dataFromList: F => Option[Data]

  def map[H](
    t: F => H,
    r: H => Option[F] = (s: H) => Option.empty): SlickShapeValueWrap[H] = {
    new SlickShapeValueWrap[H] {
      override type Data = self.Data
      override type Rep = self.Rep
      override type TargetRep = self.TargetRep
      override val rep = self.rep
      override val shape = self.shape
      override val dataToList = { (s: Data) =>
        t(self.dataToList(s))
      }
      override val dataFromList = { (s: H) =>
        r(s).flatMap(t => self.dataFromList(t))
      }
    }
  }
}

trait SlickShapeValueWrapHelper {

  val umrUnwrap: DataShapeValueInitWrap[SlickShapeValueWrap[Any]] = DataShapeValue.toShapeValue[SlickShapeValueWrap[Any]]

  implicit class jsonExtMethod[M](rep: M) {
    def jsonWithKey[D, T](key: String)(
      implicit
      shape: Shape[_ <: FlatShapeLevel, M, D, T],
      encoder: Encoder[D]): SlickShapeValueWrap[(String, Json)] = {
      shapeValueWrapExtensionMethod(rep).toWrap.map[(String, Json)] { (s: D) =>
        (key, s.asJson(encoder))
      }
    }
  }

  implicit class shapeValueWrapExtensionMethod[R](rep: R) {
    def toWrap[D, T](implicit shape: Shape[_ <: FlatShapeLevel, R, D, T]): SlickShapeValueWrap[D] = {
      val rep1 = rep
      val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]]
      new SlickShapeValueWrap[D] {
        override type TargetRep = T
        override type Data = D
        override type Rep = R
        override val shape = shape1
        override val dataToList = { (data: D) =>
          data
        }
        override val dataFromList = { (data: D) =>
          Option(data)
        }
        override val rep = rep1
      }
    }
  }

  implicit def simpleRepShapeImplicit[R, D, T](implicit shape: Shape[_ <: FlatShapeLevel, R, D, T]): DataShape[R, D, T, SlickShapeValueWrap[Any]] = {
    new DataShape[R, D, T, SlickShapeValueWrap[Any]] {
      self =>
      override def wrapRep(base: R): T = shape.pack(base)

      override def toLawRep(base: T): DataRepGroup[SlickShapeValueWrap[Any]] = {
        val rep1 = base
        val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]].packedShape
        val wrap = new SlickShapeValueWrap[D] {
          override type TargetRep = T
          override type Data = D
          override type Rep = T
          override val shape = shape1
          override val dataToList = { (data: D) =>
            data
          }
          override val dataFromList = { (data: D) =>
            Option(data)
          }
          override val rep = rep1
        }.map(s => s: Any, (m: Any) => Option(m.asInstanceOf[D]))
        DataRepGroup(reps = List(wrap), subs = List.empty)
      }

      override def takeData(oldData: DataGroup, rep: T): Either[NotConvert, SplitData[D]] = {
        Right(SplitData(current = oldData.items.head.asInstanceOf[D], left = DataGroup(items = oldData.items.tail, subs = oldData.subs)))
      }

      override def buildData(splitData: D, rep: T): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData), subs = List.empty))
      }
    }
  }

  implicit def shapeValueWrapShapeImplicit[T]: DataShape[SlickShapeValueWrap[T], T, SlickShapeValueWrap[T], SlickShapeValueWrap[Any]] = {
    new DataShape[SlickShapeValueWrap[T], T, SlickShapeValueWrap[T], SlickShapeValueWrap[Any]] {
      self =>
      override def wrapRep(base: SlickShapeValueWrap[T]): SlickShapeValueWrap[T] = base

      override def toLawRep(base: SlickShapeValueWrap[T]): DataRepGroup[SlickShapeValueWrap[Any]] = {
        DataRepGroup(reps = List(base.map(s => s: Any, (m: Any) => Option(m.asInstanceOf[T]))), subs = List.empty)
      }

      override def takeData(oldData: DataGroup, rep: SlickShapeValueWrap[T]): Either[NotConvert, SplitData[T]] = {
        Right(SplitData(current = oldData.items.head.asInstanceOf[T], left = DataGroup(items = oldData.items.tail, subs = oldData.subs)))
      }

      override def buildData(splitData: T, rep: SlickShapeValueWrap[T]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData), subs = List.empty))
      }
    }
  }

}