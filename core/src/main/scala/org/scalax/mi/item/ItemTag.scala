package org.scalax.asuna.mapper.item {
  import org.scalax.asuna.mapper.{Context, KindContext}

  import scala.language.higherKinds

  trait ItemTag {
    type XyyItemType
    type M[M <: org.scalax.asuna.mapper.item.Message] <: ItemTag
  }

  class EndItemTag extends ItemTag

  trait Message

  trait ContextContent[T] {
    def withContext[K <: KindContext](c: Context[K]): T
  }

  package impl {
    case class :-<>-:[M1 <: Message, M2 <: Message](m1: M1, m2: M2) extends Message
  }
}
