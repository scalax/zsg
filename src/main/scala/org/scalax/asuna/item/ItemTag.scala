package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait ItemTag {
  type RawItem
  type HeadItem <: ItemTag
  type TailItem <: ItemTag
  type Sub <: ItemTag
  type XyyItemType

  type NoMessage <: ItemTag

  type Pull[I <: ItemTag] <: ItemTag
  type InputMessage[I <: MessageContent] <: MessageResult

}

class EndItemTag extends ItemTag {
  override type RawItem   = NotUseItem
  override type HeadItem  = EndItemTag
  override type TailItem  = EndItemTag
  override type Sub       = EndItemTag
  override type NoMessage = EndItemTag

  override type Pull[I <: ItemTag] = EndItemTag
}

class NotUseItem

trait TagContent extends Any {
  type IITag <: ItemTag
}

trait TagContentImpl[I <: ItemTag] extends Any with TagContent {
  override type IITag = I
}

trait Message

trait MessageContent {

  type HeadItem <: Message
  type TailItem <: MessageContent

}

trait MessageResult {

  type Result <: ItemTag
  type Left <: MessageContent

}

class MessageResultImpl[I <: ItemTag, II <: MessageContent] extends MessageResult {
  override type Result = I
  override type Left   = II
}
