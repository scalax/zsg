package org.scalax.asuna.mapper.append.test

import org.scalax.asuna.ii.item.AppendTuple
import org.scalax.asuna.mapper.append.slick.SlickUtil.TupleTestImplicit
import org.scalax.asuna.mapper.item.{Application, TypeParam}
import org.scalax.asuna.mapper.append.slick.TupleTest3
import slick.ast.TypedType

import scala.language.implicitConversions

object TupleTest4 extends App {

  val iiiiii = new TupleTest3.TEncoderContext[(AppendTuple, TupleTestImplicit)]

  implicit def columnExtendsionMethod[T, I <: TypeParam, RawDataType](
      i: T
  )(implicit ii: Application[TupleTest3.TupleContext[(AppendTuple, TupleTestImplicit)], T, I], p: T <:< I#H, profile: slick.jdbc.JdbcProfile): TupleTest3.P[I#T#H] = {
    import profile.api._
    ii.application(iiiiii).iii(p(i), implicitly[TypedType[Option[Boolean]]])
  }

  import slick.jdbc.H2Profile.api._

  class T(tag: Tag) extends Table[(Int, String, Option[String], Double)](tag, Some("myschema"), "mytable") {
    def id        = column[Int]("id")
    def myString  = column[String]("myString")
    def optString = column[Option[String]]("optString")
    def price     = column[Double]("PRICE")
    def *         = (id, myString, optString, price)
  }

  val ts = TableQuery[T]

  val s7 = ts
    .filter { d =>
      (d.id, d.price) inSet Seq(1 -> 1.0, 2 -> 2.0)
    }
    .filterIf(true)(_.myString === "stack")
    .result
    .statements
    .head
  println(s7)
  val i7 = s7 endsWith """where (("id", "PRICE") in ((1, 1.0), (2, 2.0))) and ("myString" = 'stack')"""
  println(i7)

  val s8 = ts
    .filter { d =>
      (d.id, d.price) inSetBind Seq(1 -> 1.0, 2 -> 2.0)
    }
    .filterIf(true)(_.myString === "stack")
    .result
    .statements
    .head
  println(s8)
  val i8 = s8 endsWith """where (("id", "PRICE") in ((?, ?), (?, ?))) and ("myString" = 'stack')"""
  println(i8)

  val s9 = ts
    .filter { d =>
      (d.id.?, d.price) inSet Seq(Option(1) -> 1.0, Option.empty -> 2.0)
    }
    .filterIf(true)(_.myString === "stack")
    .result
    .statements
    .head
  println(s9)
  val i9 = s9 endsWith """where (("id", "PRICE") in ((1, 1.0), (null, 2.0))) and ("myString" = 'stack')"""
  println(i9)

}
