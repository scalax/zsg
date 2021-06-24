package zsg.testkit.circe

import zsg.macros.single.deficient.AsunaTupleApply
import zsg.{Application, TagMerge2, TypeHList}
import zsg.macros.single.{
  ZsgDefaultValue,
  ZsgGeneric,
  ZsgGetterGeneric,
  ZsgLabelledGeneric,
  ZsgLabelledTypeGeneric,
  ZsgSealedClassGeneric,
  ZsgSealedGeneric,
  ZsgSealedLabelledGeneric,
  ZsgSetterGeneric
}
import io.circe.{Decoder, Encoder, JsonObject}

object ACirce {

  final def mapTupleEncoder[Model, PreTuple <: TupleType, TupleType](
    ll: AsunaTupleApply[Model, PreTuple],
    objectEncoder: Encoder[TupleType]
  ): Encoder[Model] = objectEncoder.contramap(ll.toTuple)

  final def encodeCaseClass[H, R, N, I, P <: TypeHList](implicit
    ll: ZsgGeneric.Aux[H, R],
    nm: ZsgLabelledTypeGeneric.Aux[H, N],
    merge: TagMerge2.Aux[R, N, I],
    app: Application[encoder.JsonObjectFunc, encoder.ZsgJsonObjectContext, I, P],
    cv2: ZsgGetterGeneric[H, P#Tail#Head]
  ): CirceVersionCompat.JsonObjectEncoder[H] = {
    val applicationEncoder = app.application(encoder.ZsgJsonObjectContext.value)
    CirceVersionCompat.JsonObjectEncoder.instance { o: H =>
      JsonObject.fromIterable(applicationEncoder.appendField(cv2.getter(o), List.empty))
    }
  }

  final def encodeCaseObject[T]: CirceVersionCompat.JsonObjectEncoder[T] =
    CirceVersionCompat.JsonObjectEncoder.instance(_ => JsonObject.empty)

  final def encodeSealed[P, R, T <: TypeHList](implicit
    ll: ZsgSealedGeneric.Aux[P, R],
    app: Application[encoder.SealedTraitSelector[P], encoder.ZsgSealedContext[P], R, T],
    cv1: ZsgSealedLabelledGeneric[P, T#Tail#Head],
    cv2: ZsgSealedClassGeneric[P, T#Head]
  ): CirceVersionCompat.JsonObjectEncoder[P] = {
    val name1              = cv1.names
    val name2              = cv2.names
    val applicationEncoder = app.application(encoder.ZsgSealedContext.c[P])
    CirceVersionCompat.JsonObjectEncoder.instance { o: P => JsonObject.fromIterable(applicationEncoder.p(o, name2, name1)) }
  }

  def decodeCaseClass[T, R, M <: TypeHList](implicit
    ll: ZsgGeneric.Aux[T, R],
    app: Application[decoder.JsonDecoderFunc, decoder.ZsgDecoderContext, R, M],
    cv1: ZsgLabelledGeneric[T, M#Tail#Head],
    cv3: ZsgSetterGeneric[T, M#Head],
    cv4: ZsgDefaultValue#ModelType[T]#GenericType[M#Tail#Tail#Head]
  ): Decoder[T] = app.application(decoder.ZsgDecoderContext.value).to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))

  def decodeSealed[H, R, Nam <: TypeHList](implicit
    ll: ZsgSealedGeneric.Aux[H, R],
    app: Application[decoder.SealedTraitSelector[H], decoder.ZsgSealedContext[H], R, Nam],
    cv1: ZsgSealedLabelledGeneric[H, Nam#Tail#Head]
  ): Decoder[H] = {
    val names = cv1.names
    app.application(decoder.ZsgSealedContext.c[H]).to(names)
  }

}
