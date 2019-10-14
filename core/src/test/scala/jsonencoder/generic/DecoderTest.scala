package asuna.test

import asuna.macros.{AsunaDefaultValueGeneric, AsunaGeneric, AsunaLabelledGeneric, AsunaSetterGeneric}
import asuna.{Application, Context, Item0, ItemTag, KindContext, Plus, TypeParameter}
import io.circe._

object DecoderTest {

  def implicitDecoder[T, R <: ItemTag, I <: TypeParameter](
    implicit ll: AsunaGeneric.Aux[T, R],
    app: Application[KM, R, I],
    cv1: AsunaLabelledGeneric[T, I#H],
    cv3: AsunaSetterGeneric[T, I#T#H],
    cv4: AsunaDefaultValueGeneric[T, I#T#T#H]
  ): Decoder[T] = {
    app.application(ii).to(cv1.names.withContext(ii), cv4.defaultValues.withContext(ii)).map(mm => cv3.setter(mm))
  }

  class KM extends KindContext {
    override type M[P <: TypeParameter] = JsonPro[P#T#H, P#H, P#T#T#H]
  }

  trait JsonPro[T, II, D] {
    def to(name: II, defaultValue: D): Decoder[T]
  }

  object ii extends Context[KM] {
    override def isReverse: Boolean = false

    override def append[X <: TypeParameter, Y <: TypeParameter, Z <: TypeParameter](
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

    override def start: JsonPro[Item0, Item0, Item0] = {
      new JsonPro[Item0, Item0, Item0] {
        override def to(name: Item0, default: Item0): Decoder[Item0] = Decoder.instance { j =>
          Right(Item0)
        }
      }
    }
  }

  def init[T] = new GenericApply2[T]

  class GenericApply2[T] {
    def i[R <: ItemTag](
      implicit ll: AsunaGeneric.Aux[T, R],
    ) = new GenericApply1[T, R]
  }

  class GenericApply1[T, R <: ItemTag] {
    def ir[I <: TypeParameter](implicit app: Application[KM, R, I],
                               cv1: AsunaLabelledGeneric[T, I#H],
                               cv3: AsunaSetterGeneric[T, I#T#H],
                               cv4: AsunaDefaultValueGeneric[T, I#T#T#H]) = {
      app.application(ii).to(cv1.names.withContext(ii), cv4.defaultValues.withContext(ii)).map(mm => cv3.setter(mm))
    }
  }

}
