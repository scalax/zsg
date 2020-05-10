package asuna.testkit

import asuna.macros.single.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, SealedTag}
import asuna.{Application2, AsunaTuple0, Context2, Plus1, Plus2}

sealed trait Abc[T]

class AA[T](ii: T, iiii: String) extends Abc[T]

class BB[T](ii: T, iiii: String) extends Abc[T]

object SealedTraitTest extends App {

  trait STT[II, T] {
    def stt(t: T): List[String] => List[String]
  }

  trait ListEncode[H] {
    def str: List[String]
  }

  def encode[H, T, TT](
                        implicit asunaSealedGeneric: AsunaSealedGeneric.Aux[H, T],
                        app: Application2[STT, T, TT],
                        labelled: AsunaSealedLabelledGeneric[H, TT]
                      ): ListEncode[H] = new ListEncode[H] {
    override def str: List[String] = app.application(i).stt(labelled.names)(List.empty)
  }

  object i extends Context2[STT] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: STT[X1, X2], y: STT[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): STT[Z1, Z2] = new STT[Z1, Z2] {
      override def stt(h: Z2): List[String] => List[String] = {
        val xh = x.stt(p.takeHead2(h))
        val yh = y.stt(p.takeTail2(h))
        ii => xh(yh(ii))
      }
    }

    override def start: STT[AsunaTuple0, AsunaTuple0] = new STT[AsunaTuple0, AsunaTuple0] {
      override def stt(item: AsunaTuple0): List[String] => List[String] = ii => ii
    }
  }

  implicit def stringImplicit1[T, R]: Application2[STT, SealedTag[T], String] = new Application2[STT, SealedTag[T], String] {
    override def application(context: Context2[STT]): STT[SealedTag[T], String] = new STT[SealedTag[T], String] {
      override def stt(str: String): List[String] => List[String] = list => str :: list
    }
  }

  implicit val implicit1: ListEncode[Abc[String]] = encode
  println(implicit1.str)

}
