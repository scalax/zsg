package zsg.testkit.circe.encoder

import io.circe.{Encoder, Json}
import zsg.{Application, Context, PropertyTag, TagMerge2, TypeAlias, TypeFunction, TypeHList}
import zsg.macros.ByNameImplicit
import zsg.macros.single.ColumnName
import zsg.macros.utils.GenericColumnName

abstract class JsonObjectAppender[NameTag, T] {
  def appendField(tt: T, m: List[(String, Json)]): List[(String, Json)]
}

class JsonObjectFunc extends TypeFunction {
  override type H[T <: TypeHList] = JsonObjectAppender[T#Head, T#Tail#Head]
}

object JsonObjectFunc {
  implicit def implicit1[T1 <: String, T2](implicit
    t: ByNameImplicit[Encoder[T2]],
    n: GenericColumnName[T1]
  ): Application[JsonObjectFunc, TagMerge2[PropertyTag[T2], ColumnName[T1]], TypeAlias.TypeHList2[ColumnName[
    T1
  ], T2]] =
    new Application[
      JsonObjectFunc,
      TagMerge2[PropertyTag[T2], ColumnName[T1]],
      TypeAlias.TypeHList2[ColumnName[T1], T2]
    ] {
      override def application(context: Context[JsonObjectFunc]): JsonObjectAppender[ColumnName[T1], T2] =
        new JsonObjectAppender[ColumnName[T1], T2] {
          override def appendField(tt: T2, m: List[(String, Json)]): List[(String, Json)] = (n.value, t.value(tt)) :: m
        }
    }
}
