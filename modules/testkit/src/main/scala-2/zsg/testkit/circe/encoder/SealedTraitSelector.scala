package zsg.testkit.circe.encoder

import zsg.macros.ByNameImplicit
import zsg.macros.single.SealedTag
import io.circe.{Encoder, Json}
import zsg.{Application, TypeFunction, TypeHList, TypeHList2}

class SealedTraitSelector[H1] extends TypeFunction {
  override type H[T <: TypeHList] = JsonEncoder[H1, T#Head, T#Tail#Head]
}

object SealedTraitSelector {
  implicit def implicit1[P, S](implicit
    t: ByNameImplicit[Encoder[S]]
  ): Application[SealedTraitSelector[P], ZsgSealedContext[P], SealedTag[S], TypeHList2[Class[S], String]] =
    new Application[SealedTraitSelector[P], ZsgSealedContext[P], SealedTag[S], TypeHList2[Class[S], String]] {
      override def application(context: ZsgSealedContext[P]): JsonEncoder[P, Class[S], String] =
        new JsonEncoder[P, Class[S], String] {
          override def p(model: P, classTags: Class[S], labelled: String): Option[(String, Json)] = {
            if (classTags.isInstance(model))
              Some((labelled, t.value(classTags.cast(model))))
            else
              Option.empty
          }
        }
    }
}

trait JsonEncoder[H, T, II] {
  def p(model: H, classTags: T, labelled: II): Option[(String, Json)]
}
