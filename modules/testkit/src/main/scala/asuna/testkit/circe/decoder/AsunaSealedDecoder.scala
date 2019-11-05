package asuna.testkit.circe.decoder

import asuna.{Application2, AsunaTuple0, Context2, Plus2, TupleTag}
import asuna.macros.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, AsunaSealedToAbsGeneric}
import io.circe.Decoder

object AsunaSealedDecoder {

  type II[H] = ({ type I[Nam, Tran] = JsonPro[Nam, Tran, H] })#I

  def decoder[H, R <: TupleTag, Nam, Tran](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application2[II[H], R, Nam, Tran],
    cv1: AsunaSealedLabelledGeneric[H, Nam],
    cv2: AsunaSealedToAbsGeneric[H, Tran]
  ): Decoder[H] = {
    val ii    = new ii[H]
    val names = cv1.names
    app.application(ii).to(names, cv2.names)
  }

  trait JsonPro[II, T, P] {
    def to(name: II, tran: T): Decoder[P]
  }

  class ii[H] extends Context2[II[H]] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonPro[X1, X2, H], y: JsonPro[Y1, Y2, H])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): JsonPro[Z1, Z2, H] = { (name, toAbs) =>
      val a1       = p.takeHead1(name)
      val y1       = p.takeTail1(name)
      val a2       = p.takeHead2(toAbs)
      val y2       = p.takeTail2(toAbs)
      val decoderX = x.to(a1, a2)
      val decoderY = y.to(y1, y2)
      decoderX.or(decoderY)
    }

    override def start: JsonPro[AsunaTuple0, AsunaTuple0, H] = { (name, tran) =>
      Decoder.failedWithMessage("Your sealed trait have no sub class")

    }
  }

  //编译期调试辅助函数开始
  /*def initEncoder[H]: ImplicitApply1[H] = new ImplicitApply1[H] {
    def asunaGeneric[R <: TupleTag](implicit ll: AsunaSealedGeneric.Aux[H, R]): ImplicitApply2[H, R] = new ImplicitApply2[H, R] {
      override def decoder[I <: TypeHList](
        implicit
        app: Application[KContext[H], R, I],
        cv1: AsunaSealedLabelledGeneric[H, I#H],
        cv2: AsunaSealedToAbsGeneric[H, I#T#H]
      ): Decoder[H] = {
        val ii    = new ii[H]
        val names = cv1.names
        app.application(ii).to(names, cv2.names)
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
  }*/
  //编译期调试辅助函数结束

}
