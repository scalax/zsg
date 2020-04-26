package asuna.testkit

import asuna.macros.single.{AsunaGeneric, AsunaSetterGeneric}
import asuna.{Application1, AsunaTuple0, Context1, Plus1, PropertyTag0, TupleTag, TupleTag1}

trait ModelDecoder[M] {
  def getData(str: String): (String, M)
}

object decoderContext extends Context1[ModelDecoder] {

  override def append[X1, Y1, Z1](x: ModelDecoder[X1], y: ModelDecoder[Y1])(p: Plus1[X1, Y1, Z1]): ModelDecoder[Z1] = new ModelDecoder[Z1] {
    override def getData(str: String): (String, Z1) = {
      val (str1, d1) = x.getData(str)
      val (str2, d2) = y.getData(str1)
      (str2, p.plus1(d1, d2))
    }
  }


  override def start: ModelDecoder[AsunaTuple0] = new ModelDecoder[AsunaTuple0] {
    override def getData(str: String): (String, AsunaTuple0) = (str, AsunaTuple0.value)
  }

}

object reverseDecoderContext extends Context1[ModelDecoder] {

  override def append[X1, Y1, Z1](x: ModelDecoder[X1], y: ModelDecoder[Y1])(p: Plus1[X1, Y1, Z1]): ModelDecoder[Z1] = new ModelDecoder[Z1] {
    override def getData(str: String): (String, Z1) = {
    val (str1, d1) = y.getData(str)
    val (str2, d2) = x.getData(str1)
    (str2, p.plus1(d2, d1))}
  }

  override val start: ModelDecoder[AsunaTuple0] = new ModelDecoder[AsunaTuple0] {
    override def getData(str: String): (String, AsunaTuple0) = (str, AsunaTuple0.value)
  }


}

object out {

  def decoder[I1, I2 <: TupleTag, I3](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application1[ModelDecoder, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3]
  ): ModelDecoder[I1] = new ModelDecoder[I1] {
    override def getData(str: String): (String, I1) = {
      val c         = pp.application(reverseDecoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  def reverseDecoder[I1, I2 <: TupleTag, I3](
    implicit ii: AsunaGeneric.Aux[I1, I2],
    pp: Application1[ModelDecoder, I2, I3],
    asunaSetterGeneric: AsunaSetterGeneric[I1, I3]
  ): ModelDecoder[I1] = new ModelDecoder[I1] {
    override def getData(str: String): (String, I1) = {
      val c         = pp.application(decoderContext)
      val (str1, m) = c.getData(str)
      (str1, asunaSetterGeneric.setter(m))
    }
  }

  implicit val outImplicit1: Application1[ModelDecoder, PropertyTag0[String], String] = new Application1[ModelDecoder, PropertyTag0[String], String] {
    override def application(context: Context1[ModelDecoder]): ModelDecoder[String] = new ModelDecoder[String]{
      override def getData(str: String): (String, String) = {
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2)
      }
    }
  }

  implicit val outImplicit2: Application1[ModelDecoder, PropertyTag0[Int], Int] = new Application1[ModelDecoder, PropertyTag0[Int], Int] {
    override def application(context: Context1[ModelDecoder]): ModelDecoder[Int] = new ModelDecoder[Int] {
      override def getData(str: String): (String, Int) = {
        val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
        val str2 = str1.takeWhile(s => s != ')')
        val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
        (str3, str2.toInt)
      }
    }
  }

  implicit val outImplicit3: Application1[ModelDecoder, PropertyTag0[Long], Long] = new Application1[ModelDecoder, PropertyTag0[Long], Long] {
    override def application(context: Context1[ModelDecoder]): ModelDecoder[Long] = new ModelDecoder[Long] {
      override def getData(str: String): (String, Long) = {
          val str1 = str.dropWhile(s => s != '(').drop(1).dropWhile(s => s != '(').drop(1)
          val str2 = str1.takeWhile(s => s != ')')
          val str3 = str1.dropWhile(s => s != ')').drop(1).dropWhile(s => s != ')').drop(1)
          (str3, str2.toLong)
      }
    }
  }

}

object ii {
  case class I(i1: String)
  def aa[T <: TupleTag](implicit l: AsunaGeneric.Aux[I, TupleTag1[PropertyTag0[String]]]): AsunaGeneric.Aux[I, TupleTag1[PropertyTag0[String]]] = l

  aa

  //aa(_root_.asuna.macros.single.AsunaGeneric.value(((item) => _root_.asuna.AppendTag.lift(_root_.asuna.AppendTag.tag(item.to(((x$1) => x$1.i1))))))).bb
}