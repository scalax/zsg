package asuna.testkit.circe.encoder

import asuna.{Application, AsunaTuple0, Context, Context2, KindContext, Plus, Plus2, TupleTag, TypeHList}
import asuna.macros.{AsunaGeneric, AsunaGetterGeneric, AsunaLabelledGeneric}
import io.circe.{Encoder, Json}

object AsunaObjectEncoder {

  trait JsonObjectAppender[T, II] extends Any {
    def appendField(tt: T, name: II, m: java.util.LinkedHashMap[String, Json]): Unit
  }

  object ii extends Context2[JsonObjectAppender] {

    override def append[X1, X2, Y1, Y2, Z1, Z2](x: JsonObjectAppender[X1, X2], y: JsonObjectAppender[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): JsonObjectAppender[Z1, Z2] = { (obj, name, m) =>
      y.appendField(p.takeTail1(obj), p.takeTail2(name), m)
      x.appendField(p.takeHead1(obj), p.takeHead2(name), m)
    }

    override def start: JsonObjectAppender[AsunaTuple0, AsunaTuple0] = { (_: AsunaTuple0, _: AsunaTuple0, _: java.util.LinkedHashMap[String, Json]) =>
      ()
    }

  }

  //编译期调试辅助函数开始

  /*trait ImplicitApply1[H] {
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
  }*/

  //编译期调试辅助函数结束

}
