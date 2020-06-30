package zsg.macros.case_class_test

import zsg.macros.single.{ZsgGeneric, ZsgSetterGeneric}
import zsg.{Context2, Plus2, ZsgTuple0}

trait ModelFromString[M] {
  def getData(str: String): (String, M)
}

object ModelFromString {

  object decoderContext extends Context2[ModelFromStringImpl] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: ModelFromStringImpl[X1, X2], y: ModelFromStringImpl[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): ModelFromStringImpl[Z1, Z2] =
      new ModelFromStringImpl[Z1, Z2] {
        override def getData(str: String): (String, Z2) = {
          val (str1, d1) = x.getData(str)
          val (str2, d2) = y.getData(str1)
          (str2, p.plus2(d1, d2))
        }
      }

    override val start: ModelFromStringImpl[ZsgTuple0, ZsgTuple0] = new ModelFromStringImpl[ZsgTuple0, ZsgTuple0] {
      override def getData(str: String): (String, ZsgTuple0) = (str, ZsgTuple0.value)
    }
  }

  object reverseDecoderContext extends Context2[ModelFromStringImpl] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: ModelFromStringImpl[X1, X2], y: ModelFromStringImpl[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): ModelFromStringImpl[Z1, Z2] =
      new ModelFromStringImpl[Z1, Z2] {
        override def getData(str: String): (String, Z2) = {
          val (str1, d1) = y.getData(str)
          val (str2, d2) = x.getData(str1)
          (str2, p.plus2(d2, d1))
        }
      }

    override val start: ModelFromStringImpl[ZsgTuple0, ZsgTuple0] = new ModelFromStringImpl[ZsgTuple0, ZsgTuple0] {
      override def getData(str: String): (String, ZsgTuple0) = (str, ZsgTuple0.value)
    }
  }

  class DecoderContent {
    def decoder[I1, I2, I3](implicit
      ii: ZsgGeneric.Aux[I1, I2],
      pp: ModelFromStringImpl[I2, I3],
      zsgSetterGeneric: ZsgSetterGeneric[I1, I3]
    ): ModelFromString[I1] =
      new ModelFromString[I1] {
        override def getData(str: String): (String, I1) = {
          val (str1, m) = pp.getData(str)
          (str1, zsgSetterGeneric.setter(m))
        }
      }
  }

  def decoder[I](n: Context2[ModelFromStringImpl] => DecoderContent => ModelFromString[I]): ModelFromString[I] = n(decoderContext)(new DecoderContent)

  class ReverseDecoderContent {
    def reverseDecoder[I1, I2, I3](implicit
      ii: ZsgGeneric.Aux[I1, I2],
      pp: ModelFromStringImpl[I2, I3],
      zsgSetterGeneric: ZsgSetterGeneric[I1, I3]
    ): ModelFromString[I1] =
      new ModelFromString[I1] {
        override def getData(str: String): (String, I1) = {
          val (str1, m) = pp.getData(str)
          (str1, zsgSetterGeneric.setter(m))
        }
      }
  }

  def reverseDecoder[I](n: Context2[ModelFromStringImpl] => ReverseDecoderContent => ModelFromString[I]): ModelFromString[I] =
    n(reverseDecoderContext)(new ReverseDecoderContent)

}
