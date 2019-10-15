package asuna.test

import asuna.macros.LazyImplicit
import io.circe._
import shapeless._
import shapeless.labelled.FieldType

object ShapelessTest {

  object EncodeImplicit {

    implicit val encodeHNil: Encoder.AsObject[HNil] = Encoder.AsObject.instance((_: HNil) => JsonObject.empty)

    implicit def encodeHCons[K <: Symbol, H, T <: HList](
      implicit
      key: Witness.Aux[K],
      encodeH: LazyImplicit[Encoder[H]],
      encodeT: Encoder.AsObject[T]
    ): Encoder.AsObject[FieldType[K, H] :: T] = Encoder.AsObject.instance {
      case h :: t => ((key.value.name, encodeH.value(h))) +: encodeT.encodeObject(t)
    }

    def encodeGeneric[A, R](implicit gen: LabelledGeneric.Aux[A, R], encodeR: Encoder.AsObject[R]): Encoder.AsObject[A] =
      Encoder.AsObject.instance(a => encodeR.encodeObject(gen.to(a)))

  }

}
