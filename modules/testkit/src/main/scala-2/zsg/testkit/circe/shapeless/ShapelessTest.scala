package zsg.testkit.circe

import zsg.macros.ByNameImplicit
import io.circe._
import shapeless._
import shapeless.labelled.FieldType

object ShapelessEncoderTest {

  implicit val encodeHNil: CirceVersionCompat.JsonObjectEncoder[HNil] =
    CirceVersionCompat.JsonObjectEncoder.instance((_: HNil) => JsonObject.empty)

  implicit def encodeHCons[K <: Symbol, H, T <: HList](implicit
    key: Witness.Aux[K],
    encodeH: ByNameImplicit[Encoder[H]],
    encodeT: CirceVersionCompat.JsonObjectEncoder[T]
  ): CirceVersionCompat.JsonObjectEncoder[FieldType[K, H] :: T] =
    CirceVersionCompat.JsonObjectEncoder.instance { case h :: t =>
      ((key.value.name, encodeH.value(h))) +: encodeT.encodeObject(t)
    }

  def encodeGeneric[A, R](implicit
    gen: LabelledGeneric.Aux[A, R],
    encodeR: CirceVersionCompat.JsonObjectEncoder[R]
  ): CirceVersionCompat.JsonObjectEncoder[A] =
    CirceVersionCompat.JsonObjectEncoder.instance(a => encodeR.encodeObject(gen.to(a)))
  /*trait EncodeImplicit4 extends EncodeImplicit3 {

    implicit def encodeHCons4[K1 <: Symbol, H1, K2 <: Symbol, H2, K3 <: Symbol, H3, K4 <: Symbol, H4, T <: HList](
      implicit
      key1: Witness.Aux[K1],
      encodeH1: LazyImplicit[Encoder[H1]],
      key2: Witness.Aux[K2],
      encodeH2: LazyImplicit[Encoder[H2]],
      key3: Witness.Aux[K3],
      encodeH3: LazyImplicit[Encoder[H3]],
      key4: Witness.Aux[K4],
      encodeH4: LazyImplicit[Encoder[H4]],
      encodeT: Encoder.AsObject[T]
    ): Encoder.AsObject[FieldType[K1, H1] :: FieldType[K2, H2] :: FieldType[K3, H3] :: FieldType[K4, H4] :: T] = Encoder.AsObject.instance {
      case h1 :: h2 :: h3 :: h4 :: t =>
        ((key4.value.name, encodeH4.value(h4))) +: ((key3.value.name, encodeH3.value(h3))) +: ((key2.value.name, encodeH2.value(h2))) +: (
          (
            key1.value.name,
            encodeH1.value(h1)
          )
        ) +: encodeT.encodeObject(t)
    }

  }

  trait EncodeImplicit3 extends EncodeImplicit2 {

    implicit def encodeHCons3[K1 <: Symbol, H1, K2 <: Symbol, H2, K3 <: Symbol, H3, T <: HList](
      implicit
      key1: Witness.Aux[K1],
      encodeH1: LazyImplicit[Encoder[H1]],
      key2: Witness.Aux[K2],
      encodeH2: LazyImplicit[Encoder[H2]],
      key3: Witness.Aux[K3],
      encodeH3: LazyImplicit[Encoder[H3]],
      encodeT: Encoder.AsObject[T]
    ): Encoder.AsObject[FieldType[K1, H1] :: FieldType[K2, H2] :: FieldType[K3, H3] :: T] = Encoder.AsObject.instance {
      case h1 :: h2 :: h3 :: t =>
        ((key3.value.name, encodeH3.value(h3))) +: ((key2.value.name, encodeH2.value(h2))) +: ((key1.value.name, encodeH1.value(h1))) +: encodeT.encodeObject(t)
    }

  }

  trait EncodeImplicit2 extends EncodeImplicit1 {

    implicit def encodeHCons2[K1 <: Symbol, H1, K2 <: Symbol, H2, T <: HList](
      implicit
      key1: Witness.Aux[K1],
      encodeH1: LazyImplicit[Encoder[H1]],
      key2: Witness.Aux[K2],
      encodeH2: LazyImplicit[Encoder[H2]],
      encodeT: Encoder.AsObject[T]
    ): Encoder.AsObject[FieldType[K1, H1] :: FieldType[K2, H2] :: T] = Encoder.AsObject.instance {
      case h1 :: h2 :: t => ((key2.value.name, encodeH2.value(h2))) +: ((key1.value.name, encodeH1.value(h1))) +: encodeT.encodeObject(t)
    }

  }

  trait EncodeImplicit1 {

    implicit def encodeHCons1[K <: Symbol, H, T <: HList](
      implicit
      key: Witness.Aux[K],
      encodeH: LazyImplicit[Encoder[H]],
      encodeT: Encoder.AsObject[T]
    ): Encoder.AsObject[FieldType[K, H] :: T] = Encoder.AsObject.instance {
      case h :: t => ((key.value.name, encodeH.value(h))) +: encodeT.encodeObject(t)
    }

  }*/

}
