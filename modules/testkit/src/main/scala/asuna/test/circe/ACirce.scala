package asuna.test

import asuna.{Application, TupleTag, TypeHList}
import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric, AsunaSealedClassGeneric, AsunaSealedGeneric, AsunaSealedLabelledGeneric}
import io.circe.{Encoder, Json, JsonObject, Utils}

object ACirce {

  def encodeCaseClass[H, R <: TupleTag, I <: TypeHList](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application[AsunaObjectEncoder.KContext, R, I],
    cv1: AsunaLabelledGeneric[H, I#H],
    cv2: AsunaGetterGeneric[H, I#T#H]
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

  def encodeSealed[H, R <: TupleTag, I <: TypeHList](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application[AsunaSealedEncoder.KContext[H], R, I],
    cv1: AsunaSealedLabelledGeneric[H, I#H],
    cv2: AsunaSealedClassGeneric[H, I#T#H]
  ): Encoder.AsObject[H] = {
    val ii                 = new AsunaSealedEncoder.ii[H]
    val name1              = cv1.names
    val name2              = cv2.names
    val applicationEncoder = app.application(ii)
    Encoder.AsObject.instance { o: H =>
      JsonObject.fromIterable(applicationEncoder.p(o, name2, name1))
    }
  }

  def debugObjectEncoder[H]: AsunaObjectEncoder.ImplicitApply1[H] = new AsunaObjectEncoder.ImplicitApply1[H] {
    def generic[R <: TupleTag](implicit ll: AsunaGeneric.Aux[H, R]): AsunaObjectEncoder.ImplicitApply2[H, R] =
      new AsunaObjectEncoder.ImplicitApply2[H, R] {
        override def encoder[I <: TypeHList](
          implicit
          app: Application[AsunaObjectEncoder.KContext, R, I],
          cv1: AsunaLabelledGeneric[H, I#H],
          cv2: AsunaGetterGeneric[H, I#T#H]
        ): Encoder.AsObject[H] = {
          val names              = cv1.names
          val applicationEncoder = app.application(AsunaObjectEncoder.ii)
          Encoder.AsObject.instance { o: H =>
            val linkedMap = new java.util.LinkedHashMap[String, Json]
            applicationEncoder.appendField(cv2.getter(o), names, linkedMap)
            Utils.jsonObjectFromMap(linkedMap)
          }
        }
      }
  }

  def debugSealedEncoder[H]: AsunaSealedEncoder.ImplicitApply1[H] = new AsunaSealedEncoder.ImplicitApply1[H] {
    def generic[R <: TupleTag](implicit ll: AsunaSealedGeneric.Aux[H, R]): AsunaSealedEncoder.ImplicitApply2[H, R] = new AsunaSealedEncoder.ImplicitApply2[H, R] {
      override def encoder[I <: TypeHList](
        implicit
        app: Application[AsunaSealedEncoder.KContext[H], R, I],
        cv1: AsunaSealedLabelledGeneric[H, I#H],
        cv2: AsunaSealedClassGeneric[H, I#T#H]
      ): Encoder.AsObject[H] = {
        val ii                 = new AsunaSealedEncoder.ii[H]
        val applicationEncoder = app.application(ii)
        val name1              = cv1.names
        val name2              = cv2.names
        Encoder.AsObject.instance { o: H =>
          JsonObject.fromIterable(applicationEncoder.p(o, name2, name1))
        }
      }
    }
  }

}
