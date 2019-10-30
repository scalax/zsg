package asuna.test.circe

import java.util

import asuna.macros.{DefaultValue, LazyImplicit, PropertyTag, SealedTag}
import asuna.test.{AsunaCirceDecoder, AsunaCirceEncoder, AsunaSealedDecoder, AsunaSealedEncoder}
import asuna.{Application, Context, TypeHList2, TypeHList3}
import io.circe._

/*class JsonEncoderApply[T](val t: LazyImplicit[Encoder[T]]) extends AnyVal with AsunaCirceEncoder.JsonObjectAppender[T, String] {
  override def appendField(tt: T, name: String, m: util.LinkedHashMap[String, Json]): Unit = {
    m.put(name, t.value(tt))
  }
}

class JsonEncoderApplicationApply[T](val t: LazyImplicit[Encoder[T]]) extends AnyVal with Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeHList2[String, T]] {
  override def application(context: Context[AsunaCirceEncoder.KContext]): AsunaCirceEncoder.JsonObjectAppender[T, String] = new JsonEncoderApply(t)
}*/

trait EncoderCircePoly {

  implicit def asunaCirceSealedEncoder[T, R](
    implicit t: LazyImplicit[Encoder[R]]
  ): Application[AsunaSealedEncoder.KContext[T], SealedTag[R], TypeHList2[String, Class[R]]] =
    new Application[AsunaSealedEncoder.KContext[T], SealedTag[R], TypeHList2[String, Class[R]]] {
      override def application(context: Context[AsunaSealedEncoder.KContext[T]]): AsunaSealedEncoder.JsonEncoder[T, Class[R], String] = {
        new AsunaSealedEncoder.JsonEncoder[T, Class[R], String] {
          override def p(model: T, classTags: Class[R], labelled: String): Option[(String, Json)] = {
            if (classTags.isInstance(model)) {
              Some((labelled, t.value(classTags.cast(model))))
            } else {
              Option.empty
            }
          }
        }
      }
    }

  implicit def asunaCirceEncoder[T](implicit t: LazyImplicit[Encoder[T]]): Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeHList2[String, T]] =
    new Application[AsunaCirceEncoder.KContext, PropertyTag[T], TypeHList2[String, T]] {
      override def application(context: Context[AsunaCirceEncoder.KContext]): AsunaCirceEncoder.JsonObjectAppender[T, String] = {
        new AsunaCirceEncoder.JsonObjectAppender[T, String] {
          override def appendField(tt: T, name: String, m: util.LinkedHashMap[String, Json]): Unit = m.put(name, t.value(tt))
        }
      }
    }

}

object EncoderCircePoly extends EncoderCircePoly
