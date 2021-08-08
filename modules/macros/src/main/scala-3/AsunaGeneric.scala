package zsg.macros.single

import asuna._
import zsg.macros.ZsgParameters

import scala.language.experimental.macros

case class TestModel(i1: String, i2: Int)

trait AsunaGeneric[H] {
  type WT
  def tag: WT
}

object AsunaGeneric {

  val value = new AsunaGeneric[Any] {
    override type WT = Any
    override def tag: Any = 2
  }
  type Aux[H, II] = AsunaGeneric[H] { type WT = II }
  inline def Aux[H, II  ]: Aux[H, II] = value.asInstanceOf[Aux[H, II]]

  class GenericApply[M] {
    def generic[WW](implicit i: AsunaGeneric.Aux[M, WW]): AsunaGeneric.Aux[M, WW]     = i
    @inline def value[K](i: PropertyApply[M] => K): AsunaGeneric.Aux[M, K] = Aux[M, K]
  }

  object GenericApply {
    val value                                                  = new GenericApply[Any]
    inline def apply[T]: AsunaGeneric.GenericApply[T]         = value.asInstanceOf[GenericApply[T]]
    inline implicit def init[M]: AsunaGeneric.GenericApply[M] = GenericApply[M]
  }

  transparent inline def defaultOf[H](using inline prop: AsunaGeneric.GenericApply[H]) = ${ AsunaGenericMacroApply.generic('prop) }

}

object AsunaGenericMacroApply {

  import scala.quoted.*

  def generic[H](prop: Expr[AsunaGeneric.GenericApply[H]])(using qctx: Quotes, t1: Type[H]): Expr[Any] = {
    // import qctx.tasty._
    // println(t1.unseal)
    prop
  }

  transparent inline def generic1[H: Type](using qctx: Quotes): Expr[Any] = {
    val typeRef = Type.of[H]
    typeRef
    '{ 32424 }
  }

}