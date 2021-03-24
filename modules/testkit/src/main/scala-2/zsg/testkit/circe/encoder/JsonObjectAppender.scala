package zsg.testkit.circe.encoder

import io.circe.{Encoder, Json}
import zsg.{Context3, PropertyTag}
import zsg.macros.ByNameImplicit
import zsg.macros.single.{ColumnName, GenericColumnName}

abstract class JsonObjectAppender[PropertyTag, NameTag, T] {
  def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)]
}

object JsonObjectAppender {

  implicit final def zsgCirceEncoder[T, N](implicit
    t: ByNameImplicit[Encoder[T]],
    n: GenericColumnName[N]
  ): JsonObjectAppender[PropertyTag[T], ColumnName[N], T] =
    new JsonObjectAppender[PropertyTag[T], ColumnName[N], T] {
      override def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)] = (n.value, t.value(tt)) :: m
    }

}
