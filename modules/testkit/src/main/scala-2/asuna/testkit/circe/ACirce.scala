package zsg.testkit.circe

import zsg.macros.single.deficient.AsunaTupleApply
import zsg.{Application2, Application3, Application4, Context2, Context3, Context4}
import zsg.macros.single.{
  ZsgDebugGeneric,
  ZsgDefaultValueGeneric,
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
import zsg.testkit.circe.encoder.debug.{JsonObjectDebugger, JsonObjectDebuggerContext}

object ACirce {

  /*final def encodeTuple[H, R, Obj, Na](
    implicit ll: AsunaTupleGeneric.Aux[H, R],
    app: Application3[encoder.JsonObjectContent, R, Obj, Na],
    cv1: AsunaTupleLabelledGeneric[H, Na],
    cv2: AsunaTupleGetterGeneric[H, Obj]
  ): CirceType.JsonObjectEncoder[H] = {
    val name1              = cv1.names()
    val applicationEncoder = app.application(encoder.AsunaJsonObjectContext)
    val application2       = applicationEncoder.toAppender(name1)
    CirceType.JsonObjectEncoder.instance { o: H => JsonObject.fromIterable(application2.appendField(cv2.getter(o), List.empty)) }
  }*/

  final def mapTupleEncoder[Model, PreTuple <: TupleType, TupleType](ll: AsunaTupleApply[Model, PreTuple], objectEncoder: Encoder[TupleType]): Encoder[Model] =
    objectEncoder.contramap(ll.toTuple)

  final def encodeCaseClass[H, R, N, Obj](implicit
    ll: ZsgGeneric.Aux[H, R],
    nm: ZsgLabelledTypeGeneric.Aux[H, N],
    app: Application3[encoder.JsonObjectAppender, encoder.ZsgJsonObjectContext, R, N, Obj],
    cv2: ZsgGetterGeneric[H, Obj]
  ): CirceType.JsonObjectEncoder[H] = {
    val applicationEncoder = app.application
    CirceType.JsonObjectEncoder.instance { o: H => JsonObject.fromIterable(applicationEncoder.appendField(cv2.getter(o), List.empty)) }
  }

  final def debugEncodeCaseClass[CaseClass]: DebugEncodeCaseClassApply[CaseClass] = new DebugEncodeCaseClassApply[CaseClass]

  /*class DebugEncodeCaseClassApplyContent[CaseClass] {
    def instance[T](n: Context4[JsonObjectDebugger] => DebugEncodeCaseClassApply[CaseClass] => T): T = n(JsonObjectDebuggerContext)(new DebugEncodeCaseClassApply)
  }*/

  class DebugEncodeCaseClassApply[CaseClass] {
    def instance[Gen, Name, Debug, ColumnInfo](implicit
      generic: ZsgGeneric.Aux[CaseClass, Gen],
      nm: ZsgLabelledTypeGeneric.Aux[CaseClass, Name],
      debugGeneric: ZsgDebugGeneric.Aux[CaseClass, Debug],
      app: Application4[JsonObjectDebugger, JsonObjectDebuggerContext, Gen, Name, Debug, ColumnInfo]
    ): ColumnInfo = app.application.target
  }

  final def encodeCaseObject[T]: CirceType.JsonObjectEncoder[T] = CirceType.JsonObjectEncoder.instance(_ => JsonObject.empty)

  final def encodeSealed[H, R, Cls, Lab](implicit
    ll: ZsgSealedGeneric.Aux[H, R],
    app: Application3[encoder.SealedTraitSelector[H]#JsonEncoder, encoder.ZsgSealedContext[H], R, Cls, Lab],
    cv1: ZsgSealedLabelledGeneric[H, Lab],
    cv2: ZsgSealedClassGeneric[H, Cls]
  ): CirceType.JsonObjectEncoder[H] = {
    val name1              = cv1.names
    val name2              = cv2.names
    val applicationEncoder = app.application
    CirceType.JsonObjectEncoder.instance { o: H => JsonObject.fromIterable(applicationEncoder.p(o, name2, name1)) }
  }

  def decodeCaseClass[T, R, Model, Nam, DefVal](implicit
    ll: ZsgGeneric.Aux[T, R],
    app: Application4[decoder.JsonDecoderPro, decoder.ZsgDecoderContext, R, Model, Nam, DefVal],
    cv1: ZsgLabelledGeneric[T, Nam],
    cv3: ZsgSetterGeneric[T, Model],
    cv4: ZsgDefaultValueGeneric[T, DefVal]
  ): Decoder[T] = app.application.to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))

  def decodeSealed[H, R, Nam](implicit
    ll: ZsgSealedGeneric.Aux[H, R],
    app: Application2[decoder.SealedTraitSelector[H]#JsonDecoder, decoder.ZsgSealedContext[H], R, Nam],
    cv1: ZsgSealedLabelledGeneric[H, Nam]
  ): Decoder[H] = {
    val names = cv1.names
    app.application.to(names)
  }

}
