package zsg.testkit.circe.encoder

import io.circe.{Encoder, Json}
import zsg.TypeHList
import zsg.macros.ByNameImplicit
import zsg.macros.single.{ColumnName, GenericColumnName}

abstract class JsonObjectAppender[NameTag, T] {
  def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)]
}

object JsonObjectAppender {
  type S[T <: TypeHList] = JsonObjectAppender[T#Head, T#Tail#Head]

  implicit final def zsgCirceEncoder[T, N](implicit
    t: ByNameImplicit[Encoder[T]],
    n: GenericColumnName[N]
  ): JsonObjectAppender[ColumnName[N], T] =
    new JsonObjectAppender[ColumnName[N], T] {
      override def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)] = (n.value, t.value(tt)) :: m
    }
}
