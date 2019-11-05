package asuna.testkit.circe

import asuna.{Application2, TupleTag}
import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric, AsunaSealedClassGeneric, AsunaSealedGeneric, AsunaSealedLabelledGeneric}
import asuna.testkit.circe.encoder.AsunaSealedEncoder.JsonEncoder
import asuna.testkit.circe.encoder.{AsunaObjectEncoder, AsunaSealedEncoder}
import io.circe.{Encoder, Json, JsonObject, Utils}

object ACirce {

  def encodeCaseClass[H, R <: TupleTag, Obj, Na](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application2[AsunaObjectEncoder.JsonObjectAppender, R, Obj, Na],
    cv1: AsunaLabelledGeneric[H, Na],
    cv2: AsunaGetterGeneric[H, Obj]
  ): Encoder.AsObject[H] = {
    val name1              = cv1.names
    val applicationEncoder = app.application(AsunaObjectEncoder.ii)
    Encoder.AsObject.instance { o: H =>
      val linkedMap = new java.util.LinkedHashMap[String, Json]
      applicationEncoder.appendField(cv2.getter(o), name1, linkedMap)
      Utils.jsonObjectFromMap(linkedMap)
    }
  }

  def encodeCaseObject[T]: Encoder.AsObject[T] = Encoder.AsObject.instance(_ => JsonObject.empty)

  def encodeSealed[H, R <: TupleTag, Cls, Lab](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application2[({ type I[A, B] = JsonEncoder[H, A, B] })#I, R, Cls, Lab],
    cv1: AsunaSealedLabelledGeneric[H, Lab],
    cv2: AsunaSealedClassGeneric[H, Cls]
  ): Encoder.AsObject[H] = {
    val ii                 = new AsunaSealedEncoder.ii[H]
    val name1              = cv1.names
    val name2              = cv2.names
    val applicationEncoder = app.application(ii)
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(applicationEncoder.p(o, name2, name1))
    }
  }

}
