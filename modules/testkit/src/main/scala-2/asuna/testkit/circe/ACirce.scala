package asuna.testkit.circe

import asuna.macros.single.deficient.{AsunaTupleApply, AsunaTupleGeneric, AsunaTupleGetterGeneric, AsunaTupleLabelledGeneric}
import asuna.{Application3, Application4}
import asuna.macros.single.{
  AsunaDefaultValueGeneric,
  AsunaGeneric,
  AsunaGetterGeneric,
  AsunaLabelledGeneric,
  AsunaSealedClassGeneric,
  AsunaSealedGeneric,
  AsunaSealedLabelledGeneric,
  AsunaSealedToAbsGeneric,
  AsunaSetterGeneric
}
import io.circe.{Decoder, Encoder, JsonObject}

object ACirce {

  final def encodeTuple[H, R, Obj, Na](
    implicit ll: AsunaTupleGeneric.Aux[H, R],
    app: Application3[encoder.JsonObjectContent, R, Obj, Na],
    cv1: AsunaTupleLabelledGeneric[H, Na],
    cv2: AsunaTupleGetterGeneric[H, Obj]
  ): CirceType.JsonObjectEncoder[H] = {
    val name1              = cv1.names()
    val applicationEncoder = app.application(encoder.AsunaJsonObjectContext)
    val application2       = applicationEncoder.toAppender(name1)
    CirceType.JsonObjectEncoder.instance { o: H => JsonObject.fromIterable(application2.appendField(cv2.getter(o), List.empty)) }
  }

  final def mapTupleEncoder[Model, PreTuple <: TupleType, TupleType](ll: AsunaTupleApply[Model, PreTuple], objectEncoder: Encoder[TupleType]): Encoder[Model] =
    objectEncoder.contramap(ll.toTuple)

  final def encodeCaseClass[H, R, Obj, Na](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application3[encoder.JsonObjectContent, R, Obj, Na],
    cv1: AsunaLabelledGeneric[H, Na],
    cv2: AsunaGetterGeneric[H, Obj]
  ): CirceType.JsonObjectEncoder[H] = {
    val name1              = cv1.names
    val applicationEncoder = app.application(encoder.AsunaJsonObjectContext)
    val application2       = applicationEncoder.toAppender(name1)
    CirceType.JsonObjectEncoder.instance { o: H => JsonObject.fromIterable(application2.appendField(cv2.getter(o), List.empty)) }
  }

  final def encodeCaseObject[T]: CirceType.JsonObjectEncoder[T] = CirceType.JsonObjectEncoder.instance(_ => JsonObject.empty)

  final def encodeSealed[H, R, Cls, Lab](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application3[encoder.SealedTraitSelector[H]#JsonEncoder, R, Cls, Lab],
    cv1: AsunaSealedLabelledGeneric[H, Lab],
    cv2: AsunaSealedClassGeneric[H, Cls]
  ): CirceType.JsonObjectEncoder[H] = {
    val ii                 = new encoder.AsunaSealedContext[H]
    val name1              = cv1.names
    val name2              = cv2.names
    val applicationEncoder = app.application(ii)
    CirceType.JsonObjectEncoder.instance { o: H => JsonObject.fromIterable(applicationEncoder.p(o, name2, name1)) }
  }

  def decodeCaseClass[T, R, Model, Nam, DefVal](
    implicit ll: AsunaGeneric.Aux[T, R],
    app: Application4[decoder.JsonDecoderPro, R, Model, Nam, DefVal],
    cv1: AsunaLabelledGeneric[T, Nam],
    cv3: AsunaSetterGeneric[T, Model],
    cv4: AsunaDefaultValueGeneric[T, DefVal]
  ): Decoder[T] = {
    app.application(decoder.AsunaDecoderContext).to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))
  }

  def decodeSealed[H, R, Nam, Tran](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application3[decoder.SealedTraitSelector[H]#JsonDecoder, R, Nam, Tran],
    cv1: AsunaSealedLabelledGeneric[H, Nam],
    cv2: AsunaSealedToAbsGeneric[H, Tran]
  ): Decoder[H] = {
    val ii    = new decoder.AsunaSealedContext[H]
    val names = cv1.names
    app.application(ii).to(names, cv2.names)
  }

}
