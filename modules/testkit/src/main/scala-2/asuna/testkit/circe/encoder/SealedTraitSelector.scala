package zsg.testkit.circe.encoder

import zsg.macros.ByNameImplicit
import zsg.macros.single.SealedTag
import io.circe.{Encoder, Json}
import zsg.Context3

class SealedTraitSelector[H] {
  trait JsonEncoder[U, T, II] {
    def p(model: H, classTags: T, labelled: II): Option[(String, Json)]
  }
}

object SealedTraitSelector {

  val value    = new SealedTraitSelector[Any]
  def apply[T] = value.asInstanceOf[SealedTraitSelector[T]]

  implicit final def asunaCirceSealedEncoder[T, R](implicit
    t: ByNameImplicit[Encoder[R]]
  ): SealedTraitSelector[T]#JsonEncoder[SealedTag[R], Class[R], String] = {
    val con = SealedTraitSelector[T]
    new con.JsonEncoder[SealedTag[R], Class[R], String] {
      override def p(model: T, classTags: Class[R], labelled: String): Option[(String, Json)] = {
        if (classTags.isInstance(model))
          Some((labelled, t.value(classTags.cast(model))))
        else
          Option.empty
      }
    }
  }

  implicit def c[H]: Context3[SealedTraitSelector[H]#JsonEncoder] = new ZsgSealedContext[H]

}
