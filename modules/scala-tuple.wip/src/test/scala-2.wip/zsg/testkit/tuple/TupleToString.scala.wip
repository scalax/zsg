package zsg.testkit.tuple

import zsg.{ApplicationX2, Context2, Plus2}

trait TupleEncoder[T, R] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String

  def fromString(str: String): (R, String)
}

class ScalaTupleContext extends Context2[TupleEncoder] {
  override def append[X1, X2, Y1, Y2, Z1, Z2](x: TupleEncoder[X1, X2], y: TupleEncoder[Y1, Y2])(
    p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
  ): TupleEncoder[Z1, Z2] = {
    new TupleEncoder[Z1, Z2] {
      override def body(t: List[String], i: Z1): List[String] = {
        val x1 = p.takeHead1(i)
        val y1 = p.takeTail1(i)
        x.body(y.body(t, y1), x1)
      }
      override def stringBody(i: Z1): String = ""

      override def fromString(str: String): (Z2, String) = {
        val (x2, str1) = x.fromString(str)
        val (x1, str2) = y.fromString(str1)
        (p.plus2(x2, x1), str2)
      }
    }
  }
}

object ScalaTupleContext {
  val value: ScalaTupleContext = new ScalaTupleContext
}

object tuple {
  def asString[T](x: T)(implicit ii: ApplicationX2[TupleEncoder, ScalaTupleContext, T, T]): String = {
    val encoder = new TupleEncoder[T, T] {
      override def body(t: List[String], i: T): List[String] =
        ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")") :: t

      override def stringBody(i: T): String = ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")")

      override def fromString(str: String): (T, String) = {
        val (t, str1) = ii.application(ScalaTupleContext.value).fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
        val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
        (t, str2)
      }
    }
    s"[${encoder.stringBody(x)}]"
  }

  def fromString[T](str: String)(implicit ii: ApplicationX2[TupleEncoder, ScalaTupleContext, T, T]): T = {
    val decoder = new TupleEncoder[T, T] {
      override def body(t: List[String], i: T): List[String] =
        ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")") :: t
      override def stringBody(i: T): String = ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")")

      override def fromString(str: String): (T, String) = {
        val (t, str1) = ii.application(ScalaTupleContext.value).fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
        val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
        (t, str2)
      }
    }
    decoder.fromString(str)._1
  }
}

trait AppendTuple {
  implicit val tupleImplicit1: TupleEncoder[String, String] = new TupleEncoder[String, String] {
    override def body(t: List[String], i: String): List[String] = i :: t
    override def stringBody(i: String): String                  = i

    override def fromString(str: String): (String, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1, str.drop(str1.size + 1))
    }
  }

  implicit val tupleImplicit2: TupleEncoder[Int, Int] = new TupleEncoder[Int, Int] {
    override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Int): String                  = String.valueOf(i)

    override def fromString(str: String): (Int, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1.toInt, str.drop(str1.size + 1))
    }
  }

  implicit val tupleImplicit3: TupleEncoder[Long, Long] = new TupleEncoder[Long, Long] {
    override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
    override def stringBody(i: Long): String                  = String.valueOf(i)

    override def fromString(str: String): (Long, String) = {
      val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
      (str1.toLong, str.drop(str1.size + 1))
    }
  }

  implicit def applicationImplicit[T](implicit t: ApplicationX2[TupleEncoder, ScalaTupleContext, T, T]): TupleEncoder[T, T] =
    t.application(ScalaTupleContext.value)

  /*implicit def objectTupleImplicit[T](
    implicit ii: Application2[TupleEncoder, T, T, T]
  ): TupleEncoder[T, T] = new TupleEncoder[T, T] {
    override def body(t: List[String], i: T): List[String] = ii.application(scalaTupleContext).body(List.empty, i).mkString("(", ",", ")") :: t
    override def stringBody(i: T): String                  = ii.application(scalaTupleContext).body(List.empty, i).mkString("(", ",", ")")

    override def fromString(str: String): (T, String) = {
      val (t, str1) = ii.application(scalaTupleContext).fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
      val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
      (t, str2)
    }
  }*/

}

object AppendTuple extends AppendTuple
