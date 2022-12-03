package zsg.macros.case_class_test

import zsg.macros.single.{ZsgGeneric, ZsgSetterGeneric}
import zsg.{ItemTag2, PropertyTag, ZsgTuple2}

trait ModelFromString[M] {
  def getData(str: List[FieldModel]): (List[FieldModel], M)
}

object ModelFromString {

  trait MFSI[Input] {
    type M
    def getData(str: List[FieldModel]): (List[FieldModel], M)
  }
  object MFSI {
    type Aux[Input, M1] = MFSI[Input] { type M = M1 }
    implicit def impl[T1, T2, I1, I2](implicit
      i1: MFSI.Aux[T1, I1],
      i2: MFSI.Aux[T2, I2]
    ): MFSI.Aux[ItemTag2[T1, T2], ZsgTuple2[I1, I2]] =
      new MFSI[ItemTag2[T1, T2]] {
        override type M = ZsgTuple2[I1, I2]
        override def getData(str: List[FieldModel]): (List[FieldModel], ZsgTuple2[I1, I2]) = {
          val (str1, d1) = i1.getData(str)
          val (str2, d2) = i2.getData(str1)
          (str2, new ZsgTuple2(d1, d2))
        }
      }

    implicit def implicit1[I1](implicit impl: ModelFromStringImpl[I1]): MFSI.Aux[PropertyTag[I1], I1] = new MFSI[PropertyTag[I1]] {
      override type M = I1
      override def getData(str: List[FieldModel]): (List[FieldModel], I1) = impl.getData(str)
    }
  }

  trait ReverseMFSI[Input] {
    type M
    def getData(str: List[FieldModel]): (List[FieldModel], M)
  }
  object ReverseMFSI {
    type Aux[Input, M1] = ReverseMFSI[Input] { type M = M1 }
    implicit def impl[T1, T2, I1, I2](implicit
      i1: ReverseMFSI.Aux[T1, I1],
      i2: ReverseMFSI.Aux[T2, I2]
    ): ReverseMFSI.Aux[ItemTag2[T1, T2], ZsgTuple2[I1, I2]] =
      new ReverseMFSI[ItemTag2[T1, T2]] {
        override type M = ZsgTuple2[I1, I2]
        override def getData(str: List[FieldModel]): (List[FieldModel], ZsgTuple2[I1, I2]) = {
          val (str1, d1) = i2.getData(str)
          val (str2, d2) = i1.getData(str1)
          (str2, new ZsgTuple2(d2, d1))
        }
      }

    implicit def implicit1[I1](implicit impl: ModelFromStringImpl[I1]): ReverseMFSI.Aux[PropertyTag[I1], I1] =
      new ReverseMFSI[PropertyTag[I1]] {
        override type M = I1
        override def getData(str: List[FieldModel]): (List[FieldModel], I1) = impl.getData(str)
      }
  }

  def decoder[I1, I2, I3](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: MFSI.Aux[I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3]
  ): ModelFromString[I1] = new ModelFromString[I1] {
    override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
      val (str1, m) = pp.getData(str)
      (str1, zsgSetterGeneric.setter(m))
    }
  }

  def reverseDecoder[I1, I2, I3](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: ReverseMFSI.Aux[I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3]
  ): ModelFromString[I1] = new ModelFromString[I1] {
    override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
      val (str1, m) = pp.getData(str)
      (str1, zsgSetterGeneric.setter(m))
    }
  }

}
