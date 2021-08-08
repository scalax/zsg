package zsg.testkit.tuple.reverse

import zsg.{ApplicationX1, Context1, Plus1}

trait ReverseTupleEncoder[T] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String
}

class ReverseScalaTupleContext extends Context1[ReverseTupleEncoder] {

  inline override def append[X1, Y1, Z1](x: ReverseTupleEncoder[X1], y: ReverseTupleEncoder[Y1])(p: Plus1[X1, Y1, Z1]): ReverseTupleEncoder[Z1] = {
    new ReverseTupleEncoder[Z1] {
      override def body(t: List[String], i: Z1): List[String] = {
        val x1 = p.takeHead1(i)
        val y1 = p.takeTail1(i)
        y.body(x.body(t, x1), y1)
      }
      override def stringBody(i: Z1): String = ""

    }
  }

}

object ReverseScalaTupleContext {
  val value: ReverseScalaTupleContext = new ReverseScalaTupleContext
}

object reverseTuple {
  inline def asString[T](x: T)(using inline ii: ApplicationX1[ReverseTupleEncoder, ReverseScalaTupleContext, T]): String = {
    val n1 = ii.application(ReverseScalaTupleContext.value)
    s"[${n1.body(List.empty, x).mkString("(", ",", ")")}]"
  }
}

object ReverseAppendTuple {
  given ReverseTupleEncoder[String] = new ReverseTupleEncoder[String] {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i
  }

  given ReverseTupleEncoder[Int] = new ReverseTupleEncoder[Int] {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)
  }

  given ReverseTupleEncoder[Long] = new ReverseTupleEncoder[Long] {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)
  }

  inline given [T](using inline ii: ApplicationX1[ReverseTupleEncoder, ReverseScalaTupleContext, T]): ReverseTupleEncoder[T] = ii.application(ReverseScalaTupleContext.value)

}
