package asuna.testkit.tuple.reverse

import asuna.tuple.ScalaTupleImplicits
import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TypeHList, TypeHList1}

trait ReverseTupleEncoder[T] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String
}

class ReverseTupleContext[Companion] extends KindContext {
  override type M[I <: TypeHList] = ReverseTupleEncoder[I#H]
}

object reverseScalaTupleContext extends Context[ReverseTupleContext[ScalaTupleImplicits]] {

  override def isReverse: Boolean = false

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: ReverseTupleEncoder[X#H],
    y: ReverseTupleEncoder[Y#H],
    p: Plus[X, Y, Z]
  ): ReverseTupleEncoder[Z#H] = {
    new ReverseTupleEncoder[Z#H] {
      override def body(t: List[String], i: Z#H): List[String] = {
        val x1 = p.takeHead(i)
        val y1 = p.takeTail(i)
        y.body(x.body(t, x1), y1)
      }
      override def stringBody(i: Z#H): String = ""

    }
  }

  override def start: ReverseTupleEncoder[AsunaTuple0] = new ReverseTupleEncoder[AsunaTuple0] {
    override def body(t: List[String], i: AsunaTuple0): List[String] = t
    override def stringBody(i: AsunaTuple0): String                  = ""
  }

}

object reverseTuple {
  def asString[T, I <: TypeHList](x: T)(implicit ii: ReverseTupleEncoder[T]): String = {
    s"[${ii.stringBody(x)}]"
  }
}

object ReverseAppendTuple {
  implicit val reverseTupleImplicit1: ReverseTupleEncoder[String] = new ReverseTupleEncoder[String] {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i
  }

  implicit val reverseTupleImplicit12: ReverseTupleEncoder[Int] = new ReverseTupleEncoder[Int] {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)
  }

  implicit val reverseTupleImplicit3: ReverseTupleEncoder[Long] = new ReverseTupleEncoder[Long] {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)
  }

  implicit def reverseApplicationImplicit[T](implicit t: ReverseTupleEncoder[T]): Application[ReverseTupleContext[ScalaTupleImplicits], T, TypeHList1[T]] = { context =>
    t
  }

  implicit def reverseObjectTupleImplicit[T, I <: TypeHList](
    implicit ii: Application[ReverseTupleContext[ScalaTupleImplicits], T, I],
    c: T <:< I#H
  ): ReverseTupleEncoder[T] = new ReverseTupleEncoder[T] {
    override def body(t: List[String], i: T): List[String] = ii.application(reverseScalaTupleContext).body(List.empty, i).mkString("(", ",", ")") :: t
    override def stringBody(i: T): String                  = ii.application(reverseScalaTupleContext).body(List.empty, i).mkString("(", ",", ")")
  }

}
