package zsg.testkit.circe.decoder

import zsg.macros.single.DefaultValue
import zsg.macros.ByNameImplicit
import zsg.{Application4, Context4, PropertyTag}
import io.circe._

trait JsonDecoderPro[P, T, II, D] extends Any {
  def to(name: II, defaultValue: D): Decoder[T]
}

object JsonDecoderPro {

  implicit def asunaCirceDecoder[T](
    implicit dd: ByNameImplicit[Decoder[T]]
  ): JsonDecoderPro[PropertyTag[T], T, String, DefaultValue[T]] = new JsonDecoderPro[PropertyTag[T], T, String, DefaultValue[T]] {
    override def to(name: String, defaultValue: DefaultValue[T]): Decoder[T] = {
      Decoder.instance { j => defaultValue.value.map(s => Right(s)).getOrElse(j.get(name)(dd.value)) }
    }
  }

}
