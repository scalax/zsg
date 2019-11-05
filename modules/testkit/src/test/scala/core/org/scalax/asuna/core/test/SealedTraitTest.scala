package asuna.testkit

import asuna.macros.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, SealedTag}
import asuna.{Application1, AsunaTuple0, Context1, Plus1, TupleTag}

sealed trait Abc[T]
class AA[T](ii: T, iiii: String) extends Abc[T]
class BB[T](ii: T, iiii: String) extends Abc[T]

object SealedTraitTest extends App {

  type II[T] = T => List[String] => List[String]

  trait ListEncode[H] {
    def str: List[String]
  }

  def encode[H, T <: TupleTag, TT](
    implicit asunaSealedGeneric: AsunaSealedGeneric.Aux[H, T],
    app: Application1[II, T, TT],
    labelled: AsunaSealedLabelledGeneric[H, TT]
  ): ListEncode[H] = new ListEncode[H] {
    override def str: List[String] = app.application(i)(labelled.names)(List.empty)
  }

  object i extends Context1[II] {

    override def append[X1, Y1, Z1](x: X1 => List[String] => List[String], y: Y1 => List[String] => List[String])(
      p: Plus1[X1, Y1, Z1]
    ): Z1 => List[String] => List[String] = { h =>
      val xh = x(p.takeHead1(h))
      val yh = y(p.takeTail1(h));
      { ii: List[String] =>
        xh(yh(ii))
      }
    }

    override def start: AsunaTuple0 => List[String] => List[String] = { item => ii =>
      ii
    }
  }

  implicit def stringImplicit1[T, R]: Application1[II, SealedTag[T], String] =
    new Application1[({ type I[T] = T => List[String] => List[String] })#I, SealedTag[T], String] {
      override def application(context: Context1[({ type I[T] = T => List[String] => List[String] })#I]): String => List[String] => List[String] = {
        str: String =>
          { list: List[String] =>
            str :: list
          }
      }
    }

  implicit val implicit1: ListEncode[Abc[String]] = encode
  println(implicit1.str)

}
