package asuna.testkit.circe

import asuna.{Application2, TupleTag}
import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric, AsunaSealedClassGeneric, AsunaSealedGeneric, AsunaSealedLabelledGeneric}
import io.circe.{Encoder, Json, JsonObject, Utils}

object ACirce {

  final def encodeCaseClass[H, R <: TupleTag, Obj, Na](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application2[encoder.JsonObjectAppender, R, Obj, Na],
    cv1: AsunaLabelledGeneric[H, Na],
    cv2: AsunaGetterGeneric[H, Obj]
  ): Encoder.AsObject[H] = {
    val name1              = cv1.names()
    val applicationEncoder = app.application(encoder.AsunaJsonObjectContext)
    Encoder.AsObject.instance { o: H =>
      val linkedMap = new java.util.LinkedHashMap[String, Json]
      applicationEncoder.appendField(cv2.getter(o), name1, linkedMap)
      Utils.jsonObjectFromMap(linkedMap)
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

}
