package net.scalax.asuna.slick.umr

import slick.lifted.{ FlatShapeLevel, MappedProjection, Shape, ShapedValue }

import scala.language.existentials
import scala.language.implicitConversions
import scala.reflect.ClassTag

trait SlickShapeValueListWrap[F] {
  type Data
  type Rep
  type TargetRep
  val rep: Rep
  val shape: Shape[FlatShapeLevel, Rep, Data, TargetRep]
  val dataToList: Data => List[F]
  val dataFromList: List[F] => Option[Data]
}

object SlickShapeValueListWrap {

  def apply[T, S](convert: List[T] => S, reConvert: S => Option[List[T]], ct: ClassTag[S], v: SlickShapeValueWrap[T]*): ShapedValue[Any, S] = {
    val sWrap = v.toList match {
      case head :: tail =>
        val initWrap: SlickShapeValueListWrap[T] = new SlickShapeValueListWrap[T] {
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
          val currentWrap = new SlickShapeValueListWrap[T] {
            override type Data = (wrap.Data, current.Data)
            override type Rep = (wrap.Rep, current.Rep)
            override type TargetRep = (wrap.TargetRep, current.TargetRep)
            override val rep: Rep = (wrap.rep, current.rep)
            override val shape = {
              Shape.tuple2Shape(wrap.shape, current.shape)
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
          override val rep: Rep = (())
          override val shape = {
            Shape.unitShape[FlatShapeLevel]
          }
          override val dataFromList: List[T] => Option[Unit] = data =>
            Option(())
          override val dataToList: Unit => List[T] = { data =>
            List.empty
          }
        }: SlickShapeValueListWrap[T]
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
