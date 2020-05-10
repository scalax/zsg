package asuna.testkit

import asuna.macros.single.{AsunaGeneric, AsunaSetterGeneric}
import asuna.{Application2, AsunaTuple0, Context2, Plus2, PropertyTag}

trait ModelDecoderImpl[I, M] {
  def getData(str: String): (String, M)
}

trait ModelDecoder[M] {
  def getData(str: String): (String, M)
}

object decoderContext extends Context2[ModelDecoderImpl] {
  override def append[X1, X2, Y1, Y2, Z1, Z2](x: ModelDecoderImpl[X1, X2], y: ModelDecoderImpl[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): ModelDecoderImpl[Z1, Z2] = new ModelDecoderImpl[Z1, Z2] {
    override def getData(str: String): (String, Z2) = {
      val (str1, d1) = x.getData(str)
      val (str2, d2) = y.getData(str1)
      (str2, p.plus2(d1, d2))
    }
  }

  override def start: ModelDecoderImpl[AsunaTuple0, AsunaTuple0] = new ModelDecoderImpl[AsunaTuple0, AsunaTuple0] {
    override def getData(str: String): (String, AsunaTuple0) = (str, AsunaTuple0.value)
  }
}

object reverseDecoderContext extends Context2[ModelDecoderImpl] {
  override def append[X1, X2, Y1, Y2, Z1, Z2](x: ModelDecoderImpl[X1, X2], y: ModelDecoderImpl[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): ModelDecoderImpl[Z1, Z2] = new ModelDecoderImpl[Z1, Z2] {
    override def getData(str: String): (String, Z2) = {
      val (str1, d1) = y.getData(str)
      val (str2, d2) = x.getData(str1)
      (str2, p.plus2(d2, d1))
    }
  }

  override def start: ModelDecoderImpl[AsunaTuple0, AsunaTuple0] = new ModelDecoderImpl[AsunaTuple0, AsunaTuple0] {
    override def getData(str: String): (String, AsunaTuple0) = (str, AsunaTuple0.value)
  }
}

object out {

  def decoder[I1, I2, I3](
                           implicit ii: AsunaGeneric.Aux[I1, I2],
                           pp: Application2[ModelDecoderImpl, I2, I3],
                           asunaSetterGeneric: AsunaSetterGeneric[I1, I3]
                         ): ModelDecoder[I1] = new ModelDecoder[I1] {
    override def getData(str: String): (String, I1) = {
      val c = pp.application(reverseDecoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  def reverseDecoder[I1, I2, I3](
                                  implicit ii: AsunaGeneric.Aux[I1, I2],
                                  pp: Application2[ModelDecoderImpl, I2, I3],
                                  asunaSetterGeneric: AsunaSetterGeneric[I1, I3]
                                ): ModelDecoder[I1] = new ModelDecoder[I1] {
    override def getData(str: String): (String, I1) = {
      val c = pp.application(decoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  implicit val outImplicit1: Application2[ModelDecoderImpl, PropertyTag[String], String] = new Application2[ModelDecoderImpl, PropertyTag[String], String] {
    override def application(context: Context2[ModelDecoderImpl]): ModelDecoderImpl[PropertyTag[String], String] = new ModelDecoderImpl[PropertyTag[String], String] {
      override def getData(str: String): (String, String) = {
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2)
      }
    }
  }

  implicit val outImplicit2: Application2[ModelDecoderImpl, PropertyTag[Int], Int] = new Application2[ModelDecoderImpl, PropertyTag[Int], Int] {
    override def application(context: Context2[ModelDecoderImpl]): ModelDecoderImpl[PropertyTag[Int], Int] = new ModelDecoderImpl[PropertyTag[Int], Int] {
      override def getData(str: String): (String, Int) = {
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2.toInt)
      }
    }
  }

  implicit val outImplicit3: Application2[ModelDecoderImpl, PropertyTag[Long], Long] = new Application2[ModelDecoderImpl, PropertyTag[Long], Long] {
    override def application(context: Context2[ModelDecoderImpl]): ModelDecoderImpl[PropertyTag[Long], Long] = new ModelDecoderImpl[PropertyTag[Long], Long] {
      override def getData(str: String): (String, Long) = {
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2.toLong)
      }
    }
  }

}
