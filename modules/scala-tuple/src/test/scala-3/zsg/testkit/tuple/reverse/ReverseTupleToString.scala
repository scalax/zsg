package zsg.testkit.tuple.reverse

import zsg._

trait ReverseTupleEncoder[T] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String
}

type TupleEncFun[T <: TypeHList] = ReverseTupleEncoder[TakeHead1[T]]

class ReverseScalaTupleContext extends Context {

  override type T[H <: TypeHList] = TupleEncFun[H]

  inline override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    inline x: ReverseTupleEncoder[TakeHead1[X]],
    inline y: ReverseTupleEncoder[TakeHead1[Y]]
  )(inline p: Plus[X, Y, Z]): ReverseTupleEncoder[TakeHead1[Z]] = {
    new ReverseTupleEncoder[TakeHead1[Z]] {
      override def body(t: List[String], i: TakeHead1[Z]): List[String] = {
        val x1 = p.takeHead(i)
        val y1 = p.takeTail(i)
        y.body(x.body(t, x1), y1)
      }
      override def stringBody(i: TakeHead1[Z]): String = ""
    }
  }

}

object ReverseScalaTupleContext {
  val value: ReverseScalaTupleContext = new ReverseScalaTupleContext
}

object reverseTuple {
  def commonAsString(t: Product): String = {
    def toList(pro: Product): List[Any] = pro.productIterator.to(List).reverse.flatMap {
      case n: Product => toList(n)
      case i          => List(i)
    }
    s"[${toList(t).mkString("(", ",", ")")}]"
  }

  inline def asString[T, H <: TypeHList](x: T)(using inline ii: Application[ReverseScalaTupleContext, T, H]): String = {
    val n1 = ii.application(ReverseScalaTupleContext.value)
    s"[${n1.body(List.empty, x.asInstanceOf[TakeHead1[H]]).mkString("(", ",", ")")}]"
  }
}

object ReverseAppendTuple {
  inline given ReverseTupleEncoder[String] with {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i
  }

  inline given ReverseTupleEncoder[Int] with {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)
  }

  inline given ReverseTupleEncoder[Long] with {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)
  }

  inline given [T](using inline ii: ReverseTupleEncoder[T]): Application[ReverseScalaTupleContext, T, TypePositive[T, TypeZero]] =
    context => implicitly

}
