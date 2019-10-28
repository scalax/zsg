package asuna.testkit.tupleTest

import asuna.tuple.ScalaTupleImplicits
import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TypeHList, TypeHList1}

sealed trait TupleEncoder[T] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String
}

class TupleContext[Companion] extends KindContext {
  override type M[I <: TypeHList] = TupleEncoder[I#H]
}

object scalaTupleContext extends Context[TupleContext[ScalaTupleImplicits]] {

  override def isReverse: Boolean = true

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: TupleEncoder[X#H],
    y: TupleEncoder[Y#H],
    p: Plus[X, Y, Z]
  ): TupleEncoder[Z#H] = {
    new TupleEncoder[Z#H] {
      override def body(t: List[String], i: Z#H): List[String] = {
        val x1 = p.takeHead(i)
        val y1 = p.takeTail(i)
        y.body(x.body(t, x1), y1)
      }
      override def stringBody(i: Z#H): String = ""

    }
  }

  override def start: TupleEncoder[AsunaTuple0] = new TupleEncoder[AsunaTuple0] {
    override def body(t: List[String], i: AsunaTuple0): List[String] = t
    override def stringBody(i: AsunaTuple0): String                  = ""
  }

}

object tuple {
  def asString[T, I <: TypeHList](x: T)(implicit ii: TupleEncoder[T]): String = {
    s"[${ii.stringBody(x)}]"
  }
}

trait AppendTuple {
  implicit val tupleImplicit1: TupleEncoder[String] = new TupleEncoder[String] {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i
  }

  implicit val tupleImplicit2: TupleEncoder[Int] = new TupleEncoder[Int] {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)
  }

  implicit val tupleImplicit3: TupleEncoder[Long] = new TupleEncoder[Long] {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)
  }

  implicit def applicationImplicit[T](implicit t: TupleEncoder[T]): Application[TupleContext[ScalaTupleImplicits], T, TypeHList1[T]] = { context =>
    t
  }

  implicit def objectTupleImplicit[T, I <: TypeHList](
    implicit ii: Application[TupleContext[ScalaTupleImplicits], T, I],
    c: T <:< I#H
  ): TupleEncoder[T] = new TupleEncoder[T] {
    override def body(t: List[String], i: T): List[String] = ii.application(scalaTupleContext).body(List.empty, i).mkString("(", ",", ")") :: t
    override def stringBody(i: T): String                  = ii.application(scalaTupleContext).body(List.empty, i).mkString("(", ",", ")")
  }

}

object AppendTuple extends AppendTuple
