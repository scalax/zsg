package zsg.macros.case_class_test

import zsg.macros.single.{ZsgGeneric, ZsgSetterGeneric}
import zsg.{Application, Context, Plus, PropertyTag, TypeFunction, TypeHList, TypeHList1}

trait ModelFromString[M] {
  def getData(str: List[FieldModel]): (List[FieldModel], M)
}

object ModelFromString {

  class MFSI extends TypeFunction { override type H[T <: TypeHList] = ModelFromStringImpl[T#Head] }

  class DecoderContext extends Context[MFSI] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: ModelFromStringImpl[X#Head], y: ModelFromStringImpl[Y#Head])(
      plus: Plus[X, Y, Z]
    ): ModelFromStringImpl[Z#Head] =
      new ModelFromStringImpl[Z#Head] {
        override def getData(str: List[FieldModel]): (List[FieldModel], Z#Head) = {
          val (str1, d1) = x.getData(str)
          val (str2, d2) = y.getData(str1)
          (str2, plus.plus(d1, d2))
        }
      }
  }

  object DecoderContext {
    val value: DecoderContext = new DecoderContext

    implicit def implicit1[I1](implicit impl: ModelFromStringImpl[I1]): Application[MFSI, DecoderContext, PropertyTag[I1], TypeHList1[I1]] =
      new Application[MFSI, DecoderContext, PropertyTag[I1], TypeHList1[I1]] {
        override def application(context: DecoderContext): ModelFromStringImpl[I1] = impl
      }
  }

  class ReverseDecoderContext extends Context[MFSI] {
    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](x: ModelFromStringImpl[X#Head], y: ModelFromStringImpl[Y#Head])(
      plus: Plus[X, Y, Z]
    ): ModelFromStringImpl[Z#Head] = {
      new ModelFromStringImpl[Z#Head] {
        override def getData(str: List[FieldModel]): (List[FieldModel], Z#Head) = {
          val (str1, d1) = y.getData(str)
          val (str2, d2) = x.getData(str1)
          (str2, plus.plus(d2, d1))
        }
      }
    }
  }

  object ReverseDecoderContext {
    val value: ReverseDecoderContext = new ReverseDecoderContext

    implicit def implicit1[I1](implicit
      impl: ModelFromStringImpl[I1]
    ): Application[MFSI, ReverseDecoderContext, PropertyTag[I1], TypeHList1[I1]] =
      new Application[MFSI, ReverseDecoderContext, PropertyTag[I1], TypeHList1[I1]] {
        override def application(context: ReverseDecoderContext): ModelFromStringImpl[I1] = impl
      }
  }

  def decoder[I1, I2, I3 <: TypeHList](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: Application[MFSI, DecoderContext, I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3#Head]
  ): ModelFromString[I1] =
    new ModelFromString[I1] {
      override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
        val (str1, m) = pp.application(DecoderContext.value).getData(str)
        (str1, zsgSetterGeneric.setter(m))
      }
    }

  def reverseDecoder[I1, I2, I3 <: TypeHList](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: Application[MFSI, ReverseDecoderContext, I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3#Head]
  ): ModelFromString[I1] =
    new ModelFromString[I1] {
      override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
        val (str1, m) = pp.application(ReverseDecoderContext.value).getData(str)
        (str1, zsgSetterGeneric.setter(m))
      }
    }

}
