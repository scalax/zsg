package asuna.test

import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TupleTag, TypeHList}
import asuna.macros.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, AsunaSealedToAbsGeneric}
import io.circe.Decoder

object AsunaSealedDecoder {

  def decoder[H, R <: TupleTag, I <: TypeHList](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application[KContext[H], R, I],
    cv1: AsunaSealedLabelledGeneric[H, I#H],
    cv2: AsunaSealedToAbsGeneric[H, I#T#H]
  ): Decoder[H] = {
    val ii    = new ii[H]
    val names = cv1.names.withContext(ii)
    app.application(ii).to(names, cv2.names.withContext(ii))
  }

  trait JsonPro[II, T, P] {
    def to(name: II, tran: T): Decoder[P]
  }

  class KContext[H] extends KindContext {
    override type M[P <: TypeHList] = JsonPro[P#H, P#T#H, H]
  }

  class ii[H] extends Context[KContext[H]] {
    override def isReverse: Boolean = false

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonPro[X#H, X#T#H, H],
      y: JsonPro[Y#H, Y#T#H, H],
      plus: Plus[X, Y, Z]
    ): JsonPro[Z#H, Z#T#H, H] = new JsonPro[Z#H, Z#T#H, H] {
      override def to(name: Z#H, toAbs: Z#T#H): Decoder[H] = {
        val a1       = plus.takeHead(name)
        val y1       = plus.takeTail(name)
        val a2       = plus.sub.takeHead(toAbs)
        val y2       = plus.sub.takeTail(toAbs)
        val decoderX = x.to(a1, a2)
        val decoderY = y.to(y1, y2)
        decoderX.or(decoderY)
      }
    }

    override def start: JsonPro[AsunaTuple0, AsunaTuple0, H] = new JsonPro[AsunaTuple0, AsunaTuple0, H] {
      override def to(name: AsunaTuple0, toAbs: AsunaTuple0): Decoder[H] = {
        Decoder.failedWithMessage("Your sealed trait have no sub class")
      }
    }
  }

  //编译期调试辅助函数开始
  def initEncoder[H]: ImplicitApply1[H] = new ImplicitApply1[H] {
    def asunaGeneric[R <: TupleTag](implicit ll: AsunaSealedGeneric.Aux[H, R]): ImplicitApply2[H, R] = new ImplicitApply2[H, R] {
      override def decoder[I <: TypeHList](
        implicit
        app: Application[KContext[H], R, I],
        cv1: AsunaSealedLabelledGeneric[H, I#H],
        cv2: AsunaSealedToAbsGeneric[H, I#T#H]
      ): Decoder[H] = {
        val ii    = new ii[H]
        val names = cv1.names.withContext(ii)
        app.application(ii).to(names, cv2.names.withContext(ii))
      }
    }
  }

  trait ImplicitApply1[H] {
    def asunaGeneric[R <: TupleTag](implicit ll: AsunaSealedGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: TupleTag] {
    def decoder[I <: TypeHList](
      implicit
      app: Application[KContext[H], R, I],
      cv1: AsunaSealedLabelledGeneric[H, I#H],
      cv2: AsunaSealedToAbsGeneric[H, I#T#H]
    ): Decoder[H]

    def toTag: R = throw new Exception("123")
    def toIH[I <: TypeHList](
      implicit
      app: Application[KContext[H], R, I]
    ): I#H = throw new Exception("123")
  }
  //编译期调试辅助函数结束

}
