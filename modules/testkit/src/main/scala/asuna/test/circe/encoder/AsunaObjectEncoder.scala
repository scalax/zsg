package asuna.test

import asuna.{Application, AsunaTuple0, Context, KindContext, Plus, TupleTag, TypeHList}
import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric}
import io.circe.{Encoder, Json}

object AsunaObjectEncoder {

  trait JsonObjectAppender[T, II] extends Any {
    def appendField(tt: T, name: II, m: java.util.LinkedHashMap[String, Json]): Unit
  }

  class KContext extends KindContext {
    override type M[P <: TypeHList] = JsonObjectAppender[P#T#H, P#H]
  }

  object ii extends Context[KContext] {

    override def append[X <: TypeHList, Y <: TypeHList, Z <: TypeHList](
      x: JsonObjectAppender[X#T#H, X#H],
      y: JsonObjectAppender[Y#T#H, Y#H],
      plus: Plus[X, Y, Z]
    ): JsonObjectAppender[Z#T#H, Z#H] = { (obj: Z#T#H, name: Z#H, m: java.util.LinkedHashMap[String, Json]) =>
      y.appendField(plus.sub.takeTail(obj), plus.takeTail(name), m)
      x.appendField(plus.sub.takeHead(obj), plus.takeHead(name), m)
    }

    override def start: JsonObjectAppender[AsunaTuple0, AsunaTuple0] = { (_: AsunaTuple0, _: AsunaTuple0, _: java.util.LinkedHashMap[String, Json]) =>
      ()
    }
  }

  //编译期调试辅助函数开始

  trait ImplicitApply1[H] {
    def generic[R <: TupleTag](implicit ll: AsunaGeneric.Aux[H, R]): ImplicitApply2[H, R]
  }

  trait ImplicitApply2[H, R <: TupleTag] {
    def encoder[I <: TypeHList](
      implicit
      app: Application[KContext, R, I],
      cv1: AsunaLabelledGeneric[H, I#H],
      cv2: AsunaGetterGeneric[H, I#T#H]
    ): Encoder.AsObject[H]

    def tag: R = throw new Exception("debuging...")
    def fetchApplication[I <: TypeHList](
      implicit
      app: Application[KContext, R, I]
    ): I#H = throw new Exception("debuging...")
  }
  //编译期调试辅助函数结束

}
