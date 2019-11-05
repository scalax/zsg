package asuna.testkit.circe.decoder

import asuna.{Application2, AsunaTuple0, Context2, Plus2, TupleTag}
import asuna.macros.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, AsunaSealedToAbsGeneric}
import io.circe.Decoder

object AsunaSealedDecoder {

  class II[P] {

    trait JsonPro[II, T] {
      def to(name: II, tran: T): Decoder[P]
    }

  }

  object II {
    def apply[T]: II[T] = value.asInstanceOf[II[T]]
    val value: II[Any]  = new II[Any]
  }

  def decoder[H, R <: TupleTag, Nam, Tran](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application2[II[H]#JsonPro, R, Nam, Tran],
    cv1: AsunaSealedLabelledGeneric[H, Nam],
    cv2: AsunaSealedToAbsGeneric[H, Tran]
  ): Decoder[H] = {
    val ii    = new asunaSealedContext[H]
    val names = cv1.names
    app.application(ii).to(names, cv2.names)
  }

  class asunaSealedContext[P] extends Context2[II[P]#JsonPro] {

    override def append[X1, X2, Y1, Y2, Z1, Z2](x: II[P]#JsonPro[X1, X2], y: II[P]#JsonPro[Y1, Y2])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): II[P]#JsonPro[Z1, Z2] = {
      val con = II[P]
      new con.JsonPro[Z1, Z2] {
        override def to(name: Z1, toAbs: Z2): Decoder[P] = {
          val a1       = p.takeHead1(name)
          val y1       = p.takeTail1(name)
          val a2       = p.takeHead2(toAbs)
          val y2       = p.takeTail2(toAbs)
          val decoderX = x.to(a1, a2)
          val decoderY = y.to(y1, y2)
          decoderX.or(decoderY)
        }
      }

    }

    override def start: II[P]#JsonPro[AsunaTuple0, AsunaTuple0] = {
      val con = II[P]
      new con.JsonPro[AsunaTuple0, AsunaTuple0] {
        override def to(name: AsunaTuple0, tran: AsunaTuple0): Decoder[P] = {
          Decoder.failedWithMessage("Your sealed trait have no sub class")
        }
      }
    }
  }

}
