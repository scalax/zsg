package zsg.testkit.tuple

import zsg.{Application, Context, Plus, TypeAlias, TypeFunction, TypeHList}

import scala.collection.compat._

trait TupleEncoder[T, R] {
  self =>
  def body(t: List[String], i: T): List[String]
  def stringBody(i: T): String

  def fromString(str: String): (R, String)
}

class TupleEncFun extends TypeFunction {
  override type H[T <: TypeHList] = TupleEncoder[T#Head, T#Tail#Head]
}

class ScalaTupleContext extends Context[TupleEncFun] {
  override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
    x: TupleEncoder[X#Head, X#Tail#Head],
    y: TupleEncoder[Y#Head, Y#Tail#Head]
  )(plus: Plus[X, Y, Z]): TupleEncoder[Z#Head, Z#Tail#Head] = new TupleEncoder[Z#Head, Z#Tail#Head] {
    override def body(t: List[String], i: Z#Head): List[String] = {
      val x1 = plus.takeHead(i)
      val y1 = plus.takeTail(i)
      x.body(y.body(t, y1), x1)
    }
    override def stringBody(i: Z#Head): String = ""
    override def fromString(str: String): (Z#Tail#Head, String) = {
      val (x2, str1) = x.fromString(str)
      val (x1, str2) = y.fromString(str1)
      (plus.tail.plus(x2, x1), str2)
    }
  }
}

object ScalaTupleContext {
  val value: ScalaTupleContext = new ScalaTupleContext
}

object tuple {
  def asString[T, H <: TypeHList](x: T)(implicit ii: Application[TupleEncFun, ScalaTupleContext, T, H { type Head = T }]): String = {
    val encoder = new TupleEncoder[T, H#Tail#Head] {
      override def body(t: List[String], i: T): List[String] =
        ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")") :: t

      override def stringBody(i: T): String = ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")")

      override def fromString(str: String): (H#Tail#Head, String) = {
        val (t, str1) = ii.application(ScalaTupleContext.value).fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
        val str2      = str1.dropWhile(s => s == '(' || s == ',' || s == ')')
        (t, str2)
      }
    }
    s"[${encoder.stringBody(x)}]"
  }

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

  class TupleGen[T] {
    def fromString[H <: TypeHList](str: String)(implicit ii: Application[TupleEncFun, ScalaTupleContext, T, H]): H#Tail#Head = {
      val decoder = new TupleEncoder[H#Head, H#Tail#Head] {
        override def body(t: List[String], i: H#Head): List[String] =
          ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")") :: t
        override def stringBody(i: H#Head): String = ii.application(ScalaTupleContext.value).body(List.empty, i).mkString("(", ",", ")")

        override def fromString(str: String): (H#Tail#Head, String) = {
          val (t, str1) = ii.application(ScalaTupleContext.value).fromString(str.dropWhile(s => s == '(' || s == ',' || s == ')'))
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
  implicit val tupleImplicit1: Application[TupleEncFun, ScalaTupleContext, String, TypeAlias.TypeHList2[String, String]] =
    new Application[TupleEncFun, ScalaTupleContext, String, TypeAlias.TypeHList2[String, String]] {
      override def application(context: ScalaTupleContext): TupleEncoder[String, String] = new TupleEncoder[String, String] {
        override def body(t: List[String], i: String): List[String] = i :: t
        override def stringBody(i: String): String                  = i

        override def fromString(str: String): (String, String) = {
          val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
          (str1, str.drop(str1.size + 1))
        }
      }
    }

  implicit val tupleImplicit2: Application[TupleEncFun, ScalaTupleContext, Int, TypeAlias.TypeHList2[Int, Int]] =
    new Application[TupleEncFun, ScalaTupleContext, Int, TypeAlias.TypeHList2[Int, Int]] {
      override def application(context: ScalaTupleContext): TupleEncoder[Int, Int] = new TupleEncoder[Int, Int] {
        override def body(t: List[String], i: Int): List[String] = String.valueOf(i) :: t
        override def stringBody(i: Int): String                  = String.valueOf(i)

        override def fromString(str: String): (Int, String) = {
          val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
          (str1.toInt, str.drop(str1.size + 1))
        }
      }
    }

  implicit val tupleImplicit3: Application[TupleEncFun, ScalaTupleContext, Long, TypeAlias.TypeHList2[Long, Long]] =
    new Application[TupleEncFun, ScalaTupleContext, Long, TypeAlias.TypeHList2[Long, Long]] {
      override def application(context: ScalaTupleContext): TupleEncoder[Long, Long] = new TupleEncoder[Long, Long] {
        override def body(t: List[String], i: Long): List[String] = String.valueOf(i) :: t
        override def stringBody(i: Long): String                  = String.valueOf(i)

        override def fromString(str: String): (Long, String) = {
          val str1 = str.dropWhile(s => s == '(' || s == ',' || s == ')').takeWhile(s => s != ',' && s != ')')
          (str1.toLong, str.drop(str1.size + 1))
        }
      }
    }

}

object AppendTuple extends AppendTuple
