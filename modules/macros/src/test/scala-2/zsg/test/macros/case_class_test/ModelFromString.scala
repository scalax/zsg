package zsg.macros.case_class_test

import zsg.macros.single.{ZsgGeneric, ZsgSetterGeneric}
import zsg.{Application, Context, Plus, PropertyTag, TypeAlias, TypeFunction, TypeHList}

trait ModelFromString[M] {
  def getData(str: List[FieldModel]): (List[FieldModel], M)
}

object ModelFromString {

  class MFSI extends TypeFunction { override type H[T <: TypeHList] = ModelFromStringImpl[T#Head] }
  object MFSI {
    implicit def implicit1[I1](implicit
      impl: ModelFromStringImpl[I1]
    ): Application[MFSI, PropertyTag[I1], TypeAlias.TypeHList1[I1]] =
      new Application[MFSI, PropertyTag[I1], TypeAlias.TypeHList1[I1]] {
        override def application(context: Context[MFSI]): ModelFromStringImpl[I1] = impl
      }
  }

  object DecoderContext extends Context[MFSI] {
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

  class ReverseMSFI extends TypeFunction { override type H[T <: TypeHList] = ModelFromStringImpl[T#Head] }
  object ReverseMSFI {
    implicit def implicit1[I1](implicit
      impl: ModelFromStringImpl[I1]
    ): Application[ReverseMSFI, PropertyTag[I1], TypeAlias.TypeHList1[I1]] =
      new Application[ReverseMSFI, PropertyTag[I1], TypeAlias.TypeHList1[I1]] {
        override def application(context: Context[ReverseMSFI]): ModelFromStringImpl[I1] = impl
      }
  }

  object ReverseDecoderContext extends Context[ReverseMSFI] {
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

  def decoder[I1, I2, I3 <: TypeHList](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: Application[MFSI, I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3#Head]
  ): ModelFromString[I1] =
    new ModelFromString[I1] {
      override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
        val (str1, m) = pp.application(DecoderContext).getData(str)
        (str1, zsgSetterGeneric.setter(m))
      }
    }

  def reverseDecoder[I1, I2, I3 <: TypeHList](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: Application[ReverseMSFI, I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3#Head]
  ): ModelFromString[I1] =
    new ModelFromString[I1] {
      override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
        val (str1, m) = pp.application(ReverseDecoderContext).getData(str)
        (str1, zsgSetterGeneric.setter(m))
      }
    }

}
