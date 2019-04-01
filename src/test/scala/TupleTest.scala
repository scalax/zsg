package org.scalax.asuna.mapper.append.debug

import org.scalax.asuna.ii.item.{AppendTuple, XyyItem0}
import org.scalax.asuna.mapper.item._

object TupleTest {

  sealed trait TupleEncoder[T] {
    def body(t: List[String], i: T): List[String]

    def print(t: List[String], i: T): String = {
      val ii = body(t, i)
      s"TupleMiaoMiaoMiao${ii.size}(${ii.mkString(", ")})"
    }

    def ++[R](o: TupleEncoder[R]): TupleEncoder[(T, R)]
  }

  trait TupleEncoder1[T] extends TupleEncoder[T] {
    self =>

    def pro(t: T): String

    override def body(t: List[String], i: T): List[String] = pro(i) :: t
    override def ++[R](o: TupleEncoder[R]): TupleEncoder[(T, R)] = new TupleEncoder2[(T, R)] {
      override def body(t: List[String], i: (T, R)): List[String] = self.pro(i._1) :: o.body(t, i._2)
    }

  }

  trait TupleEncoder2[T] extends TupleEncoder[T] {
    self =>

    override def body(t: List[String], i: T): List[String]
    override def ++[R](o: TupleEncoder[R]): TupleEncoder[(T, R)] = new TupleEncoder2[(T, R)] {
      override def body(t: List[String], i: (T, R)): List[String] = self.print(List.empty, i._1) :: o.body(t, i._2)
    }

  }

  class TupleContext[Companion] extends KindContext {
    override type M[I <: TypeParam] = (TupleEncoder[I#H], I#H => I#T#H)
  }

  object tencoderContext extends Context[TupleContext[(AppendTuple, TupleTestImplicit)]] {

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

    override def start: (TupleEncoder[XyyItem0], XyyItem0 => XyyItem0) =
      (new TupleEncoder2[XyyItem0] {
        override def body(t: List[String], i: XyyItem0) = t
      }, identity)

  }

  def encodeTuple[T, I <: TypeParam](x: T)(implicit ii: Application[TupleContext[(AppendTuple, TupleTestImplicit)], T, I]): (TupleEncoder[I#H], I#H => I#T#H) = {
    ii.application(tencoderContext)
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

  trait TupleTestImplicit {
    implicit def ii: Application[TupleContext[(AppendTuple, TupleTestImplicit)], String, Type1] =
      new Application[TupleContext[(AppendTuple, TupleTestImplicit)], String, Type1] {
        override def application(cotext: Context[TupleContext[(AppendTuple, TupleTestImplicit)]]): (TupleEncoder[String], String => List[String]) =
          (new TupleEncoder1[String] {
            override def pro(t: String) = t.toString
          }, t => List(s"copy1: ${t}", s"copy2: ${t}"))
      }

    implicit def ii2: Application[TupleContext[(AppendTuple, TupleTestImplicit)], Int, Type2] =
      new Application[TupleContext[(AppendTuple, TupleTestImplicit)], Int, TupleTest.Type2] {
        override def application(cotext: Context[TupleTest.TupleContext[(AppendTuple, TupleTestImplicit)]]): (TupleEncoder[Int], Int => List[String]) =
          (new TupleEncoder1[Int] {
            override def pro(t: Int) = t.toString
          }, t => List(s"${t}", s"plus one: ${t + 1}"))
      }
  }

  object TupleTestImplicit extends TupleTestImplicit

}
