package zsg.test.macros.sealed_trait_test

import zsg.{Application, Context, Plus, TypeFunction, TypeHList, TypeHList1}
import zsg.macros.single.{SealedTag, ZsgSealedGeneric, ZsgSealedLabelledGeneric}

object SealedTraitLabelledGenericPrepareTest {

  sealed trait Abc[T]

  class AA(ii: String, iiii: String)    extends Abc[String]
  class BB(ii: String, iiii: String)    extends Abc[String]
  case class CC(i1: Number, i2: String) extends Abc[Number]
  case object dd                        extends Abc[Number]

  class Ignore(ii: String, iiii: String) extends BB(ii, iiii)

  trait SealedNameGetter[T] {
    def stt(t: T): List[String] => List[String]
  }

  trait SealedTraitNames[H] {
    def str: List[String]
  }

  class SeaGetter extends TypeFunction {
    override type H[T <: TypeHList] = SealedNameGetter[T#Head]
  }

  def sealedNames[H, T, TT <: TypeHList](implicit
    sg: ZsgSealedGeneric.Aux[H, T],
    app: Application[SeaGetter, SealedNameGetterContext, T, TT],
    labelled: ZsgSealedLabelledGeneric[H, TT#Head]
  ): SealedTraitNames[H] = new SealedTraitNames[H] {
    override def str: List[String] = app.application(SealedNameGetterContext.value).stt(labelled.names)(List.empty)
  }

  class SealedNameGetterContext extends Context[SeaGetter] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: SealedNameGetter[X#Head], y: SealedNameGetter[Y#Head])(
      plus: Plus[X, Y, Z]
    ): SealedNameGetter[Z#Head] = new SealedNameGetter[Z#Head] {
      override def stt(t: Z#Head): List[String] => List[String] = {
        val xh = x.stt(plus.takeHead(t))
        val yh = y.stt(plus.takeTail(t))
        ii => xh(yh(ii))
      }
    }
  }

  object SealedNameGetterContext {
    val value: SealedNameGetterContext = new SealedNameGetterContext
  }

  implicit def stringImplicit1[T]: Application[SeaGetter, SealedNameGetterContext, SealedTag[T], TypeHList1[String]] = {
    new Application[SeaGetter, SealedNameGetterContext, SealedTag[T], TypeHList1[String]] {
      override def application(context: SealedNameGetterContext): SealedNameGetter[String] = new SealedNameGetter[String] {
        override def stt(t: String): List[String] => List[String] = list => t :: list
      }
    }
  }

}
