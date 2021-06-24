package zsg.testkit.circe.decoder

import zsg.macros.single.DefaultValue
import zsg.macros.ByNameImplicit
import io.circe._
import zsg.{Application, PropertyTag, TypeFunction, TypeHList, TypeHList3}

trait JsonDecoderPro[T, II, D] extends Any {
  def to(name: II, defaultValue: D): Decoder[T]
}

class JsonDecoderFunc extends TypeFunction {
  override type H[T <: TypeHList] = JsonDecoderPro[T#Head, T#Tail#Head, T#Tail#Tail#Head]
}

object JsonDecoderFunc {
  implicit def implicit1[T1](implicit
    dd: ByNameImplicit[Decoder[T1]]
  ): Application[JsonDecoderFunc, ZsgDecoderContext, PropertyTag[T1], TypeHList3[T1, String, DefaultValue[T1]]] =
    new Application[JsonDecoderFunc, ZsgDecoderContext, PropertyTag[T1], TypeHList3[T1, String, DefaultValue[T1]]] {
      override def application(context: ZsgDecoderContext): JsonDecoderPro[T1, String, DefaultValue[T1]] =
        new JsonDecoderPro[T1, String, DefaultValue[T1]] {
          override def to(name: String, defaultValue: DefaultValue[T1]): Decoder[T1] = {
            Decoder.instance { j => defaultValue.value.map(s => Right(s)).getOrElse(j.get(name)(dd.value)) }
          }
        }
    }
}
