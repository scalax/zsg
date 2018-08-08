package net.scalax.asuna.slick.filter

import cats.Contravariant
import io.circe.{ Decoder, Json, JsonObject }
import net.scalax.asuna.core.common.AtomicColumn
import net.scalax.asuna.core.encoder.EncoderShape
import net.scalax.asuna.helper.encoder.{ EncoderContent, EncoderHelper, EncoderWrapperHelper }
import slick.ast.BaseTypedType

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

  trait InputData[RepOut, Data] extends EncoderContent[RepOut, Data] {
    def inputData(data: Data)(implicit profile: slick.jdbc.JdbcProfile): Option[slick.lifted.Rep[Option[Boolean]]]
  }

  object filter extends EncoderHelper[SlickFilterCol] with EncoderWrapperHelper[SlickFilterCol, InputData] {

    override def effect[E, U, R](rep: E)(implicit shape: EncoderShape[E, U, R, SlickFilterCol]): InputData[R, U] = {
      new InputData[R, U] {
        override def inputData(data: U)(implicit profile: slick.jdbc.JdbcProfile): Option[slick.lifted.Rep[Option[Boolean]]] = {
          val w = shape.wrapRep(rep)
          val reps = shape.toLawRep(shape.wrapRep(rep), List.empty)
          val dataList = shape.buildData(data, w, List.empty)
          import profile.api._
          val list = reps.zip(dataList).map {
            case (eachRep, eachData) =>
              eachRep.toOptionCondition(eachData.asInstanceOf[eachRep.InputDataType])
          }
          list match {
            case Nil => Option.empty
            case head :: tail => Option(tail.foldLeft(head) { (left, right) => left && right })
          }
        }
      }
    }

  }

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

  def filterRep[D](rep: slick.lifted.Rep[D])(implicit b: SFilterColHelper[D], profile: slick.jdbc.JdbcProfile): SlickFilterColImpl[D] = {
    import profile.api._
    val h = new SlickFilterColImpl[D] { self =>
      override def toOptionCondition(data: D): Rep[Option[Boolean]] = {
        implicit val impl = b.basedTypedType
        b.rep2OptRep(rep) === b.data2OptData(data)
      }
    }
    h
  }

  def jsonFilterKey[E](rep: slick.lifted.Rep[E], key: String)(implicit profile: slick.jdbc.JdbcProfile, b: SFilterColHelper[E], decoder: Decoder[E]): SlickFilterColImpl[JsonObject] = {
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
    h
  }

}