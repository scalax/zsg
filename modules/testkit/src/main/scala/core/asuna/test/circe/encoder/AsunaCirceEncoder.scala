package asuna.test

import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TupleTag, TypeHList}
import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric}
import io.circe.{Encoder, Json, JsonObject, Utils}

trait JsonObjectAppender[T, II] extends Any {
  def appendField(tt: T, name: II, m: java.util.LinkedHashMap[String, Json]): Unit
}
object AsunaCirceEncoder {

  def encoder[H, R <: TupleTag, I <: TypeHList](
    implicit ll: AsunaGeneric.Aux[H, R],
    app: Application[KContext, R, I],
    cv1: AsunaLabelledGeneric[H, I#H],
    cv2: AsunaGetterGeneric[H, I#T#H]
  ): Encoder.AsObject[H] = {
    val names              = cv1.names
    val linkedMap          = new java.util.LinkedHashMap[String, Json]
    val applicationEncoder = app.application(ii)
    Encoder.AsObject.instance { o: H =>
      applicationEncoder.appendField(cv2.getter(o), names, linkedMap)
      Utils.jsonObjectFromMap(linkedMap)
    }
  }

  def caseObjectEncoder[T]: Encoder.AsObject[T] = Encoder.AsObject.instance(f => JsonObject.empty)

  class KContext extends KindContext {
    override type M[P <: TypeHList] = JsonObjectAppender[P#T#H, P#H]
  }

  object ii extends Context[KContext] {

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonObjectAppender[X#T#H, X#H],
      y: JsonObjectAppender[Y#T#H, Y#H],
      plus: Plus[X, Y, Z]
    ): JsonObjectAppender[Z#T#H, Z#H] = new JsonObjectAppender[Z#T#H, Z#H] {
      override def appendField(obj: Z#T#H, name: Z#H, m: java.util.LinkedHashMap[String, Json]): Unit = {
        y.appendField(plus.sub.takeTail(obj), plus.takeTail(name), m)
        x.appendField(plus.sub.takeHead(obj), plus.takeHead(name), m)
      }
    }

    override def start: JsonObjectAppender[AsunaTuple0, AsunaTuple0] = new JsonObjectAppender[AsunaTuple0, AsunaTuple0] {
      override def appendField(name: AsunaTuple0, obj: AsunaTuple0, m: java.util.LinkedHashMap[String, Json]): Unit = ()
    }
  }

  //编译期调试辅助函数开始
  def initEncoder[H]: ImplicitApply1[H] = new ImplicitApply1[H] {
    def asunaGeneric[R <: TupleTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R] = new ImplicitApply2[H, R] {
      override def encoder[I <: TypeHList](
        implicit
        app: Application[KContext, R, I],
        cv1: AsunaLabelledGeneric[H, I#H],
        cv2: AsunaGetterGeneric[H, I#T#H]
      ): Encoder.AsObject[H] = {
        val names              = cv1.names
        val linkedMap          = new java.util.LinkedHashMap[String, Json]
        val applicationEncoder = app.application(ii)
        Encoder.AsObject.instance { o: H =>
          applicationEncoder.appendField(cv2.getter(o), names, linkedMap)
          Utils.jsonObjectFromMap(linkedMap)
        }
      }
    }
  }

  trait ImplicitApply1[H] {
    def asunaGeneric[R <: TupleTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: TupleTag] {
    def encoder[I <: TypeHList](
      implicit
      app: Application[KContext, R, I],
      cv1: AsunaLabelledGeneric[H, I#H],
      cv2: AsunaGetterGeneric[H, I#T#H]
    ): Encoder.AsObject[H]

    def toTag: R = throw new Exception("123")
    def toIH[I <: TypeHList](
      implicit
      app: Application[KContext, R, I]
    ): I#H = throw new Exception("123")
  }
  //编译期调试辅助函数结束

}
