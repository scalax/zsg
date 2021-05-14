package zsg.testkit.circe

import zsg.macros.single.deficient.AsunaTupleApply
import zsg.{ApplicationX2, ApplicationX3, ApplicationX4}
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

  final def encodeCaseClass[H, R, N, Obj](implicit
    ll: ZsgGeneric.Aux[H, R],
    nm: ZsgLabelledTypeGeneric.Aux[H, N],
    app: ApplicationX3[encoder.JsonObjectAppender, encoder.ZsgJsonObjectContext, R, N, Obj],
    cv2: ZsgGetterGeneric[H, Obj]
  ): CirceVersionCompat.JsonObjectEncoder[H] = {
    val applicationEncoder = app.application(encoder.ZsgJsonObjectContext.value)
    CirceVersionCompat.JsonObjectEncoder.instance { o: H =>
      JsonObject.fromIterable(applicationEncoder.appendField(cv2.getter(o), List.empty))
    }
  }

  final def encodeCaseObject[T]: CirceVersionCompat.JsonObjectEncoder[T] =
    CirceVersionCompat.JsonObjectEncoder.instance(_ => JsonObject.empty)

  final def encodeSealed[H, R, Cls, Lab](implicit
    ll: ZsgSealedGeneric.Aux[H, R],
    app: ApplicationX3[encoder.SealedTraitSelector[H]#JsonEncoder, encoder.ZsgSealedContext[H], R, Cls, Lab],
    cv1: ZsgSealedLabelledGeneric[H, Lab],
    cv2: ZsgSealedClassGeneric[H, Cls]
  ): CirceVersionCompat.JsonObjectEncoder[H] = {
    val name1              = cv1.names
    val name2              = cv2.names
    val applicationEncoder = app.application(encoder.ZsgSealedContext.c[H])
    CirceVersionCompat.JsonObjectEncoder.instance { o: H => JsonObject.fromIterable(applicationEncoder.p(o, name2, name1)) }
  }

  def decodeCaseClass[T, R, Model, Nam, DefVal](implicit
    ll: ZsgGeneric.Aux[T, R],
    app: ApplicationX4[decoder.JsonDecoderPro, decoder.ZsgDecoderContext, R, Model, Nam, DefVal],
    cv1: ZsgLabelledGeneric[T, Nam],
    cv3: ZsgSetterGeneric[T, Model],
    cv4: ZsgDefaultValue#ModelType[T]#GenericType[DefVal]
  ): Decoder[T] = app.application(decoder.ZsgDecoderContext.value).to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))

  def decodeSealed[H, R, Nam](implicit
    ll: ZsgSealedGeneric.Aux[H, R],
    app: ApplicationX2[decoder.SealedTraitSelector[H]#JsonDecoder, decoder.ZsgSealedContext[H], R, Nam],
    cv1: ZsgSealedLabelledGeneric[H, Nam]
  ): Decoder[H] = {
    val names = cv1.names
    app.application(decoder.ZsgSealedContext.c[H]).to(names)
  }

}
