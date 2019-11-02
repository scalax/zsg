package asuna.testkit.tuple

import asuna.tuple.ScalaTupleImplicits
import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TypeHList, TypeHList1, TypeHList2}

trait TupleEncoder[T, R] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String

  def fromString(str: String): (R, String)
}

class TupleContext[Companion] extends KindContext {
  override type M[I <: TypeHList] = TupleEncoder[I#H, I#T#H]
}

object scalaTupleContext extends Context[TupleContext[ScalaTupleImplicits]] {

  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
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
  }

}

object tuple {
  def asString[T](x: T)(implicit ii: TupleEncoder[T, T]): String = {
    s"[${ii.stringBody(x)}]"
  }

  def fromString[T](str: String)(implicit ii: TupleEncoder[T, T]): T = {
    ii.fromString(str)._1
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

  implicit def applicationImplicit[T, R](implicit t: TupleEncoder[T, R]): Application[TupleContext[ScalaTupleImplicits], T, TypeHList2[T, R]] = { context =>
    t
  }

  implicit def objectTupleImplicit[T, I <: TypeHList](
    implicit ii: Application[TupleContext[ScalaTupleImplicits], T, I],
    c: T <:< I#H,
    d: I#T#H <:< T
  ): TupleEncoder[T, T] = new TupleEncoder[T, T] {
    override def body(t: List[String], i: T): List[String] = ii.application(scalaTupleContext).body(List.empty, i).mkString("(", ",", ")") :: t
    override def stringBody(i: T): String                  = ii.application(scalaTupleContext).body(List.empty, i).mkString("(", ",", ")")

    override def fromString(str: String): (T, String) = {
      val (t, str1) = ii.application(scalaTupleContext).fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
      val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
      (t, str2)
    }
  }

}

object AppendTuple extends AppendTuple
