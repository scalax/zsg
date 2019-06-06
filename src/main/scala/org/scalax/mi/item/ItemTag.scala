package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait ItemTag {
  type Sub <: ItemTag
  type XyyItemType

  type InputMessage[I <: MessageContent] <: MessageResult
}

class EndItemTag extends ItemTag {
  override type Sub = EndItemTag
}

trait Message

trait MessageContent {

  type HeadItem <: Message
  type TailItem <: MessageContent

}

class MessageContentImpl[HI <: Message, TI <: MessageContent] extends MessageContent {
  override type HeadItem = HI
  override type TailItem = TI
}

class ZeroMessageContent extends MessageContent {
  override type HeadItem = Message
  override type TailItem = ZeroMessageContent
}

trait MessageResult {

  type Result <: ItemTag
  type Left <: MessageContent

}

class MessageResultImpl[I <: ItemTag, II <: MessageContent] extends MessageResult {
  override type Result = I
  override type Left   = II
}
