package asuna.testkit.circe.encoder

import asuna.macros.{ByNameImplicit, PropertyTag, SealedTag}
import asuna.testkit.circe.encoder.AsunaSealedEncoder.JsonEncoder
import asuna.Application2
import io.circe._

trait EncoderCircePoly {

  implicit def asunaCirceSealedEncoder[T, R](
    implicit t: ByNameImplicit[Encoder[R]]
  ): Application2[JsonEncoder[T, *, *], SealedTag[R], Class[R], String] = {
    context =>
      { (model: T, classTags: Class[R], labelled: String) =>
        if (classTags.isInstance(model))
          Some((labelled, t.value(classTags.cast(model))))
        else
          Option.empty
      }
  }

  implicit def asunaCirceEncoder[T](implicit t: ByNameImplicit[Encoder[T]]): Application2[AsunaObjectEncoder.JsonObjectAppender, PropertyTag[T], T, String] = {
    context =>
      { (tt: T, name: String, m: java.util.LinkedHashMap[String, Json]) =>
        m.put(name, t.value(tt))
      }
  }

}

object EncoderCircePoly extends EncoderCircePoly
