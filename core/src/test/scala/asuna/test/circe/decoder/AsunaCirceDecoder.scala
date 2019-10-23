package asuna.test

import asuna.macros.{AsunaDefaultValueGeneric, AsunaGeneric, AsunaLabelledGeneric, AsunaSetterGeneric}
import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TupleTag, TypeHList}
import io.circe._

object AsunaCirceDecoder {

  def decoder[T, R <: TupleTag, I <: TypeHList](
    implicit ll: AsunaGeneric.Aux[T, R],
    app: Application[KM, R, I],
    cv1: AsunaLabelledGeneric[T, I#H],
    cv3: AsunaSetterGeneric[T, I#T#H],
    cv4: AsunaDefaultValueGeneric[T, I#T#T#H]
  ): Decoder[T] = {
    app.application(ii).to(cv1.names, cv4.defaultValues).map(mm => cv3.setter(mm))
  }

  class KM extends KindContext {
    override type M[P <: TypeHList] = JsonPro[P#T#H, P#H, P#T#T#H]
  }

  trait JsonPro[T, II, D] extends Any {
    def to(name: II, defaultValue: D): Decoder[T]
  }

  object ii extends Context[KM] {
    override def isReverse: Boolean = false

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonPro[X#T#H, X#H, X#T#T#H],
      y: JsonPro[Y#T#H, Y#H, Y#T#T#H],
      plus: Plus[X, Y, Z]
    ): JsonPro[Z#T#H, Z#H, Z#T#T#H] = {
      new JsonPro[Z#T#H, Z#H, Z#T#T#H] {
        override def to(name: Z#H, default: Z#T#T#H): Decoder[Z#T#H] = {
          val xx1 = plus.takeHead(name)
          val xx2 = plus.sub.sub.takeHead(default)
          val yy1 = plus.takeTail(name)
          val yy2 = plus.sub.sub.takeTail(default)
          for {
            x1 <- x.to(xx1, xx2)
            y1 <- y.to(yy1, yy2)
          } yield {
            plus.sub.plus(x1, y1)
          }
        }
      }
    }

    override def start: JsonPro[AsunaTuple0, AsunaTuple0, AsunaTuple0] = {
      new JsonPro[AsunaTuple0, AsunaTuple0, AsunaTuple0] {
        override def to(name: AsunaTuple0, default: AsunaTuple0): Decoder[AsunaTuple0] = Decoder.instance { j =>
          Right(AsunaTuple0)
        }
      }
    }
  }

  //debug 辅助部分代码开始
  def init[T] = new GenericApply2[T]

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
  }
  //debug 辅助部分代码结束

}
