package org.scalax.asuna.mapper.append

import io.circe._
import shapeless._
import shapeless.labelled.FieldType

object ShapelessTest {

  trait EncodeImplicit[T] {
    def mm: Encoder.AsObject[T]
  }

  object EncodeImplicit {

    implicit val encodeHNil: EncodeImplicit[HNil] = new EncodeImplicit[HNil] { override def mm = Encoder.AsObject.instance(_ => JsonObject.empty) }

    implicit def encodeHCons[K <: Symbol, H, T <: HList](
      implicit
      key: Witness.Aux[K],
      encodeH: Lazy[Encoder[H]],
      encodeT: EncodeImplicit[T]
    ): EncodeImplicit[FieldType[K, H] :: T] =
      new EncodeImplicit[FieldType[K, H] :: T] {
        override def mm = Encoder.AsObject.instance {
          case h :: t => (key.value.name -> encodeH.value(h)) +: encodeT.mm.encodeObject(t)
        }
      }

    implicit def encodeGeneric[A, R](implicit gen: LabelledGeneric.Aux[A, R], encodeR: EncodeImplicit[R]): EncodeImplicit[A] =
      new EncodeImplicit[A] { override def mm = Encoder.AsObject.instance(a => encodeR.mm.encodeObject(gen.to(a))) }

  }

}
