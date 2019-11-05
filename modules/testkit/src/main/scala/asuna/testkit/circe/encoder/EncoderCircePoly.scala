package asuna.testkit.circe.encoder

import asuna.macros.{ByNameImplicit, PropertyTag, SealedTag}
import asuna.Application2
import io.circe._

trait EncoderCircePoly {

  implicit def asunaCirceSealedEncoder[T, R](
    implicit t: ByNameImplicit[Encoder[R]]
  ): Application2[AsunaSealedEncoder.II[T]#JsonEncoder, SealedTag[R], Class[R], String] = { context =>
    val con = AsunaSealedEncoder.II[T]

    new con.JsonEncoder[Class[R], String] {
      override def p(model: T, classTags: Class[R], labelled: String): Option[(String, Json)] = {
        if (classTags.isInstance(model))
          Some((labelled, t.value(classTags.cast(model))))
        else
          Option.empty
      }
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
