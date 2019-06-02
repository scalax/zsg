package org.scalax.asuna.mapper.append.debug

import io.circe._
import io.circe.syntax._
import org.scalax.asuna.implements.ByNameImplicit
import org.scalax.asuna.mapper.append.MacroTest4
import org.scalax.asuna.mapper.append.debug.MacroTest.{IIII, JsonPro, KM}
import org.scalax.asuna.mapper.item.TypeParam2
import org.scalax.asuna.mapper.{Application, Context}

object MacroTest2 extends App {

  /*object mm {
    implicit lazy val kk111Encoder: ObjectEncoder[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1.encoder
    implicit lazy val kk112Encoder: ObjectEncoder[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1.encoder

    implicit lazy val kk113Encoder: Decoder[MacroTest4.LargeModel]   = MacroTest.kou[MacroTest4.LargeModel].kou1.decoder
    implicit lazy val kk114Encoder: Decoder[MacroTest4.LargeModel11] = MacroTest.kou[MacroTest4.LargeModel11].kou1.decoder
  }*/

  object miaomiaomiao {
    implicit def iiii[T](implicit ii: IIII[T]): ObjectEncoder[T] = ii.reverseEncoder
    implicit def iiiiii[T](implicit ii: IIII[T]): Decoder[T]     = ii.decoder

    implicit def im[T](implicit t: ByNameImplicit[Encoder[T]], dd: ByNameImplicit[Decoder[T]]): Application[KM, T, TypeParam2[String, T]] =
      new Application[KM, T, TypeParam2[String, T]] {
        override def application(context: Context[KM]): JsonPro[T, String] = {
          new JsonPro[T, String] {
            override def p(name: String, tt: T, m: List[(String, Json)]): List[(String, Json)] = {
              ((name, t.value(tt))) :: m
            }
            override def reverseP(name: String, tt: T, m: List[(String, Json)]): List[(String, Json)] = {
              ((name, t.value(tt))) :: m
            }
            override def d(j: JsonObject, name: String): Either[String, T] = {
              j(name).map(jj => dd.value.decodeJson(jj).left.map(_.message)).getOrElse(Left(s"找不到属性:${name}"))
            }
          }
        }
      }

    implicit lazy val kk111Encoder: IIII[MacroTest4.LargeModel]   = MacroTest.koukou
    implicit lazy val kk112Encoder: IIII[MacroTest4.LargeModel11] = MacroTest.koukou

    def iiiiiiii: String                                 = MacroTest4.dd.asJson.spaces2
    def iiiiiiiiii: Either[Error, MacroTest4.LargeModel] = io.circe.parser.parse(miaomiaomiao.iiiiiiii).right.flatMap(_.as[MacroTest4.LargeModel])
  }

  println(miaomiaomiao.iiiiiiii)
  //println(miaomiaomiao.iiiiiiiiii)

  /*object ll {
    implicit lazy val kk211Encoder: ObjectEncoder[MacroTest4.LargeModel]   = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel]].mm
    implicit lazy val kk212Encoder: ObjectEncoder[MacroTest4.LargeModel11] = implicitly[MacroTest3.EncodeImplicit[MacroTest4.LargeModel11]].mm
  }*/

}
