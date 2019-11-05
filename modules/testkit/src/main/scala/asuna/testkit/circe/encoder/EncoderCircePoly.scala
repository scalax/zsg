package asuna.testkit.circe.encoder

import asuna.macros.{ByNameImplicit, PropertyTag, SealedTag}
import asuna.{Application, Application2, TypeHList2}
import io.circe._

trait EncoderCircePoly {

  implicit def asunaCirceSealedEncoder[T, R](
    implicit t: ByNameImplicit[Encoder[R]]
  ): Application[AsunaSealedEncoder.KContext[T], SealedTag[R], TypeHList2[String, Class[R]]] = {
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
