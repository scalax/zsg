package zsg.testkit.circe.decoder

import zsg.macros.single.DefaultValue
import zsg.macros.ByNameImplicit
import io.circe._
import zsg.TypeHList

trait JsonDecoderPro[T, II, D] extends Any {
  def to(name: II, defaultValue: D): Decoder[T]
}

object JsonDecoderPro {
  type S[T <: TypeHList] = JsonDecoderPro[T#Head, T#Tail#Head, T#Tail#Tail#Head]

  implicit def asunaCirceDecoder[T](implicit
    dd: ByNameImplicit[Decoder[T]]
  ): JsonDecoderPro[T, String, DefaultValue[T]] =
    new JsonDecoderPro[T, String, DefaultValue[T]] {
      override def to(name: String, defaultValue: DefaultValue[T]): Decoder[T] = {
        Decoder.instance { j => defaultValue.value.map(s => Right(s)).getOrElse(j.get(name)(dd.value)) }
      }
    }

}
