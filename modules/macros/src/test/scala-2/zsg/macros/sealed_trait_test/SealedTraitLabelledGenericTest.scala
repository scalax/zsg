package zsg.macros.sealed_trait_test

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import zsg.macros.single.{SealedTag, ZsgSealedGeneric, ZsgSealedLabelledGeneric}
import zsg.{Context2, Plus2, ZsgTuple0, ZsgTuple1}

class SealedTraitLabelledGenericTest extends AnyFunSpec with Matchers {

  sealed trait Abc[T]

  class AA[T](ii: T, iiii: String) extends Abc[T]
  //class BB[T](ii: T, iiii: String) extends Abc[T]
  //case class CC(i1: Number, i2: String) extends Abc[Number]
  //case object dd                        extends Abc[Number]

  //class Ignore(ii: Int, iiii: String) extends BB[Int](ii, iiii)

  trait STT[II, T] {
    def stt(t: T): List[String] => List[String]
  }

  trait SealedTraitNames[H] {
    def str: List[String]
  }

  class TraitApply {
    def encode[H, T, TT](implicit
      zsgSealedGeneric: ZsgSealedGeneric.Aux[H, T],
      app: STT[T, TT],
      labelled: ZsgSealedLabelledGeneric[H, TT]
    ): SealedTraitNames[H] =
      new SealedTraitNames[H] {
        override val str: List[String] = app.stt(labelled.names)(List.empty)
      }
  }

  /*def encode[H, T, TT](implicit
    zsgSealedGeneric: ZsgSealedGeneric.Aux[H, T],
    app: STT[T, TT],
    labelled: ZsgSealedLabelledGeneric[H, TT]
  ): SealedTraitNames[H] =
    new SealedTraitNames[H] {
      override val str: List[String] = app.stt(labelled.names)(List.empty)
    }

  def encode1[H] =
    new {
      def encode2[T](implicit zsgSealedGeneric: ZsgSealedGeneric.Aux[H, T]): T = zsgSealedGeneric.tag
    }*/

  def encode[T](n: Context2[STT] => TraitApply => SealedTraitNames[T]): SealedTraitNames[T] = n(i)(new TraitApply)

  object i extends Context2[STT] {
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

  implicit def stringImplicit1[T]: STT[SealedTag[T], String] =
    new STT[SealedTag[T], String] {
      override def stt(str: String): List[String] => List[String] = list => str :: list
    }

  describe("A sealed trait") {
    it("should labelled generic to it's names") {
      val names1: SealedTraitNames[Abc[String]] = encode { (c11: Context2[STT]) => s =>
        {
          implicit val c123 = c11
          // s.encode: SealedTraitNames[Abc[String]]
          // val bb: STT[ZsgTuple1[SealedTag[AA[String]]], ZsgTuple1[String]] = ZsgTuple1.tupleTagApplicationImplicit_tagNum1_typeParamNum2(stringImplicit1, c123)

          implicitly[STT[ZsgTuple1[SealedTag[AA[String]]], ZsgTuple1[String]]]

          s.encode(implicitly[ZsgSealedGeneric.Aux[Abc[String], ZsgTuple1[SealedTag[AA[String]]]]], implicitly[STT[ZsgTuple1[SealedTag[AA[String]]], ZsgTuple1[String]]], implicitly[ZsgSealedLabelledGeneric[Abc[String], ZsgTuple1[String]]]): SealedTraitNames[Abc[String]]
        }
      }
      // names1.str shouldBe List("AA", "BB", "CC", "dd")

      // encode1[Abc[String]].encode2.bb
    }
  }

}
