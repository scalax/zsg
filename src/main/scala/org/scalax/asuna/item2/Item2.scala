package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait EatItem extends Any {

  type NotPlusItem[T] <: EatItem
  def notPlusItem[T](t: T): NotPlusItem[T]

  type PlusItem[T] <: EatItem
  def plusItem[T](t: T): PlusItem[T]

  type UpToP <: UpToPlus
  type UpToPlusItem[T] <: EatItem
  def upToP: UpToP
  def upToPlusItem[T](t: T): UpToPlusItem[T]

  type RightSub <: EatItem
  type RightReplace[T <: EatItem] <: EatItem

  def rightSub: RightSub
  def rightReplace[T <: EatItem](t: T): RightReplace[T]

  type RightDrop <: EatItem
  type DropIO <: RightDropIO
  type DropRightItem

  def rightDrop: RightDrop
  def dropIO: DropIO
  def dropRightItem: DropRightItem

}

trait EatValue0 extends Any {
  self =>

  type AddRightItem[T] = E[EatValue1[T], NotPlusAddItemPlus]

  def addRightItem[T](t: T): E[EatValue1[T], NotPlusAddItemPlus] = new E[EatValue1[T], NotPlusAddItemPlus] {
    override val item        = new EatValue1(t)
    override val addItemPlus = NotPlusAddItemPlus
  }

}

object EatValue0 extends EatValue0

class EatValue1[T1](val i1: T1) extends AnyVal with EatItem {
  self =>

  override type NotPlusItem[T] = EatValue2[T1, T]
  override def notPlusItem[T](t: T): EatValue2[T1, T] = new EatValue2[T1, T] {
    override val i1: T1 = self.i1
    override val i2     = t
  }

  override type PlusItem[T] = NotUse
  override def plusItem[T](t: T): NotUse = NotUse

  override type UpToP           = NotUseUpToPlus
  override type UpToPlusItem[T] = NotUse
  override def upToP: NotUseUpToPlus         = NotUseUpToPlus
  override def upToPlusItem[T](t: T): NotUse = NotUse

  override type RightSub                   = NotUse
  override type RightReplace[T <: EatItem] = NotUse

  override def rightSub: NotUse                         = NotUse
  override def rightReplace[T <: EatItem](t: T): NotUse = NotUse

  override type RightDrop     = NotUse
  override type DropIO        = EatValue1RightDropIO
  override type DropRightItem = T1

  override def rightDrop: NotUse            = NotUse
  override def dropIO: EatValue1RightDropIO = EatValue1RightDropIO
  override def dropRightItem: T1            = self.i1

  override def toString: String = s"EatValue1(${i1})"

}

trait EatValue2[T1, T2] extends Any with EatItem {
  self =>

  def i1: T1
  def i2: T2

  override type NotPlusItem[T] = NotUse
  override def notPlusItem[T](t: T): NotUse = NotUse

  override type PlusItem[T] = EatValue1[T]
  override def plusItem[T](t: T): EatValue1[T] = new EatValue1[T](t)

  override type UpToP           = UpToNotDonePlus
  override type UpToPlusItem[T] = EatValue1[T]
  override def upToP: UpToNotDonePlus              = UpToNotDonePlus
  override def upToPlusItem[T](t: T): EatValue1[T] = new EatValue1[T](t)

  override type RightSub                   = NotUse
  override type RightReplace[T <: EatItem] = NotUse

  override def rightSub: NotUse                         = NotUse
  override def rightReplace[T <: EatItem](t: T): NotUse = NotUse

  override type RightDrop     = EatValue1[T1]
  override type DropIO        = EatValue2RightDropIO
  override type DropRightItem = T2

  override def rightDrop: EatValue1[T1]     = new EatValue1[T1](self.i1)
  override def dropIO: EatValue2RightDropIO = EatValue2RightDropIO
  override def dropRightItem: T2            = self.i2

  override def toString: String = s"EatValue2(${i1}, ${i2})"

}

trait PItem1[T1 <: EatItem] extends Any with EatItem {
  self =>

  def i1: T1

  override type NotPlusItem[T] = PItem1[T1#NotPlusItem[T]]
  override def notPlusItem[T](t: T): PItem1[T1#NotPlusItem[T]] = new PItem1[T1#NotPlusItem[T]] {
    override val i1 = self.i1.notPlusItem(t)
  }

  override type PlusItem[T] = PItem2[T1, T1#PlusItem[T]]
  override def plusItem[T](t: T): PItem2[T1, T1#PlusItem[T]] = new PItem2[T1, T1#PlusItem[T]] {
    override val i1 = self.i1
    override val i2 = self.i1.plusItem(t)
  }

  override type UpToP           = T1#UpToP#UpToDone
  override type UpToPlusItem[T] = T1#UpToP#Current[PItem1[T1#UpToPlusItem[T]], PlusItem[T]]
  override def upToP: T1#UpToP#UpToDone = self.i1.upToP.upToDone
  override def upToPlusItem[T](t: T): T1#UpToP#Current[PItem1[T1#UpToPlusItem[T]], PlusItem[T]] = self.i1.upToP.current(
      new PItem1[T1#UpToPlusItem[T]] {
      override val i1 = self.i1.upToPlusItem(t)
    }
    , self.plusItem(t)
  )

  override type RightSub                   = T1
  override type RightReplace[T <: EatItem] = PItem1[T]

  override def rightSub: T1 = i1
  override def rightReplace[T <: EatItem](t: T): PItem1[T] = new PItem1[T] {
    override val i1 = t
  }

  override type RightDrop     = NotUse
  override type DropIO        = RightSub#DropIO#UpToPItem1
  override type DropRightItem = T1#DropRightItem

  override def rightDrop: NotUse                  = NotUse
  override def dropIO: RightSub#DropIO#UpToPItem1 = rightSub.dropIO.upToPItem1
  override def dropRightItem: T1#DropRightItem    = self.i1.dropRightItem

  override def toString: String = s"PItem1(${i1})"

}

trait PItem2[T1 <: EatItem, T2 <: EatItem] extends Any with EatItem {
  self =>

  def i1: T1
  def i2: T2

  override type NotPlusItem[T] = PItem2[T1, T2#NotPlusItem[T]]
  override def notPlusItem[T](t: T): PItem2[T1, T2#NotPlusItem[T]] = new PItem2[T1, T2#NotPlusItem[T]] {
    override val i1 = self.i1
    override val i2 = self.i2.notPlusItem(t)
  }

  override type PlusItem[T] = PItem1[T2#PlusItem[T]]
  override def plusItem[T](t: T): PItem1[T2#PlusItem[T]] = new PItem1[T2#PlusItem[T]] {
    override val i1 = self.i2.plusItem(t)
  }

  override type UpToP           = T2#UpToP#UpToNotDone
  override type UpToPlusItem[T] = T2#UpToP#Current[PItem2[T1, T2#UpToPlusItem[T]], PlusItem[T]]
  override def upToP: T2#UpToP#UpToNotDone = self.i2.upToP.upToNotDone
  override def upToPlusItem[T](t: T): T2#UpToP#Current[PItem2[T1, T2#UpToPlusItem[T]], PlusItem[T]] = self.i2.upToP.current(
      new PItem2[T1, T2#UpToPlusItem[T]] {
      override val i1 = self.i1
      override val i2 = self.i2.upToPlusItem(t)
    }
    , self.plusItem(t)
  )

  override type RightSub                   = T2
  override type RightReplace[T <: EatItem] = PItem2[T1, T]

  override def rightSub: T2 = i2
  override def rightReplace[T <: EatItem](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }

  override type RightDrop     = T1
  override type DropIO        = RightSub#DropIO#UpToPItem2
  override type DropRightItem = T2#DropRightItem

  override def rightDrop: T1                      = self.i1
  override def dropIO: RightSub#DropIO#UpToPItem2 = rightSub.dropIO.upToPItem2
  override def dropRightItem: T2#DropRightItem    = self.i2.dropRightItem

  override def toString: String = s"PItem2(${i1}, ${i2})"

}

trait E[I <: EatItem, P <: AddItemPlus] extends EatItem {
  self =>

  def item: I
  def addItemPlus: P

  override type NotPlusItem[T] = E[I#NotPlusItem[T], P#Change]
  override def notPlusItem[T](t: T): E[I#NotPlusItem[T], P#Change] = new E[I#NotPlusItem[T], P#Change] {
    override val item        = self.item.notPlusItem(t)
    override val addItemPlus = self.addItemPlus.change
  }

  override type PlusItem[T] = E[PItem2[I, I#PlusItem[T]], P]
  override def plusItem[T](t: T): E[PItem2[I, I#PlusItem[T]], P] =
    new E[PItem2[I, I#PlusItem[T]], P] {
      override val item = new PItem2[I, I#PlusItem[T]] {
        override val i1 = self.item
        override val i2 = self.item.plusItem(t)
      }
      override val addItemPlus = self.addItemPlus
    }

  override type UpToP           = I#UpToP
  override type UpToPlusItem[T] = I#UpToP#Current[E[I#UpToPlusItem[T], P#Change], E[PItem2[I, I#UpToPlusItem[T]], P#Change]]
  override def upToP: I#UpToP = self.item.upToP
  override def upToPlusItem[T](t: T): I#UpToP#Current[E[I#UpToPlusItem[T], P#Change], E[PItem2[I, I#UpToPlusItem[T]], P#Change]] = self.upToP.current(
      new E[I#UpToPlusItem[T], P#Change] {
      override val item        = self.item.upToPlusItem(t)
      override val addItemPlus = self.addItemPlus.change
    }
    , new E[PItem2[I, I#UpToPlusItem[T]], P#Change] {
      override val item = new PItem2[I, I#UpToPlusItem[T]] {
        override val i1 = self.item
        override val i2 = self.item.upToPlusItem(t)
      }
      override val addItemPlus = self.addItemPlus.change
    }
  )

  override type RightSub                   = I
  override type RightReplace[T <: EatItem] = E[T, P#Change]

  override def rightSub: I = item
  override def rightReplace[T <: EatItem](t: T): E[T, P#Change] = new E[T, P#Change] {
    override val item        = t
    override val addItemPlus = self.addItemPlus.change
  }

  type AddRightItem[T] = P#Add[E[I, P], T]
  def addRightItem[T](t: T): P#Add[E[I, P], T] = {
    addItemPlus.add(self, t)
  }

  override type RightDrop     = NotUse
  override type DropIO        = RightSub#DropIO#UpToTopItem
  override type DropRightItem = I#DropRightItem

  override def rightDrop: NotUse                   = NotUse
  override def dropIO: RightSub#DropIO#UpToTopItem = rightSub.dropIO.upToTopItem
  override def dropRightItem: I#DropRightItem      = item.dropRightItem

  def dropRight: DropIO#Drop[E[I, P]] = dropIO.drop(self)

  override def toString: String = s"E(${item})"

}

object E {
  def value1[T](t: T): E[EatValue1[T], NotPlusAddItemPlus] = new E[EatValue1[T], NotPlusAddItemPlus] {
    override val item        = new EatValue1(t)
    override val addItemPlus = NotPlusAddItemPlus
  }

  val item0: EatValue0 = EatValue0
}

object App extends App {

  type II1  = String
  type II2  = String
  type II3  = Int
  type II4  = String
  type II5  = Int
  type II6  = String
  type II7  = String
  type II8  = String
  type II9  = Int
  type II10 = String

  val bb = E.item0.addRightItem("1").addRightItem("2").addRightItem(3).addRightItem("4").addRightItem(5)

  val cc = bb.addRightItem("6").addRightItem("7").addRightItem("8").addRightItem(9).addRightItem(10).addRightItem(11).addRightItem(12)

  println(bb)
  println(cc)

  val i1  = cc.dropRight
  val i2  = i1.dropRight
  val i3  = i2.dropRight
  val i4  = i3.dropRight
  val i5  = i4.dropRight
  val i6  = i5.dropRight
  val i7  = i6.dropRight
  val i8  = i7.dropRight
  val i9  = i8.dropRight
  val i10 = i9.dropRight
  val i11 = i10.dropRight
  val i12 = i11.dropRight

  println(i1)
  println(i2)
  println(i3)
  println(i4)
  println(i5)
  println(i6)
  println(i7)
  println(i8)
  println(i9)
  println(i10)
  println(i11)

}
