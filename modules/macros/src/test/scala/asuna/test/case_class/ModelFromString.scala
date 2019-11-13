package asuna.testkit

import asuna.macros.{AsunaGeneric, AsunaSetterGeneric, PropertyTag}
import asuna.{Application1, AsunaTuple0, Context1, Plus1, TupleTag}

trait ModelDecoder[M] {
  def getData(str: String): (String, M)
}

object decoderContext extends Context1[ModelDecoder] {
  override def append[X1, Y1, Z1](x: ModelDecoder[X1], y: ModelDecoder[Y1])(p: Plus1[X1, Y1, Z1]): ModelDecoder[Z1] = { (str: String) =>
    val (str1, d1) = x.getData(str)
    val (str2, d2) = y.getData(str1)
    (str2, p.plus1(d1, d2))
  }

  override def start: ModelDecoder[AsunaTuple0] = { str: String =>
    (str, AsunaTuple0.value)
  }
}

object reverseDecoderContext extends Context1[ModelDecoder] {
  override def append[X1, Y1, Z1](x: ModelDecoder[X1], y: ModelDecoder[Y1])(p: Plus1[X1, Y1, Z1]): ModelDecoder[Z1] = { (str: String) =>
    val (str1, d1) = y.getData(str)
    val (str2, d2) = x.getData(str1)
    (str2, p.plus1(d2, d1))
  }

  override def start: ModelDecoder[AsunaTuple0] = { str: String =>
    (str, AsunaTuple0.value)
  }
}

object out {

  def decoder[I1, I2 <: TupleTag, I3](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application1[ModelDecoder, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3]
  ): ModelDecoder[I1] = {
    { str: String =>
      val c         = pp.application(reverseDecoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  def reverseDecoder[I1, I2 <: TupleTag, I3](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application1[ModelDecoder, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3]
  ): ModelDecoder[I1] = {
    { str: String =>
      val c         = pp.application(decoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  implicit val outImplicit1: Application1[ModelDecoder, PropertyTag[String], String] = {
    context =>
      { (str: String) =>
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2)
      }
  }

  implicit val outImplicit2: Application1[ModelDecoder, PropertyTag[Int], Int] = {
    context =>
      { (str: String) =>
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2.toInt)
      }
  }

  implicit val outImplicit3: Application1[ModelDecoder, PropertyTag[Long], Long] = (context => {
    (str: String) =>
      val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
      val str2 = str1.takeWhile(s => s != ')')
      val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
      (str3, str2.toLong)
  })

}
