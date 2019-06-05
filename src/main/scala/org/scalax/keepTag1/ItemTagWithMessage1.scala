package org.scalax.asuna.mapper.item

class ItemTagWithMessage1[T1, Message1 <: org.scalax.asuna.mapper.item.Message] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem                                         = T1
  override type HeadItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem                                        = org.scalax.asuna.mapper.item.EndItemTag
  override type Sub                                             = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage                                       = ItemTag1[T1]
  override type XyyItemType                                     = XyyItem1[T1]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag1[(RawItem, I#RawItem)]
}

class `Please change .debug(context) to .find1.debug(context).` extends org.scalax.asuna.mapper.item.Message
