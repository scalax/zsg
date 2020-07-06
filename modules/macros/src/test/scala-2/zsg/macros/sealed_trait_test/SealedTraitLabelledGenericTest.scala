package zsg.macros.sealed_trait_test

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import zsg.macros.single.{SealedTag, ZsgSealedGeneric, ZsgSealedLabelledGeneric}
import zsg.{Application2, Context2, Plus2, ZsgTuple0, ZsgTuple1}

class SealedTraitLabelledGenericTest extends AnyFunSpec with Matchers {

  sealed trait Abc[T]

  class AA[T](ii: T, iiii: String)      extends Abc[T]
  class BB[T](ii: T, iiii: String)      extends Abc[T]
  case class CC(i1: Number, i2: String) extends Abc[Number]
  case object dd                        extends Abc[Number]

  class Ignore(ii: Int, iiii: String) extends BB[Int](ii, iiii)

  trait STT[II, T] {
    def stt(t: T): List[String] => List[String]
  }

  trait SealedTraitNames[H] {
    def str: List[String]
  }

  def fetch[H, T, TT](implicit
    zsgSealedGeneric: ZsgSealedGeneric.Aux[H, T],
    app: Application2[STT, STTContext, T, TT],
    labelled: ZsgSealedLabelledGeneric[H, TT]
  ): SealedTraitNames[H] =
    new SealedTraitNames[H] {
      override def str: List[String] = app.application.stt(labelled.names)(List.empty)
    }

  class STTContext extends Context2[STT] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: STT[X1, X2], y: STT[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): STT[Z1, Z2] =
      new STT[Z1, Z2] {
        override def stt(h: Z2): List[String] => List[String] = {
          val xh = x.stt(p.takeHead2(h))
          val yh = y.stt(p.takeTail2(h))
          ii => yh(xh(ii))
        }
      }

    private val nTran: List[String] => List[String] = ii => ii

    override val start: STT[ZsgTuple0, ZsgTuple0] = new STT[ZsgTuple0, ZsgTuple0] {
      override def stt(item: ZsgTuple0): List[String] => List[String] = nTran
    }
  }

  object STTContext {
    implicit val value: STTContext = new STTContext
  }

  implicit def stringImplicit1[T]: STT[SealedTag[T], String] =
    new STT[SealedTag[T], String] {
      override def stt(str: String): List[String] => List[String] = list => str :: list
    }

  describe("A sealed trait") {
    it("should labelled generic to it's names") {
      val names1: SealedTraitNames[Abc[String]] = fetch
      names1.str shouldBe List("AA", "BB", "CC", "dd")
    }
  }

}
