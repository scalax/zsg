package net.scalax.asuna.slick.filter

import cats.Contravariant
import io.circe.{ Decoder, Json, JsonObject }
import net.scalax.asuna.core._
import slick.ast.BaseTypedType

import shapeless._
import tag._

import scala.language.implicitConversions

trait SFilterColHelper[D] {
  import slick.lifted.Rep

  type BaseDataType
  val basedTypedType: BaseTypedType[BaseDataType]
  val rep2OptRep: Rep[D] => Rep[Option[BaseDataType]]
  val data2OptData: D => Option[BaseDataType]
}

trait SlickFilterCol {
  import slick.lifted.Rep
  type InputDataType
  def toOptionCondition(data: InputDataType): Rep[Option[Boolean]]
}

trait SlickFilterColImpl[D] extends SlickFilterCol with AtomicColumn[D, SlickFilterCol] {
  self =>

  override type InputDataType = D
  override def common: SlickFilterCol = self
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
        }
      }
    }
  }

}

trait SlickFilterColHelper {

  val filterUnwrap: DataShapeValueInitWrap[SlickFilterCol] = DataShapeValue.toShapeValue[SlickFilterCol]

  implicit def JsonKeyWithSlickFilterExtensionMethod[D](implicit b: BaseTypedType[D], profile: slick.jdbc.JdbcProfile): SFilterColHelper[D] = {
    import profile.api._
    new SFilterColHelper[D] { self =>
      override type BaseDataType = D
      override val basedTypedType = b
      override val rep2OptRep = (rep: Rep[D]) => rep.?
      override val data2OptData = (data: D) => Option(data)
    }
  }

  implicit def JsonKeyWithSlickFilterOptionColumnExtensionMethod[D](implicit b: BaseTypedType[D], profile: slick.jdbc.JdbcProfile): SFilterColHelper[Option[D]] = {
    import profile.api._
    new SFilterColHelper[Option[D]] { self =>
      override type BaseDataType = D
      override val basedTypedType = b
      override val rep2OptRep = (rep: Rep[Option[D]]) => rep
      override val data2OptData = (data: Option[D]) => data
    }
  }

  def filterRep[D](rep: slick.lifted.Rep[D])(implicit b: SFilterColHelper[D], profile: slick.jdbc.JdbcProfile): SlickFilterColImpl[D] @@ OutputTag = {
    import profile.api._
    val h = new SlickFilterColImpl[D] { self =>
      override def toOptionCondition(data: D): Rep[Option[Boolean]] = {
        implicit val impl = b.basedTypedType
        b.rep2OptRep(rep) === b.data2OptData(data)
      }
    }
    AtomicColumn.tagOutput(h)
  }

  def filterOptRep[D](rep: slick.lifted.Rep[Option[D]])(implicit b: SFilterColHelper[Option[D]], profile: slick.jdbc.JdbcProfile): SlickFilterColImpl[Option[D]] @@ OutputTag = {
    import profile.api._
    val h = new SlickFilterColImpl[Option[D]] { self =>
      override def toOptionCondition(data: Option[D]): Rep[Option[Boolean]] = {
        implicit val impl = b.basedTypedType
        b.rep2OptRep(rep) === b.data2OptData(data)
      }
    }
    AtomicColumn.tagOutput(h)
  }

  def jsonFilterKey[E](rep: slick.lifted.Rep[E], key: String)(implicit profile: slick.jdbc.JdbcProfile, b: SFilterColHelper[E], decoder: Decoder[E]): SlickFilterColImpl[JsonObject] @@ OutputTag = {
    val f = filterRep(rep)
    val h = new SlickFilterColImpl[JsonObject] {
      import profile.api._
      override def toOptionCondition(data: JsonObject): Rep[Option[Boolean]] = {
        data.apply(key).getOrElse(Json.Null).as[E](decoder).toOption match {
          case Some(s) =>
            f.toOptionCondition(s)
          case _ =>
            LiteralColumn(Option(true))
        }
      }
    }
    AtomicColumn.tagOutput(h)
  }

}