package net.scalax.umr

import slick.lifted.{ FlatShapeLevel, MappedProjection, Shape, ShapedValue }
import io.circe.{ Encoder, Json }
import io.circe.syntax._
import net.scalax.asuna.core._

import scala.language.existentials
import scala.language.implicitConversions
import scala.reflect.ClassTag

trait ShapeValueWrap[F] {
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
    r: H => Option[F] = (s: H) => Option.empty): ShapeValueWrap[H] = {
    new ShapeValueWrap[H] {
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

trait ShapeValueWrapHelper {

  implicit class jsonExtMethod[M](rep: M) {
    def jsonWithKey[D, T](key: String)(
      implicit
      shape: Shape[_ <: FlatShapeLevel, M, D, T],
      encoder: Encoder[D]): ShapeValueWrap[(String, Json)] = {
      shapeValueWrapExtensionMethod(rep).toWrap.map[(String, Json)]({ (s: D) =>
        (key, s.asJson(encoder))
      })
    }
  }

  implicit class shapeValueWrapExtensionMethod[R](rep: R) {
    def toWrap[D, T](implicit shape: Shape[_ <: FlatShapeLevel, R, D, T]): ShapeValueWrap[D] = {
      val rep1 = rep
      val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]]
      new ShapeValueWrap[D] {
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

  implicit def simpleRepShapeImplicit[R, D, T](implicit shape: Shape[_ <: FlatShapeLevel, R, D, T]): DataShape[R, D, T, ShapeValueWrap[Any]] = {
    new DataShape[R, D, T, ShapeValueWrap[Any]] {
      self =>
      override def wrapRep(base: R): T = shape.pack(base)

      override def toLawRep(base: T): DataRepGroup[ShapeValueWrap[Any]] = {
        val rep1 = base
        val shape1 = shape.asInstanceOf[Shape[FlatShapeLevel, R, D, T]].packedShape
        val wrap = new ShapeValueWrap[D] {
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

  implicit def shapeValueWrapShapeImplicit[T]: DataShape[ShapeValueWrap[T], T, ShapeValueWrap[T], ShapeValueWrap[Any]] = {
    new DataShape[ShapeValueWrap[T], T, ShapeValueWrap[T], ShapeValueWrap[Any]] {
      self =>
      override def wrapRep(base: ShapeValueWrap[T]): ShapeValueWrap[T] = base

      override def toLawRep(base: ShapeValueWrap[T]): DataRepGroup[ShapeValueWrap[Any]] = {
        DataRepGroup(reps = List(base.map(s => s: Any, (m: Any) => Option(m.asInstanceOf[T]))), subs = List.empty)
      }

      override def takeData(oldData: DataGroup, rep: ShapeValueWrap[T]): Either[NotConvert, SplitData[T]] = {
        Right(SplitData(current = oldData.items.head.asInstanceOf[T], left = DataGroup(items = oldData.items.tail, subs = oldData.subs)))
      }

      override def buildData(splitData: T, rep: ShapeValueWrap[T]): Either[NotConvert, DataGroup] = {
        Right(DataGroup(items = List(splitData), subs = List.empty))
      }
    }
  }

}

trait ShapeListWrap[F] {
  type Data
  type Rep
  type TargetRep
  val rep: Rep
  val shape: Shape[FlatShapeLevel, Rep, Data, TargetRep]
  val dataToList: Data => List[F]
  val dataFromList: List[F] => Option[Data]
}

object ListShape {

  def apply[T, S](convert: List[T] => S, reConvert: S => Option[List[T]], ct: ClassTag[S], v: ShapeValueWrap[T]*): ShapedValue[Any, S] = {
    val sWrap = v.toList match {
      case head :: tail =>
        val initWrap: ShapeListWrap[T] = new ShapeListWrap[T] {
          override type Data = head.Data
          override type Rep = head.Rep
          override type TargetRep = head.TargetRep
          override val rep: Rep = head.rep
          override val shape = {
            head.shape
          }
          override val dataToList: Data => List[T] = data =>
            List(head.dataToList(data))
          override val dataFromList: List[T] => Option[Data] = { data =>
            head.dataFromList(data.head)
          }
        }

        tail.foldLeft(initWrap) { (wrap, current) =>
          val currentWrap = new ShapeListWrap[T] {
            override type Data = (current.Data, wrap.Data)
            override type Rep = (current.Rep, wrap.Rep)
            override type TargetRep = (current.TargetRep, wrap.TargetRep)
            override val rep: Rep = (current.rep, wrap.rep)
            override val shape = {
              Shape.tuple2Shape(current.shape, wrap.shape)
            }
            override val dataFromList: List[T] => Option[(current.Data, wrap.Data)] = { data =>
              data match {
                case dataHead :: dataTail =>
                  for {
                    s <- current.dataFromList(dataHead)
                    t <- wrap.dataFromList(dataTail)
                  } yield {
                    (s, t)
                  }
              }
            }
            override val dataToList: ((current.Data, wrap.Data)) => List[T] = {
              data =>
                val (h, t) = data
                current.dataToList(h) :: wrap.dataToList(t)
            }
          }: ShapeListWrap[T]

          currentWrap
        }
      case List(head) =>
        new ShapeListWrap[T] {
          override type Data = head.Data
          override type Rep = head.Rep
          override type TargetRep = head.TargetRep
          override val rep: Rep = head.rep
          override val shape = {
            head.shape
          }
          override val dataToList: Data => List[T] = data =>
            List(head.dataToList(data))
          override val dataFromList: List[T] => Option[Data] = { data =>
            head.dataFromList(data.head)
          }
        }: ShapeListWrap[T]
      case _ =>
        new ShapeListWrap[T] {
          override type Data = Unit
          override type Rep = Unit
          override type TargetRep = Unit
          override val rep: Rep = (())
          override val shape = {
            Shape.unitShape[FlatShapeLevel]
          }
          override val dataFromList: List[T] => Option[Unit] = data =>
            Option(())
          override val dataToList: Unit => List[T] = { data =>
            List.empty
          }
        }: ShapeListWrap[T]
    }

    val tatalShapeValue = ShapedValue(sWrap.rep, sWrap.shape)

    ShapedValue(
      tatalShapeValue
        .<>[S](
          { s => convert(sWrap.dataToList(s).reverse) },
          s => reConvert(s).map(_.reverse).flatMap(sWrap.dataFromList))(ct),
      implicitly[Shape[FlatShapeLevel, MappedProjection[S, sWrap.Data], S, MappedProjection[S, sWrap.Data]]]).asInstanceOf[ShapedValue[Any, S]]
  }

}
