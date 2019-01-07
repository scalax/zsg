package org.scalax.asuna.mapper.common3;
import io.circe.{Decoder, Encoder, Json, JsonObject}
import play.api.libs.json.{JsObject, OWrites, Reads, Writes}
import shapeless._

import scala.util.Try

object MiaoWuTest {
  object i extends Context[JsonRM] {
    self =>
    override def map[T1 <: Item, T2 <: Item](
      a1: MM[T1#Model] => OWrites[T1#Sub#Model],
      a2: MM[T2#Model] => OWrites[T2#Sub#Model]): MM[Bingbing2[T1#Model, T2#Model]] => OWrites[Bingbing2[T1#Sub#Model, T2#Sub#Model]] = { mm =>
      new OWrites[Bingbing2[T1#Sub#Model, T2#Sub#Model]] {
        override def writes(o: Bingbing2[T1#Sub#Model, T2#Sub#Model]): JsObject = { a1(MM(mm.i.i1)).writes(o.i1) ++ a2(MM(mm.i.i2)).writes(o.i2) }
      }
    }
  }

  trait JsonRM extends RM {
    type IM[U <: Item] = MM[U#Model] => OWrites[U#Sub#Model]
  }

  case class MM[I](i: I)

  /*trait JsonItem extends Item {
    type PlayItem
    type CirceItem
  }*/

}
