package asuna.testkit.circe.decoder

import asuna.macros.{AsunaDefaultValueGeneric, AsunaGeneric, AsunaLabelledGeneric, AsunaSetterGeneric}
import asuna.{Application3, AsunaTuple0, Context3, Plus3, TupleTag}
import io.circe._

object AsunaCirceDecoder {

  def decoder[T, R <: TupleTag, Model, Nam, DefVal](
    implicit ll: AsunaGeneric.Aux[T, R],
    app: Application3[JsonPro, R, Model, Nam, DefVal],
    cv1: AsunaLabelledGeneric[T, Nam],
    cv3: AsunaSetterGeneric[T, Model],
    cv4: AsunaDefaultValueGeneric[T, DefVal]
  ): Decoder[T] = {
    app.application(ii).to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))
  }

  trait JsonPro[T, II, D] extends Any {
    def to(name: II, defaultValue: D): Decoder[T]
  }

  object ii extends Context3[JsonPro] {

    override def append[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3](x: JsonPro[X1, X2, X3], y: JsonPro[Y1, Y2, Y3])(
      p: Plus3[X1, X2, X3, Y1, Y2, Y3, Z1, Z2, Z3]
    ): JsonPro[Z1, Z2, Z3] = { (name, default) =>
      val xx1 = p.takeHead2(name)
      val xx2 = p.takeHead3(default)
      val yy1 = p.takeTail2(name)
      val yy2 = p.takeTail3(default)
      for {
        x1 <- x.to(xx1, xx2)
        y1 <- y.to(yy1, yy2)
      } yield {
        p.plus1(x1, y1)
      }
    }

    override def start: JsonPro[AsunaTuple0, AsunaTuple0, AsunaTuple0] = {
      val zeroValue = Right(AsunaTuple0.value)
      (name, default) =>
        Decoder.instance { _ =>
          zeroValue
        }
    }
  }

  //debug 辅助部分代码开始
  /*def init[T] = new GenericApply2[T]

  class GenericApply2[T] {
    def i[R <: TupleTag](
      implicit ll: AsunaGeneric.Aux[T, R]
    ) = new GenericApply1[T, R]
  }

  class GenericApply1[T, R <: TupleTag] {
    def ir[I <: TypeHList](
      implicit app: Application[KM, R, I],
      cv1: AsunaLabelledGeneric[T, I#H],
      cv3: AsunaSetterGeneric[T, I#T#H],
      cv4: AsunaDefaultValueGeneric[T, I#T#T#H]
    ) = {
      app.application(ii).to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))
    }
  }*/
  //debug 辅助部分代码结束

}
