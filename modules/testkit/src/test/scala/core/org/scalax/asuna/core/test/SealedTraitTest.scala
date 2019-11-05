package asuna.testkit

import asuna.macros.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, SealedTag}
import asuna.{Application1, AsunaTuple0, Context1, Plus1, TupleTag}

sealed trait Abc[T]
class AA[T](ii: T, iiii: String) extends Abc[T]
class BB[T](ii: T, iiii: String) extends Abc[T]

object SealedTraitTest extends App {

  trait STT[T] {
    def stt(t: T): List[String] => List[String]
  }

  trait ListEncode[H] {
    def str: List[String]
  }

  def encode[H, T <: TupleTag, TT](
    implicit asunaSealedGeneric: AsunaSealedGeneric.Aux[H, T],
    app: Application1[STT, T, TT],
    labelled: AsunaSealedLabelledGeneric[H, TT]
  ): ListEncode[H] = new ListEncode[H] {
    override def str: List[String] = app.application(i).stt(labelled.names)(List.empty)
  }

  object i extends Context1[STT] {

    override def append[X1, Y1, Z1](x: STT[X1], y: STT[Y1])(p: Plus1[X1, Y1, Z1]): STT[Z1] = { h =>
      val xh = x.stt(p.takeHead1(h))
      val yh = y.stt(p.takeTail1(h));
      { ii: List[String] =>
        xh(yh(ii))
      }
    }

    override def start: STT[AsunaTuple0] = { item => ii =>
      ii
    }
  }

  implicit def stringImplicit1[T, R]: Application1[STT, SealedTag[T], String] =
    new Application1[STT, SealedTag[T], String] {
      override def application(context: Context1[STT]): STT[String] = {
        str: String =>
          { list: List[String] =>
            str :: list
          }
      }
    }

  implicit val implicit1: ListEncode[Abc[String]] = encode
  println(implicit1.str)

}
