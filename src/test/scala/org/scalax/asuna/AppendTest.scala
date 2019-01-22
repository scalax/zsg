package org.scalax.asuna.mapper.append

import io.circe._
import play.api.libs.json._

import scala.language.higherKinds

object AppendTest extends App {

  case class koukou1(id: Long, name: String, age: String, i4: String, i5: Int, i6: String)
  case class koukou2(id: String, name: String, age: Short, i4: String, i5: Int, i6: String)

  /*val generic11 = { kk1: koukou1 =>
    Item.apply(Item.apply(kk1.id, kk1.name, kk1.age, kk1.i4), Item.apply(kk1.i5, kk1.i6))
  }*/

  val generic12 = { kk1: Item2[Item4[Long, String, String, String], Item2[Int, String]] =>
    koukou1(kk1.i1.i1, kk1.i1.i2, kk1.i1.i3, kk1.i1.i4, kk1.i2.i1, kk1.i2.i2)
  }

  val generic21 = { kk2: koukou2 =>
    Item.apply(Item.apply(kk2.id, kk2.name, kk2.age, kk2.i4), Item.apply(kk2.i5, kk2.i6))
  }

  /*val generic22 = { kk1: Item2[Item4[String, String, Short, String], Item2[Int, String]] =>
    koukou2(kk1.i1.i1, kk1.i1.i2, kk1.i1.i3, kk1.i1.i4, kk1.i2.i1, kk1.i2.i2)
  }*/

  object playJson {
    val id  = (implicitly[Reads[Long]], Writes[String](p => implicitly[Writes[Long]].writes(p.toLong)))
    val age = (implicitly[Reads[Short]].map(_.toString), implicitly[Writes[Short]])
  }

  object circeJson {
    val id = (Decoder.decodeLong, Encoder.encodeLong.contramap { i: String =>
      i.toLong
    })
    val age = (Decoder.decodeShort.map(_.toString), Encoder.encodeShort)
  }

  object keys {
    val id   = "id"
    val name = "name"
    val age  = "age"
    val i4   = "i4"
    val i5   = "i5"
    val i6   = "i6"
  }

  trait Placeholder[T]
  def h[T]: Placeholder[T] = new Placeholder[T] {}

  val polyPlay = Item.apply(Item.apply(playJson.id, h[String], playJson.age, h[String]), Item.apply(h[Int], h[String]))

  val polyCirce = Item.apply(Item.apply(circeJson.id, h[String], circeJson.age, h[String]), Item.apply(h[Int], h[String]))

  val polyKeys = Item.apply(Item.apply(keys.id, keys.name, keys.age, keys.i4), Item.apply(keys.i5, keys.i6))

  val polySum = Item.apply(
      Item.apply((playJson.id, circeJson.id), (h[String], h[String]), (playJson.age, circeJson.age), (h[String], h[String]))
    , Item.apply((h[Int], h[Int]), (h[String], h[String]))
  )

  class KK extends KindContext {
    override type M[P <: TypeParam] = (P#H, P#T#H, P#T#T#T#T#H) => (Reads[P#T#T#H], OWrites[P#T#T#T#H], Decoder[P#T#T#H], ObjectEncoder[P#T#T#T#H])
  }

  object m extends Context[KK] {
    override def append[X <: TypeParam, Y <: TypeParam, Z <: TypeParam](
      x: (X#H, X#T#H, X#T#T#T#T#H) => (Reads[X#T#T#H], OWrites[X#T#T#T#H], Decoder[X#T#T#H], ObjectEncoder[X#T#T#T#H]),
      y: (Y#H, Y#T#H, Y#T#T#T#T#H) => (Reads[Y#T#T#H], OWrites[Y#T#T#T#H], Decoder[Y#T#T#H], ObjectEncoder[Y#T#T#T#H]),
      plus: Plus[X, Y, Z]): (Z#H, Z#T#H, Z#T#T#T#T#H) => (Reads[Z#T#T#H], OWrites[Z#T#T#T#H], Decoder[Z#T#T#H], ObjectEncoder[Z#T#T#T#H]) = {
      type PolyX1 = X#H
      type PolyX2 = X#T#H
      type RX1    = X#T#T#H
      type RX2    = X#T#T#T#H

      type PolyY1 = Y#H
      type PolyY2 = Y#T#H
      type RY1    = Y#T#T#H
      type RY2    = Y#T#T#T#H

      type PolyZ1 = Z#H
      type PolyZ2 = Z#T#H
      type RZ1    = Z#T#T#H
      type RZ2    = Z#T#T#T#H

      { (pz1: PolyZ1, pz2: PolyZ2, key: Z#T#T#T#T#H) =>
        val (xKey, yKey)     = plus.sub.sub.sub.sub.take(key)
        val (r1, w1, d1, e1) = x(plus.take(pz1)._1, plus.sub.take(pz2)._1, xKey)
        val (r2, w2, d2, e2) = y(plus.take(pz1)._2, plus.sub.take(pz2)._2, yKey)

        val sub = plus.sub.sub
        (r1.flatMap(i1 => r2.map(i2 => sub.plus(i1, i2))), OWrites[RZ2] { rz2 =>
          val (rx2, ry2) = sub.sub.take(rz2)
          w1.writes(rx2) ++ w2.writes(ry2)
        }, d1.flatMap(i1 => d2.map(i2 => sub.plus(i1, i2))), ObjectEncoder.instance { rz2: RZ2 =>
          val (rx2, ry2) = sub.sub.take(rz2)
          JsonObject.fromMap(e1.encodeObject(rx2).toMap ++ e2.encodeObject(ry2).toMap)
        })
      }
    }

    override def start: (Item0, Item0, Item0) => (Reads[Item0], OWrites[Item0], Decoder[Item0], ObjectEncoder[Item0]) = {
      { (ii: Item0, iii: Item0, key: Item0) =>
        (Reads[Item0](p => JsSuccess(Item.apply)),
         OWrites[Item0](p => JsObject.empty),
         Decoder.instance(f => Right(Item.apply)),
         ObjectEncoder.instance(i => JsonObject.empty))
      }
    }
  }

  class ItemP[T1, T2, T3, T4] extends TypeParam {
    override type H = T1
    override type T = ItemP1[T2, T3, T4]
    class ItemP1[T2, T3, T4] extends TypeParam {
      override type H = T2
      override type T = ItemP2[T3, T4]
      class ItemP2[T3, T4] extends TypeParam {
        override type H = T3
        override type T = ItemP3[T4]
        class ItemP3[T4] extends TypeParam {
          override type H = T4
          override type T = ItemP4
          class ItemP4 extends TypeParam {
            override type H = String
            override type T = Type0
          }
        }
      }
    }
  }

  implicit def app1[T1, T2]
    : Application[KK, ((Reads[T1], Writes[T2]), (Decoder[T1], Encoder[T2])), ItemP[(Reads[T1], Writes[T2]), (Decoder[T1], Encoder[T2]), T1, T2]] =
    new Application[KK, ((Reads[T1], Writes[T2]), (Decoder[T1], Encoder[T2])), ItemP[(Reads[T1], Writes[T2]), (Decoder[T1], Encoder[T2]), T1, T2]] {
      def application(
        t: ItemTag[((Reads[T1], Writes[T2]), (Decoder[T1], Encoder[T2]))],
        context: Context[KK]): ((Reads[T1], Writes[T2]), (Decoder[T1], Encoder[T2]), String) => (Reads[T1], OWrites[T2], Decoder[T1], ObjectEncoder[T2]) = {
        (play, circe, key) =>
          (Reads[T1](j =>
             j match {
               case e: JsObject =>
                 play._1.reads(e.fields.toMap.get(key).get)
           }),
           OWrites[T2](j => JsObject(Seq((key, play._2.writes(j))))),
           Decoder.decodeJsonObject.emap(f => f.toMap.get(key).get.as(circe._1).left.map(_.message)),
           ObjectEncoder.instance[T2](i => JsonObject((key, circe._2(i)))))
      }
    }

  implicit def app2[T1, T2](implicit playR: Reads[T1],
                            playW: Writes[T2],
                            circeD: Decoder[T1],
                            circeE: Encoder[T2]): Application[KK, (Placeholder[T1], Placeholder[T2]), ItemP[Placeholder[T1], Placeholder[T2], T1, T2]] =
    new Application[KK, (Placeholder[T1], Placeholder[T2]), ItemP[Placeholder[T1], Placeholder[T2], T1, T2]] {
      def application(t: ItemTag[(Placeholder[T1], Placeholder[T2])],
                      context: Context[KK]): (Placeholder[T1], Placeholder[T2], String) => (Reads[T1], OWrites[T2], Decoder[T1], ObjectEncoder[T2]) = {
        (play, circe, key) =>
          (Reads[T1](j =>
             j match {
               case e: JsObject =>
                 playR.reads(e.fields.toMap.get(key).get)
           }),
           OWrites[T2](j => JsObject(Seq((key, playW.writes(j))))),
           Decoder.decodeJsonObject.emap(f => f.toMap.get(key).get.as(circeD).left.map(_.message)),
           ObjectEncoder.instance[T2](i => JsonObject((key, circeE(i)))))
      }
    }

  val func = m.lift(m.虚得一逼(polySum))

  val (playR, playW, circeD, circeE) = func(polyPlay, polyCirce, polyKeys)
  val (playR1, playW1, circeD1, circeE1) =
    (playR.map(generic12), Writes[koukou2](s => playW.writes(generic21(s))), circeD.map(generic12), circeE.contramapObject(generic21))

  val model           = koukou2(id = "123456789", name = "name", age = 2, i4 = "i4", i5 = 5, i6 = "i6")
  val playJsonResult  = playW1.writes(model)
  val playResult      = play.api.libs.json.Json.stringify(playJsonResult)
  val circeJsonResult = circeE1(model)
  val circeResult     = circeJsonResult.noSpaces

  println(s"encode 结果是否相等: ${io.circe.parser.parse(playResult).right.get == circeJsonResult}")
  println(circeResult)

  val playModel  = play.api.libs.json.Json.parse(circeResult).validate(playR1).asOpt.get
  val circeModel = io.circe.parser.parse(circeResult).right.get.as(circeD1).right.get

  println(s"decode 结果是否相等: ${playModel == circeModel}")
  println(circeModel)

}
