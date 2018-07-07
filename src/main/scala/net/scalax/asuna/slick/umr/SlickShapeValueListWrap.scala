package net.scalax.asuna.slick.umr

import slick.lifted.{ FlatShapeLevel, MappedProjection, Shape, ShapedValue }

import scala.language.existentials
import scala.language.implicitConversions
import scala.reflect.ClassTag

/*trait SlickShapeValueListWrap[F] {
  type Data
  type Rep
  type TargetRep
  type Level <: FlatShapeLevel
  val rep: Rep
  val shape: Shape[Level, Rep, Data, TargetRep]
  val dataToList: Data => List[F]
  val dataFromList: List[F] => Option[Data]
}*/

trait ReadSlickShapeValueListWrap[F] {
  type Data
  type Rep
  type TargetRep
  type Level <: FlatShapeLevel
  val rep: Rep
  val shape: Shape[Level, Rep, Data, TargetRep]
  val dataToList: Data => List[F]
}

trait ShapedValueWrap[D] {
  type RepType
  def shapedValue: ShapedValue[Any, D] = baseSV.asInstanceOf[ShapedValue[Any, D]]
  protected def baseSV: ShapedValue[RepType, D]
}

object SlickShapeValueListWrap {

  /*def completeApply[T, S](convert: List[T] => S, reConvert: S => Option[List[T]], ct: ClassTag[S], v: SlickShapeValueWrap[T]*): ShapedValueWrap[S] = {
    val sWrap = v.toList match {
      case head :: tail =>
        val initWrap: SlickShapeValueListWrap[T] = new SlickShapeValueListWrap[T] {
          override type Data = head.Data
          override type Rep = head.Rep
          override type TargetRep = head.TargetRep
          override type Level = head.Level
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
          val currentWrap = new SlickShapeValueListWrap[T] {
            self =>

            override type Data = (wrap.Data, current.Data)
            override type Rep = (wrap.Rep, current.Rep)
            override type TargetRep = (wrap.TargetRep, current.TargetRep)
            override type Level = FlatShapeLevel
            override val rep: Rep = (wrap.rep, current.rep)
            override val shape = {
              Shape.tuple2Shape[FlatShapeLevel, wrap.Rep, current.Rep, wrap.Data, current.Data, wrap.TargetRep, current.TargetRep](wrap.shape, current.shape)
            }
            override val dataFromList: List[T] => Option[(wrap.Data, current.Data)] = { data =>
              data match {
                case dataHead :: dataTail =>
                  for {
                    t <- wrap.dataFromList(dataTail)
                    s <- current.dataFromList(dataHead)
                  } yield {
                    (t, s)
                  }
              }
            }
            override val dataToList: ((wrap.Data, current.Data)) => List[T] = {
              data =>
                val (h, t) = data
                current.dataToList(t) :: wrap.dataToList(h)
            }
          }: SlickShapeValueListWrap[T]

          currentWrap
        }
      case List(head) =>
        new SlickShapeValueListWrap[T] {
          override type Data = head.Data
          override type Rep = head.Rep
          override type TargetRep = head.TargetRep
          override type Level = head.Level
          override val rep: Rep = head.rep
          override val shape = {
            head.shape
          }
          override val dataToList: Data => List[T] = data =>
            List(head.dataToList(data))
          override val dataFromList: List[T] => Option[Data] = { data =>
            head.dataFromList(data.head)
          }
        }: SlickShapeValueListWrap[T]
      case _ =>
        new SlickShapeValueListWrap[T] {
          override type Data = Unit
          override type Rep = Unit
          override type TargetRep = Unit
          override type Level = FlatShapeLevel
          override val rep: Rep = (())
          override val shape = {
            implicitly[Shape[FlatShapeLevel, Unit, Unit, Unit]]
          }
          override val dataFromList: List[T] => Option[Unit] = data =>
            Option(())
          override val dataToList: Unit => List[T] = { data =>
            List.empty
          }
        }: SlickShapeValueListWrap[T]
    }

    val tatalShapeValue = ShapedValue(sWrap.rep, sWrap.shape)

    val shapeValueR = ShapedValue(
      tatalShapeValue
        .<>[S](
          { s => convert(sWrap.dataToList(s).reverse) },
          s => reConvert(s).map(_.reverse).flatMap(sWrap.dataFromList))(ct),
      implicitly[Shape[FlatShapeLevel, MappedProjection[S, sWrap.Data], S, MappedProjection[S, sWrap.Data]]])

    new ShapedValueWrap[S] {
      override type RepType = MappedProjection[S, sWrap.Data]
      override protected val baseSV = shapeValueR
    }
  }*/

  trait ApplyHelper1[T] {
    def apply[S](convert: List[T] => S)(implicit ct: ClassTag[S]): ShapedValueWrap[S]
  }

  def apply[T](v: List[SlickShapeValueWrap[T]]): ApplyHelper1[T] = {
    new ApplyHelper1[T] {
      def apply[S](convert: List[T] => S)(implicit ct: ClassTag[S]): ShapedValueWrap[S] = {
        val sWrap = v match {
          case head :: tail =>
            val initWrap: ReadSlickShapeValueListWrap[T] = new ReadSlickShapeValueListWrap[T] {
              override type Data = head.Data
              override type Rep = head.Rep
              override type TargetRep = head.TargetRep
              override type Level = head.Level
              override val rep: Rep = head.rep
              override val shape = head.shape
              override val dataToList = (data: Data) => List(head.dataToList(data))
            }

            tail.foldLeft(initWrap) { (wrap, current) =>
              val currentWrap = new ReadSlickShapeValueListWrap[T] {
                self =>

                override type Data = (wrap.Data, current.Data)
                override type Rep = (wrap.Rep, current.Rep)
                override type TargetRep = (wrap.TargetRep, current.TargetRep)
                override type Level = FlatShapeLevel
                override val rep: Rep = (wrap.rep, current.rep)
                override val shape = {
                  Shape.tuple2Shape[FlatShapeLevel, wrap.Rep, current.Rep, wrap.Data, current.Data, wrap.TargetRep, current.TargetRep](wrap.shape, current.shape)
                }
                override val dataToList = { (data: ((wrap.Data, current.Data))) =>
                  val (h, t) = data
                  current.dataToList(t) :: wrap.dataToList(h)
                }
              }: ReadSlickShapeValueListWrap[T]

              currentWrap
            }
          case List(head) =>
            new ReadSlickShapeValueListWrap[T] {
              override type Data = head.Data
              override type Rep = head.Rep
              override type TargetRep = head.TargetRep
              override type Level = head.Level
              override val rep: Rep = head.rep
              override val shape = head.shape
              override val dataToList = (data: Data) => List(head.dataToList(data))
            }: ReadSlickShapeValueListWrap[T]
          case _ =>
            new ReadSlickShapeValueListWrap[T] {
              override type Data = Unit
              override type Rep = Unit
              override type TargetRep = Unit
              override type Level = FlatShapeLevel
              override val rep: Rep = (())
              override val shape = implicitly[Shape[FlatShapeLevel, Unit, Unit, Unit]]
              override val dataToList: Unit => List[T] = (_: Unit) => List.empty
            }: ReadSlickShapeValueListWrap[T]
        }

        val tatalShapeValue = ShapedValue(sWrap.rep, sWrap.shape)

        val shapeValueR = ShapedValue(
          tatalShapeValue.<>[S](
            s => convert(sWrap.dataToList(s).reverse),
            _ => Option.empty[sWrap.Data])(ct),
          implicitly[Shape[FlatShapeLevel, MappedProjection[S, sWrap.Data], S, MappedProjection[S, sWrap.Data]]])

        new ShapedValueWrap[S] {
          override type RepType = MappedProjection[S, sWrap.Data]
          override protected val baseSV = shapeValueR
        }
      }
    }
  }

}
