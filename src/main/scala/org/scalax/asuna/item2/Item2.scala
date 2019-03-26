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

  type LeftPlus[T <: EatItem] <: EatItem
  type LeftSub <: EatItem
  type LeftReplace[T <: EatItem] <: EatItem
  type AddLeftItem[T] <: EatItem

  type LeftCurrent <: LeftCurrentIO
  type LeftAppend <: LeftAppendIO

  def leftCurrent: LeftCurrent
  def leftAppend: LeftAppend

  def leftSub: LeftSub
  def leftPlus[T <: EatItem](t: T): LeftPlus[T]
  def leftReplace[T <: EatItem](t: T): LeftReplace[T]
  def addLeftItem[T](t: T): AddLeftItem[T]

}

trait EatValue0 extends Any {
  self =>

  type AddRightItem[T]  = E[EatValue1[T]]
  type AddLeftItem[T]   = E[EatValue1[T]]
  type Add2Item[T1, T2] = E[PItem2[EatValue1[T1], EatValue1[T2]]]

  def addRightItem[T](t: T): E[EatValue1[T]] = new E[EatValue1[T]](new EatValue1(t))
  def addLeftItem[T](t: T): E[EatValue1[T]]  = new E[EatValue1[T]](new EatValue1(t))
  def add2Item[T1, T2](t1: T1, t2: T2): E[PItem2[EatValue1[T1], EatValue1[T2]]] =
    new E(new PItem2[EatValue1[T1], EatValue1[T2]] {
      override val i1 = new EatValue1(t1)
      override val i2 = new EatValue1(t2)
    })

}

object EatValue0 extends EatValue0

class EatValue1[T1](val i1: T1) extends AnyVal with EatItem {
  self =>

  override type RightPlus[T <: EatItem]    = T
  override type RightSub                   = EatValue1[T1]
  override type RightReplace[T <: EatItem] = T
  override type AddRightItem[T]            = EatValue2[T1, T]

  override type RightCurrent = EatValue1Current
  override type RightAppend  = EatValue1Append

  override def rightCurrent: EatValue1Current = EatValue1Current
  override def rightAppend: EatValue1Append   = EatValue1Append

  override def rightSub: EatValue1[T1]             = self
  override def rightPlus[T <: EatItem](t: T): T    = t
  override def rightReplace[T <: EatItem](t: T): T = t
  override def addRightItem[T](t: T): EatValue2[T1, T] = new EatValue2[T1, T] {
    override val i1: T1 = self.i1
    override val i2     = t
  }

  override type LeftPlus[T <: EatItem]    = T
  override type LeftSub                   = EatValue1[T1]
  override type LeftReplace[T <: EatItem] = T
  override type AddLeftItem[T]            = EatValue2[T, T1]

  override type LeftCurrent = LeftEatValue1Current
  override type LeftAppend  = LeftEatValue1Append

  override def leftCurrent: LeftEatValue1Current = LeftEatValue1Current
  override def leftAppend: LeftEatValue1Append   = LeftEatValue1Append

  override def leftSub: EatValue1[T1]             = self
  override def leftPlus[T <: EatItem](t: T): T    = t
  override def leftReplace[T <: EatItem](t: T): T = t
  override def addLeftItem[T](t: T): EatValue2[T, T1] = new EatValue2[T, T1] {
    override val i1     = t
    override val i2: T1 = self.i1
  }

  override def toString: String = s"EatValue1(${i1})"

}

trait EatValue2[T1, T2] extends Any with EatItem {
  self =>

  def i1: T1
  def i2: T2

  override type RightPlus[T <: EatItem]    = T
  override type RightSub                   = EatValue2[T1, T2]
  override type RightReplace[T <: EatItem] = T
  override type AddRightItem[T]            = EatValue2[T1, T2]

  override type RightCurrent = EatValue2Current
  override type RightAppend  = EatValue2Append

  override def rightCurrent: EatValue2Current = EatValue2Current
  override def rightAppend: EatValue2Append   = EatValue2Append

  override def rightSub: EatValue2[T1, T2]              = self
  override def rightPlus[T](t: T): T                    = t
  override def rightReplace[T <: EatItem](t: T): T      = t
  override def addRightItem[T](t: T): EatValue2[T1, T2] = self

  override type LeftPlus[T <: EatItem]    = T
  override type LeftSub                   = EatValue2[T1, T2]
  override type LeftReplace[T <: EatItem] = T
  override type AddLeftItem[T]            = EatValue2[T1, T2]

  override type LeftCurrent = LeftEatValue2Current
  override type LeftAppend  = LeftEatValue2Append

  override def leftCurrent: LeftEatValue2Current = LeftEatValue2Current
  override def leftAppend: LeftEatValue2Append   = LeftEatValue2Append

  override def leftSub: EatValue2[T1, T2]              = self
  override def leftPlus[T <: EatItem](t: T): T         = t
  override def leftReplace[T <: EatItem](t: T): T      = t
  override def addLeftItem[T](t: T): EatValue2[T1, T2] = self

  override def toString: String = s"EatValue2(${i1}, ${i2})"

}

trait PItem1[T1 <: EatItem] extends Any with EatItem {
  self =>

  def i1: T1

  override type RightPlus[T <: EatItem]    = PItem2[T1, T]
  override type RightSub                   = T1
  override type RightReplace[T <: EatItem] = PItem1[T]
  override type AddRightItem[T]            = PItem1[T1]

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
  override def addRightItem[T](t: T): PItem1[T1] = self

  override type LeftPlus[T <: EatItem]    = PItem2[T, T1]
  override type LeftSub                   = T1
  override type LeftReplace[T <: EatItem] = PItem1[T]
  override type AddLeftItem[T]            = PItem1[T1]

  override type LeftCurrent = LeftSub#LeftCurrent#UpToPItem1
  override type LeftAppend  = LeftSub#LeftAppend#UpToPItem1

  override def leftCurrent: LeftSub#LeftCurrent#UpToPItem1 = leftSub.leftCurrent.upToPItem1
  override def leftAppend: LeftSub#LeftAppend#UpToPItem1   = leftSub.leftAppend.upToPItem1

  override def leftSub: T1 = i1
  override def leftPlus[T <: EatItem](t: T): PItem2[T, T1] = new PItem2[T, T1] {
    override val i1 = t
    override val i2 = self.i1
  }
  override def leftReplace[T <: EatItem](t: T): PItem1[T] = new PItem1[T] {
    override val i1 = t
  }
  override def addLeftItem[T](t: T): PItem1[T1] = self

  override def toString: String = s"PItem1(${i1})"

}

trait PItem2[T1 <: EatItem, T2 <: EatItem] extends Any with EatItem {
  self =>

  def i1: T1
  def i2: T2

  override type RightPlus[T <: EatItem]    = PItem2[T1, T2]
  override type RightSub                   = T2
  override type RightReplace[T <: EatItem] = PItem2[T1, T]
  override type AddRightItem[T]            = PItem2[T1, T2]

  override type RightCurrent = RightSub#RightCurrent#UpToPItem2
  override type RightAppend  = RightSub#RightAppend#UpToPItem2

  override def rightCurrent: RightSub#RightCurrent#UpToPItem2 = rightSub.rightCurrent.upToPItem2
  override def rightAppend: RightSub#RightAppend#UpToPItem2   = rightSub.rightAppend.upToPItem2

  override def rightSub: T2                                  = i2
  override def rightPlus[T <: EatItem](t: T): PItem2[T1, T2] = self
  override def rightReplace[T <: EatItem](t: T): PItem2[T1, T] = new PItem2[T1, T] {
    override val i1 = self.i1
    override val i2 = t
  }
  override def addRightItem[T](t: T): PItem2[T1, T2] = self

  override type LeftPlus[T <: EatItem]    = PItem2[T1, T2]
  override type LeftSub                   = T1
  override type LeftReplace[T <: EatItem] = PItem2[T, T2]
  override type AddLeftItem[T]            = PItem2[T1, T2]

  override type LeftCurrent = LeftSub#LeftCurrent#UpToPItem2
  override type LeftAppend  = LeftSub#LeftAppend#UpToPItem2

  override def leftCurrent: LeftSub#LeftCurrent#UpToPItem2 = leftSub.leftCurrent.upToPItem2
  override def leftAppend: LeftSub#LeftAppend#UpToPItem2   = leftSub.leftAppend.upToPItem2

  override def leftSub: T1                                  = i1
  override def leftPlus[T <: EatItem](t: T): PItem2[T1, T2] = self
  override def leftReplace[T <: EatItem](t: T): PItem2[T, T2] = new PItem2[T, T2] {
    override val i1 = t
    override val i2 = self.i2
  }
  override def addLeftItem[T](t: T): PItem2[T1, T2] = self

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

  override type LeftPlus[T <: EatItem]    = E[PItem2[T, I]]
  override type LeftSub                   = I
  override type LeftReplace[T <: EatItem] = E[T]
  override type AddLeftItem[T]            = LeftSub#LeftAppend#UpToTopItem#Append[T, E[LeftSub#LeftCurrent#Current[T, I]]]

  override type LeftCurrent = LeftSub#LeftCurrent
  override type LeftAppend  = LeftSub#LeftAppend#UpToTopItem

  override def leftCurrent: LeftSub#LeftCurrent           = leftSub.leftCurrent
  override def leftAppend: LeftSub#LeftAppend#UpToTopItem = leftSub.leftAppend.upToTopItem

  override def leftSub: I = item
  override def leftPlus[T <: EatItem](t: T): E[PItem2[T, I]] =
    new E(new PItem2[T, I] {
      override val i1 = t
      override val i2 = self.item
    })
  override def leftReplace[T <: EatItem](t: T): E[T] = new E(t)
  override def addLeftItem[T](t: T): LeftSub#LeftAppend#UpToTopItem#Append[T, E[LeftSub#LeftCurrent#Current[T, I]]] = {
    leftSub.leftAppend.upToTopItem.append(t, new E(self.leftSub.leftCurrent.current(t, self.item)))
  }

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

  val bb = new AppendXyy9(
      E.item0
      .addRightItem("1": II1)
      .addRightItem("2": II2)
      .addRightItem(3: II3)
      .addRightItem("4": II4)
      .addRightItem(5: II5)
      .addRightItem("6": II6)
      .addRightItem("7": II7)
      .addRightItem("8": II8)
      .addRightItem(9: II9)
  )

}
