package asuna.testkit.circe.encoder

import asuna.{Application2, Context2}
import asuna.macros.ByNameImplicit
import asuna.macros.single.SealedTag
import io.circe.{Encoder, Json}

class SealedTraitSelector[H] {
  abstract class JsonEncoder[T, II] {
    def p(model: H, classTags: T, labelled: II): Option[(String, Json)]
  }
}

object SealedTraitSelector {

  val value    = new SealedTraitSelector[Any]
  def apply[T] = value.asInstanceOf[SealedTraitSelector[T]]

  implicit final def asunaCirceSealedEncoder[T, R](
    implicit t: ByNameImplicit[Encoder[R]]
  ): Application2[SealedTraitSelector[T]#JsonEncoder, SealedTag[R], Class[R], String] =
    new Application2[SealedTraitSelector[T]#JsonEncoder, SealedTag[R], Class[R], String] {
      override def application(context: Context2[SealedTraitSelector[T]#JsonEncoder]): SealedTraitSelector[T]#JsonEncoder[Class[R], String] = {
        val con = SealedTraitSelector[T]
        new con.JsonEncoder[Class[R], String] {
          override def p(model: T, classTags: Class[R], labelled: String): Option[(String, Json)] = {
            if (classTags.isInstance(model))
              Some((labelled, t.value(classTags.cast(model))))
            else
              Option.empty
          }
        }
      }
    }
}
