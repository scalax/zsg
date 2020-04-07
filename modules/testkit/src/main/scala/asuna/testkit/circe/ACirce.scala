package asuna.testkit.circe

import asuna.macros.single.deficient.{AsunaTupleDeficientApply, AsunaTupleDeficientGeneric, AsunaTupleGetterGeneric, AsunaTupleLabelledGeneric}
import asuna.{Application2, Application3, TupleTag}
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

  final def encodeTuple[H, R <: TupleTag, Obj, Na](
    implicit ll: AsunaTupleDeficientGeneric.Aux[H, R],
    app: Application2[encoder.JsonObjectContent, R, Obj, Na],
    cv1: AsunaTupleLabelledGeneric[H, Na],
    cv2: AsunaTupleGetterGeneric[H, Obj]
  ): Encoder.AsObject[H] = {
    val name1              = cv1.names()
    val applicationEncoder = app.application(encoder.AsunaJsonObjectContext)
    val application2       = applicationEncoder.toAppender(name1)
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(application2.appendField(cv2.getter(o), List.empty))
    }
  }

  final def mapTupleEncoder[Model, PreTuple <: TupleType, TupleType](
    implicit ll: AsunaTupleDeficientApply[Model, PreTuple],
    objectEncoder: Encoder[TupleType]
  ): Encoder[Model] = objectEncoder.contramap(ll.toTuple)

  final def encodeCaseClass[H, R <: TupleTag, Obj, Na](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application2[encoder.JsonObjectContent, R, Obj, Na],
    cv1: AsunaLabelledGeneric[H, Na],
    cv2: AsunaGetterGeneric[H, Obj]
  ): Encoder.AsObject[H] = {
    val name1              = cv1.names()
    val applicationEncoder = app.application(encoder.AsunaJsonObjectContext)
    val application2       = applicationEncoder.toAppender(name1)
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(application2.appendField(cv2.getter(o), List.empty))
    }
  }

  final def encodeCaseObject[T]: Encoder.AsObject[T] = Encoder.AsObject.instance(_ => JsonObject.empty)

  final def encodeSealed[H, R <: TupleTag, Cls, Lab](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application2[encoder.SealedTraitSelector[H]#JsonEncoder, R, Cls, Lab],
    cv1: AsunaSealedLabelledGeneric[H, Lab],
    cv2: AsunaSealedClassGeneric[H, Cls]
  ): Encoder.AsObject[H] = {
    val ii                 = new encoder.AsunaSealedContext[H]
    val name1              = cv1.names()
    val name2              = cv2.names()
    val applicationEncoder = app.application(ii)
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(applicationEncoder.p(o, name2, name1))
    }
  }

  def decodeCaseClass[T, R <: TupleTag, Model, Nam, DefVal](
    implicit ll: AsunaGeneric.Aux[T, R],
    app: Application3[decoder.JsonDecoderPro, R, Model, Nam, DefVal],
    cv1: AsunaLabelledGeneric[T, Nam],
    cv3: AsunaSetterGeneric[T, Model],
    cv4: AsunaDefaultValueGeneric[T, DefVal]
  ): Decoder[T] = {
    app.application(decoder.AsunaDecoderContext).to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))
  }

  def decodeSealed[H, R <: TupleTag, Nam, Tran](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application2[decoder.SealedTraitSelector[H]#JsonDecoder, R, Nam, Tran],
    cv1: AsunaSealedLabelledGeneric[H, Nam],
    cv2: AsunaSealedToAbsGeneric[H, Tran]
  ): Decoder[H] = {
    val ii    = new decoder.AsunaSealedContext[H]
    val names = cv1.names
    app.application(ii).to(names, cv2.names)
  }

}
