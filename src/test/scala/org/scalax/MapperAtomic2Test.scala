package org.scalax.asuna.mapper.common2;
import io.circe.{Decoder, Json, JsonObject}
import shapeless._

import scala.util.Try

object MiaoWuTest {
  case class MiaoWu(i1: String, i2: Int, i3: String, i4: Int, i5: String, i6: Int, i7: String, i8: Int, i9: String)

  trait PropertyType[T] { def name: String }

  val field: FieldApply[MiaoWu] = new FieldApply[MiaoWu] {}

  trait FieldApply[Case] {
    def field[T](f: Case => T, name: String): PropertyType[T] = {
      val name1 = name
      new PropertyType[T] { override val name = name1 }
    }
  }

  object Poly {
    val i2 = Decoder.decodeString.emapTry(i => Try { i.toInt })
  }

  trait Placeholder

  val p: Placeholder = new Placeholder {}

  val h = new MiaoMiao2(
      new MiaoMiao7(
        (p, field.field(_.i1, "i1"))
      , (Poly.i2, field.field(_.i2, "i2"))
      //, (p, field.field(_.i2, "i2"))
      , (p, field.field(_.i3, "i3"))
      , (p, field.field(_.i4, "i4"))
      , (p, field.field(_.i5, "i5"))
      , (p, field.field(_.i6, "i6"))
      , (p, field.field(_.i7, "i7"))
    )
    , new MiaoMiao2((p, field.field(_.i8, "i8")), (p, field.field(_.i9, "i9")))
  )

  class Writable extends RM {
    override type M[D] = Decoder[D] :: HNil
  }

  object i extends Context[Writable] {
    override def map[A, B](r: A => B): Decoder[A] :: HNil => Decoder[B] :: HNil = { ha =>
      val a :: HNil = ha
      a.map(r) :: HNil
    }
  }

  class Tag[T] extends Item {
    override type D = T
  }

  implicit def implicit1[D]: AppendToMiaoMiaoMiao[(Decoder[D], PropertyType[D]), Writable, Tag[D]] =
    new AppendToMiaoMiaoMiao[(Decoder[D], PropertyType[D]), Writable, Tag[D]] {
      override def add[U](t: (Decoder[D], PropertyType[D]), old: Decoder[U] :: HNil, context: Context[Writable]): Decoder[(D, U)] :: HNil = {
        val du :: HNil = old
        val (dd, pro)  = t
        Decoder.decodeJsonObject.emap { j: JsonObject =>
          val di = Json.fromJsonObject(j).as(du).left.map(_.getMessage)
          val d = j(pro.name) match {
            case Some(r) => Right(r)
            case _       => Left("")
          }
          val dl = d.flatMap(j => j.as(dd).left.map(_.getMessage))
          for {
            d1 <- di
            d2 <- dl
          } yield (d2, d1)
        }
      } :: HNil
    }

  implicit def implicit2[D](implicit dd: Decoder[D]): AppendToMiaoMiaoMiao[(Placeholder, PropertyType[D]), Writable, Tag[D]] =
    new AppendToMiaoMiaoMiao[(Placeholder, PropertyType[D]), Writable, Tag[D]] {
      override def add[U](t: (Placeholder, PropertyType[D]), old: Decoder[U] :: HNil, context: Context[Writable]): Decoder[(D, U)] :: HNil = {
        val du :: HNil = old
        val (_, pro)   = t
        Decoder.decodeJsonObject.emap { j: JsonObject =>
          val di = Json.fromJsonObject(j).as(du).left.map(_.getMessage)
          val d = j(pro.name) match {
            case Some(r) => Right(r)
            case _       => Left("")
          }
          val dl = d.flatMap(j => j.as(dd).left.map(_.getMessage))
          for {
            d1 <- di
            d2 <- dl
          } yield (d2, d1)
        }
      } :: HNil
    }

  val toModel: MiaoMiao2[MiaoMiao7[String, Int, String, Int, String, Int, String], MiaoMiao2[Int, String]] => MiaoWu = { m =>
    MiaoWu(m.i1.i1, m.i1.i2, m.i1.i3, m.i1.i4, m.i1.i5, m.i1.i6, m.i1.i7, m.i2.i1, m.i2.i2)
  }

  val modelDecoder :: HNil = i.lift(h, Decoder.instance(_ => Right(new MiaoMiao0)) :: HNil)
  val ii: Decoder[MiaoWu]  = modelDecoder.map(toModel)

}
