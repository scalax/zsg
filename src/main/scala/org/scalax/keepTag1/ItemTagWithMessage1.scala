package org.scalax.asuna.mapper.item

class ItemTagWithMessage1[T1, Message1 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type XyyItemType = XyyItem1[T1]
}

class `Please change .debug(context) to .find1.debug(context).` extends org.scalax.asuna.mapper.item.Message
