package org.scalax.asuna.mapper.item

trait NotUseDropRightResult

object NotUseDropRightResult extends NotUseDropRightResult

class NotUse extends EatItem {
  self =>

  override type RightPlus[T <: EatItem]    = NotUse
  override type RightSub                   = NotUse
  override type RightReplace[T <: EatItem] = NotUse
  override type AddRightItem[T]            = NotUse

  override type RightCurrent = RightNotUseCurrentIO
  override type RightAppend  = RightNotUseAppendIO

  override def rightCurrent: RightNotUseCurrentIO = RightNotUseCurrentIO
  override def rightAppend: RightNotUseAppendIO   = RightNotUseAppendIO

  override def rightSub: NotUse                         = self
  override def rightPlus[T <: EatItem](t: T): NotUse    = self
  override def rightReplace[T <: EatItem](t: T): NotUse = self
  override def addRightItem[T](t: T): NotUse            = self

  override type RightDrop     = NotUse
  override type DropIO        = NotUsedDropIO
  override type DropRightItem = NotUseDropRightResult

  override def rightDrop: NotUse                    = self
  override def dropIO: NotUsedDropIO                = NotUsedDropIO
  override def dropRightItem: NotUseDropRightResult = NotUseDropRightResult

}

object NotUse extends NotUse

trait RightNotUseCurrentIO extends Any with RightCurrentIO {
  self =>

  override type Current[T, I <: EatItem] = NotUse

  override type UpToPItem1 = RightNotUseCurrentIO
  override type UpToPItem2 = RightNotUseCurrentIO

  override def upToPItem1: RightNotUseCurrentIO = self
  override def upToPItem2: RightNotUseCurrentIO = self

  override def current[T, I <: EatItem](t: T, i: I): NotUse = NotUse

}

object RightNotUseCurrentIO extends RightNotUseCurrentIO

trait RightNotUseAppendIO extends Any with RightAppendIO {
  self =>

  override type Append[T, I <: EatItem] = NotUse

  override type UpToPItem1  = RightNotUseAppendIO
  override type UpToPItem2  = RightNotUseAppendIO
  override type UpToTopItem = RightNotUseAppendIO

  override def upToPItem1: RightNotUseAppendIO  = self
  override def upToPItem2: RightNotUseAppendIO  = self
  override def upToTopItem: RightNotUseAppendIO = self

  override def append[T, I <: EatItem](t: T, i: I): NotUse = NotUse

}

object RightNotUseAppendIO extends RightNotUseAppendIO

class NotUsedDropIO extends RightDropIO {
  self =>

  override type Drop[I <: EatItem] = NotUse

  override type UpToPItem1  = NotUsedDropIO
  override type UpToPItem2  = NotUsedDropIO
  override type UpToTopItem = NotUsedDropIO

  override def upToPItem1: NotUsedDropIO  = NotUsedDropIO
  override def upToPItem2: NotUsedDropIO  = NotUsedDropIO
  override def upToTopItem: NotUsedDropIO = NotUsedDropIO

  override def drop[I <: EatItem](i: I): NotUse = NotUse

}

object NotUsedDropIO extends NotUsedDropIO
