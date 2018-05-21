package net.scalax.asuna.slick.filter

import cats.Contravariant
import io.circe.{ Decoder, Json, JsonObject }
import net.scalax.asuna.core._
import slick.ast.BaseTypedType

import scala.language.implicitConversions

trait SlickFilterCol {
  import slick.lifted.Rep

  type DataType
  type BaseDataType
  type InputDataType
  val basedTypedType: BaseTypedType[BaseDataType]
  val rep2OptRep: Rep[DataType] => Rep[Option[BaseDataType]]
  val data2OptData: DataType => Option[BaseDataType]

  def toOptionCondition(data: InputDataType): Rep[Option[Boolean]]
}

trait SlickFilterColImpl[D] extends SlickFilterCol {
  override type InputDataType = D
}

object SlickFilterColImpl {

  implicit val contravariant: Contravariant[SlickFilterColImpl] = {
    import slick.lifted.Rep
    new Contravariant[SlickFilterColImpl] {
      override def contramap[A, B](fa: SlickFilterColImpl[A])(f: B => A): SlickFilterColImpl[B] = {
        new SlickFilterColImpl[B] {
          override def toOptionCondition(data: B): Rep[Option[Boolean]] = {
            fa.toOptionCondition(f(data))
          }
          override type DataType = fa.DataType
          override type BaseDataType = fa.BaseDataType
          override val basedTypedType = fa.basedTypedType
          override val rep2OptRep = fa.rep2OptRep
          override val data2OptData = fa.data2OptData
        }
      }
    }
  }

}

trait SlickFilterColHelper {

  val filterUnwrap: DataShapeValueInitWrap[SlickFilterCol] = DataShapeValue.toShapeValue[SlickFilterCol]

  trait SlickFilterColExtensionMethod[D, BType] {
    def filter(implicit b: BaseTypedType[BType], profile: slick.jdbc.JdbcProfile): SlickFilterColImpl[D]
  }

  trait JsonKeyWithSlickFilterExtensionMethod[E] {
    def jsonFilterWithKey(key: String)(implicit b: BaseTypedType[E], decoder: Decoder[E]): SlickFilterColImpl[JsonObject]
  }

  implicit def slickFilterColBaseColumnExtensionMethod[D](rep: slick.lifted.Rep[D]): SlickFilterColExtensionMethod[D, D] = {
    new SlickFilterColExtensionMethod[D, D] {
      override def filter(implicit b: BaseTypedType[D], profile: slick.jdbc.JdbcProfile): SlickFilterColImpl[D] = {
        import profile.api._
        new SlickFilterColImpl[D] { self =>
          override type DataType = D
          override type BaseDataType = D
          override val basedTypedType = b
          override val rep2OptRep = (rep: Rep[D]) => rep.?
          override val data2OptData = (data: D) => Option(data)
          override def toOptionCondition(data: D): Rep[Option[Boolean]] = {
            implicit val b = self.basedTypedType
            self.rep2OptRep(rep) === self.data2OptData(data)
          }
        }
      }
    }
  }

  implicit def slickFilterColOptionColumnExtensionMethod[D](rep: slick.lifted.Rep[Option[D]]): SlickFilterColExtensionMethod[Option[D], D] = {
    new SlickFilterColExtensionMethod[Option[D], D] {
      override def filter(implicit b: BaseTypedType[D], profile: slick.jdbc.JdbcProfile): SlickFilterColImpl[Option[D]] = {
        import profile.api._
        new SlickFilterColImpl[Option[D]] { self =>
          override type DataType = Option[D]
          override type BaseDataType = D
          override val basedTypedType = b
          override val rep2OptRep = (rep: Rep[Option[D]]) => rep
          override val data2OptData = (data: Option[D]) => data
          override def toOptionCondition(data: Option[D]): Rep[Option[Boolean]] = {
            implicit val b = self.basedTypedType
            self.rep2OptRep(rep) === self.data2OptData(data)
          }
        }
      }
    }
  }

  implicit def columExtensionMethodWithJsonKey[E](rep: slick.lifted.Rep[E])(implicit profile: slick.jdbc.JdbcProfile) =
    new JsonKeyWithSlickFilterExtensionMethod[E] {
      override def jsonFilterWithKey(key: String)(implicit b: BaseTypedType[E], decoder: Decoder[E]): SlickFilterColImpl[JsonObject] = {
        val f = rep.filter
        new SlickFilterColImpl[JsonObject] {
          import profile.api._
          override type DataType = f.DataType
          override type BaseDataType = f.BaseDataType
          override val basedTypedType = f.basedTypedType
          override val rep2OptRep = (rep: Rep[f.DataType]) => f.rep2OptRep(rep)
          override val data2OptData = (data: f.DataType) => f.data2OptData(data)
          override def toOptionCondition(data: JsonObject): Rep[Option[Boolean]] = {
            data.apply(key).getOrElse(Json.Null).as[E](decoder).toOption match {
              case Some(s) =>
                f.toOptionCondition(s)
              case _ =>
                LiteralColumn(Option(true))
            }
          }
        }
      }
    }

  implicit def readerShape[R]: DataShape[SlickFilterColImpl[R], R, SlickFilterColImpl[R], SlickFilterCol] = {
    new DataShape[SlickFilterColImpl[R], R, SlickFilterColImpl[R], SlickFilterCol] { self =>
      override def wrapRep(base: SlickFilterColImpl[R]): SlickFilterColImpl[R] = base
      override def toLawRep(base: SlickFilterColImpl[R]): DataRepGroup[SlickFilterCol] = DataRepGroup(reps = List(base), subs = List.empty)
      override def takeData(oldData: DataGroup, rep: SlickFilterColImpl[R]): Either[NotConvert, SplitData[R]] = {
        oldData.items match {
          case head :: tail =>
            Right(SplitData(current = head.asInstanceOf[R], left = DataGroup(items = tail, subs = oldData.subs)))
        }
      }
      override def buildData(splitData: R, rep: SlickFilterColImpl[R]): Either[NotConvert, DataGroup] =
        Right(DataGroup(items = List(splitData), subs = List.empty))
    }
  }

}