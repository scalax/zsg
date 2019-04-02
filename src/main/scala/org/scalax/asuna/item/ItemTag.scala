package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait ItemTag {
  type RawItem
  type HeadItem <: ItemTag
  type TailItem <: ItemTag
  type Sub <: ItemTag

  type Pull[I <: ItemTag] <: ItemTag
}

class EndItemTag extends ItemTag {
  override type RawItem  = NotUseItem
  override type HeadItem = EndItemTag
  override type TailItem = EndItemTag
  override type Sub      = EndItemTag

  override type Pull[I <: ItemTag] = EndItemTag
}

class NotUseItem

trait TagContent extends Any {
  type IITag <: ItemTag
}

trait TagContentImpl[I <: ItemTag] extends Any with TagContent {
  override type IITag = I
}
