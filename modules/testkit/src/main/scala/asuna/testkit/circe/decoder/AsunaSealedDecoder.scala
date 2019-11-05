package asuna.testkit.circe.decoder

import asuna.{Application2, AsunaTuple0, Context3, Plus2, Plus3, TupleTag}
import asuna.macros.{AsunaSealedGeneric, AsunaSealedLabelledGeneric, AsunaSealedToAbsGeneric}
import io.circe.Decoder

object AsunaSealedDecoder {

  type II[H] = JsonPro[*, *, H]

  def decoder[H, R <: TupleTag, Nam, Tran](
    implicit ll: AsunaSealedGeneric.Aux[H, R],
    app: Application2[II[  H], R, Nam, Tran],
    cv1: AsunaSealedLabelledGeneric[H, Nam],
    cv2: AsunaSealedToAbsGeneric[H, Tran]
  ): Decoder[H] = {
    val ii    = new ii[H]
    val names = cv1.names
    app.application(ii).to(names, cv2.names)
  }

  trait JsonPro[II, T, P] {
    def to(name: II, tran: T => P): Decoder[P]
  }

  class ii extends Context3[JsonPro] {
    /*override def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonPro[X1, X2, H], y: JsonPro[Y1, Y2, H])(p: Plus2[X1, X2, Y1, Y2, Z1, Z2]): JsonPro[Z1, Z2, H] = { (name, toAbs) =>
      val a1       = p.takeHead1(name)
      val y1       = p.takeTail1(name)
      val a2       = p.takeHead2(toAbs)
      val y2       = p.takeTail2(toAbs)
      val decoderX = x.to(a1, a2)
      val decoderY = y.to(y1, y2)
      decoderX.or(decoderY)
    }

    override def start: JsonPro[AsunaTuple0, AsunaTuple0, H] = { (name, tran) =>
      Decoder.failedWithMessage("Your sealed trait have no sub class")*/
    override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonPro[X1, X2, X3], y: JsonPro[Y1, Y2, Y3])(p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]): JsonPro[Z1, Z2, Z3] = {(name, toAbs) =>

        val a1       = p.takeHead1(name)
        val y1       = p.takeTail1(name)
        val a2       = toAbs.compose(s =>p.takeHead3(s))//.compose(s => p.takeTail3(s))
        /*val y2       = p.takeTail2(toAbs)
        val decoderX = x.to(a1, a2)
        val decoderY = y.to(y1, y2)
        decoderX.or(decoderY)*/
      }

    override def start: JsonPro[AsunaTuple0, AsunaTuple0, AsunaTuple0] = {

      }
  }
  }

}
