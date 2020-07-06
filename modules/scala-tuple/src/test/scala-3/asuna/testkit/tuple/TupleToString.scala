package zsg.testkit.tuple

import zsg.{Application2, ZsgTuple0, Context2, Plus2}

trait TupleEncoder[T, R] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String

  def fromString(str: String): (R, String)
}

class ScalaTupleContext extends Context2[TupleEncoder] {

  /*override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: TupleEncoder[X#H, X#T#H],
    y: TupleEncoder[Y#H, Y#T#H],
    p: Plus[X, Y, Z]
  ): TupleEncoder[Z#H, Z#T#H] = {
    new TupleEncoder[Z#H, Z#T#H] {
      override def body(t: List[String], i: Z#H): List[String] = {
        val x1 = p.takeHead(i)
        val y1 = p.takeTail(i)
        y.body(x.body(t, x1), y1)
      }
      override def stringBody(i: Z#H): String = ""

      override def fromString(str: String): (Z#T#H, String) = {
        val (x1, str1) = y.fromString(str)
        val (x2, str2) = x.fromString(str1)
        (p.sub.plus(x2, x1), str2)
      }
    }
  }

  override def start: TupleEncoder[AsunaTuple0, AsunaTuple0] = new TupleEncoder[AsunaTuple0, AsunaTuple0] {
    override def body(t: List[String], i: AsunaTuple0): List[String] = t
    override def stringBody(i: AsunaTuple0): String                  = ""
    override def fromString(str: String): (AsunaTuple0, String) = {
      (AsunaTuple0.value, str)
    }
  }*/
  override def append[X1, X2, Y1, Y2, Z1, Z2](x: TupleEncoder[X1, X2], y: TupleEncoder[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): TupleEncoder[Z1, Z2] = {
    new TupleEncoder[Z1, Z2] {
      override def body(t: List[String], i: Z1): List[String] = {
        val x1 = p.takeHead1(i)
        val y1 = p.takeTail1(i)
        y.body(x.body(t, x1), y1)
      }
      override def stringBody(i: Z1): String = ""

      override def fromString(str: String): (Z2, String) = {
        val (x1, str1) = y.fromString(str)
        val (x2, str2) = x.fromString(str1)
        (p.plus2(x2, x1), str2)
      }
    }
  }

  override def start: TupleEncoder[ZsgTuple0, ZsgTuple0] = new TupleEncoder[ZsgTuple0, ZsgTuple0] {
    override def body(t: List[String], i: ZsgTuple0): List[String] = t
    override def stringBody(i: ZsgTuple0): String                  = ""
    override def fromString(str: String): (ZsgTuple0, String) = {
      (ZsgTuple0.value, str)
    }
  }
}

object ScalaTupleContext {
  given as ScalaTupleContext { }
}

object tuple {

  def asString[T](x: T)(using Application2[TupleEncoder, ScalaTupleContext, T,  T]): String = {
    val ii = implicitly[Application2[TupleEncoder, ScalaTupleContext, T,  T]]
    val encoder = new TupleEncoder[T, T] {
      override def body(t: List[String], i: T): List[String] = ii.application.body(List.empty, i).mkString("(", ",", ")") :: t

      override def stringBody(i: T): String = ii.application.body(List.empty, i).mkString("(", ",", ")")

      override def fromString(str: String): (T, String) = {
        val (t, str1) = ii.application.fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
        val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
        (t, str2)
      }
    }
    s"[${encoder.stringBody(x)}]"
  }

  def fromString[T](str: String)(using Application2[TupleEncoder, ScalaTupleContext, T,  T]): T = {
    val ii = implicitly[Application2[TupleEncoder, ScalaTupleContext, T,  T]]
    val decoder = new TupleEncoder[T, T] {
      override def body(t: List[String], i: T): List[String] = ii.application.body(List.empty, i).mkString("(", ",", ")") :: t
      override def stringBody(i: T): String                  = ii.application.body(List.empty, i).mkString("(", ",", ")")

      override def fromString(str: String): (T, String) = {
        val (t, str1) = ii.application.fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
        val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
        (t, str2)
      }
    }
    decoder.fromString(str)._1
  }

}

trait AppendTuple {
  given as TupleEncoder[String, String] {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i

    override def fromString(str: String): (String, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1, str.drop(str1.size + 1))
    }
  }

  given as TupleEncoder[Int, Int] {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)

    override def fromString(str: String): (Int, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1.toInt, str.drop(str1.size + 1))
    }
  }

  given as TupleEncoder[Long, Long] {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)

    override def fromString(str: String): (Long, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1.toLong, str.drop(str1.size + 1))
    }
  }

  given [T](using Application2[TupleEncoder, ScalaTupleContext, T, T]) as TupleEncoder[T, T] = implicitly[Application2[TupleEncoder, ScalaTupleContext, T, T]].application

}

object AppendTuple extends AppendTuple
