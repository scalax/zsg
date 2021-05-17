package zsg.test.macros.sealed_trait_test

import zsg.macros.single.{SealedTag, ZsgSealedGeneric, ZsgSealedLabelledGeneric}
import zsg.{Application2, Context2, Plus2}

object SealedTraitLabelledGenericPrepareTest {

  sealed trait Abc[T]

  class AA(ii: String, iiii: String)    extends Abc[String]
  class BB(ii: String, iiii: String)    extends Abc[String]
  case class CC(i1: Number, i2: String) extends Abc[Number]
  case object dd                        extends Abc[Number]

  class Ignore(ii: String, iiii: String) extends BB(ii, iiii)

  trait SealedNameGetter[II, T] {
    def stt(t: T): List[String] => List[String]
  }

  trait SealedTraitNames[H] {
    def str: List[String]
  }

  def sealedNames[H, T, TT](implicit
    sg: ZsgSealedGeneric.Aux[H, T],
    app: Application2[SealedNameGetter, SealedNameGetterContext, T, TT],
    labelled: ZsgSealedLabelledGeneric[H, TT]
  ): SealedTraitNames[H] = new SealedTraitNames[H] {
    override def str: List[String] = app.application(SealedNameGetterContext.value).stt(labelled.names)(List.empty)
  }

  class SealedNameGetterContext extends Context2[SealedNameGetter] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: SealedNameGetter[X1, X2], y: SealedNameGetter[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): SealedNameGetter[Z1, Z2] =
      new SealedNameGetter[Z1, Z2] {
        override def stt(h: Z2): List[String] => List[String] = {
          val xh = x.stt(p.takeHead2(h))
          val yh = y.stt(p.takeTail2(h))
          ii => xh(yh(ii))
        }
      }
  }

  object SealedNameGetterContext {
    val value: SealedNameGetterContext = new SealedNameGetterContext
  }

  implicit def stringImplicit1[T]: SealedNameGetter[SealedTag[T], String] =
    new SealedNameGetter[SealedTag[T], String] {
      override def stt(str: String): List[String] => List[String] = list => str :: list
    }

}
