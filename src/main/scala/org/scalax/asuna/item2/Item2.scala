package org.scalax.asuna.mapper.item

import scala.language.higherKinds

trait EatItem extends Any {

  type RightPlus[T <: EatItem] <: EatItem
  type RightSub <: EatItem
  type RightReplace[T <: EatItem] <: EatItem
  type AddRightItem[T] <: EatItem

  type RightCurrent <: RightCurrentIO
  type RightAppend <: RightAppendIO

  def rightCurrent: RightCurrent
  def rightAppend: RightAppend

  def rightSub: RightSub
  def rightPlus[T <: EatItem](t: T): RightPlus[T]
  def rightReplace[T <: EatItem](t: T): RightReplace[T]
  def addRightItem[T](t: T): AddRightItem[T]

  type RightDrop <: EatItem
  type DropIO <: RightDropIO
  type DropRightItem

  def rightDrop: RightDrop
  def dropIO: DropIO
  def dropRightItem: DropRightItem

}

trait EatValue0 extends Any {
  self =>

  type AddRightItem[T] = E[EatValue1[T]]

  def addRightItem[T](t: T): E[EatValue1[T]] = new E[EatValue1[T]](new EatValue1(t))

}

object EatValue0 extends EatValue0

class EatValue1[T1](val i1: T1) extends AnyVal with EatItem {
  self =>

  override type RightPlus[T <: EatItem]    = NotUse
  override type RightSub                   = NotUse
  override type RightReplace[T <: EatItem] = NotUse
  override type AddRightItem[T]            = EatValue2[T1, T]

  override type RightCurrent = EatValue1Current
  override type RightAppend  = EatValue1Append

  override def rightCurrent: EatValue1Current = EatValue1Current
  override def rightAppend: EatValue1Append   = EatValue1Append

  override def rightSub: NotUse                         = NotUse
  override def rightPlus[T <: EatItem](t: T): NotUse    = NotUse
  override def rightReplace[T <: EatItem](t: T): NotUse = NotUse
  override def addRightItem[T](t: T): EatValue2[T1, T] = new EatValue2[T1, T] {
    override val i1: T1 = self.i1
    override val i2     = t
  }

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

  override type RightPlus[T <: EatItem]    = NotUse
  override type RightSub                   = NotUse
  override type RightReplace[T <: EatItem] = NotUse
  override type AddRightItem[T]            = NotUse

  override type RightCurrent = EatValue2Current
  override type RightAppend  = EatValue2Append

  override def rightCurrent: EatValue2Current = EatValue2Current
  override def rightAppend: EatValue2Append   = EatValue2Append

  override def rightSub: NotUse                         = NotUse
  override def rightPlus[T](t: T): NotUse               = NotUse
  override def rightReplace[T <: EatItem](t: T): NotUse = NotUse
  override def addRightItem[T](t: T): NotUse            = NotUse

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

  override type RightPlus[T <: EatItem]    = PItem2[T1, T]
  override type RightSub                   = T1
  override type RightReplace[T <: EatItem] = PItem1[T]
  override type AddRightItem[T]            = NotUse

  override type RightCurrent = RightSub#RightCurrent#UpToPItem1
  override type RightAppend  = RightSub#RightAppend#UpToPItem1

  override def rightCurrent: RightSub#RightCurrent#UpToPItem1 = rightSub.rightCurrent.upToPItem1
  override def rightAppend: RightSub#RightAppend#UpToPItem1   = rightSub.rightAppend.upToPItem1

  override def rightSub: T1 = i1
  override def rightPlus[T <: EatItem](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }
  override def rightReplace[T <: EatItem](t: T): PItem1[T] = new PItem1[T] {
    override val i1 = t
  }
  override def addRightItem[T](t: T): NotUse = NotUse

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

  override type RightPlus[T <: EatItem]    = NotUse
  override type RightSub                   = T2
  override type RightReplace[T <: EatItem] = PItem2[T1, T]
  override type AddRightItem[T]            = NotUse

  override type RightCurrent = RightSub#RightCurrent#UpToPItem2
  override type RightAppend  = RightSub#RightAppend#UpToPItem2

  override def rightCurrent: RightSub#RightCurrent#UpToPItem2 = rightSub.rightCurrent.upToPItem2
  override def rightAppend: RightSub#RightAppend#UpToPItem2   = rightSub.rightAppend.upToPItem2

  override def rightSub: T2                          = i2
  override def rightPlus[T <: EatItem](t: T): NotUse = NotUse
  override def rightReplace[T <: EatItem](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }
  override def addRightItem[T](t: T): NotUse = NotUse

  override type RightDrop     = T1
  override type DropIO        = RightSub#DropIO#UpToPItem2
  override type DropRightItem = T2#DropRightItem

  override def rightDrop: T1                      = self.i1
  override def dropIO: RightSub#DropIO#UpToPItem2 = rightSub.dropIO.upToPItem2
  override def dropRightItem: T2#DropRightItem    = self.i2.dropRightItem

  override def toString: String = s"PItem2(${i1}, ${i2})"

}

class E[I <: EatItem](val item: I) extends EatItem {
  self =>

  override type RightPlus[T <: EatItem]    = E[PItem2[I, T]]
  override type RightSub                   = I
  override type RightReplace[T <: EatItem] = E[T]
  override type AddRightItem[T]            = RightSub#RightAppend#UpToTopItem#Append[T, E[RightSub#RightCurrent#Current[T, I]]]

  override type RightCurrent = RightSub#RightCurrent
  override type RightAppend  = RightSub#RightAppend#UpToTopItem

  override def rightCurrent: RightSub#RightCurrent           = rightSub.rightCurrent
  override def rightAppend: RightSub#RightAppend#UpToTopItem = rightSub.rightAppend.upToTopItem

  override def rightSub: I = item
  override def rightPlus[T <: EatItem](t: T): E[PItem2[I, T]] =
    new E(new PItem2[I, T] {
      override val i1: I = self.item
      override val i2    = t
    })
  override def rightReplace[T <: EatItem](t: T): E[T] = new E(t)
  override def addRightItem[T](t: T): RightSub#RightAppend#UpToTopItem#Append[T, E[RightSub#RightCurrent#Current[T, I]]] = {
    rightSub.rightAppend.upToTopItem.append(t, new E(self.rightSub.rightCurrent.current(t, self.item)))
  }

  override type RightDrop     = NotUse
  override type DropIO        = RightSub#DropIO#UpToTopItem
  override type DropRightItem = I#DropRightItem

  override def rightDrop: NotUse                   = NotUse
  override def dropIO: RightSub#DropIO#UpToTopItem = rightSub.dropIO.upToTopItem
  override def dropRightItem: I#DropRightItem      = item.dropRightItem

  def dropRight: DropIO#Drop[E[I]] = dropIO.drop(self)

  override def toString: String = s"E(${item})"

}

object E {
  def value1[T](t: T): E[EatValue1[T]] = new E(new EatValue1(t))

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
