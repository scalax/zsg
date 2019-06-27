package org.scalax.asuna.mapper.append.debug

import org.scalax.asuna.mapper.item.{AppendTuple, Item0}
import org.scalax.asuna.mapper._

object TupleTest {

  sealed trait TupleEncoder[T] {
    def body(t: List[String], i: T): List[String]

    def print(i: T): String

    def ++[R](o: TupleEncoder[R]): TupleEncoder[(T, R)]
  }

  trait TupleEncoder1[T] extends TupleEncoder[T] {
    self =>

    override def print(t: T): String

    override def body(t: List[String], i: T): List[String] = print(i) :: t
    override def ++[R](o: TupleEncoder[R]): TupleEncoder[(T, R)] = new TupleEncoder2[(T, R)] {
      override def body(t: List[String], i: (T, R)): List[String] = self.print(i._1) :: o.body(t, i._2)
    }

  }

  trait TupleEncoder2[T] extends TupleEncoder[T] {
    self =>

    override def print(i: T): String = {
      val ii = body(List.empty, i)
      s"TupleMiaoMiaoMiao${ii.size}(${ii.mkString(", ")})"
    }

    override def body(t: List[String], i: T): List[String]
    override def ++[R](o: TupleEncoder[R]): TupleEncoder[(T, R)] = new TupleEncoder2[(T, R)] {
      override def body(t: List[String], i: (T, R)): List[String] = self.print(i._1) :: o.body(t, i._2)
    }

  }

  class TupleContext[Companion] extends KindContext {
    override type M[I <: TypeParam] = (TupleEncoder[I#H], I#H => I#T#H)
  }

  class TEncoderContext[Companion] extends Context[TupleContext[Companion]] {

    override def useHList: Boolean  = true
    override def isReverse: Boolean = true

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
        x: (TupleEncoder[X#H], X#H => X#T#H)
      , y: (TupleEncoder[Y#H], Y#H => Y#T#H)
      , p: Plus[X, Y, Z]
    ): (TupleEncoder[Z#H], Z#H => Z#T#H) = {

      val aa = y._1.++(x._1)

      (new TupleEncoder2[Z#H] {
        override def body(t: List[String], i: Z#H): List[String] = aa.body(t, (p.takeHead(i), p.takeTail(i)))
      }, { i: Z#H =>
        val x1 = p.takeTail(i)
        val y1 = p.takeHead(i)
        p.sub.plus(x._2(x1), y._2(y1))
      })
    }

    override def start: (TupleEncoder[Item0], Item0 => Item0) =
      (new TupleEncoder2[Item0] {
        override def body(t: List[String], i: Item0) = t
      }, identity)

  }

  class PP[K] {
    private val c: Context[TupleContext[K]] = new TEncoderContext[K]
    def encodeTuple[T, I <: TypeParam](x: T)(implicit ii: Application[TupleContext[K], T, I]): (TupleEncoder[I#H], I#H => I#T#H) = {
      ii.application(c)
    }
  }

  class PU extends TypeParam {
    override type H = List[String]
    override type T = EndParam
  }

  class Type1 extends TypeParam {
    override type H = String
    override type T = PU
  }

  class Type2 extends TypeParam {
    override type H = Int
    override type T = PU
  }

}

object Util {

  import TupleTest._

  trait TupleTestImplicit {
    implicit val ii: Application[TupleContext[(AppendTuple, TupleTestImplicit)], String, Type1] =
      new Application[TupleContext[(AppendTuple, TupleTestImplicit)], String, Type1] {
        override def application(cotext: Context[TupleContext[(AppendTuple, TupleTestImplicit)]]): (TupleEncoder[String], String => List[String]) =
          (new TupleEncoder1[String] {
            override def print(t: String) = t.toString
          }, t => List(s"copy1: ${t}", s"copy2: ${t}"))
      }

    implicit val ii2: Application[TupleContext[(AppendTuple, TupleTestImplicit)], Int, Type2] =
      new Application[TupleContext[(AppendTuple, TupleTestImplicit)], Int, TupleTest.Type2] {
        override def application(cotext: Context[TupleTest.TupleContext[(AppendTuple, TupleTestImplicit)]]): (TupleEncoder[Int], Int => List[String]) =
          (new TupleEncoder1[Int] {
            override def print(t: Int) = t.toString
          }, t => List(s"${t}", s"plus one: ${t + 1}"))
      }
  }

  object TupleTestImplicit extends TupleTestImplicit

  val pp = new PP[(AppendTuple, TupleTestImplicit)]

}
