package org.scalax.asuna.mapper.append.debug

import org.scalax.asuna.ii.item.{AppendTuple, XyyItem0}
import org.scalax.asuna.mapper.item._

object TupleTest {

  trait TupleEncoder[T] {

    def body(t: T): List[String]

    def print(t: T): String = body(t) match {
      case i :: Nil => i
      case ii       => s"TupleMiaoMiaoMiao${ii.size}(${ii.mkString(",")})"
    }

  }

  class TupleContext[Companion] extends KindContext {
    override type M[I <: TypeParam] = (TupleEncoder[I#H], I#H => I#T#H)
  }

  object tencoderContext extends Context[TupleContext[AppendTuple]] {
    override def useHList: Boolean  = true
    override def isReverse: Boolean = true

    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
        x: (TupleEncoder[X#H], X#H => X#T#H)
      , y: (TupleEncoder[Y#H], Y#H => Y#T#H)
      , p: Plus[X, Y, Z]
    ): (TupleEncoder[Z#H], Z#H => Z#T#H) = {

      (new TupleEncoder[Z#H] {
        override def body(z: Z#H) = y._1.print(p.takeHead(z)) :: x._1.body(p.takeTail(z))
      }, { i: Z#H =>
        val x1 = p.takeTail(i)
        val y1 = p.takeHead(i)
        p.sub.plus(x._2(x1), y._2(y1))
      })
    }

    override def start: (TupleEncoder[XyyItem0], XyyItem0 => XyyItem0) =
      (new TupleEncoder[XyyItem0] {
        override def body(t: XyyItem0) = List.empty
      }, identity)
  }

  def encodeTuple[T, I <: TypeParam](x: T)(implicit ii: Application[TupleContext[AppendTuple], T, I]): (TupleEncoder[I#H], I#H => I#T#H) = {
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

}
