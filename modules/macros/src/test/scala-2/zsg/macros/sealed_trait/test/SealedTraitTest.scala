package zsg.macros.sealed_trait.test

import zsg.macros.single.{SealedTag, ZsgSealedGeneric, ZsgSealedLabelledGeneric}
import zsg.{Application2, Context2, Plus2, ZsgTuple0}

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
    implicit asunaSealedGeneric: ZsgSealedGeneric.Aux[H, T],
    app: Application2[STT, T, TT],
    labelled: ZsgSealedLabelledGeneric[H, TT]
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

    override def start: STT[ZsgTuple0, ZsgTuple0] = new STT[ZsgTuple0, ZsgTuple0] {
      override def stt(item: ZsgTuple0): List[String] => List[String] = ii => ii
    }
  }

  implicit def stringImplicit1[T, R]: STT[SealedTag[T], String] = new STT[SealedTag[T], String] {
    override def stt(str: String): List[String] => List[String] = list => str :: list
  }

  implicit val implicit1: ListEncode[Abc[String]] = encode
  println(implicit1.str)

}
