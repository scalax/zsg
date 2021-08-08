package zsg.testkit.tuple.reverse

import zsg.macros.single.{ZsgGeneric, ZsgGetterGeneric}
import zsg.{ApplicationX1, Context1, Plus1}

trait ReverseTupleEncoder[T] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String
}

class ReverseScalaTupleContext extends Context1[ReverseTupleEncoder] {
  override def append[X1, Y1, Z1](x: ReverseTupleEncoder[X1], y: ReverseTupleEncoder[Y1])(p: Plus1[X1, Y1, Z1]): ReverseTupleEncoder[Z1] = {
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
  def asString[T](x: T)(implicit ii: ApplicationX1[ReverseTupleEncoder, ReverseScalaTupleContext, T]): String = {
    val con = ii.application(ReverseScalaTupleContext.value)
    s"[${con.body(List.empty, x).mkString("(", ",", ")")}]"
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

  implicit def reverseApplicationImplicit[CaseClass, T](implicit
    zsgGeneric: ZsgGeneric.Aux[CaseClass, T],
    t1: => ApplicationX1[ReverseTupleEncoder, ReverseScalaTupleContext, T],
    getterGeneric: ZsgGetterGeneric[CaseClass, T]
  ): ReverseTupleEncoder[CaseClass] = {
    val app = t1.application(ReverseScalaTupleContext.value)
    new ReverseTupleEncoder[CaseClass] {
      override def body(t: List[String], i: CaseClass): List[String] = app.body(t, getterGeneric.getter(i))
      override def stringBody(i: CaseClass): String                  = app.stringBody(getterGeneric.getter(i))
    }
  }

}
