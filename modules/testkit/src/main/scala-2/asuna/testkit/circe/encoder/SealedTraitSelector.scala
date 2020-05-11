package asuna.testkit.circe.encoder

import asuna.{Application3, Context3}
import asuna.macros.ByNameImplicit
import asuna.macros.single.SealedTag
import io.circe.{Encoder, Json}

class SealedTraitSelector[H] {
  trait JsonEncoder[U, T, II] {
    def p(model: H, classTags: T, labelled: II): Option[(String, Json)]
  }
}

object SealedTraitSelector {

  val value    = new SealedTraitSelector[Any]
  def apply[T] = value.asInstanceOf[SealedTraitSelector[T]]

  class SealedTraitSelectorImpl[I] extends SealedTraitSelector[I] {
    class JsonEncoderImpl[H](n: ByNameImplicit[Encoder[H]])
        extends Application3[SealedTraitSelector[I]#JsonEncoder, SealedTag[H], Class[H], String]
        with JsonEncoder[SealedTag[H], Class[H], String] { self =>
      override def p(model: I, classTags: Class[H], labelled: String): Option[(String, Json)] = {
        if (classTags.isInstance(model))
          Some((labelled, n.value(classTags.cast(model))))
        else
          Option.empty
      }

      override def application(context: Context3[SealedTraitSelector[I]#JsonEncoder]): SealedTraitSelector[I]#JsonEncoder[SealedTag[H], Class[H], String] = self
    }
  }

  object SealedTraitSelectorImpl {
    val value    = new SealedTraitSelectorImpl[Any]
    def apply[T] = value.asInstanceOf[SealedTraitSelectorImpl[T]]
  }

  implicit final def asunaCirceSealedEncoder[T, R](
    implicit t: ByNameImplicit[Encoder[R]]
  ): Application3[SealedTraitSelector[T]#JsonEncoder, SealedTag[R], Class[R], String] = {
    val con = SealedTraitSelectorImpl[T]
    new con.JsonEncoderImpl[R](t)
  }
}
