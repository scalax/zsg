package zsg.testkit.tuple.reverse

import zsg.{Application, Context, Plus, TypeFunction, TypeHList, TypeHList1}
import scala.collection.compat._

trait ReverseTupleEncoder[T] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String
}

class ReverseTupleEncFun extends TypeFunction {
  override type H[T <: TypeHList] = ReverseTupleEncoder[T#Head]
}

class ReverseScalaTupleContext extends Context[ReverseTupleEncFun] {
  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: ReverseTupleEncoder[X#Head], y: ReverseTupleEncoder[Y#Head])(
    plus: Plus[X, Y, Z]
  ): ReverseTupleEncoder[Z#Head] = new ReverseTupleEncoder[Z#Head] {
    override def body(t: List[String], i: Z#Head): List[String] = {
      val x1 = plus.takeHead(i)
      val y1 = plus.takeTail(i)
      y.body(x.body(t, x1), y1)
    }
    override def stringBody(i: Z#Head): String = ""
  }
}

object ReverseScalaTupleContext {
  val value: ReverseScalaTupleContext = new ReverseScalaTupleContext
}

object reverseTuple {
  def asString[T, H <: TypeHList](
    x: T
  )(implicit ii: Application[ReverseTupleEncFun, ReverseScalaTupleContext, T, H], cv: T <:< H#Head): String = {
    val con = ii.application(ReverseScalaTupleContext.value)
    s"[${con.body(List.empty, x).mkString("(", ",", ")")}]"
  }

  def commonAsString(t: Product): String = {
    def toList(pro: Product): List[Any] = pro.productIterator.to(List).flatMap {
      case n: Product => toList(n)
      case i          => List(i)
    }
    s"[${toList(t).reverse.mkString("(", ",", ")")}]"
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

  implicit def reverseApplicationImplicit[T](implicit
    t1: ReverseTupleEncoder[T]
  ): Application[ReverseTupleEncFun, ReverseScalaTupleContext, T, TypeHList1[T]] =
    new Application[ReverseTupleEncFun, ReverseScalaTupleContext, T, TypeHList1[T]] {
      override def application(context: ReverseScalaTupleContext): ReverseTupleEncoder[T] = t1
    }

}
