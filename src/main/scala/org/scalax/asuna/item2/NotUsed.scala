package org.scalax.asuna.mapper.item

trait NotUseDropRightResult

object NotUseDropRightResult extends NotUseDropRightResult

class NotUse extends EatItem with PItem2PP {
  self =>

  override type SelfType = NotUse
  override def selfItem: SelfType = NotUse

  override type TT1 = NotUse
  override def i1: NotUse = self

  override type TT2 = NotUse
  override def i2: NotUse = self

  override type ToPItem1[TT <: PItem1PP, T] = NotUse
  override type ToPItem2[TT <: PItem2PP, T] = NotUse

  override def toPItem1[TT <: PItem1PP, T](tt: TT, t: T): NotUse = self
  override def toPItem2[TT <: PItem2PP, T](tt: TT, t: T): NotUse = self

  /*override type UpToP           = NotUseUpToPlus
  override type UpToPlusItem[T] = NotUse
  override def upToP: NotUseUpToPlus         = NotUseUpToPlus
  override def upToPlusItem[T](t: T): NotUse = self*/

  override type RightSub                   = NotUse
  override type RightReplace[T <: EatItem] = NotUse

  override def rightSub: NotUse                         = self
  override def rightReplace[T <: EatItem](t: T): NotUse = self

  override type RightDrop     = NotUse
  override type DropIO        = NotUsedDropIO
  override type DropRightItem = NotUseDropRightResult

  override def rightDrop: NotUse                    = self
  override def dropIO: NotUsedDropIO                = NotUsedDropIO
  override def dropRightItem: NotUseDropRightResult = NotUseDropRightResult

}

object NotUse extends NotUse

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
