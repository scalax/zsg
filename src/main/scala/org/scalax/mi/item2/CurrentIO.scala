package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait UpToPlus {

  type UpToDone <: UpToPlus
  type UpToNotDone <: UpToPlus
  type Current[T <: EatItem, PlusItem <: EatItem] <: EatItem

  def upToDone: UpToDone
  def upToNotDone: UpToNotDone
  def current[T <: EatItem, PlusItem <: EatItem](eat: T, p: PlusItem): Current[T, PlusItem]

}

class NotUseUpToPlus extends UpToPlus {

  override type UpToDone                        = NotUseUpToPlus
  override type UpToNotDone                     = NotUseUpToPlus
  override type Current[T <: EatItem, PlusItem] = NotUse

  override def upToDone: NotUseUpToPlus                                                = NotUseUpToPlus
  override def upToNotDone: NotUseUpToPlus                                             = NotUseUpToPlus
  override def current[T <: EatItem, PlusItem <: EatItem](eat: T, p: PlusItem): NotUse = NotUse

}

object NotUseUpToPlus extends NotUseUpToPlus

class UpToDonePlus extends UpToPlus {
  self =>

  override type UpToDone                                   = UpToDonePlus
  override type UpToNotDone                                = UpToDonePlus
  override type Current[T <: EatItem, PlusItem <: EatItem] = T

  override def upToDone: UpToDonePlus                                             = self
  override def upToNotDone: UpToDonePlus                                          = self
  override def current[T <: EatItem, PlusItem <: EatItem](eat: T, p: PlusItem): T = eat

}

object UpToDonePlus extends UpToDonePlus

class UpToNotDonePlus extends UpToPlus {
  self =>

  override type UpToDone                                   = UpToDonePlus
  override type UpToNotDone                                = UpToNotDonePlus
  override type Current[T <: EatItem, PlusItem <: EatItem] = PlusItem

  override def upToDone: UpToDonePlus                                                    = UpToDonePlus
  override def upToNotDone: UpToNotDonePlus                                              = self
  override def current[T <: EatItem, PlusItem <: EatItem](eat: T, p: PlusItem): PlusItem = p

}

object UpToNotDonePlus extends UpToNotDonePlus

trait AddItemPlus {

  type Change <: AddItemPlus
  def change: Change

  type Add[T <: EatItem, I] <: EatItem
  def add[T <: EatItem, I](eat: T, item: I): Add[T, I]

}

trait NotPlusAddItemPlus extends AddItemPlus {
  self =>

  override type Change = PlusAddItemPlus
  override def change: PlusAddItemPlus = PlusAddItemPlus

  override type Add[T <: EatItem, I] = T#NotPlusItem[I]
  override def add[T <: EatItem, I](eat: T, item: I): T#NotPlusItem[I] = eat.notPlusItem(item)

}

object NotPlusAddItemPlus extends NotPlusAddItemPlus

trait PlusAddItemPlus extends AddItemPlus {
  self =>

  override type Change = NotPlusAddItemPlus
  override def change: NotPlusAddItemPlus = NotPlusAddItemPlus

  override type Add[T <: EatItem, I] = T#UpToPlusItem[I]
  override def add[T <: EatItem, I](eat: T, item: I): T#UpToPlusItem[I] = eat.upToPlusItem(item)

}

object PlusAddItemPlus extends PlusAddItemPlus

trait NotUseAddItemPlus extends AddItemPlus {

  override type Change = NotUseAddItemPlus
  override def change: NotUseAddItemPlus = NotUseAddItemPlus

  override type Add[T <: EatItem, I] = NotUse
  override def add[T <: EatItem, I](eat: T, item: I): NotUse = NotUse

}

object NotUseAddItemPlus extends NotUseAddItemPlus
