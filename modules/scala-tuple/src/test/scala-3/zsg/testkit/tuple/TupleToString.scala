package zsg.testkit.tuple

import zsg._

trait TupleEncoder[T, R] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String

  def fromString(str: String): (R, String)
}

type TupleEncFun[T <: TypeHList] = TupleEncoder[TakeHead1[T], TakeHead2[T]]

class ScalaTupleContext extends Context {

  override type T[H <: TypeHList] = TupleEncFun[H]

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: TupleEncoder[TakeHead1[X], TakeHead2[X]],
    y: TupleEncoder[TakeHead1[Y], TakeHead2[Y]]
  )(p: Plus[X, Y, Z]): TupleEncoder[TakeHead1[Z], TakeHead2[Z]] = {
    new TupleEncoder[TakeHead1[Z], TakeHead2[Z]] {
      override def body(t: List[String], i: TakeHead1[Z]): List[String] = {
        val x1 = p.takeHead(i)
        val y1 = p.takeTail(i)
        x.body(y.body(t, y1), x1)
      }

      override def stringBody(i: TakeHead1[Z]): String = ""

      override def fromString(str: String): (TakeHead2[Z], String) = {
        val (x2, str1) = x.fromString(str)
        val (x1, str2) = y.fromString(str1)
        (p.tail.plus(x2, x1), str2)
      }
    }
  }

}

object ScalaTupleContext {
  val value: ScalaTupleContext = new ScalaTupleContext
}

object tuple {

  def commonAsString(t: Product): String = {
    def toList(pro: Product): List[Any] = pro.productIterator.to(List).flatMap {
      case n: Product => toList(n)
      case i          => List(i)
    }
    s"[${toList(t).mkString("(", ",", ")")}]"
  }

  def commonAsString1(t: Product): String = {
    def toList(pro: Product): List[Any] = pro.productIterator.to(List).flatMap {
      case n: Product => toList(n)
      case i          => List(i)
    }
    toList(t).mkString("(", ",", ")")
  }

  inline def asString[T, H <: TypeHList](
    x: T
  )(using inline ii: Application[ScalaTupleContext, T, H]): String = {
    val n1 = ii.application(ScalaTupleContext.value)
    val encoder = new TupleEncoder[TakeHead1[H], TakeHead2[H]] {
      override def body(t: List[String], i: TakeHead1[H]): List[String] = n1.body(List.empty, i).mkString("(", ",", ")") :: t

      override def stringBody(i: TakeHead1[H]): String = n1.body(List.empty, i).mkString("(", ",", ")")

      override def fromString(str: String): (TakeHead2[H], String) = {
        val (t, str1) = n1.fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
        val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
        (t, str2)
      }
    }
    s"[${encoder.stringBody(x.asInstanceOf[TakeHead1[H]])}]"
  }

  class TupleGen[T] {
    inline def fromString[H <: TypeHList](
      str: String
    )(using inline ii: Application[ScalaTupleContext, T, H]): TakeHead2[H] = {
      val n1 = ii.application(ScalaTupleContext.value)
      val decoder = new TupleEncoder[TakeHead1[H], TakeHead2[H]] {
        override def body(t: List[String], i: TakeHead1[H]): List[String] = n1.body(List.empty, i).mkString("(", ",", ")") :: t
        override def stringBody(i: TakeHead1[H]): String                  = n1.body(List.empty, i).mkString("(", ",", ")")

        override def fromString(str: String): (TakeHead2[H], String) = {
          val (t, str1) = n1.fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
          val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
          (t, str2)
        }
      }
      decoder.fromString(str)._1
    }
  }

  def gen[T]: TupleGen[T] = new TupleGen[T]

}

trait AppendTuple {
  inline given TupleEncoder[EmptyTuple.type, EmptyTuple.type] with {
    override def body(t: List[String], i: EmptyTuple.type): List[String] = t
    override def stringBody(i: EmptyTuple.type): String                  = ""
    override def fromString(str: String): (EmptyTuple.type, String)      = (EmptyTuple, str)
  }

  inline given TupleEncoder[String, String] with {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i

    override def fromString(str: String): (String, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1, str.drop(str1.size + 1))
    }
  }

  inline given TupleEncoder[Int, Int] with {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)

    override def fromString(str: String): (Int, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1.toInt, str.drop(str1.size + 1))
    }
  }

  inline given TupleEncoder[Long, Long] with {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)

    override def fromString(str: String): (Long, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1.toLong, str.drop(str1.size + 1))
    }
  }

  given [T](using ii: TupleEncoder[T, T]): Application[ScalaTupleContext, T, TypePositive[T, TypePositive[T, TypeZero]]] =
    context => implicitly

}

object AppendTuple extends AppendTuple
