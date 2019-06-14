package content

import io.circe.{Encoder, Json}
import io.circe.generic.semiauto._

class EncoderContent[A, Poly](val encoder: Encoder[A]) extends AnyVal

trait PolyContent[Poly] {

  type CirceEncoder[A] = EncoderContent[A, Poly]

  implicit def circeEncoderImplicit[A](implicit encoder: CirceEncoder[A]): Encoder[A] = encoder.encoder

  def toEncoderContent[A](encoder: Encoder[A]): EncoderContent[A, Poly] = new EncoderContent[A, Poly](encoder)

}

trait Getter[Poly] {
  def toJson[A](model: A)(implicit i: EncoderContent[A, Poly]): Json = i.encoder(model)
}

case class 米粒01(i1: String, i2: Int)
case class 米粒02(i3: String, i4: Int)
case class 米粒03(i3: String, i4: Int)
case class 黑豆01(i3: String, i4: Int)
case class 黑豆02(i3: String, i4: Int)

trait 鼎1 extends PolyContent[鼎1] {

  implicit def 米粒01Implicit: CirceEncoder[米粒01] = toEncoderContent(deriveEncoder)
  implicit def 米粒02Implicit: CirceEncoder[米粒02] = toEncoderContent(deriveEncoder)
  implicit def 米粒03Implicit: CirceEncoder[米粒03] = toEncoderContent(deriveEncoder)

}

object 鼎1 extends 鼎1

trait 鼎2 extends PolyContent[鼎2] {

  implicit def 黑豆04Implicit: CirceEncoder[黑豆01] = toEncoderContent(deriveEncoder)
  implicit def 黑豆05Implicit: CirceEncoder[黑豆02] = toEncoderContent(deriveEncoder)

}

object 鼎2 extends 鼎2

case class 汉人01(name: String, age: Int)
case class 汉人02(name: String, age: Int)
case class 汉人03(name: String, age: Int)
case class 汉人04(name: String, age: Int)
case class 汉人05(name: String, age: Int)
case class 昭君(name: String, age: Int, 出塞: Option[郅支单于])
case class 郅支单于(name: String, age: Int, 娶: List[昭君])
case class 匈奴民众01(name: String, age: Int)
case class 匈奴民众02(name: String, age: Int)
case class 匈奴民众03(name: String, age: Int)
case class 匈奴民众04(name: String, age: Int)

trait 汉朝 extends PolyContent[(汉朝, 匈奴)] {

  implicit def 汉民01Implicit: CirceEncoder[汉人01] = toEncoderContent(deriveEncoder)
  implicit def 汉民02Implicit: CirceEncoder[汉人02] = toEncoderContent(deriveEncoder)
  implicit def 汉民03Implicit: CirceEncoder[汉人03] = toEncoderContent(deriveEncoder)
  implicit def 汉民04Implicit: CirceEncoder[汉人04] = toEncoderContent(deriveEncoder)
  implicit def 汉民05Implicit: CirceEncoder[汉人05] = toEncoderContent(deriveEncoder)
  implicit def 昭君Implicit: CirceEncoder[昭君]     = toEncoderContent(deriveEncoder)

}

object 汉朝 extends 汉朝

trait 匈奴 extends PolyContent[(汉朝, 匈奴)] {

  implicit def 匈奴民众01Implicit: CirceEncoder[匈奴民众01] = toEncoderContent(deriveEncoder)
  implicit def 匈奴民众02Implicit: CirceEncoder[匈奴民众02] = toEncoderContent(deriveEncoder)
  implicit def 匈奴民众03Implicit: CirceEncoder[匈奴民众03] = toEncoderContent(deriveEncoder)
  implicit def 匈奴民众04Implicit: CirceEncoder[匈奴民众04] = toEncoderContent(deriveEncoder)
  implicit def 郅支单于Implicit: CirceEncoder[郅支单于]     = toEncoderContent(deriveEncoder)

}

object 匈奴 extends 匈奴
