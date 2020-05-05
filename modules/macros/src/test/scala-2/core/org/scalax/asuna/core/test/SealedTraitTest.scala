package asuna.testkit

import asuna.macros.single.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, SealedTag}
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

    override def append[X1, Y1, Z1](x: STT[X1], y: STT[Y1])(p: Plus1[X1, Y1, Z1]): STT[Z1] = new STT[Z1] {
      override def stt(h: Z1): List[String] => List[String] = {
        val xh = x.stt(p.takeHead1(h))
        val yh = y.stt(p.takeTail1(h))
        ii => xh(yh(ii))
      }
    }

    override def start: STT[AsunaTuple0] = new STT[AsunaTuple0] {
      override def stt(item: AsunaTuple0): List[String] => List[String] = ii => ii
    }
  }

  implicit def stringImplicit1[T, R]: Application1[STT, SealedTag[T], String] =
    new Application1[STT, SealedTag[T], String] {
      override def application(context: Context1[STT]): STT[String] = new STT[String] {
        override def stt(str: String): List[String] => List[String] = list => str :: list
      }
    }

  implicit val implicit1: ListEncode[Abc[String]] = encode
  println(implicit1.str)

}
